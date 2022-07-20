package net.mcreator.server.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.server.network.ServerModVariables;

public class NextProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 1 + (entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ServerModVariables.PlayerVariables())).menupage;
			entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.menupage = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
