
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

import net.mcreator.server.world.inventory.MisionguiMenu;
import net.mcreator.server.network.ServerModVariables;
import net.mcreator.server.network.MisionguiButtonMessage;
import net.mcreator.server.ServerMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class MisionguiScreen extends AbstractContainerScreen<MisionguiMenu> {
	private final static HashMap<String, Object> guistate = MisionguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public MisionguiScreen(MisionguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 179;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("server:textures/misiongui.png");

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
		this.font.draw(poseStack, "Tu misi\uFFFDn es coneguir", 4, 4, -12829636);
		this.font.draw(poseStack,
				"" + ((entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ServerModVariables.PlayerVariables())).n_mission) + " de "
						+ ((entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ServerModVariables.PlayerVariables())).objetomision)
						+ "",
				4, 15, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 53, this.topPos + 29, 70, 20, new TextComponent("Completar"), e -> {
			if (true) {
				ServerMod.PACKET_HANDLER.sendToServer(new MisionguiButtonMessage(0, x, y, z));
				MisionguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
