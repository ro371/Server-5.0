package net.mcreator.server.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.server.network.ServerModVariables;

import java.util.HashMap;

public class AtarCommandExecutedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, HashMap cmdparams) {
		if (entity == null || cmdparams == null)
			return;
		if ((entity.getDisplayName().getString()).equals(ServerModVariables.MapVariables.get(world).police1)
				|| (entity.getDisplayName().getString()).equals(ServerModVariables.MapVariables.get(world).police2)) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						("/replaceitem entity " + ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "") + ""
								+ " armor.head server:preso_armor_helmet{Enchantments:[{id:\"minecraft:binding_curse\",lvl:1}]}")));
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						("/replaceitem entity " + ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "") + ""
								+ " armor.chest server:preso_armor_chestplate{Enchantments:[{id:\"minecraft:binding_curse\",lvl:1}]}")));
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						("/replaceitem entity " + ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "") + ""
								+ " armor.legs server:preso_armor_leggings{Enchantments:[{id:\"minecraft:binding_curse\",lvl:1}]}")));
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						("/replaceitem entity " + ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "") + ""
								+ " armor.feet server:preso_armor_boots{Enchantments:[{id:\"minecraft:binding_curse\",lvl:1}]}")));
		}
	}
}
