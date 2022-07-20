package net.mcreator.server.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.server.network.ServerModVariables;

public class ShownextProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean truecheck = false;
		if ((entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ServerModVariables.PlayerVariables())).menupage == 2) {
			truecheck = false;
		} else {
			truecheck = true;
		}
		return truecheck;
	}
}
