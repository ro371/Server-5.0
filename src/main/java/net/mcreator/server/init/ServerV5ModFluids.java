
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.server.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.server.fluid.AGUACALIENTEFluid;
import net.mcreator.server.ServerV5Mod;

public class ServerV5ModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, ServerV5Mod.MODID);
	public static final RegistryObject<Fluid> AGUACALIENTE = REGISTRY.register("aguacaliente", () -> new AGUACALIENTEFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_AGUACALIENTE = REGISTRY.register("flowing_aguacaliente", () -> new AGUACALIENTEFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(AGUACALIENTE.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_AGUACALIENTE.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
