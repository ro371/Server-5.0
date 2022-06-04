package net.mcreator.server.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.server.network.ServerModVariables;

public class ShowpreviousProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean isshown = false;
		if (0 == (entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ServerModVariables.PlayerVariables())).menupage) {
			isshown = false;
		} else {
			isshown = true;
		}
		return isshown;
	}
}
