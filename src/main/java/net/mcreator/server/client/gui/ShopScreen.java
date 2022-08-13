
package net.mcreator.server.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.server.world.inventory.ShopMenu;
import net.mcreator.server.procedures.ShowpreviousProcedure;
import net.mcreator.server.procedures.ShownextProcedure;
import net.mcreator.server.network.ShopButtonMessage;
import net.mcreator.server.ServerV5Mod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class ShopScreen extends AbstractContainerScreen<ShopMenu> {
	private final static HashMap<String, Object> guistate = ShopMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public ShopScreen(ShopMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 337;
		this.imageHeight = 201;
	}

	private static final ResourceLocation texture = new ResourceLocation("server_v5:textures/shop.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("server_v5:textures/arrow.png"));
		this.blit(ms, this.leftPos + 38, this.topPos + 15, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("server_v5:textures/shoptext.png"));
		this.blit(ms, this.leftPos + 136, this.topPos + 10, 0, 0, 64, 32, 64, 32);

		RenderSystem.setShaderTexture(0, new ResourceLocation("server_v5:textures/arrow.png"));
		this.blit(ms, this.leftPos + 37, this.topPos + 42, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("server_v5:textures/arrow.png"));
		this.blit(ms, this.leftPos + 37, this.topPos + 69, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("server_v5:textures/arrow.png"));
		this.blit(ms, this.leftPos + 37, this.topPos + 96, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("server_v5:textures/arrow.png"));
		this.blit(ms, this.leftPos + 37, this.topPos + 124, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("server_v5:textures/arrow.png"));
		this.blit(ms, this.leftPos + 37, this.topPos + 150, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("server_v5:textures/arrow.png"));
		this.blit(ms, this.leftPos + 37, this.topPos + 177, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("server_v5:textures/arrow.png"));
		this.blit(ms, this.leftPos + 280, this.topPos + 16, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("server_v5:textures/arrow.png"));
		this.blit(ms, this.leftPos + 280, this.topPos + 42, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 213, this.topPos + 15, 35, 20, new TextComponent("->"), e -> {
			if (ShownextProcedure.execute(entity)) {
				ServerV5Mod.PACKET_HANDLER.sendToServer(new ShopButtonMessage(0, x, y, z));
				ShopButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (ShownextProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		});
		this.addRenderableWidget(new Button(this.leftPos + 87, this.topPos + 15, 35, 20, new TextComponent("<-"), e -> {
			if (ShowpreviousProcedure.execute(entity)) {
				ServerV5Mod.PACKET_HANDLER.sendToServer(new ShopButtonMessage(1, x, y, z));
				ShopButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (ShowpreviousProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		});
	}
}
