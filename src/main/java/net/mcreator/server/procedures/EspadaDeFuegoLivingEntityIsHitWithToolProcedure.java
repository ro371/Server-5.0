package net.mcreator.server.procedures;

import net.minecraft.world.entity.Entity;

public class EspadaDeFuegoLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(6);
	}
}
