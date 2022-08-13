package net.mcreator.server.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.server.network.ServerV5ModVariables;

public class BotelladevinoPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(ServerV5ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ServerV5ModVariables.PlayerVariables())).used_bottle >= 40000) {
			if (entity instanceof Player _player)
				_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) + 12));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION,
						(int) ((entity.getCapability(ServerV5ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ServerV5ModVariables.PlayerVariables())).used_bottle / 2),
						3, (true), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST,
						(int) ((entity.getCapability(ServerV5ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ServerV5ModVariables.PlayerVariables())).used_bottle / 2),
						3, (true), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(
						new MobEffectInstance(MobEffects.JUMP, (int) ((entity.getCapability(ServerV5ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ServerV5ModVariables.PlayerVariables())).used_bottle / 2), 2, (true), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,
						(int) ((entity.getCapability(ServerV5ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ServerV5ModVariables.PlayerVariables())).used_bottle / 2),
						2, (true), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED,
						(int) ((entity.getCapability(ServerV5ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ServerV5ModVariables.PlayerVariables())).used_bottle / 2),
						2, (true), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(
						new MobEffectInstance(MobEffects.LUCK, (int) ((entity.getCapability(ServerV5ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ServerV5ModVariables.PlayerVariables())).used_bottle / 2), 2, (true), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING,
						(int) ((entity.getCapability(ServerV5ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ServerV5ModVariables.PlayerVariables())).used_bottle / 2),
						2, (true), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING,
						(int) ((entity.getCapability(ServerV5ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ServerV5ModVariables.PlayerVariables())).used_bottle / 2),
						0, (true), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST,
						(int) ((entity.getCapability(ServerV5ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ServerV5ModVariables.PlayerVariables())).used_bottle / 2),
						1, (true), (false)));
		} else if ((entity.getCapability(ServerV5ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ServerV5ModVariables.PlayerVariables())).used_bottle >= 20000) {
			if (entity instanceof Player _player)
				_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) + 10));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 8000, 2, (true), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 200, 0, (true), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 5500, 2, (true), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 5500, 1, (true), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 5500, 1, (true), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 5500, 1, (true), (false)));
		} else if ((entity.getCapability(ServerV5ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ServerV5ModVariables.PlayerVariables())).used_bottle >= 12000) {
			if (entity instanceof Player _player)
				_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) + 8));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 5000, 2, (true), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 500, 0, (true), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 4000, 1, (true), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 4000, 0, (true), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 4000, 0, (true), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 4000, 0, (true), (false)));
		} else if ((entity.getCapability(ServerV5ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ServerV5ModVariables.PlayerVariables())).used_bottle >= 6000) {
			if (entity instanceof Player _player)
				_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) + 6));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 3000, 1, (true), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 1000, 0, (true), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2500, 0, (true), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 2500, 0, (true), (false)));
		} else if ((entity.getCapability(ServerV5ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ServerV5ModVariables.PlayerVariables())).used_bottle >= 3500) {
			if (entity instanceof Player _player)
				_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) + 4));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 1000, 0, (true), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 1000, 1, (true), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 1000, 0, (true), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1000, 0, (true), (false)));
		} else if ((entity.getCapability(ServerV5ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ServerV5ModVariables.PlayerVariables())).used_bottle >= 1800) {
			if (entity instanceof Player _player)
				_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) + 2));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 400, 0, (true), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 1000, 2, (true), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 1000, 2, (true), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 1000, 1, (true), (false)));
		} else if ((entity.getCapability(ServerV5ModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ServerV5ModVariables.PlayerVariables())).used_bottle >= 800) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 500, 0, (true), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 1000, 3, (true), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 1000, 3, (true), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 1000, 2, (true), (false)));
		} else {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 500, 1, (true), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 1000, 4, (true), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 1000, 4, (true), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 1000, 4, (true), (false)));
		}
	}
}
