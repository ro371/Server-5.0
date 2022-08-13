
package net.mcreator.server.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.server.entity.HeroEntity;

public class HeroRenderer extends HumanoidMobRenderer<HeroEntity, HumanoidModel<HeroEntity>> {
	public HeroRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
		this.addLayer(new EyesLayer<HeroEntity, HumanoidModel<HeroEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("server_v5:textures/pixil-frame-0_3.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(HeroEntity entity) {
		return new ResourceLocation("server_v5:textures/2019_02_25_herobrine-12823413.png");
	}
}
