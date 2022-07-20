
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
public class ServerModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("server", "policia_en_accion"), new SoundEvent(new ResourceLocation("server", "policia_en_accion")));
		REGISTRY.put(new ResourceLocation("server", "yummy"), new SoundEvent(new ResourceLocation("server", "yummy")));
		REGISTRY.put(new ResourceLocation("server", "asco_puaj"), new SoundEvent(new ResourceLocation("server", "asco_puaj")));
		REGISTRY.put(new ResourceLocation("server", "saciado"), new SoundEvent(new ResourceLocation("server", "saciado")));
		REGISTRY.put(new ResourceLocation("server", "alone"), new SoundEvent(new ResourceLocation("server", "alone")));
		REGISTRY.put(new ResourceLocation("server", "de_sastre"), new SoundEvent(new ResourceLocation("server", "de_sastre")));
		REGISTRY.put(new ResourceLocation("server", "quizas"), new SoundEvent(new ResourceLocation("server", "quizas")));
		REGISTRY.put(new ResourceLocation("server", "sufremamon_disk"), new SoundEvent(new ResourceLocation("server", "sufremamon_disk")));
		REGISTRY.put(new ResourceLocation("server", "resistiresound"), new SoundEvent(new ResourceLocation("server", "resistiresound")));
		REGISTRY.put(new ResourceLocation("server", "popola"), new SoundEvent(new ResourceLocation("server", "popola")));
		REGISTRY.put(new ResourceLocation("server", "blursound"), new SoundEvent(new ResourceLocation("server", "blursound")));
		REGISTRY.put(new ResourceLocation("server", "rammstein"), new SoundEvent(new ResourceLocation("server", "rammstein")));
		REGISTRY.put(new ResourceLocation("server", "greenday"), new SoundEvent(new ResourceLocation("server", "greenday")));
		REGISTRY.put(new ResourceLocation("server", "the_nights"), new SoundEvent(new ResourceLocation("server", "the_nights")));
		REGISTRY.put(new ResourceLocation("server", "mood"), new SoundEvent(new ResourceLocation("server", "mood")));
		REGISTRY.put(new ResourceLocation("server", "watermelon_sugar"), new SoundEvent(new ResourceLocation("server", "watermelon_sugar")));
		REGISTRY.put(new ResourceLocation("server", "montero"), new SoundEvent(new ResourceLocation("server", "montero")));
		REGISTRY.put(new ResourceLocation("server", "ibaisong"), new SoundEvent(new ResourceLocation("server", "ibaisong")));
		REGISTRY.put(new ResourceLocation("server", "cakebytheocean"), new SoundEvent(new ResourceLocation("server", "cakebytheocean")));
		REGISTRY.put(new ResourceLocation("server", "delgadito"), new SoundEvent(new ResourceLocation("server", "delgadito")));
		REGISTRY.put(new ResourceLocation("server", "the_animals"), new SoundEvent(new ResourceLocation("server", "the_animals")));
		REGISTRY.put(new ResourceLocation("server", "phineasdisk"), new SoundEvent(new ResourceLocation("server", "phineasdisk")));
		REGISTRY.put(new ResourceLocation("server", "el_anillo"), new SoundEvent(new ResourceLocation("server", "el_anillo")));
		REGISTRY.put(new ResourceLocation("server", "gemido"), new SoundEvent(new ResourceLocation("server", "gemido")));
		REGISTRY.put(new ResourceLocation("server", "alto_policia"), new SoundEvent(new ResourceLocation("server", "alto_policia")));
		REGISTRY.put(new ResourceLocation("server", "orden_en_la_sala"), new SoundEvent(new ResourceLocation("server", "orden_en_la_sala")));
		REGISTRY.put(new ResourceLocation("server", "shower"), new SoundEvent(new ResourceLocation("server", "shower")));
		REGISTRY.put(new ResourceLocation("server", "pilots21"), new SoundEvent(new ResourceLocation("server", "pilots21")));
		REGISTRY.put(new ResourceLocation("server", "musicatristenaruto"), new SoundEvent(new ResourceLocation("server", "musicatristenaruto")));
		REGISTRY.put(new ResourceLocation("server", "memyselfandi"), new SoundEvent(new ResourceLocation("server", "memyselfandi")));
		REGISTRY.put(new ResourceLocation("server", "esgratis"), new SoundEvent(new ResourceLocation("server", "esgratis")));
		REGISTRY.put(new ResourceLocation("server", "princesas"), new SoundEvent(new ResourceLocation("server", "princesas")));
		REGISTRY.put(new ResourceLocation("server", "sound123"), new SoundEvent(new ResourceLocation("server", "sound123")));
		REGISTRY.put(new ResourceLocation("server", "quemaspues"), new SoundEvent(new ResourceLocation("server", "quemaspues")));
		REGISTRY.put(new ResourceLocation("server", "juramentodesal"), new SoundEvent(new ResourceLocation("server", "juramentodesal")));
		REGISTRY.put(new ResourceLocation("server", "howdoyousleep"), new SoundEvent(new ResourceLocation("server", "howdoyousleep")));
		REGISTRY.put(new ResourceLocation("server", "sus"), new SoundEvent(new ResourceLocation("server", "sus")));
		REGISTRY.put(new ResourceLocation("server", "among_us"), new SoundEvent(new ResourceLocation("server", "among_us")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
