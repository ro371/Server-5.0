package net.mcreator.server.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.server.network.ServerV5ModVariables;

public class RejectCommandExecutedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((ServerV5ModVariables.MapVariables.get(world).nameproposal).equals("")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "tell @p Nadie te ha propuesto matrimonio :(");
		} else {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						("tell " + (ServerV5ModVariables.MapVariables.get(world).nameproposal + " Tu propuesta ha sido rechazada :(")));
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
								_level.getServer(), null).withSuppressedOutput(),
						("give " + (ServerV5ModVariables.MapVariables.get(world).nameproposal + " minecraft:diamond 10")));
			ServerV5ModVariables.MapVariables.get(world).nameproposal = "";
			ServerV5ModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
