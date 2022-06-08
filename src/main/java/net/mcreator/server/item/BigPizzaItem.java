
package net.mcreator.server.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.server.procedures.BigPizzaFoodEatenProcedure;

public class BigPizzaItem extends Item {
	public BigPizzaItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(8).rarity(Rarity.EPIC)
				.food((new FoodProperties.Builder()).nutrition(12).saturationMod(1f).alwaysEat()

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 42;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		BigPizzaFoodEatenProcedure.execute(world, x, y, z, entity);
		return retval;
	}
}
