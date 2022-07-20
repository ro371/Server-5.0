
package net.mcreator.server.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.server.procedures.AguaCalienteMobplayerCollidesBlockProcedure;
import net.mcreator.server.init.ServerModFluids;

public class AGUACALIENTEBlock extends LiquidBlock {
	public AGUACALIENTEBlock() {
		super(() -> (FlowingFluid) ServerModFluids.AGUACALIENTE.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)
				.hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 5));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		AguaCalienteMobplayerCollidesBlockProcedure.execute(entity);
	}
}
