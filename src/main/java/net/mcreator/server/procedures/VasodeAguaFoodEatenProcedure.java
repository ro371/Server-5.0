package net.mcreator.server.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class VasodeAguaFoodEatenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean hl = false;
		double blindness = 0;
		double hunger = 0;
		double slowness = 0;
		double bl = 0;
		double sl = 0;
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("server_v5:saciado")),
						SoundSource.NEUTRAL, 120, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("server_v5:saciado")), SoundSource.NEUTRAL,
						120, 1, false);
			}
		}
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.BLINDNESS)
				? _livEnt.getEffect(MobEffects.BLINDNESS).getDuration()
				: 0) >= 20) {
			blindness = (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.BLINDNESS)
					? _livEnt.getEffect(MobEffects.BLINDNESS).getDuration()
					: 0) / 2;
			bl = entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HUNGER)
					? _livEnt.getEffect(MobEffects.HUNGER).getAmplifier()
					: 0;
		} else {
			blindness = 0;
		}
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HUNGER)
				? _livEnt.getEffect(MobEffects.HUNGER).getDuration()
				: 0) >= 20) {
			hunger = (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HUNGER)
					? _livEnt.getEffect(MobEffects.HUNGER).getDuration()
					: 0) / 2;
			sl = entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HUNGER)
					? _livEnt.getEffect(MobEffects.HUNGER).getAmplifier()
					: 0;
		} else {
			hunger = 0;
		}
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.MOVEMENT_SLOWDOWN)
				? _livEnt.getEffect(MobEffects.MOVEMENT_SLOWDOWN).getDuration()
				: 0) >= 20) {
			slowness = (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.MOVEMENT_SLOWDOWN)
					? _livEnt.getEffect(MobEffects.MOVEMENT_SLOWDOWN).getDuration()
					: 0) / 2;
			bl = entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.MOVEMENT_SLOWDOWN)
					? _livEnt.getEffect(MobEffects.MOVEMENT_SLOWDOWN).getAmplifier()
					: 0;
		} else {
			slowness = 0;
		}
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.BLINDNESS);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.HUNGER);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, (int) blindness, (int) bl, (true), (false)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, (int) hunger, (int) sl, (true), (false)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, (int) blindness, (int) bl, (true), (false)));
	}
}
