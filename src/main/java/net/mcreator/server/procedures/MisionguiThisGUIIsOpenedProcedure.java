package net.mcreator.server.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.server.network.ServerModVariables;
import net.mcreator.server.init.ServerModItems;

import java.util.function.Supplier;
import java.util.Map;

public class MisionguiThisGUIIsOpenedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
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
				if ((entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ServerModVariables.PlayerVariables())).misionchosen == 0) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(ServerModItems.CARBON_AHUMADO.get());
						_setstack.setCount(64);
						((Slot) _slots.get(4)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else {
					if ((entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ServerModVariables.PlayerVariables())).misionchosen == 1) {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
								&& _current.get() instanceof Map _slots) {
							ItemStack _setstack = new ItemStack(Items.WHEAT);
							_setstack.setCount(192);
							((Slot) _slots.get(4)).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
					} else {
						if ((entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ServerModVariables.PlayerVariables())).misionchosen == 2) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								ItemStack _setstack = new ItemStack(Blocks.PUMPKIN);
								_setstack.setCount(128);
								((Slot) _slots.get(4)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
						} else {
							if ((entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new ServerModVariables.PlayerVariables())).misionchosen == 3) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get() instanceof Map _slots) {
									ItemStack _setstack = new ItemStack(Items.WHEAT_SEEDS);
									_setstack.setCount(256);
									((Slot) _slots.get(4)).set(_setstack);
									_player.containerMenu.broadcastChanges();
								}
							} else {
								if ((entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new ServerModVariables.PlayerVariables())).misionchosen == 4) {
									if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
											&& _current.get() instanceof Map _slots) {
										ItemStack _setstack = new ItemStack(Blocks.MELON);
										_setstack.setCount(128);
										((Slot) _slots.get(4)).set(_setstack);
										_player.containerMenu.broadcastChanges();
									}
								} else {
									if ((entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new ServerModVariables.PlayerVariables())).misionchosen == 5) {
										if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
												&& _current.get() instanceof Map _slots) {
											ItemStack _setstack = new ItemStack(Blocks.SUGAR_CANE);
											_setstack.setCount(128);
											((Slot) _slots.get(4)).set(_setstack);
											_player.containerMenu.broadcastChanges();
										}
									} else {
										if ((entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new ServerModVariables.PlayerVariables())).misionchosen == 6) {
											if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
													&& _current.get() instanceof Map _slots) {
												ItemStack _setstack = new ItemStack(Blocks.COBBLESTONE);
												_setstack.setCount(256);
												((Slot) _slots.get(4)).set(_setstack);
												_player.containerMenu.broadcastChanges();
											}
										} else {
											if ((entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new ServerModVariables.PlayerVariables())).misionchosen == 7) {
												if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
														&& _current.get() instanceof Map _slots) {
													ItemStack _setstack = new ItemStack(Items.COD);
													_setstack.setCount(16);
													((Slot) _slots.get(4)).set(_setstack);
													_player.containerMenu.broadcastChanges();
												}
											}
										}
									}
								}
							}
						}
					}
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 5);
	}
}
