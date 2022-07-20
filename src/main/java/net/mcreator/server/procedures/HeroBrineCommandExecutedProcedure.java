package net.mcreator.server.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.server.network.ServerModVariables;
import net.mcreator.server.init.ServerModEntities;
import net.mcreator.server.entity.HeroEntity;

import java.util.Random;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

public class HeroBrineCommandExecutedProcedure {
	public static void execute(LevelAccessor world, HashMap cmdparams) {
		if (cmdparams == null)
			return;
		{
			List<? extends Player> _players = new ArrayList<>(world.players());
			for (Entity entityiterator : _players) {
				if ((entityiterator.getDisplayName().getString()).equals(cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "")) {
					ServerModVariables.MapVariables.get(world).HeroTarget = cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "";
					ServerModVariables.MapVariables.get(world).syncData(world);
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
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new HeroEntity(ServerModEntities.HERO.get(), _level);
								entityToSpawn.moveTo(Math.round(Mth.nextInt(new Random(), -120, 120) + entityiterator.getX()),
										Math.round(Mth.nextInt(new Random(), 0, 10) + entityiterator.getY()),
										Math.round(Mth.nextInt(new Random(), -120, 120) + entityiterator.getZ()),
										world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()),
											MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 20);
				}
			}
		}
	}
}
