package net.mcreator.server.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class ShopThisGUIIsOpenedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("guishopopen", (true));
		if (true == entity.getPersistentData().getBoolean("guishopopen")) {
			ConstantcheckProcedure.execute(world, entity);
		}
	}
}
