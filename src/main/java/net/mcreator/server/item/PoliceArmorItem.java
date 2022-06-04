
package net.mcreator.server.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.server.procedures.PoliceArmorHelmetTickEventProcedure;
import net.mcreator.server.procedures.PoliceArmorBootsTickEventProcedure;
import net.mcreator.server.procedures.PoliceArmorBodyTickEventProcedure;

public abstract class PoliceArmorItem extends ArmorItem {
	public PoliceArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 32;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{4, 10, 9, 4}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 18;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("server:policia_en_accion"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.OBSIDIAN), new ItemStack(Items.DIAMOND));
			}

			@Override
			public String getName() {
				return "police_armor";
			}

			@Override
			public float getToughness() {
				return 3.4f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.3f;
			}
		}, slot, properties);
	}

	public static class Helmet extends PoliceArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "server:textures/models/armor/police_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			PoliceArmorHelmetTickEventProcedure.execute(entity);
		}
	}

	public static class Chestplate extends PoliceArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "server:textures/models/armor/police_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			PoliceArmorBodyTickEventProcedure.execute(entity);
		}
	}

	public static class Leggings extends PoliceArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "server:textures/models/armor/police_layer_2.png";
		}
	}

	public static class Boots extends PoliceArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "server:textures/models/armor/police_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			PoliceArmorBootsTickEventProcedure.execute(entity);
		}
	}
}
