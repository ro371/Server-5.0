
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.server.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.server.world.inventory.ShopMenu;
import net.mcreator.server.world.inventory.SellguiMenu;
import net.mcreator.server.world.inventory.MisionguiMenu;
import net.mcreator.server.world.inventory.BuyguiMenu;
import net.mcreator.server.world.inventory.BankMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ServerModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<BankMenu> BANK = register("bank", (id, inv, extraData) -> new BankMenu(id, inv, extraData));
	public static final MenuType<ShopMenu> SHOP = register("shop", (id, inv, extraData) -> new ShopMenu(id, inv, extraData));
	public static final MenuType<MisionguiMenu> MISIONGUI = register("misiongui", (id, inv, extraData) -> new MisionguiMenu(id, inv, extraData));
	public static final MenuType<SellguiMenu> SELLGUI = register("sellgui", (id, inv, extraData) -> new SellguiMenu(id, inv, extraData));
	public static final MenuType<BuyguiMenu> BUYGUI = register("buygui", (id, inv, extraData) -> new BuyguiMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
