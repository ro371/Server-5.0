
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.server.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.server.block.VentBlock;
import net.mcreator.server.block.SellBlock;
import net.mcreator.server.block.AGUACALIENTEBlock;
import net.mcreator.server.ServerMod;

public class ServerModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ServerMod.MODID);
	public static final RegistryObject<Block> SELL = REGISTRY.register("sell", () -> new SellBlock());
	public static final RegistryObject<Block> VENT = REGISTRY.register("vent", () -> new VentBlock());
	public static final RegistryObject<Block> AGUACALIENTE = REGISTRY.register("aguacaliente", () -> new AGUACALIENTEBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			VentBlock.registerRenderLayer();
		}
	}
}
