package net.mcreator.server.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.server.network.ServerModVariables;
import net.mcreator.server.init.ServerModItems;

import java.util.function.Supplier;
import java.util.Map;

public class DoneProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(0) >= 16) {
			if (7 == (entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ServerModVariables.PlayerVariables())).misionchosen) {
				if (Items.COD == (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem()) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						((Slot) _slots.get(0)).remove(16);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(ServerModItems.COIN_1.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(ServerModItems.MISIONFISH.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
								_player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player)
						_player.closeContainer();
				}
			}
			if (new Object() {
				public int getAmount(int sltid) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(0) == 64) {
				if (new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
								&& _current.get() instanceof Map _slots) {
							ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(1) == 64) {
					if (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(2) == 64) {
						if (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get() instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(3) == 64) {
							if (3 == (entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new ServerModVariables.PlayerVariables())).misionchosen) {
								if (Items.WHEAT_SEEDS == (entity instanceof ServerPlayer _plrSlotItem
										&& _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
												? ((Slot) _slt.get(0)).getItem()
												: ItemStack.EMPTY)
										.getItem()
										&& Items.WHEAT_SEEDS == (entity instanceof ServerPlayer _plrSlotItem
												&& _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
														? ((Slot) _slt.get(1)).getItem()
														: ItemStack.EMPTY)
												.getItem()
										&& Items.WHEAT_SEEDS == (entity instanceof ServerPlayer _plrSlotItem
												&& _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
														? ((Slot) _slt.get(2)).getItem()
														: ItemStack.EMPTY)
												.getItem()
										&& Items.WHEAT_SEEDS == (entity instanceof ServerPlayer _plrSlotItem
												&& _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
														? ((Slot) _slt.get(3)).getItem()
														: ItemStack.EMPTY)
												.getItem()) {
									if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
											&& _current.get() instanceof Map _slots) {
										((Slot) _slots.get(0)).remove(64);
										_player.containerMenu.broadcastChanges();
									}
									if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
											&& _current.get() instanceof Map _slots) {
										((Slot) _slots.get(1)).remove(64);
										_player.containerMenu.broadcastChanges();
									}
									if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
											&& _current.get() instanceof Map _slots) {
										((Slot) _slots.get(2)).remove(64);
										_player.containerMenu.broadcastChanges();
									}
									if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
											&& _current.get() instanceof Map _slots) {
										((Slot) _slots.get(3)).remove(64);
										_player.containerMenu.broadcastChanges();
									}
									if (entity instanceof Player _player) {
										ItemStack _setstack = new ItemStack(ServerModItems.COIN_1.get());
										_setstack.setCount(1);
										ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
									}
									if (entity instanceof Player _player) {
										ItemStack _stktoremove = new ItemStack(ServerModItems.MISION_SEEDS.get());
										_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
												_player.inventoryMenu.getCraftSlots());
									}
									if (entity instanceof Player _player)
										_player.closeContainer();
								}
							} else {
								if (6 == (entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new ServerModVariables.PlayerVariables())).misionchosen) {
									if (Blocks.COBBLESTONE
											.asItem() == (entity instanceof ServerPlayer _plrSlotItem
													&& _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
															? ((Slot) _slt.get(0)).getItem()
															: ItemStack.EMPTY)
													.getItem()
											&& Blocks.COBBLESTONE.asItem() == (entity instanceof ServerPlayer _plrSlotItem
													&& _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
															? ((Slot) _slt.get(1)).getItem()
															: ItemStack.EMPTY)
													.getItem()
											&& Blocks.COBBLESTONE.asItem() == (entity instanceof ServerPlayer _plrSlotItem
													&& _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
															? ((Slot) _slt.get(2)).getItem()
															: ItemStack.EMPTY)
													.getItem()
											&& Blocks.COBBLESTONE.asItem() == (entity instanceof ServerPlayer _plrSlotItem
													&& _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
															? ((Slot) _slt.get(3)).getItem()
															: ItemStack.EMPTY)
													.getItem()) {
										if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
												&& _current.get() instanceof Map _slots) {
											((Slot) _slots.get(0)).remove(64);
											_player.containerMenu.broadcastChanges();
										}
										if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
												&& _current.get() instanceof Map _slots) {
											((Slot) _slots.get(1)).remove(64);
											_player.containerMenu.broadcastChanges();
										}
										if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
												&& _current.get() instanceof Map _slots) {
											((Slot) _slots.get(2)).remove(64);
											_player.containerMenu.broadcastChanges();
										}
										if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
												&& _current.get() instanceof Map _slots) {
											((Slot) _slots.get(3)).remove(64);
											_player.containerMenu.broadcastChanges();
										}
										if (entity instanceof Player _player) {
											ItemStack _setstack = new ItemStack(ServerModItems.COIN_1.get());
											_setstack.setCount(1);
											ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
										}
										if (entity instanceof Player _player) {
											ItemStack _stktoremove = new ItemStack(ServerModItems.MISIONSTONE.get());
											_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
													_player.inventoryMenu.getCraftSlots());
										}
										if (entity instanceof Player _player)
											_player.closeContainer();
									}
								}
							}
						}
						if (1 == (entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ServerModVariables.PlayerVariables())).misionchosen) {
							if (Items.WHEAT == (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
									&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem()
									&& Items.WHEAT == (entity instanceof ServerPlayer _plrSlotItem
											&& _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
													? ((Slot) _slt.get(1)).getItem()
													: ItemStack.EMPTY)
											.getItem()
									&& Items.WHEAT == (entity instanceof ServerPlayer _plrSlotItem
											&& _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
													? ((Slot) _slt.get(2)).getItem()
													: ItemStack.EMPTY)
											.getItem()) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get() instanceof Map _slots) {
									((Slot) _slots.get(0)).remove(64);
									_player.containerMenu.broadcastChanges();
								}
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get() instanceof Map _slots) {
									((Slot) _slots.get(1)).remove(64);
									_player.containerMenu.broadcastChanges();
								}
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get() instanceof Map _slots) {
									((Slot) _slots.get(2)).remove(64);
									_player.containerMenu.broadcastChanges();
								}
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(ServerModItems.COIN_1.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								if (entity instanceof Player _player) {
									ItemStack _stktoremove = new ItemStack(ServerModItems.MISIONWHEAT.get());
									_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
											_player.inventoryMenu.getCraftSlots());
								}
								if (entity instanceof Player _player)
									_player.closeContainer();
							}
						}
					}
					if (2 == (entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ServerModVariables.PlayerVariables())).misionchosen) {
						if (Blocks.PUMPKIN
								.asItem() == (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
										&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem()
								&& Blocks.PUMPKIN.asItem() == (entity instanceof ServerPlayer _plrSlotItem
										&& _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
												? ((Slot) _slt.get(1)).getItem()
												: ItemStack.EMPTY)
										.getItem()) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								((Slot) _slots.get(0)).remove(64);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								((Slot) _slots.get(1)).remove(64);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(ServerModItems.COIN_1.get());
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(ServerModItems.MISIONPUMPKIN.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
										_player.inventoryMenu.getCraftSlots());
							}
							if (entity instanceof Player _player)
								_player.closeContainer();
						}
					}
					if (4 == (entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ServerModVariables.PlayerVariables())).misionchosen) {
						if (Blocks.MELON
								.asItem() == (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
										&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem()
								&& Blocks.MELON.asItem() == (entity instanceof ServerPlayer _plrSlotItem
										&& _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
												? ((Slot) _slt.get(1)).getItem()
												: ItemStack.EMPTY)
										.getItem()) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								((Slot) _slots.get(0)).remove(64);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								((Slot) _slots.get(1)).remove(64);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(ServerModItems.COIN_1.get());
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(ServerModItems.MISIONMELON.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
										_player.inventoryMenu.getCraftSlots());
							}
							if (entity instanceof Player _player)
								_player.closeContainer();
						}
					}
					if (5 == (entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ServerModVariables.PlayerVariables())).misionchosen) {
						if (Blocks.SUGAR_CANE
								.asItem() == (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
										&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem()
								&& Blocks.SUGAR_CANE.asItem() == (entity instanceof ServerPlayer _plrSlotItem
										&& _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
												? ((Slot) _slt.get(1)).getItem()
												: ItemStack.EMPTY)
										.getItem()) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								((Slot) _slots.get(0)).remove(64);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								((Slot) _slots.get(1)).remove(64);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(ServerModItems.COIN_1.get());
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(ServerModItems.MISIONSUGAR.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
										_player.inventoryMenu.getCraftSlots());
							}
							if (entity instanceof Player _player)
								_player.closeContainer();
						}
					}
				}
				if (0 == (entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ServerModVariables.PlayerVariables())).misionchosen) {
					if (ServerModItems.CARBON_AHUMADO
							.get() == (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
									&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem()) {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
								&& _current.get() instanceof Map _slots) {
							((Slot) _slots.get(0)).remove(64);
							_player.containerMenu.broadcastChanges();
						}
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(ServerModItems.COIN_1.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(ServerModItems.MISION.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
									_player.inventoryMenu.getCraftSlots());
						}
						if (entity instanceof Player _player)
							_player.closeContainer();
					}
				}
			}
		}
	}
}
