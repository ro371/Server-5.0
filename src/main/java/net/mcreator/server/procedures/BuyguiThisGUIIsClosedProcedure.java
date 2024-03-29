package net.mcreator.server.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.server.network.ServerV5ModVariables;

import java.util.function.Supplier;
import java.util.Map;

public class BuyguiThisGUIIsClosedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			((Slot) _slots.get(5)).set(ItemStack.EMPTY);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			((Slot) _slots.get(6)).set(ItemStack.EMPTY);
			_player.containerMenu.broadcastChanges();
		}
		{
			boolean _setval = false;
			entity.getCapability(ServerV5ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.guishopopen = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
