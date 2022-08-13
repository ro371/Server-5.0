package net.mcreator.server.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.server.network.ServerV5ModVariables;

public class Inserted3Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(ServerV5ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ServerV5ModVariables.PlayerVariables())).tiempo3 != 0) {
			return true;
		}
		return false;
	}
}
