package net.mcreator.server.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.MinecraftServer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.core.BlockPos;
import net.minecraft.Util;

import net.mcreator.server.network.ServerModVariables;
import net.mcreator.server.entity.HeroEntity;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class AppearProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastMessage(new TextComponent(ServerModVariables.MapVariables.get(world).HeroTarget), ChatType.SYSTEM,
						Util.NIL_UUID);
		}
		{
			List<? extends Player> _players = new ArrayList<>(world.players());
			for (Entity entityiterator : _players) {
				if ((entityiterator.getDisplayName().getString()).equals(ServerModVariables.MapVariables.get(world).HeroTarget)) {
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
							if (!world.getEntitiesOfClass(HeroEntity.class,
									AABB.ofSize(new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ())), 38, 38, 38),
									e -> true).isEmpty()) {
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
										if (Mth.nextInt(new Random(), 1, 20) == 1) {
											if ((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) >= 10) {
												entityiterator.hurt(DamageSource.OUT_OF_WORLD, (float) Math
														.ceil((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) / 2));
											}
											if (world instanceof ServerLevel _level) {
												LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
												entityToSpawn
														.moveTo(Vec3.atBottomCenterOf(new BlockPos(entity.getX(), entity.getY(), entity.getZ())));
												entityToSpawn.setVisualOnly(true);
												_level.addFreshEntity(entityToSpawn);
											}
											if (!entity.level.isClientSide())
												entity.discard();
											if (world instanceof Level _level) {
												if (!_level.isClientSide()) {
													_level.playSound(null,
															new BlockPos(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()),
															ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.hurt")),
															SoundSource.MASTER, 1, 1);
												} else {
													_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()),
															ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ghast.hurt")),
															SoundSource.MASTER, 1, 1, false);
												}
											}
										} else {
											{
												Entity _ent = entity;
												_ent.teleportTo((Mth.nextInt(new Random(), -120, 120) + entityiterator.getX()),
														(Mth.nextInt(new Random(), -10, 10) + entityiterator.getY()),
														(Mth.nextInt(new Random(), -120, 120) + entityiterator.getZ()));
												if (_ent instanceof ServerPlayer _serverPlayer)
													_serverPlayer.connection.teleport((Mth.nextInt(new Random(), -120, 120) + entityiterator.getX()),
															(Mth.nextInt(new Random(), -10, 10) + entityiterator.getY()),
															(Mth.nextInt(new Random(), -120, 120) + entityiterator.getZ()), _ent.getYRot(),
															_ent.getXRot());
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
													if (Mth.nextInt(new Random(), 1, 6) == 1) {
														if (!entity.level.isClientSide())
															entity.discard();
													} else {
														AppearProcedure.execute(world, entity);
													}
													MinecraftForge.EVENT_BUS.unregister(this);
												}
											}.start(world, 10);
										}
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, 60);
							} else {
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
										if (Mth.nextInt(new Random(), 1, 10) == 1) {
											if (!entity.level.isClientSide())
												entity.discard();
										} else {
											if (Mth.nextInt(new Random(), 1, 8) == 1) {
												{
													Entity _ent = entity;
													_ent.teleportTo((Mth.nextInt(new Random(), -120, 120) + entityiterator.getX()),
															(Mth.nextInt(new Random(), -10, 10) + entityiterator.getY()),
															(Mth.nextInt(new Random(), -120, 120) + entityiterator.getZ()));
													if (_ent instanceof ServerPlayer _serverPlayer)
														_serverPlayer.connection.teleport(
																(Mth.nextInt(new Random(), -120, 120) + entityiterator.getX()),
																(Mth.nextInt(new Random(), -10, 10) + entityiterator.getY()),
																(Mth.nextInt(new Random(), -120, 120) + entityiterator.getZ()), _ent.getYRot(),
																_ent.getXRot());
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
														AppearProcedure.execute(world, entity);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, 80);
											} else {
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
														AppearProcedure.execute(world, entity);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, 100);
											}
										}
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, 200);
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 80);
				}
			}
		}
	}
}
