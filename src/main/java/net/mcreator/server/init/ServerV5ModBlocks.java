
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.server.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.server.block.VentBlock;
import net.mcreator.server.block.UvaBlock;
import net.mcreator.server.block.StonemineBlock;
import net.mcreator.server.block.SellBlock;
import net.mcreator.server.block.SandmineBlock;
import net.mcreator.server.block.QuartzmineBlock;
import net.mcreator.server.block.PrensaBlock;
import net.mcreator.server.block.PlanksmineBlock;
import net.mcreator.server.block.OakmineBlock;
import net.mcreator.server.block.IronmineBlock;
import net.mcreator.server.block.GoldmineBlock;
import net.mcreator.server.block.FurnacemineBlock;
import net.mcreator.server.block.EarthmineBlock;
import net.mcreator.server.block.DiamondmineBlock;
import net.mcreator.server.block.CraftingmineBlock;
import net.mcreator.server.block.CobblemineBlock;
import net.mcreator.server.block.BarrilBlock;
import net.mcreator.server.block.AGUACALIENTEBlock;
import net.mcreator.server.ServerV5Mod;

public class ServerV5ModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ServerV5Mod.MODID);
	public static final RegistryObject<Block> SELL = REGISTRY.register("sell", () -> new SellBlock());
	public static final RegistryObject<Block> VENT = REGISTRY.register("vent", () -> new VentBlock());
	public static final RegistryObject<Block> AGUACALIENTE = REGISTRY.register("aguacaliente", () -> new AGUACALIENTEBlock());
	public static final RegistryObject<Block> EARTHMINE = REGISTRY.register("earthmine", () -> new EarthmineBlock());
	public static final RegistryObject<Block> COBBLEMINE = REGISTRY.register("cobblemine", () -> new CobblemineBlock());
	public static final RegistryObject<Block> CRAFTINGMINE = REGISTRY.register("craftingmine", () -> new CraftingmineBlock());
	public static final RegistryObject<Block> FURNACEMINE = REGISTRY.register("furnacemine", () -> new FurnacemineBlock());
	public static final RegistryObject<Block> STONEMINE = REGISTRY.register("stonemine", () -> new StonemineBlock());
	public static final RegistryObject<Block> SANDMINE = REGISTRY.register("sandmine", () -> new SandmineBlock());
	public static final RegistryObject<Block> IRONMINE = REGISTRY.register("ironmine", () -> new IronmineBlock());
	public static final RegistryObject<Block> GOLDMINE = REGISTRY.register("goldmine", () -> new GoldmineBlock());
	public static final RegistryObject<Block> DIAMONDMINE = REGISTRY.register("diamondmine", () -> new DiamondmineBlock());
	public static final RegistryObject<Block> PLANKSMINE = REGISTRY.register("planksmine", () -> new PlanksmineBlock());
	public static final RegistryObject<Block> OAKMINE = REGISTRY.register("oakmine", () -> new OakmineBlock());
	public static final RegistryObject<Block> QUARTZMINE = REGISTRY.register("quartzmine", () -> new QuartzmineBlock());
	public static final RegistryObject<Block> BARRIL = REGISTRY.register("barril", () -> new BarrilBlock());
	public static final RegistryObject<Block> UVA = REGISTRY.register("uva", () -> new UvaBlock());
	public static final RegistryObject<Block> PRENSA = REGISTRY.register("prensa", () -> new PrensaBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			VentBlock.registerRenderLayer();
			BarrilBlock.registerRenderLayer();
			UvaBlock.registerRenderLayer();
			PrensaBlock.registerRenderLayer();
		}
	}
}
