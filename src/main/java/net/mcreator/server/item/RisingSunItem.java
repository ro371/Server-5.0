
package net.mcreator.server.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.server.init.ServerV5ModSounds;

public class RisingSunItem extends RecordItem {
	public RisingSunItem() {
		super(0, ServerV5ModSounds.REGISTRY.get(new ResourceLocation("server_v5:the_animals")),
				new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE));
	}
}
