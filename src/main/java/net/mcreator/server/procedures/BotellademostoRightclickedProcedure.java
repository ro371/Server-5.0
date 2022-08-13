package net.mcreator.server.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.server.network.ServerV5ModVariables;
import net.mcreator.server.init.ServerV5ModItems;

public class BotellademostoRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (ServerV5ModItems.BOTELLADEMOSTO.get() == itemstack.getItem() || ServerV5ModItems.BOTELLADEVINO.get() == itemstack.getItem()) {
			{
				double _setval = itemstack.getOrCreateTag().getDouble("Curaci\u00F3n");
				entity.getCapability(ServerV5ModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.used_bottle = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
