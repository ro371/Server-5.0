
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.server.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.server.potion.StopPoliciaMobEffect;
import net.mcreator.server.ServerV5Mod;

public class ServerV5ModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, ServerV5Mod.MODID);
	public static final RegistryObject<MobEffect> ALTO_POLICIA = REGISTRY.register("alto_policia", () -> new StopPoliciaMobEffect());
}
