package net.mcreator.server.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.server.network.ServerV5ModVariables;

public class ShowpreviousProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean isshown = false;
		if (0 >= (entity.getCapability(ServerV5ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ServerV5ModVariables.PlayerVariables())).menupage) {
			isshown = false;
		} else {
			isshown = true;
		}
		return isshown;
	}
}
