
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.server.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.server.client.gui.ShopScreen;
import net.mcreator.server.client.gui.SellguiScreen;
import net.mcreator.server.client.gui.MisionguiScreen;
import net.mcreator.server.client.gui.BuyguiScreen;
import net.mcreator.server.client.gui.BankScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ServerModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ServerModMenus.BANK, BankScreen::new);
			MenuScreens.register(ServerModMenus.SHOP, ShopScreen::new);
			MenuScreens.register(ServerModMenus.MISIONGUI, MisionguiScreen::new);
			MenuScreens.register(ServerModMenus.SELLGUI, SellguiScreen::new);
			MenuScreens.register(ServerModMenus.BUYGUI, BuyguiScreen::new);
		});
	}
}
