package net.mcreator.server.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.server.network.ServerV5ModVariables;

import java.util.HashMap;

public class SetCommandExecutedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, HashMap cmdparams) {
		if (cmdparams == null)
			return;
		if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("police1")) {
			ServerV5ModVariables.MapVariables.get(world).police1 = cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "";
			ServerV5ModVariables.MapVariables.get(world).syncData(world);
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						("tell @p ahora el polic\u00EDa 1 es " + (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "")));
		} else {
			if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("police2")) {
				ServerV5ModVariables.MapVariables.get(world).police2 = cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "";
				ServerV5ModVariables.MapVariables.get(world).syncData(world);
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
									_level.getServer(), null).withSuppressedOutput(),
							("tell @p ahora el polic\u00EDa 2 es " + (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "")));
			} else {
				if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("judge")) {
					ServerV5ModVariables.MapVariables.get(world).judge = cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "";
					ServerV5ModVariables.MapVariables.get(world).syncData(world);
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
										_level.getServer(), null).withSuppressedOutput(),
								("tell @p ahora el juez es " + (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "")));
				} else {
					if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("judge2")) {
						ServerV5ModVariables.MapVariables.get(world).judge2 = cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "";
						ServerV5ModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
											_level.getServer(), null).withSuppressedOutput(),
									("tell @p ahora el segundo juez es " + (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "")));
					} else {
						if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("mayor")) {
							ServerV5ModVariables.MapVariables.get(world).mayor = cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "";
							ServerV5ModVariables.MapVariables.get(world).syncData(world);
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
												_level.getServer(), null).withSuppressedOutput(),
										("tell @p ahora el alcalde es " + (cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "")));
						} else {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z),
										Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
										"tell @p ERROR");
						}
					}
				}
			}
		}
	}
}
