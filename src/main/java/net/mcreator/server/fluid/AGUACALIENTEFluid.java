
package net.mcreator.server.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.BlockPos;

import net.mcreator.server.init.ServerModItems;
import net.mcreator.server.init.ServerModFluids;
import net.mcreator.server.init.ServerModBlocks;
import net.mcreator.server.fluid.attributes.AGUACALIENTEFluidAttributes;

public abstract class AGUACALIENTEFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(ServerModFluids.AGUACALIENTE,
			ServerModFluids.FLOWING_AGUACALIENTE,
			AGUACALIENTEFluidAttributes
					.builder(new ResourceLocation("server:blocks/static_water"), new ResourceLocation("server:blocks/flowing_hot_water"))
					.luminosity(4)

					.viscosity(600).temperature(400)

					.color(-13083194))
			.explosionResistance(100f)

			.bucket(ServerModItems.AGUACALIENTE_BUCKET).block(() -> (LiquidBlock) ServerModBlocks.AGUACALIENTE.get());

	private AGUACALIENTEFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.EXPLOSION;
	}

	@Override
	public Vec3 getFlow(BlockGetter world, BlockPos pos, FluidState fluidstate) {
		return super.getFlow(world, pos, fluidstate).scale(0.8);
	}

	public static class Source extends AGUACALIENTEFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends AGUACALIENTEFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
