
package net.mcreator.server.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.server.init.ServerModSounds;

public class ElAnilloItem extends RecordItem {
	public ElAnilloItem() {
		super(0, ServerModSounds.REGISTRY.get(new ResourceLocation("server:el_anillo")),
				new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE));
	}
}
