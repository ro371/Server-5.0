package net.mcreator.server.procedures;

import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;

import net.mcreator.server.network.ServerModVariables;

import java.util.function.Supplier;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;

public class CheckupdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double count = 0;
		count = 0;
		{
			AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
			entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _iitemhandlerref.set(capability));
			if (_iitemhandlerref.get() != null) {
				for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
					ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
					if ((new Object() {
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
							3)).getItem() == itemstackiterator.getItem()) {
						count = count + (itemstackiterator).getCount();
					}
				}
			}
		}
		if (count >= new Object() {
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
				2)) {
			if (new Object() {
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
					1) <= new Object() {
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
							0)) {
				if (64 - new Object() {
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
						4) >= new Object() {
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
								2)) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						ItemStack _setstack = (new Object() {
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
						_setstack.setCount(new Object() {
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
								1));
						((Slot) _slots.get(5)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						((Slot) _slots.get(5)).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
				}
			} else {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					((Slot) _slots.get(5)).set(ItemStack.EMPTY);
					_player.containerMenu.broadcastChanges();
				}
			}
		} else {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(5)).set(ItemStack.EMPTY);
				_player.containerMenu.broadcastChanges();
			}
		}
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private LevelAccessor world;

			public void start(LevelAccessor world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				if ((entity.getCapability(ServerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ServerModVariables.PlayerVariables())).guishopopen == true) {
					CheckupdateProcedure.execute(world, entity);
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 4);
	}
}
