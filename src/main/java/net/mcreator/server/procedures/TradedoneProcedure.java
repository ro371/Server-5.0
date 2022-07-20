package net.mcreator.server.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.server.network.ServerModVariables;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

public class TradedoneProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos(
					(entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ServerModVariables.PlayerVariables())).x,
					(entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ServerModVariables.PlayerVariables())).y,
					(entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ServerModVariables.PlayerVariables())).z));
			if (_ent != null) {
				final int _slotid = 0;
				final ItemStack _setstack = (new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
									.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world,
						new BlockPos(
								(entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new ServerModVariables.PlayerVariables())).x,
								(entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new ServerModVariables.PlayerVariables())).y,
								(entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new ServerModVariables.PlayerVariables())).z),
						0));
				_setstack.setCount((int) (new Object() {
					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
									.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
						return _retval.get();
					}
				}.getAmount(world,
						new BlockPos(
								(entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new ServerModVariables.PlayerVariables())).x,
								(entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new ServerModVariables.PlayerVariables())).y,
								(entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new ServerModVariables.PlayerVariables())).z),
						0) - new Object() {
							public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicInteger _retval = new AtomicInteger(0);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
											.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
								return _retval.get();
							}
						}.getAmount(world,
								new BlockPos(
										(entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new ServerModVariables.PlayerVariables())).x,
										(entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new ServerModVariables.PlayerVariables())).y,
										(entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new ServerModVariables.PlayerVariables())).z),
								1)));
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable)
						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(new BlockPos(
					(entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ServerModVariables.PlayerVariables())).x,
					(entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ServerModVariables.PlayerVariables())).y,
					(entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ServerModVariables.PlayerVariables())).z));
			if (_ent != null) {
				final int _slotid = 4;
				final ItemStack _setstack = (new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
									.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world,
						new BlockPos(
								(entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new ServerModVariables.PlayerVariables())).x,
								(entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new ServerModVariables.PlayerVariables())).y,
								(entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new ServerModVariables.PlayerVariables())).z),
						3));
				_setstack.setCount((int) (new Object() {
					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
									.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
						return _retval.get();
					}
				}.getAmount(world,
						new BlockPos(
								(entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new ServerModVariables.PlayerVariables())).x,
								(entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new ServerModVariables.PlayerVariables())).y,
								(entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new ServerModVariables.PlayerVariables())).z),
						2) + new Object() {
							public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
								AtomicInteger _retval = new AtomicInteger(0);
								BlockEntity _ent = world.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
											.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
								return _retval.get();
							}
						}.getAmount(world,
								new BlockPos(
										(entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new ServerModVariables.PlayerVariables())).x,
										(entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new ServerModVariables.PlayerVariables())).y,
										(entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new ServerModVariables.PlayerVariables())).z),
								4)));
				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable)
						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
				});
			}
		}
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = (new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
								.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
					return _retval.get();
				}
			}.getItemStack(world, new BlockPos(
					(entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ServerModVariables.PlayerVariables())).x,
					(entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ServerModVariables.PlayerVariables())).y,
					(entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ServerModVariables.PlayerVariables())).z),
					3));
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), new Object() {
				public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
								.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
					return _retval.get();
				}
			}.getAmount(world, new BlockPos(
					(entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ServerModVariables.PlayerVariables())).x,
					(entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ServerModVariables.PlayerVariables())).y,
					(entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ServerModVariables.PlayerVariables())).z),
					2), _player.inventoryMenu.getCraftSlots());
		}
	}
}
