package net.mcreator.server.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.server.network.ServerV5ModVariables;

import java.util.HashMap;

public class JailCommandExecutedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, HashMap cmdparams) {
		if (entity == null || cmdparams == null)
			return;
		if ((entity.getDisplayName().getString()).equals(ServerV5ModVariables.MapVariables.get(world).police1)
				|| (entity.getDisplayName().getString()).equals(ServerV5ModVariables.MapVariables.get(world).police2)
				|| (entity.getDisplayName().getString()).equals(ServerV5ModVariables.MapVariables.get(world).judge)
				|| (entity.getDisplayName().getString()).equals(ServerV5ModVariables.MapVariables.get(world).judge2)) {
			if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("")) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("A\u00F1ade el nombre de un jugador!"), (false));
			} else if ((cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "").equals("")) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("A\u00F1ade el tiempo en segundos!"), (false));
			} else {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
									_level.getServer(), null).withSuppressedOutput(),
							("tp " + ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "") + " 339 65 -12")));
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
									_level.getServer(), null).withSuppressedOutput(),
							("spawnpoint " + ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "") + " 339 65 -12")));
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
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("server_v5:musicatristenaruto")), SoundSource.NEUTRAL, 10,
								1);
					} else {
						_level.playLocalSound(31, 71, (-258),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("server_v5:musicatristenaruto")), SoundSource.NEUTRAL, 10,
								1, false);
					}
				}
				new Object() {
					private int ticks = 0;
					private float waitTicks;
					private LevelAccessor world;

					public void start(LevelAccessor world, int waitTicks) {
						this.waitTicks = waitTicks;
						MinecraftForge.EVENT_BUS.register(this);
						this.world = world;
					}

					@SubscribeEvent
					public void tick(TickEvent.ServerTickEvent event) {
						if (event.phase == TickEvent.Phase.END) {
							this.ticks += 1;
							if (this.ticks >= this.waitTicks)
								run();
						}
					}

					private void run() {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
											_level.getServer(), null).withSuppressedOutput(),
									("tp " + ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "") + " 339 70 -12")));
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
											_level.getServer(), null).withSuppressedOutput(),
									("spawnpoint " + ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "") + " 339 70 -12")));
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
											_level.getServer(), null).withSuppressedOutput(),
									("title " + ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "") + ""
											+ " subtitle {\"text\":\"Has sido liberado\"}")));
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) (20 * new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(cmdparams.containsKey("1") ? cmdparams.get("1").toString() : "")));
			}
		} else {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "tell @p No tienes permisos");
		}
	}
}
