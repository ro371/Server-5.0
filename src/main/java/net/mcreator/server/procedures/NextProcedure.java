package net.mcreator.server.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.server.network.ServerV5ModVariables;

public class NextProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 1 + (entity.getCapability(ServerV5ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ServerV5ModVariables.PlayerVariables())).menupage;
			entity.getCapability(ServerV5ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.menupage = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
