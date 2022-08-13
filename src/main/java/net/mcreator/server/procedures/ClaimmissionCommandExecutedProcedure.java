package net.mcreator.server.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.server.network.ServerV5ModVariables;
import net.mcreator.server.init.ServerV5ModItems;

public class ClaimmissionCommandExecutedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(ServerV5ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ServerV5ModVariables.PlayerVariables())).missions > 0) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ServerV5ModItems.PERGAMINO.get());
				_setstack.setCount((int) (entity.getCapability(ServerV5ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ServerV5ModVariables.PlayerVariables())).missions);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else {
			{
				double _setval = 0;
				entity.getCapability(ServerV5ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.missions = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
