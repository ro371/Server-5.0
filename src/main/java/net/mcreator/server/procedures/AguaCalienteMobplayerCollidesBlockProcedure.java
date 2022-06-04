package net.mcreator.server.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class AguaCalienteMobplayerCollidesBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isAlive()) {
			entity.hurt(DamageSource.HOT_FLOOR, 1);
		}
	}
}
