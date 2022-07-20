
package net.mcreator.server.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.server.procedures.AppleStickPlayerFinishesUsingItemProcedure;

public class AppleStickItem extends Item {
	public AppleStickItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(32).rarity(Rarity.UNCOMMON)
				.food((new FoodProperties.Builder()).nutrition(7).saturationMod(0.6f).alwaysEat()

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		AppleStickPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}
