package net.mcreator.server.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.server.network.ServerV5ModVariables;
import net.mcreator.server.init.ServerV5ModItems;

public class Itemtaken2Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (0 == (entity.getCapability(ServerV5ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ServerV5ModVariables.PlayerVariables())).menupage) {
			if (entity.getPersistentData().getDouble("coin1") >= 3) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(ServerV5ModItems.COIN_1.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 3,
							_player.inventoryMenu.getCraftSlots());
				}
			} else {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(ServerV5ModItems.SUFRE_MAMON_DISK.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
			}
		} else {
			if (1 == (entity.getCapability(ServerV5ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ServerV5ModVariables.PlayerVariables())).menupage) {
				if (entity.getPersistentData().getDouble("coin1") >= 1) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(ServerV5ModItems.COIN_1.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
								_player.inventoryMenu.getCraftSlots());
					}
				}
			} else {
				if (2 == (entity.getCapability(ServerV5ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ServerV5ModVariables.PlayerVariables())).menupage) {
					if (entity.getPersistentData().getDouble("coin1") >= 3) {
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(ServerV5ModItems.COIN_1.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 3,
									_player.inventoryMenu.getCraftSlots());
						}
					}
				}
			}
		}
	}
}
