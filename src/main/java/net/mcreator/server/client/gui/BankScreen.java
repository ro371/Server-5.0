
package net.mcreator.server.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.server.world.inventory.BankMenu;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class BankScreen extends AbstractContainerScreen<BankMenu> {
	private final static HashMap<String, Object> guistate = BankMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public BankScreen(BankMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("server:textures/bank.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("server:textures/arrow_hd.png"));
		this.blit(ms, this.leftPos + -90, this.topPos + -91, 0, 0, 256, 256, 256, 256);

		RenderSystem.setShaderTexture(0, new ResourceLocation("server:textures/arrow_hd2.png"));
		this.blit(ms, this.leftPos + -89, this.topPos + -66, 0, 0, 256, 256, 256, 256);

		RenderSystem.setShaderTexture(0, new ResourceLocation("server:textures/coin.png"));
		this.blit(ms, this.leftPos + 24, this.topPos + 53, 0, 0, 256, 256, 256, 256);

		RenderSystem.setShaderTexture(0, new ResourceLocation("server:textures/coin_.png"));
		this.blit(ms, this.leftPos + 79, this.topPos + 26, 0, 0, 256, 256, 256, 256);

		RenderSystem.setShaderTexture(0, new ResourceLocation("server:textures/coin_1.png"));
		this.blit(ms, this.leftPos + 24, this.topPos + 27, 0, 0, 256, 256, 256, 256);

		RenderSystem.setShaderTexture(0, new ResourceLocation("server:textures/coin_1_.png"));
		this.blit(ms, this.leftPos + 79, this.topPos + 54, 0, 0, 256, 256, 256, 256);

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
		this.font.draw(poseStack, "Cambia aqu\u00ED tus monedas", 32, 7, -16777216);
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
	}
}
