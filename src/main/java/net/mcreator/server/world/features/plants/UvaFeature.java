
package net.mcreator.server.world.features.plants;

import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.BlockColumnConfiguration;
import net.minecraft.world.level.levelgen.feature.RandomPatchFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.util.valueproviders.BiasedToBottomInt;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Holder;
import net.minecraft.core.BlockPos;

import net.mcreator.server.init.ServerV5ModBlocks;

import java.util.Set;
import java.util.List;

public class UvaFeature extends RandomPatchFeature {
	public static UvaFeature FEATURE = null;
	public static Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new UvaFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("server_v5:uva", FEATURE,
				FeatureUtils.simpleRandomPatchConfiguration(4,
						PlacementUtils.filtered(Feature.BLOCK_COLUMN,
								BlockColumnConfiguration.simple(BiasedToBottomInt.of(2, 4),
										BlockStateProvider.simple(ServerV5ModBlocks.UVA.get().defaultBlockState())),
								BlockPredicate.allOf(BlockPredicate.ONLY_IN_AIR_PREDICATE,
										BlockPredicate.wouldSurvive(ServerV5ModBlocks.UVA.get().defaultBlockState(), BlockPos.ZERO)))));
		PLACED_FEATURE = PlacementUtils.register("server_v5:uva", CONFIGURED_FEATURE, List.of(CountPlacement.of(1),
				RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("warped_forest"), new ResourceLocation("warm_ocean"),
			new ResourceLocation("frozen_river"), new ResourceLocation("mushroom_fields"), new ResourceLocation("stony_shore"),
			new ResourceLocation("end_midlands"), new ResourceLocation("deep_lukewarm_ocean"), new ResourceLocation("lush_caves"),
			new ResourceLocation("snowy_slopes"), new ResourceLocation("cold_ocean"), new ResourceLocation("the_end"),
			new ResourceLocation("deep_ocean"), new ResourceLocation("deep_frozen_ocean"), new ResourceLocation("nether_wastes"),
			new ResourceLocation("soul_sand_valley"), new ResourceLocation("small_end_islands"), new ResourceLocation("ice_spikes"),
			new ResourceLocation("lukewarm_ocean"), new ResourceLocation("stony_peaks"), new ResourceLocation("frozen_peaks"),
			new ResourceLocation("end_highlands"), new ResourceLocation("meadow"), new ResourceLocation("end_barrens"),
			new ResourceLocation("snowy_beach"), new ResourceLocation("frozen_ocean"), new ResourceLocation("savanna_plateau"),
			new ResourceLocation("basalt_deltas"), new ResourceLocation("dripstone_caves"), new ResourceLocation("snowy_plains"),
			new ResourceLocation("taiga"), new ResourceLocation("jagged_peaks"), new ResourceLocation("snowy_taiga"), new ResourceLocation("swamp"),
			new ResourceLocation("eroded_badlands"), new ResourceLocation("badlands"), new ResourceLocation("deep_cold_ocean"),
			new ResourceLocation("grove"), new ResourceLocation("windswept_hills"), new ResourceLocation("ocean"),
			new ResourceLocation("wooded_badlands"), new ResourceLocation("windswept_savanna"), new ResourceLocation("the_void"),
			new ResourceLocation("windswept_forest"), new ResourceLocation("windswept_gravelly_hills"), new ResourceLocation("desert"));
	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public UvaFeature() {
		super(RandomPatchConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<RandomPatchConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}
