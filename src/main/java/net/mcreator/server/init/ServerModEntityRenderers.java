
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.server.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.server.client.renderer.HeroRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ServerModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ServerModEntities.HERO.get(), HeroRenderer::new);
		event.registerEntityRenderer(ServerModEntities.ARCO_DE_FUEGO.get(), ThrownItemRenderer::new);
	}
}
