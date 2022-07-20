package net.mcreator.server.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.server.network.ServerModVariables;

import java.util.HashMap;

public class JailCommandExecutedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, HashMap cmdparams) {
		if (entity == null || cmdparams == null)
			return;
		if ((entity.getDisplayName().getString()).equals(ServerModVariables.MapVariables.get(world).police1)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						("tp " + ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "") + " 31 71 -258")));
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						("spawnpoint " + ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "") + " 31 71 -258")));
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						("title " + ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "") + " times 20 200 20")));
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						("title "
								+ ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "") + "" + " subtitle {\"text\":\"encarcelado\"}")));
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						("title " + ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "") + "" + " title {\"text\":\"Has sido \"}")));
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(31, 71, -258),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("server:musicatristenaruto")), SoundSource.NEUTRAL, 10, 1);
				} else {
					_level.playLocalSound(31, 71, (-258), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("server:musicatristenaruto")),
							SoundSource.NEUTRAL, 10, 1, false);
				}
			}
		} else {
			if ((entity.getDisplayName().getString()).equals(ServerModVariables.MapVariables.get(world).police2)) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
									_level.getServer(), null).withSuppressedOutput(),
							("tp " + ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "") + " 31 71 -258")));
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
									_level.getServer(), null).withSuppressedOutput(),
							("spawnpoint " + ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "") + " 31 71 -258")));
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
									_level.getServer(), null).withSuppressedOutput(),
							("title " + ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "") + " times 20 200 20")));
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
									_level.getServer(), null).withSuppressedOutput(),
							("title " + ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "") + ""
									+ " subtitle {\"text\":\"encarcelado\"}")));
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
									_level.getServer(), null).withSuppressedOutput(),
							("title "
									+ ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "") + "" + " title {\"text\":\"Has sido \"}")));
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(31, 71, -258),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("server:musicatristenaruto")), SoundSource.NEUTRAL, 10, 1);
					} else {
						_level.playLocalSound(31, 71, (-258),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("server:musicatristenaruto")), SoundSource.NEUTRAL, 10, 1,
								false);
					}
				}
			} else {
				if ((entity.getDisplayName().getString()).equals(ServerModVariables.MapVariables.get(world).judge)
						|| (entity.getDisplayName().getString()).equals(ServerModVariables.MapVariables.get(world).judge2)) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
										_level.getServer(), null).withSuppressedOutput(),
								("tp " + ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "") + " 31 71 -258")));
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
										_level.getServer(), null).withSuppressedOutput(),
								("spawnpoint " + ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "") + " 31 71 -258")));
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
										_level.getServer(), null).withSuppressedOutput(),
								("title " + ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "") + " times 20 200 20")));
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
										_level.getServer(), null).withSuppressedOutput(),
								("title " + ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "") + ""
										+ " subtitle {\"text\":\"encarcelado\"}")));
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
										_level.getServer(), null).withSuppressedOutput(),
								("title " + ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "") + ""
										+ " title {\"text\":\"Has sido \"}")));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(31, 71, -258),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("server:musicatristenaruto")), SoundSource.NEUTRAL, 10,
									1);
						} else {
							_level.playLocalSound(31, 71, (-258),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("server:musicatristenaruto")), SoundSource.NEUTRAL, 10,
									1, false);
						}
					}
				} else {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO,
								_level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "tell @p No tienes permisos");
				}
			}
		}
	}
}
