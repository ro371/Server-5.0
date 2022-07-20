package net.mcreator.server.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.server.network.ServerModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class StayProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getPlayer().level, event.getPlayer());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private LevelAccessor world;

			public void start(LevelAccessor world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				{
					double _setval = (entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ServerModVariables.PlayerVariables())).time + 1;
					entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.time = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if ((entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ServerModVariables.PlayerVariables())).time >= 90) {
					if (Math.random() < 0.85) {
						{
							double _setval = (entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new ServerModVariables.PlayerVariables())).coin1 + 1;
							entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.coin1 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = (entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new ServerModVariables.PlayerVariables())).time - 90;
							entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.time = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				}
				StayProcedure.execute(world, entity);
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 1200);
	}
}
