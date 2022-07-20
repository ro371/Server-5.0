package net.mcreator.server.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.server.network.ServerModVariables;
import net.mcreator.server.init.ServerModItems;

public class ClaimmissionCommandExecutedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ServerModVariables.PlayerVariables())).missions > 0) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ServerModItems.PERGAMINO.get());
				_setstack.setCount((int) (entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ServerModVariables.PlayerVariables())).missions);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else {
			{
				double _setval = 0;
				entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.missions = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
