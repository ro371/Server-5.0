package net.mcreator.server.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.server.network.ServerV5ModVariables;
import net.mcreator.server.init.ServerV5ModItems;

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
			if (7 == (entity.getCapability(ServerV5ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ServerV5ModVariables.PlayerVariables())).misionchosen) {
				if (Items.COD == (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem()) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						((Slot) _slots.get(0)).remove(16);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(ServerV5ModItems.COIN_1.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(ServerV5ModItems.MISIONFISH.get());
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
							if (3 == (entity.getCapability(ServerV5ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new ServerV5ModVariables.PlayerVariables())).misionchosen) {
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
										ItemStack _setstack = new ItemStack(ServerV5ModItems.COIN_1.get());
										_setstack.setCount(1);
										ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
									}
									if (entity instanceof Player _player) {
										ItemStack _stktoremove = new ItemStack(ServerV5ModItems.MISION_SEEDS.get());
										_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
												_player.inventoryMenu.getCraftSlots());
									}
									if (entity instanceof Player _player)
										_player.closeContainer();
								}
							} else {
								if (6 == (entity.getCapability(ServerV5ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new ServerV5ModVariables.PlayerVariables())).misionchosen) {
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
											ItemStack _setstack = new ItemStack(ServerV5ModItems.COIN_1.get());
											_setstack.setCount(1);
											ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
										}
										if (entity instanceof Player _player) {
											ItemStack _stktoremove = new ItemStack(ServerV5ModItems.MISIONSTONE.get());
											_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
													_player.inventoryMenu.getCraftSlots());
										}
										if (entity instanceof Player _player)
											_player.closeContainer();
									}
								}
							}
						}
						if (1 == (entity.getCapability(ServerV5ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ServerV5ModVariables.PlayerVariables())).misionchosen) {
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
									ItemStack _setstack = new ItemStack(ServerV5ModItems.COIN_1.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								if (entity instanceof Player _player) {
									ItemStack _stktoremove = new ItemStack(ServerV5ModItems.MISIONWHEAT.get());
									_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
											_player.inventoryMenu.getCraftSlots());
								}
								if (entity instanceof Player _player)
									_player.closeContainer();
							}
						}
					}
					if (2 == (entity.getCapability(ServerV5ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ServerV5ModVariables.PlayerVariables())).misionchosen) {
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
								ItemStack _setstack = new ItemStack(ServerV5ModItems.COIN_1.get());
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(ServerV5ModItems.MISIONPUMPKIN.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
										_player.inventoryMenu.getCraftSlots());
							}
							if (entity instanceof Player _player)
								_player.closeContainer();
						}
					}
					if (4 == (entity.getCapability(ServerV5ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ServerV5ModVariables.PlayerVariables())).misionchosen) {
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
								ItemStack _setstack = new ItemStack(ServerV5ModItems.COIN_1.get());
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(ServerV5ModItems.MISIONMELON.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
										_player.inventoryMenu.getCraftSlots());
							}
							if (entity instanceof Player _player)
								_player.closeContainer();
						}
					}
					if (5 == (entity.getCapability(ServerV5ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ServerV5ModVariables.PlayerVariables())).misionchosen) {
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
								ItemStack _setstack = new ItemStack(ServerV5ModItems.COIN_1.get());
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
							if (entity instanceof Player _player) {
								ItemStack _stktoremove = new ItemStack(ServerV5ModItems.MISIONSUGAR.get());
								_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
										_player.inventoryMenu.getCraftSlots());
							}
							if (entity instanceof Player _player)
								_player.closeContainer();
						}
					}
				}
				if (0 == (entity.getCapability(ServerV5ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ServerV5ModVariables.PlayerVariables())).misionchosen) {
					if (ServerV5ModItems.CARBON_AHUMADO
							.get() == (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
									&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem()) {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
								&& _current.get() instanceof Map _slots) {
							((Slot) _slots.get(0)).remove(64);
							_player.containerMenu.broadcastChanges();
						}
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(ServerV5ModItems.COIN_1.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(ServerV5ModItems.MISION.get());
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
