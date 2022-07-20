
package net.mcreator.server.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.server.world.inventory.ShopMenu;
import net.mcreator.server.procedures.Itemtaken9Procedure;
import net.mcreator.server.procedures.Itemtaken8Procedure;
import net.mcreator.server.procedures.Itemtaken7Procedure;
import net.mcreator.server.procedures.Itemtaken6Procedure;
import net.mcreator.server.procedures.Itemtaken5Procedure;
import net.mcreator.server.procedures.Itemtaken4Procedure;
import net.mcreator.server.procedures.Itemtaken3Procedure;
import net.mcreator.server.procedures.Itemtaken2Procedure;
import net.mcreator.server.procedures.Itemtaken1Procedure;
import net.mcreator.server.ServerMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ShopSlotMessage {
	private final int slotID, x, y, z, changeType, meta;

	public ShopSlotMessage(int slotID, int x, int y, int z, int changeType, int meta) {
		this.slotID = slotID;
		this.x = x;
		this.y = y;
		this.z = z;
		this.changeType = changeType;
		this.meta = meta;
	}

	public ShopSlotMessage(FriendlyByteBuf buffer) {
		this.slotID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
		this.changeType = buffer.readInt();
		this.meta = buffer.readInt();
	}

	public static void buffer(ShopSlotMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.slotID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
		buffer.writeInt(message.changeType);
		buffer.writeInt(message.meta);
	}

	public static void handler(ShopSlotMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int slotID = message.slotID;
			int changeType = message.changeType;
			int meta = message.meta;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleSlotAction(entity, slotID, changeType, meta, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleSlotAction(Player entity, int slotID, int changeType, int meta, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = ShopMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (slotID == 1 && changeType == 1) {

			Itemtaken1Procedure.execute(entity);
		}
		if (slotID == 3 && changeType == 1) {

			Itemtaken2Procedure.execute(entity);
		}
		if (slotID == 5 && changeType == 1) {

			Itemtaken3Procedure.execute(entity);
		}
		if (slotID == 7 && changeType == 1) {

			Itemtaken4Procedure.execute(entity);
		}
		if (slotID == 9 && changeType == 1) {

			Itemtaken5Procedure.execute(entity);
		}
		if (slotID == 11 && changeType == 1) {

			Itemtaken6Procedure.execute(entity);
		}
		if (slotID == 13 && changeType == 1) {

			Itemtaken7Procedure.execute(entity);
		}
		if (slotID == 15 && changeType == 1) {

			Itemtaken8Procedure.execute(entity);
		}
		if (slotID == 17 && changeType == 1) {

			Itemtaken9Procedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		ServerMod.addNetworkMessage(ShopSlotMessage.class, ShopSlotMessage::buffer, ShopSlotMessage::new, ShopSlotMessage::handler);
	}
}
