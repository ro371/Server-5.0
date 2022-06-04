package net.mcreator.server.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.server.init.ServerModItems;

import java.util.concurrent.atomic.AtomicReference;

public class CreatemissionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double num = 0;
		double perg = 0;
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(ServerModItems.PERGAMINO.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		num = Math.random();
		perg = 0;
		{
			AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
			entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _iitemhandlerref.set(capability));
			if (_iitemhandlerref.get() != null) {
				for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
					ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
					if (ServerModItems.PERGAMINO.get() == itemstackiterator.getItem()) {
						perg = perg + (itemstackiterator).getCount();
					}
				}
			}
		}
		if (perg >= 1) {
			if (num < 0.125) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(ServerModItems.MISION.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else {
				if (num < 0.25) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(ServerModItems.MISIONWHEAT.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else {
					if (num < 0.375) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(ServerModItems.MISIONPUMPKIN.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else {
						if (num < 0.5) {
							if (entity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(ServerModItems.MISION_SEEDS.get());
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
						} else {
							if (num < 0.625) {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(ServerModItems.MISIONMELON.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
							} else {
								if (num < 0.75) {
									if (entity instanceof Player _player) {
										ItemStack _setstack = new ItemStack(ServerModItems.MISIONSUGAR.get());
										_setstack.setCount(1);
										ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
									}
								} else {
									if (num < 0.875) {
										if (entity instanceof Player _player) {
											ItemStack _setstack = new ItemStack(ServerModItems.MISIONSTONE.get());
											_setstack.setCount(1);
											ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
										}
									} else {
										if (num < 1) {
											if (entity instanceof Player _player) {
												ItemStack _setstack = new ItemStack(ServerModItems.MISIONFISH.get());
												_setstack.setCount(1);
												ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} else {
			if (num < 0.125) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ServerModItems.MISION.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else {
				if (num < 0.25) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ServerModItems.MISIONWHEAT.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					if (num < 0.375) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ServerModItems.MISIONPUMPKIN.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (num < 0.5) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ServerModItems.MISION_SEEDS.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (num < 0.625) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ServerModItems.MISIONMELON.get()));
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if (num < 0.75) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ServerModItems.MISIONSUGAR.get()));
										entityToSpawn.setPickUpDelay(10);
										_level.addFreshEntity(entityToSpawn);
									}
								} else {
									if (num < 0.875) {
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
													new ItemStack(ServerModItems.MISIONSTONE.get()));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									} else {
										if (num < 1) {
											if (world instanceof Level _level && !_level.isClientSide()) {
												ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
														new ItemStack(ServerModItems.MISIONFISH.get()));
												entityToSpawn.setPickUpDelay(10);
												_level.addFreshEntity(entityToSpawn);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
