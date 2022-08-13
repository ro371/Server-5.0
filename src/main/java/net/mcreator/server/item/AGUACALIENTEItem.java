
package net.mcreator.server.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.mcreator.server.init.ServerV5ModFluids;

public class AGUACALIENTEItem extends BucketItem {
	public AGUACALIENTEItem() {
		super(ServerV5ModFluids.AGUACALIENTE,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_MISC));
	}
}
