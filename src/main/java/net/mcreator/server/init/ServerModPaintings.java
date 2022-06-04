
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.server.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.decoration.Motive;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ServerModPaintings {
	@SubscribeEvent
	public static void registerMotives(RegistryEvent.Register<Motive> event) {
		event.getRegistry().register(new Motive(16, 32).setRegistryName("romeo"));
		event.getRegistry().register(new Motive(16, 32).setRegistryName("chispa"));
		event.getRegistry().register(new Motive(48, 48).setRegistryName("montero_0"));
		event.getRegistry().register(new Motive(80, 48).setRegistryName("montero_1"));
		event.getRegistry().register(new Motive(80, 48).setRegistryName("montero_2"));
		event.getRegistry().register(new Motive(64, 32).setRegistryName("montero_3"));
		event.getRegistry().register(new Motive(48, 48).setRegistryName("montero_4"));
		event.getRegistry().register(new Motive(48, 48).setRegistryName("montero_5"));
		event.getRegistry().register(new Motive(80, 32).setRegistryName("montero_6"));
	}
}
