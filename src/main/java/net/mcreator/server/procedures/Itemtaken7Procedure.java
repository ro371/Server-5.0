package net.mcreator.server.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.server.network.ServerModVariables;
import net.mcreator.server.init.ServerModItems;

public class Itemtaken7Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ServerModVariables.PlayerVariables())).menupage == 0) {
			if (entity.getPersistentData().getDouble("coin1") >= 3) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(ServerModItems.COIN_1.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 3,
							_player.inventoryMenu.getCraftSlots());
				}
			} else {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(ServerModItems.GREEN_DAYDISK.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
			}
		} else {
			if ((entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ServerModVariables.PlayerVariables())).menupage == 1) {
				if (entity.getPersistentData().getDouble("coin1") >= 2) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(ServerModItems.COIN_1.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 2,
								_player.inventoryMenu.getCraftSlots());
					}
				}
			} else {
				if ((entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ServerModVariables.PlayerVariables())).menupage == 2) {
					if (entity.getPersistentData().getDouble("coin1") >= 1) {
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(ServerModItems.COIN_1.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
									_player.inventoryMenu.getCraftSlots());
						}
					}
				}
			}
		}
	}
}
