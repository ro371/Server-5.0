package net.mcreator.server.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class VasodeaguaflyvenomFoodEatenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		PastillavenomFoodEatenProcedure.execute(entity);
		PastillaflyFoodEatenProcedure.execute(world, x, y, z, entity);
	}
}
