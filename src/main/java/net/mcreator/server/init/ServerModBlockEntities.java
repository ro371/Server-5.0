
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
import net.mcreator.server.block.entity.PlanksmineBlockEntity;
import net.mcreator.server.block.entity.OakmineBlockEntity;
import net.mcreator.server.block.entity.IronmineBlockEntity;
import net.mcreator.server.block.entity.GoldmineBlockEntity;
import net.mcreator.server.block.entity.FurnacemineBlockEntity;
import net.mcreator.server.block.entity.EarthmineBlockEntity;
import net.mcreator.server.block.entity.DiamondmineBlockEntity;
import net.mcreator.server.block.entity.CraftingmineBlockEntity;
import net.mcreator.server.block.entity.CobblemineBlockEntity;
import net.mcreator.server.ServerMod;

public class ServerModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, ServerMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> SELL = register("sell", ServerModBlocks.SELL, SellBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> EARTHMINE = register("earthmine", ServerModBlocks.EARTHMINE, EarthmineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COBBLEMINE = register("cobblemine", ServerModBlocks.COBBLEMINE,
			CobblemineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CRAFTINGMINE = register("craftingmine", ServerModBlocks.CRAFTINGMINE,
			CraftingmineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FURNACEMINE = register("furnacemine", ServerModBlocks.FURNACEMINE,
			FurnacemineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> STONEMINE = register("stonemine", ServerModBlocks.STONEMINE, StonemineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SANDMINE = register("sandmine", ServerModBlocks.SANDMINE, SandmineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> IRONMINE = register("ironmine", ServerModBlocks.IRONMINE, IronmineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GOLDMINE = register("goldmine", ServerModBlocks.GOLDMINE, GoldmineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DIAMONDMINE = register("diamondmine", ServerModBlocks.DIAMONDMINE,
			DiamondmineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PLANKSMINE = register("planksmine", ServerModBlocks.PLANKSMINE,
			PlanksmineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OAKMINE = register("oakmine", ServerModBlocks.OAKMINE, OakmineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> QUARTZMINE = register("quartzmine", ServerModBlocks.QUARTZMINE,
			QuartzmineBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
