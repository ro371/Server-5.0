
package net.mcreator.server.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.server.procedures.PhallicObjectPlayerFinishesUsingItemProcedure;
import net.mcreator.server.procedures.PhallicObjectLivingEntityIsHitWithItemProcedure;

public class PhallicObjectItem extends Item {
	public PhallicObjectItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(8).rarity(Rarity.EPIC)
				.food((new FoodProperties.Builder()).nutrition(2).saturationMod(0.2f).alwaysEat().meat().build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 500;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		PhallicObjectPlayerFinishesUsingItemProcedure.execute(world, x, y, z, entity);
		return retval;
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		PhallicObjectLivingEntityIsHitWithItemProcedure.execute(entity.level, entity, sourceentity);
		return retval;
	}
}
