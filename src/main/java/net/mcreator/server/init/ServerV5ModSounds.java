
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.server.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ServerV5ModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("server_v5", "policia_en_accion"), new SoundEvent(new ResourceLocation("server_v5", "policia_en_accion")));
		REGISTRY.put(new ResourceLocation("server_v5", "yummy"), new SoundEvent(new ResourceLocation("server_v5", "yummy")));
		REGISTRY.put(new ResourceLocation("server_v5", "asco_puaj"), new SoundEvent(new ResourceLocation("server_v5", "asco_puaj")));
		REGISTRY.put(new ResourceLocation("server_v5", "saciado"), new SoundEvent(new ResourceLocation("server_v5", "saciado")));
		REGISTRY.put(new ResourceLocation("server_v5", "alone"), new SoundEvent(new ResourceLocation("server_v5", "alone")));
		REGISTRY.put(new ResourceLocation("server_v5", "de_sastre"), new SoundEvent(new ResourceLocation("server_v5", "de_sastre")));
		REGISTRY.put(new ResourceLocation("server_v5", "quizas"), new SoundEvent(new ResourceLocation("server_v5", "quizas")));
		REGISTRY.put(new ResourceLocation("server_v5", "sufremamon_disk"), new SoundEvent(new ResourceLocation("server_v5", "sufremamon_disk")));
		REGISTRY.put(new ResourceLocation("server_v5", "resistiresound"), new SoundEvent(new ResourceLocation("server_v5", "resistiresound")));
		REGISTRY.put(new ResourceLocation("server_v5", "popola"), new SoundEvent(new ResourceLocation("server_v5", "popola")));
		REGISTRY.put(new ResourceLocation("server_v5", "blursound"), new SoundEvent(new ResourceLocation("server_v5", "blursound")));
		REGISTRY.put(new ResourceLocation("server_v5", "rammstein"), new SoundEvent(new ResourceLocation("server_v5", "rammstein")));
		REGISTRY.put(new ResourceLocation("server_v5", "greenday"), new SoundEvent(new ResourceLocation("server_v5", "greenday")));
		REGISTRY.put(new ResourceLocation("server_v5", "the_nights"), new SoundEvent(new ResourceLocation("server_v5", "the_nights")));
		REGISTRY.put(new ResourceLocation("server_v5", "mood"), new SoundEvent(new ResourceLocation("server_v5", "mood")));
		REGISTRY.put(new ResourceLocation("server_v5", "watermelon_sugar"), new SoundEvent(new ResourceLocation("server_v5", "watermelon_sugar")));
		REGISTRY.put(new ResourceLocation("server_v5", "montero"), new SoundEvent(new ResourceLocation("server_v5", "montero")));
		REGISTRY.put(new ResourceLocation("server_v5", "ibaisong"), new SoundEvent(new ResourceLocation("server_v5", "ibaisong")));
		REGISTRY.put(new ResourceLocation("server_v5", "cakebytheocean"), new SoundEvent(new ResourceLocation("server_v5", "cakebytheocean")));
		REGISTRY.put(new ResourceLocation("server_v5", "delgadito"), new SoundEvent(new ResourceLocation("server_v5", "delgadito")));
		REGISTRY.put(new ResourceLocation("server_v5", "the_animals"), new SoundEvent(new ResourceLocation("server_v5", "the_animals")));
		REGISTRY.put(new ResourceLocation("server_v5", "phineasdisk"), new SoundEvent(new ResourceLocation("server_v5", "phineasdisk")));
		REGISTRY.put(new ResourceLocation("server_v5", "el_anillo"), new SoundEvent(new ResourceLocation("server_v5", "el_anillo")));
		REGISTRY.put(new ResourceLocation("server_v5", "gemido"), new SoundEvent(new ResourceLocation("server_v5", "gemido")));
		REGISTRY.put(new ResourceLocation("server_v5", "alto_policia"), new SoundEvent(new ResourceLocation("server_v5", "alto_policia")));
		REGISTRY.put(new ResourceLocation("server_v5", "orden_en_la_sala"), new SoundEvent(new ResourceLocation("server_v5", "orden_en_la_sala")));
		REGISTRY.put(new ResourceLocation("server_v5", "shower"), new SoundEvent(new ResourceLocation("server_v5", "shower")));
		REGISTRY.put(new ResourceLocation("server_v5", "pilots21"), new SoundEvent(new ResourceLocation("server_v5", "pilots21")));
		REGISTRY.put(new ResourceLocation("server_v5", "musicatristenaruto"),
				new SoundEvent(new ResourceLocation("server_v5", "musicatristenaruto")));
		REGISTRY.put(new ResourceLocation("server_v5", "memyselfandi"), new SoundEvent(new ResourceLocation("server_v5", "memyselfandi")));
		REGISTRY.put(new ResourceLocation("server_v5", "esgratis"), new SoundEvent(new ResourceLocation("server_v5", "esgratis")));
		REGISTRY.put(new ResourceLocation("server_v5", "princesas"), new SoundEvent(new ResourceLocation("server_v5", "princesas")));
		REGISTRY.put(new ResourceLocation("server_v5", "sound123"), new SoundEvent(new ResourceLocation("server_v5", "sound123")));
		REGISTRY.put(new ResourceLocation("server_v5", "quemaspues"), new SoundEvent(new ResourceLocation("server_v5", "quemaspues")));
		REGISTRY.put(new ResourceLocation("server_v5", "juramentodesal"), new SoundEvent(new ResourceLocation("server_v5", "juramentodesal")));
		REGISTRY.put(new ResourceLocation("server_v5", "howdoyousleep"), new SoundEvent(new ResourceLocation("server_v5", "howdoyousleep")));
		REGISTRY.put(new ResourceLocation("server_v5", "sus"), new SoundEvent(new ResourceLocation("server_v5", "sus")));
		REGISTRY.put(new ResourceLocation("server_v5", "among_us"), new SoundEvent(new ResourceLocation("server_v5", "among_us")));
		REGISTRY.put(new ResourceLocation("server_v5", "quevedo_quedate"), new SoundEvent(new ResourceLocation("server_v5", "quevedo_quedate")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
