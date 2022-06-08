
package net.mcreator.server.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.server.procedures.HotPotatoLivingEntityIsHitWithItemProcedure;
import net.mcreator.server.procedures.HotPotatoFoodEatenProcedure;

public class HotPotatoItem extends Item {
	public HotPotatoItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(32).rarity(Rarity.RARE)
				.food((new FoodProperties.Builder()).nutrition(5).saturationMod(0.4f).alwaysEat().meat().build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 40;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		HotPotatoFoodEatenProcedure.execute(world, x, y, z);
		return retval;
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		HotPotatoLivingEntityIsHitWithItemProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity, sourceentity);
		return retval;
	}
}
