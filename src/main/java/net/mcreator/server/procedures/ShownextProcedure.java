package net.mcreator.server.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.server.network.ServerV5ModVariables;

public class ShownextProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean truecheck = false;
		if ((entity.getCapability(ServerV5ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ServerV5ModVariables.PlayerVariables())).menupage >= 2) {
			truecheck = false;
		} else {
			truecheck = true;
		}
		return truecheck;
	}
}
