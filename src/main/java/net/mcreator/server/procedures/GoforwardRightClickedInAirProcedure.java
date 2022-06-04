package net.mcreator.server.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.server.init.ServerModItems;

public class GoforwardRightClickedInAirProcedure {
	public static void execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getYRot() < 0) {
			if (entity.getYRot() >= -30 || entity.getYRot() <= -330) {
				{
					Entity _ent = entity;
					_ent.teleportTo(x, y, (z + 6));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(x, y, (z + 6), _ent.getYRot(), _ent.getXRot());
				}
			} else {
				if (entity.getYRot() >= -60) {
					{
						Entity _ent = entity;
						_ent.teleportTo((x + 3), y, (z + 3));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((x + 3), y, (z + 3), _ent.getYRot(), _ent.getXRot());
					}
				} else {
					if (entity.getYRot() <= -300) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x - 3), y, (z + 3));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x - 3), y, (z + 3), _ent.getYRot(), _ent.getXRot());
						}
					} else {
						if (entity.getYRot() >= -120) {
							{
								Entity _ent = entity;
								_ent.teleportTo((x + 6), y, z);
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport((x + 6), y, z, _ent.getYRot(), _ent.getXRot());
							}
						} else {
							if (entity.getYRot() <= -240) {
								{
									Entity _ent = entity;
									_ent.teleportTo((x - 6), y, z);
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport((x - 6), y, z, _ent.getYRot(), _ent.getXRot());
								}
							} else {
								if (entity.getYRot() >= -150) {
									{
										Entity _ent = entity;
										_ent.teleportTo((x + 3), y, (z - 3));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((x + 3), y, (z - 3), _ent.getYRot(), _ent.getXRot());
									}
								} else {
									if (entity.getYRot() <= -210) {
										{
											Entity _ent = entity;
											_ent.teleportTo((x - 3), y, (z - 3));
											if (_ent instanceof ServerPlayer _serverPlayer)
												_serverPlayer.connection.teleport((x - 3), y, (z - 3), _ent.getYRot(), _ent.getXRot());
										}
									} else {
										if (entity.getYRot() >= -210 || entity.getYRot() <= -150) {
											{
												Entity _ent = entity;
												_ent.teleportTo(x, y, (z - 6));
												if (_ent instanceof ServerPlayer _serverPlayer)
													_serverPlayer.connection.teleport(x, y, (z - 6), _ent.getYRot(), _ent.getXRot());
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} else {
			if (entity.getYRot() < 30 || entity.getYRot() >= 330) {
				{
					Entity _ent = entity;
					_ent.teleportTo(x, y, (z + 6));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(x, y, (z + 6), _ent.getYRot(), _ent.getXRot());
				}
			} else {
				if (entity.getYRot() < 60) {
					{
						Entity _ent = entity;
						_ent.teleportTo((x - 3), y, (z + 3));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((x - 3), y, (z + 3), _ent.getYRot(), _ent.getXRot());
					}
				} else {
					if (entity.getYRot() > 300) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x + 3), y, (z + 3));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x + 3), y, (z + 3), _ent.getYRot(), _ent.getXRot());
						}
					} else {
						if (entity.getYRot() < 120) {
							{
								Entity _ent = entity;
								_ent.teleportTo((x - 6), y, z);
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport((x - 6), y, z, _ent.getYRot(), _ent.getXRot());
							}
						} else {
							if (entity.getYRot() > 240) {
								{
									Entity _ent = entity;
									_ent.teleportTo((x + 6), y, z);
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport((x + 6), y, z, _ent.getYRot(), _ent.getXRot());
								}
							} else {
								if (entity.getYRot() < 150) {
									{
										Entity _ent = entity;
										_ent.teleportTo((x - 3), y, (z - 3));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((x - 3), y, (z - 3), _ent.getYRot(), _ent.getXRot());
									}
								} else {
									if (entity.getYRot() > 210) {
										{
											Entity _ent = entity;
											_ent.teleportTo((x + 3), y, (z - 3));
											if (_ent instanceof ServerPlayer _serverPlayer)
												_serverPlayer.connection.teleport((x + 3), y, (z - 3), _ent.getYRot(), _ent.getXRot());
										}
									} else {
										if (entity.getYRot() < 210 || entity.getYRot() > 150) {
											{
												Entity _ent = entity;
												_ent.teleportTo(x, y, (z - 6));
												if (_ent instanceof ServerPlayer _serverPlayer)
													_serverPlayer.connection.teleport(x, y, (z - 6), _ent.getYRot(), _ent.getXRot());
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(ServerModItems.GOFORWARD.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
	}
}
