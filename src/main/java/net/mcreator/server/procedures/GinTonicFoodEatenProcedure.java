package net.mcreator.server.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class GinTonicFoodEatenProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double Drunk = 0;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.POISON,
					(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.POISON)
							? _livEnt.getEffect(MobEffects.POISON).getDuration()
							: 0) * 2 + 40),
					2, (true), (true)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION,
					(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.CONFUSION)
							? _livEnt.getEffect(MobEffects.CONFUSION).getDuration()
							: 0) * 2 + 100),
					3, (true), (true)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS,
					(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.BLINDNESS)
							? _livEnt.getEffect(MobEffects.BLINDNESS).getDuration()
							: 0) * 2 + 60),
					0, (true), (true)));
	}
}
