package net.mcreator.server.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;
import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.Util;

import net.mcreator.server.network.ServerV5ModVariables;
import net.mcreator.server.init.ServerV5ModItems;

import java.util.HashMap;

public class AcceptCommandExecutedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, HashMap cmdparams) {
		if (entity == null || cmdparams == null)
			return;
		if ((ServerV5ModVariables.MapVariables.get(world).nameproposal).equals("")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "tell @p Nadie te ha propuesto matrimonio :(");
		} else {
			if ((ServerV5ModVariables.MapVariables.get(world).nameproposal).equals(cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "")) {
				if (!world.isClientSide()) {
					MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
					if (_mcserv != null)
						_mcserv.getPlayerList().broadcastMessage(
								new TextComponent((ServerV5ModVariables.MapVariables.get(world).nameproposal + ""
										+ (" y " + (entity.getDisplayName().getString() + " ahora est\uFFFDn casados")))),
								ChatType.SYSTEM, Util.NIL_UUID);
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands()
							.performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
									new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
									"title @a title {\"text\":\"VIVAN LOS NOVIOS!!!\"}");
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(ServerV5ModItems.ANILLO.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
									_level.getServer(), null).withSuppressedOutput(),
							("give " + (ServerV5ModVariables.MapVariables.get(world).nameproposal + " server:anillo")));
				ServerV5ModVariables.MapVariables.get(world).nameproposal = "";
				ServerV5ModVariables.MapVariables.get(world).syncData(world);
			} else {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level,
							4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "tell @p Ha ocurrido un error");
			}
		}
	}
}
