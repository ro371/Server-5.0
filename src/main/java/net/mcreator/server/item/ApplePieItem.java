
package net.mcreator.server.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.server.procedures.ApplePieFoodEatenProcedure;

public class ApplePieItem extends Item {
	public ApplePieItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(16).rarity(Rarity.RARE)
				.food((new FoodProperties.Builder()).nutrition(9).saturationMod(0.7f).alwaysEat()

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 30;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		ApplePieFoodEatenProcedure.execute(world, x, y, z);
		return retval;
	}
}
