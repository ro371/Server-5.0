
package net.mcreator.server.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.server.procedures.AltoPoliciaPotionStartedappliedProcedure;
import net.mcreator.server.procedures.AltoPoliciaPotionExpiresProcedure;

public class StopPoliciaMobEffect extends MobEffect {
	public StopPoliciaMobEffect() {
		super(MobEffectCategory.HARMFUL, -13434625);
	}

	@Override
	public String getDescriptionId() {
		return "effect.server_v5.alto_policia";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		AltoPoliciaPotionStartedappliedProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		AltoPoliciaPotionExpiresProcedure.execute(entity.level, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
