
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.server.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.server.block.entity.StonemineBlockEntity;
import net.mcreator.server.block.entity.SellBlockEntity;
import net.mcreator.server.block.entity.SandmineBlockEntity;
import net.mcreator.server.block.entity.QuartzmineBlockEntity;
import net.mcreator.server.block.entity.PrensaBlockEntity;
import net.mcreator.server.block.entity.PlanksmineBlockEntity;
import net.mcreator.server.block.entity.OakmineBlockEntity;
import net.mcreator.server.block.entity.IronmineBlockEntity;
import net.mcreator.server.block.entity.GoldmineBlockEntity;
import net.mcreator.server.block.entity.FurnacemineBlockEntity;
import net.mcreator.server.block.entity.EarthmineBlockEntity;
import net.mcreator.server.block.entity.DiamondmineBlockEntity;
import net.mcreator.server.block.entity.CraftingmineBlockEntity;
import net.mcreator.server.block.entity.CobblemineBlockEntity;
import net.mcreator.server.block.entity.BarrilBlockEntity;
import net.mcreator.server.ServerV5Mod;

public class ServerV5ModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, ServerV5Mod.MODID);
	public static final RegistryObject<BlockEntityType<?>> SELL = register("sell", ServerV5ModBlocks.SELL, SellBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> EARTHMINE = register("earthmine", ServerV5ModBlocks.EARTHMINE, EarthmineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COBBLEMINE = register("cobblemine", ServerV5ModBlocks.COBBLEMINE,
			CobblemineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CRAFTINGMINE = register("craftingmine", ServerV5ModBlocks.CRAFTINGMINE,
			CraftingmineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FURNACEMINE = register("furnacemine", ServerV5ModBlocks.FURNACEMINE,
			FurnacemineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> STONEMINE = register("stonemine", ServerV5ModBlocks.STONEMINE, StonemineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SANDMINE = register("sandmine", ServerV5ModBlocks.SANDMINE, SandmineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> IRONMINE = register("ironmine", ServerV5ModBlocks.IRONMINE, IronmineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GOLDMINE = register("goldmine", ServerV5ModBlocks.GOLDMINE, GoldmineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DIAMONDMINE = register("diamondmine", ServerV5ModBlocks.DIAMONDMINE,
			DiamondmineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PLANKSMINE = register("planksmine", ServerV5ModBlocks.PLANKSMINE,
			PlanksmineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OAKMINE = register("oakmine", ServerV5ModBlocks.OAKMINE, OakmineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> QUARTZMINE = register("quartzmine", ServerV5ModBlocks.QUARTZMINE,
			QuartzmineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BARRIL = register("barril", ServerV5ModBlocks.BARRIL, BarrilBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PRENSA = register("prensa", ServerV5ModBlocks.PRENSA, PrensaBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
