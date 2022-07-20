
package net.mcreator.server.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class PicoDeFuegoItem extends PickaxeItem {
	public PicoDeFuegoItem() {
		super(new Tier() {
			public int getUses() {
				return 1000;
			}

			public float getSpeed() {
				return 9.6f;
			}

			public float getAttackDamageBonus() {
				return 3.3999999999999995f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 18;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, -2.5999999999999999f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant());
	}
}
