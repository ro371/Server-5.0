package net.mcreator.server.procedures;

import net.minecraft.world.entity.Entity;

public class ShopThisGUIIsClosedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("guishopopen", (false));
	}
}
