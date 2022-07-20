package net.mcreator.server.procedures;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.server.world.inventory.SellguiMenu;
import net.mcreator.server.world.inventory.BuyguiMenu;
import net.mcreator.server.network.ServerModVariables;

import io.netty.buffer.Unpooled;

public class SellOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = x;
			entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.x = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = y;
			entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.y = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = z;
			entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.z = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.HOPPER) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands()
						.performCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
										_level.getServer(), null).withSuppressedOutput(),
								"tell @p De momento las tiendas no son compatibles con tolvas.");
		} else {
			if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.RAIL) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands()
							.performCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
											_level.getServer(), null).withSuppressedOutput(),
									"tell @p Quite el ra\u00EDl para evitar fallos accidentales.");
			} else {
				if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.POWERED_RAIL) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
										_level.getServer(), null).withSuppressedOutput(),
								"tell @p Quite el ra\u00EDl para evitar fallos accidentales.");
				} else {
					if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.DETECTOR_RAIL) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
											_level.getServer(), null).withSuppressedOutput(),
									"tell @p Quite el ra\u00EDl para evitar fallos accidentales.");
					} else {
						if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.ACTIVATOR_RAIL) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
												_level.getServer(), null).withSuppressedOutput(),
										"tell @p Quite el ra\u00EDl para evitar fallos accidentales.");
						} else {
							if ((entity.getDisplayName().getString()).equals(new Object() {
								public String getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getString(tag);
									return "";
								}
							}.getValue(world, new BlockPos(x, y, z), "name"))) {
								{
									if (entity instanceof ServerPlayer _ent) {
										BlockPos _bpos = new BlockPos(x, y, z);
										NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
											@Override
											public Component getDisplayName() {
												return new TextComponent("Sellgui");
											}

											@Override
											public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
												return new SellguiMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
											}
										}, _bpos);
									}
								}
							} else {
								{
									if (entity instanceof ServerPlayer _ent) {
										BlockPos _bpos = new BlockPos(x, y, z);
										NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
											@Override
											public Component getDisplayName() {
												return new TextComponent("Buygui");
											}

											@Override
											public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
												return new BuyguiMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
											}
										}, _bpos);
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
