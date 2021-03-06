
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.server.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.server.ServerMod;

public class ServerModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, ServerMod.MODID);
	public static final RegistryObject<Potion> ALTO_POLICIA_POTION_ITEM = REGISTRY.register("alto_policia_potion_item",
			() -> new Potion(new MobEffectInstance(ServerModMobEffects.ALTO_POLICIA.get(), 3600, 0, false, true)));
}
