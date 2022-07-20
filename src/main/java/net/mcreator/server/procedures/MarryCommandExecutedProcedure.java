package net.mcreator.server.procedures;

import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.server.network.ServerModVariables;

import java.util.concurrent.atomic.AtomicReference;
import java.util.HashMap;

public class MarryCommandExecutedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, HashMap cmdparams) {
		if (entity == null || cmdparams == null)
			return;
		double diamond = 0;
		if ((ServerModVariables.MapVariables.get(world).nameproposal).equals("")) {
			diamond = 0;
			{
				AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
				entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _iitemhandlerref.set(capability));
				if (_iitemhandlerref.get() != null) {
					for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
						ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
						if (Items.DIAMOND == itemstackiterator.getItem()) {
							diamond = diamond + (itemstackiterator).getCount();
						}
					}
				}
			}
			if (diamond >= 10) {
				ServerModVariables.MapVariables.get(world).nameproposal = entity.getDisplayName().getString();
				ServerModVariables.MapVariables.get(world).syncData(world);
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
									_level.getServer(), null).withSuppressedOutput(),
							("tell " + ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "") + "" + (" " + (entity.getDisplayName()
									.getString()
									+ " te ha enviado una propuesta de matrimonio, escribe /accept <nombre> para aceptarla o /reject para cancelarla")))));
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(Items.DIAMOND);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 10,
							_player.inventoryMenu.getCraftSlots());
				}
			} else {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
									_level.getServer(), null).withSuppressedOutput(),
							("tell " + (entity.getDisplayName().getString() + " Necesitas 10 diamantes")));
			}
		} else {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4,
						"", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
						"tell @p ya hay una propuesta de matrimonio en curso");
		}
	}
}
