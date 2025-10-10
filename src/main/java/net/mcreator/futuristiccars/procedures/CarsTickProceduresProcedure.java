package net.mcreator.futuristiccars.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.futuristiccars.network.FuturisticcarsModVariables;
import net.mcreator.futuristiccars.entity.WingedFlyingCarWhiteEntity;
import net.mcreator.futuristiccars.entity.WingedFlyingCarRedEntity;
import net.mcreator.futuristiccars.entity.WingedFlyingCarEntity;
import net.mcreator.futuristiccars.entity.InfiniteCarWhiteEntity;
import net.mcreator.futuristiccars.entity.InfiniteCarRedEntity;
import net.mcreator.futuristiccars.entity.InfiniteCarEntity;
import net.mcreator.futuristiccars.entity.FlyingCarYellowEntity;
import net.mcreator.futuristiccars.entity.FlyingCarRedEntity;
import net.mcreator.futuristiccars.entity.FlyingCarEntity;
import net.mcreator.futuristiccars.entity.FastestFlyingCarWhiteEntity;
import net.mcreator.futuristiccars.entity.FastestFlyingCarRedEntity;
import net.mcreator.futuristiccars.entity.FastestFlyingCarEntity;
import net.mcreator.futuristiccars.entity.CatsonFlyingCarYellowEntity;
import net.mcreator.futuristiccars.entity.CatsonFlyingCarRedEntity;
import net.mcreator.futuristiccars.entity.CatsonFlyingCarEntity;
import net.mcreator.futuristiccars.entity.AdvancedFlyingCarYelliowEntity;
import net.mcreator.futuristiccars.entity.AdvancedFlyingCarWhiteEntity;
import net.mcreator.futuristiccars.entity.AdvancedFlyingCarEntity;
import net.mcreator.futuristiccars.FuturisticcarsMod;

import com.mojang.blaze3d.platform.InputConstants;

public class CarsTickProceduresProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("futuristiccars:flyingcar")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("futuristiccars:flyingcar")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		if (entity.isVehicle()) {
			if (entity instanceof Player _player) {
				_player.getAbilities().invulnerable = true;
				_player.onUpdateAbilities();
			}
		} else {
			if (entity instanceof Player _player) {
				_player.getAbilities().invulnerable = false;
				_player.onUpdateAbilities();
			}
		}
		if (InputConstants.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), InputConstants.KEY_Z)) {
			if (entity.isVehicle()) {
				if (entity instanceof InfiniteCarEntity) {
					FuturisticcarsModVariables.Y = FuturisticcarsModVariables.Y + 0.09;
				}
				if (entity instanceof InfiniteCarRedEntity) {
					FuturisticcarsModVariables.Y = FuturisticcarsModVariables.Y + 0.09;
				}
				if (entity instanceof InfiniteCarWhiteEntity) {
					FuturisticcarsModVariables.Y = FuturisticcarsModVariables.Y + 0.09;
				}
			}
		}
		if (InputConstants.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), InputConstants.KEY_X)) {
			if (entity.isVehicle()) {
				if (entity instanceof InfiniteCarEntity) {
					FuturisticcarsModVariables.Y = FuturisticcarsModVariables.Y - 0.09;
				}
				if (entity instanceof InfiniteCarRedEntity) {
					FuturisticcarsModVariables.Y = FuturisticcarsModVariables.Y - 0.09;
				}
				if (entity instanceof InfiniteCarWhiteEntity) {
					FuturisticcarsModVariables.Y = FuturisticcarsModVariables.Y - 0.09;
				}
			}
		}
		if (InputConstants.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), InputConstants.KEY_D)) {
			if (entity.isVehicle()) {
				if (entity instanceof InfiniteCarEntity) {
					{
						Entity _ent = entity;
						_ent.setYRot((float) (entity.getYRot() + 3));
						_ent.setXRot(entity.getXRot());
						_ent.setYBodyRot(_ent.getYRot());
						_ent.setYHeadRot(_ent.getYRot());
						_ent.yRotO = _ent.getYRot();
						_ent.xRotO = _ent.getXRot();
						if (_ent instanceof LivingEntity _entity) {
							_entity.yBodyRotO = _entity.getYRot();
							_entity.yHeadRotO = _entity.getYRot();
						}
					}
					if (entity instanceof InfiniteCarEntity) {
						((InfiniteCarEntity) entity).setAnimation("mover");
					}
					if (entity instanceof InfiniteCarRedEntity) {
						((InfiniteCarRedEntity) entity).setAnimation("mover");
					}
					if (entity instanceof InfiniteCarWhiteEntity) {
						((InfiniteCarWhiteEntity) entity).setAnimation("mover");
					}
				}
				if (entity instanceof InfiniteCarRedEntity) {
					if (entity instanceof InfiniteCarEntity) {
						((InfiniteCarEntity) entity).setAnimation("mover");
					}
					if (entity instanceof InfiniteCarRedEntity) {
						((InfiniteCarRedEntity) entity).setAnimation("mover");
					}
					if (entity instanceof InfiniteCarWhiteEntity) {
						((InfiniteCarWhiteEntity) entity).setAnimation("mover");
					}
					{
						Entity _ent = entity;
						_ent.setYRot((float) (entity.getYRot() + 3));
						_ent.setXRot(entity.getXRot());
						_ent.setYBodyRot(_ent.getYRot());
						_ent.setYHeadRot(_ent.getYRot());
						_ent.yRotO = _ent.getYRot();
						_ent.xRotO = _ent.getXRot();
						if (_ent instanceof LivingEntity _entity) {
							_entity.yBodyRotO = _entity.getYRot();
							_entity.yHeadRotO = _entity.getYRot();
						}
					}
				}
				if (entity instanceof InfiniteCarWhiteEntity) {
					if (entity instanceof InfiniteCarRedEntity) {
						((InfiniteCarRedEntity) entity).setAnimation("mover");
					}
					if (entity instanceof InfiniteCarWhiteEntity) {
						((InfiniteCarWhiteEntity) entity).setAnimation("mover");
					}
					if (entity instanceof InfiniteCarEntity) {
						((InfiniteCarEntity) entity).setAnimation("mover");
					}
					{
						Entity _ent = entity;
						_ent.setYRot((float) (entity.getYRot() + 3));
						_ent.setXRot(entity.getXRot());
						_ent.setYBodyRot(_ent.getYRot());
						_ent.setYHeadRot(_ent.getYRot());
						_ent.yRotO = _ent.getYRot();
						_ent.xRotO = _ent.getXRot();
						if (_ent instanceof LivingEntity _entity) {
							_entity.yBodyRotO = _entity.getYRot();
							_entity.yHeadRotO = _entity.getYRot();
						}
					}
				}
			}
		}
		if (InputConstants.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), InputConstants.KEY_A)) {
			if (entity.isVehicle()) {
				if (entity instanceof InfiniteCarEntity) {
					{
						Entity _ent = entity;
						_ent.setYRot((float) (entity.getYRot() - 3));
						_ent.setXRot(entity.getXRot());
						_ent.setYBodyRot(_ent.getYRot());
						_ent.setYHeadRot(_ent.getYRot());
						_ent.yRotO = _ent.getYRot();
						_ent.xRotO = _ent.getXRot();
						if (_ent instanceof LivingEntity _entity) {
							_entity.yBodyRotO = _entity.getYRot();
							_entity.yHeadRotO = _entity.getYRot();
						}
					}
					if (entity instanceof InfiniteCarEntity) {
						((InfiniteCarEntity) entity).setAnimation("moveleft");
					}
					if (entity instanceof InfiniteCarRedEntity) {
						((InfiniteCarRedEntity) entity).setAnimation("moveleft");
					}
					if (entity instanceof InfiniteCarWhiteEntity) {
						((InfiniteCarWhiteEntity) entity).setAnimation("moveleft");
					}
				}
				if (entity instanceof InfiniteCarRedEntity) {
					if (entity instanceof InfiniteCarEntity) {
						((InfiniteCarEntity) entity).setAnimation("moveleft");
					}
					if (entity instanceof InfiniteCarRedEntity) {
						((InfiniteCarRedEntity) entity).setAnimation("moveleft");
					}
					if (entity instanceof InfiniteCarWhiteEntity) {
						((InfiniteCarWhiteEntity) entity).setAnimation("moveleft");
					}
					{
						Entity _ent = entity;
						_ent.setYRot((float) (entity.getYRot() - 3));
						_ent.setXRot(entity.getXRot());
						_ent.setYBodyRot(_ent.getYRot());
						_ent.setYHeadRot(_ent.getYRot());
						_ent.yRotO = _ent.getYRot();
						_ent.xRotO = _ent.getXRot();
						if (_ent instanceof LivingEntity _entity) {
							_entity.yBodyRotO = _entity.getYRot();
							_entity.yHeadRotO = _entity.getYRot();
						}
					}
				}
				if (entity instanceof InfiniteCarWhiteEntity) {
					if (entity instanceof InfiniteCarRedEntity) {
						((InfiniteCarRedEntity) entity).setAnimation("moveleft");
					}
					if (entity instanceof InfiniteCarWhiteEntity) {
						((InfiniteCarWhiteEntity) entity).setAnimation("moveleft");
					}
					if (entity instanceof InfiniteCarEntity) {
						((InfiniteCarEntity) entity).setAnimation("moveleft");
					}
					{
						Entity _ent = entity;
						_ent.setYRot((float) (entity.getYRot() - 3));
						_ent.setXRot(entity.getXRot());
						_ent.setYBodyRot(_ent.getYRot());
						_ent.setYHeadRot(_ent.getYRot());
						_ent.yRotO = _ent.getYRot();
						_ent.xRotO = _ent.getXRot();
						if (_ent instanceof LivingEntity _entity) {
							_entity.yBodyRotO = _entity.getYRot();
							_entity.yHeadRotO = _entity.getYRot();
						}
					}
				}
			}
		}
		if (FuturisticcarsModVariables.normalcar > 0) {
			if (entity.isVehicle()) {
				if (InputConstants.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), InputConstants.KEY_Z)) {
					if (entity.isVehicle()) {
						FuturisticcarsModVariables.moveup = 1;
						if (entity instanceof InfiniteCarEntity) {
							FuturisticcarsModVariables.Y = FuturisticcarsModVariables.Y + 0.09;
						}
						if (entity instanceof InfiniteCarRedEntity) {
							FuturisticcarsModVariables.Y = FuturisticcarsModVariables.Y + 0.09;
						}
						if (entity instanceof InfiniteCarWhiteEntity) {
							FuturisticcarsModVariables.Y = FuturisticcarsModVariables.Y + 0.09;
						}
						FuturisticcarsMod.queueServerWork(40, () -> {
							FuturisticcarsModVariables.moveup = FuturisticcarsModVariables.moveup - 1;
						});
					}
				} else {
					FuturisticcarsModVariables.moveup = 0;
				}
				if (InputConstants.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), InputConstants.KEY_X)) {
					if (entity.isVehicle()) {
						FuturisticcarsModVariables.movedown = 1;
						if (entity instanceof InfiniteCarEntity) {
							FuturisticcarsModVariables.Y = FuturisticcarsModVariables.Y - 0.09;
						}
						if (entity instanceof InfiniteCarRedEntity) {
							FuturisticcarsModVariables.Y = FuturisticcarsModVariables.Y - 0.09;
						}
						if (entity instanceof InfiniteCarWhiteEntity) {
							FuturisticcarsModVariables.Y = FuturisticcarsModVariables.Y - 0.09;
						}
					}
				} else {
					FuturisticcarsModVariables.movedown = 0;
				}
				if (entity.isVehicle()) {
					if (FuturisticcarsModVariables.moveup == 1) {
						FuturisticcarsMod.queueServerWork(40, () -> {
							FuturisticcarsModVariables.moveup = FuturisticcarsModVariables.moveup - 1;
						});
						FuturisticcarsModVariables.Y = FuturisticcarsModVariables.Y + 0.09;
						entity.setDeltaMovement(new Vec3(0, 0.09, 0));
					}
				}
				if (entity.isVehicle()) {
					if (FuturisticcarsModVariables.moveup == 0) {
						FuturisticcarsModVariables.Y = 0;
					}
				}
				if (entity.isVehicle()) {
					if (FuturisticcarsModVariables.movedown == 1) {
						FuturisticcarsModVariables.Y = FuturisticcarsModVariables.Y - 0.09;
						entity.setDeltaMovement(new Vec3(0, (-0.09), 0));
					}
				}
				if (entity.isVehicle()) {
					if (FuturisticcarsModVariables.movedown == 0) {
						FuturisticcarsModVariables.Y = 0;
					}
				}
				if (entity.isVehicle()) {
					if (Minecraft.getInstance().options.keyLeft.isDown()) {
						{
							Entity _ent = entity;
							_ent.setYRot((float) (entity.getYRot() - 3));
							_ent.setXRot(entity.getXRot());
							_ent.setYBodyRot(_ent.getYRot());
							_ent.setYHeadRot(_ent.getYRot());
							_ent.yRotO = _ent.getYRot();
							_ent.xRotO = _ent.getXRot();
							if (_ent instanceof LivingEntity _entity) {
								_entity.yBodyRotO = _entity.getYRot();
								_entity.yHeadRotO = _entity.getYRot();
							}
						}
						if (entity instanceof FlyingCarEntity) {
							((FlyingCarEntity) entity).setAnimation("moveleft");
						}
						if (entity instanceof AdvancedFlyingCarEntity) {
							((AdvancedFlyingCarEntity) entity).setAnimation("moveleft");
						}
						if (entity instanceof CatsonFlyingCarEntity) {
							((CatsonFlyingCarEntity) entity).setAnimation("moveleft");
						}
						if (entity instanceof FastestFlyingCarEntity) {
							((FastestFlyingCarEntity) entity).setAnimation("moveleft");
						}
						if (entity instanceof WingedFlyingCarEntity) {
							((WingedFlyingCarEntity) entity).setAnimation("moveleft");
						}
						if (entity instanceof AdvancedFlyingCarWhiteEntity) {
							((AdvancedFlyingCarWhiteEntity) entity).setAnimation("moveleft");
						}
						if (entity instanceof AdvancedFlyingCarYelliowEntity) {
							((AdvancedFlyingCarYelliowEntity) entity).setAnimation("moveleft");
						}
						if (entity instanceof FastestFlyingCarRedEntity) {
							((FastestFlyingCarRedEntity) entity).setAnimation("moveleft");
						}
						if (entity instanceof FastestFlyingCarWhiteEntity) {
							((FastestFlyingCarWhiteEntity) entity).setAnimation("moveleft");
						}
						if (entity instanceof FlyingCarRedEntity) {
							((FlyingCarRedEntity) entity).setAnimation("moveleft");
						}
						if (entity instanceof FlyingCarYellowEntity) {
							((FlyingCarYellowEntity) entity).setAnimation("moveleft");
						}
						if (entity instanceof WingedFlyingCarRedEntity) {
							((WingedFlyingCarRedEntity) entity).setAnimation("moveleft");
						}
						if (entity instanceof WingedFlyingCarWhiteEntity) {
							((WingedFlyingCarWhiteEntity) entity).setAnimation("moveleft");
						}
					} else {
						if (Minecraft.getInstance().options.keyRight.isDown()) {
							if (entity instanceof FlyingCarEntity) {
								((FlyingCarEntity) entity).setAnimation("mover");
							}
							if (entity instanceof AdvancedFlyingCarEntity) {
								((AdvancedFlyingCarEntity) entity).setAnimation("mover");
							}
							if (entity instanceof CatsonFlyingCarEntity) {
								((CatsonFlyingCarEntity) entity).setAnimation("mover");
							}
							if (entity instanceof FastestFlyingCarEntity) {
								((FastestFlyingCarEntity) entity).setAnimation("mover");
							}
							if (entity instanceof WingedFlyingCarEntity) {
								((WingedFlyingCarEntity) entity).setAnimation("mover");
							}
							if (entity instanceof AdvancedFlyingCarWhiteEntity) {
								((AdvancedFlyingCarWhiteEntity) entity).setAnimation("mover");
							}
							if (entity instanceof AdvancedFlyingCarYelliowEntity) {
								((AdvancedFlyingCarYelliowEntity) entity).setAnimation("mover");
							}
							if (entity instanceof FastestFlyingCarRedEntity) {
								((FastestFlyingCarRedEntity) entity).setAnimation("mover");
							}
							if (entity instanceof FastestFlyingCarWhiteEntity) {
								((FastestFlyingCarWhiteEntity) entity).setAnimation("mover");
							}
							if (entity instanceof FlyingCarRedEntity) {
								((FlyingCarRedEntity) entity).setAnimation("mover");
							}
							if (entity instanceof FlyingCarYellowEntity) {
								((FlyingCarYellowEntity) entity).setAnimation("mover");
							}
							if (entity instanceof WingedFlyingCarRedEntity) {
								((WingedFlyingCarRedEntity) entity).setAnimation("mover");
							}
							if (entity instanceof WingedFlyingCarWhiteEntity) {
								((WingedFlyingCarWhiteEntity) entity).setAnimation("mover");
							}
							{
								Entity _ent = entity;
								_ent.setYRot((float) (entity.getYRot() + 3));
								_ent.setXRot(entity.getXRot());
								_ent.setYBodyRot(_ent.getYRot());
								_ent.setYHeadRot(_ent.getYRot());
								_ent.yRotO = _ent.getYRot();
								_ent.xRotO = _ent.getXRot();
								if (_ent instanceof LivingEntity _entity) {
									_entity.yBodyRotO = _entity.getYRot();
									_entity.yHeadRotO = _entity.getYRot();
								}
							}
						} else {
							if (entity instanceof FlyingCarEntity) {
								((FlyingCarEntity) entity).setAnimation("empty");
							}
							if (entity instanceof AdvancedFlyingCarEntity) {
								((AdvancedFlyingCarEntity) entity).setAnimation("empty");
							}
							if (entity instanceof CatsonFlyingCarEntity) {
								((CatsonFlyingCarEntity) entity).setAnimation("empty");
							}
							if (entity instanceof FastestFlyingCarEntity) {
								((FastestFlyingCarEntity) entity).setAnimation("empty");
							}
							if (entity instanceof WingedFlyingCarEntity) {
								((WingedFlyingCarEntity) entity).setAnimation("empty");
							}
							if (entity instanceof AdvancedFlyingCarWhiteEntity) {
								((AdvancedFlyingCarWhiteEntity) entity).setAnimation("empty");
							}
							if (entity instanceof AdvancedFlyingCarYelliowEntity) {
								((AdvancedFlyingCarYelliowEntity) entity).setAnimation("empty");
							}
							if (entity instanceof CatsonFlyingCarRedEntity) {
								((CatsonFlyingCarRedEntity) entity).setAnimation("empty");
							}
							if (entity instanceof CatsonFlyingCarYellowEntity) {
								((CatsonFlyingCarYellowEntity) entity).setAnimation("empty");
							}
							if (entity instanceof FastestFlyingCarRedEntity) {
								((FastestFlyingCarRedEntity) entity).setAnimation("empty");
							}
							if (entity instanceof FastestFlyingCarWhiteEntity) {
								((FastestFlyingCarWhiteEntity) entity).setAnimation("empty");
							}
							if (entity instanceof FlyingCarRedEntity) {
								((FlyingCarRedEntity) entity).setAnimation("empty");
							}
							if (entity instanceof FlyingCarYellowEntity) {
								((FlyingCarYellowEntity) entity).setAnimation("empty");
							}
							if (entity instanceof WingedFlyingCarRedEntity) {
								((WingedFlyingCarRedEntity) entity).setAnimation("empty");
							}
							if (entity instanceof WingedFlyingCarWhiteEntity) {
								((WingedFlyingCarWhiteEntity) entity).setAnimation("empty");
							}
						}
					}
				}
			} else {
				entity.setOnGround(true);
			}
			if (!entity.onGround()) {
				FuturisticcarsMod.queueServerWork(40, () -> {
					FuturisticcarsModVariables.moveup = FuturisticcarsModVariables.moveup - 1;
				});
			}
			if (entity.isVehicle()) {
				if (entity instanceof CatsonFlyingCarEntity) {
					if (InputConstants.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), InputConstants.KEY_C)) {
						FuturisticcarsModVariables.canshoot = 1;
					} else {
						FuturisticcarsModVariables.canshoot = 0;
					}
				} else {
					if (entity instanceof CatsonFlyingCarRedEntity) {
						if (InputConstants.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), InputConstants.KEY_C)) {
							FuturisticcarsModVariables.canshoot = 1;
						} else {
							FuturisticcarsModVariables.canshoot = 0;
						}
					} else {
						if (entity instanceof FastestFlyingCarWhiteEntity) {
							if (InputConstants.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), InputConstants.KEY_C)) {
								FuturisticcarsModVariables.canshoot = 1;
							} else {
								FuturisticcarsModVariables.canshoot = 0;
							}
						}
					}
				}
				if (entity instanceof AdvancedFlyingCarEntity) {
					if (InputConstants.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), InputConstants.KEY_C)) {
						FuturisticcarsModVariables.canshoot = 2;
					} else {
						FuturisticcarsModVariables.canshoot = 0;
					}
				} else {
					if (entity instanceof AdvancedFlyingCarWhiteEntity) {
						if (InputConstants.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), InputConstants.KEY_C)) {
							FuturisticcarsModVariables.canshoot = 2;
						} else {
							FuturisticcarsModVariables.canshoot = 0;
						}
					} else {
						if (entity instanceof AdvancedFlyingCarYelliowEntity) {
							if (InputConstants.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), InputConstants.KEY_C)) {
								FuturisticcarsModVariables.canshoot = 2;
							} else {
								FuturisticcarsModVariables.canshoot = 0;
							}
						}
					}
				}
				if (entity instanceof WingedFlyingCarEntity) {
					if (InputConstants.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), InputConstants.KEY_C)) {
						FuturisticcarsModVariables.canshoot = 3;
					} else {
						FuturisticcarsModVariables.canshoot = 0;
					}
				} else {
					if (entity instanceof WingedFlyingCarRedEntity) {
						if (InputConstants.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), InputConstants.KEY_C)) {
							FuturisticcarsModVariables.canshoot = 3;
						} else {
							FuturisticcarsModVariables.canshoot = 0;
						}
					} else {
						if (entity instanceof WingedFlyingCarWhiteEntity) {
							if (InputConstants.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), InputConstants.KEY_C)) {
								FuturisticcarsModVariables.canshoot = 3;
							} else {
								FuturisticcarsModVariables.canshoot = 0;
							}
						} else {
							if (entity instanceof InfiniteCarEntity) {
								if (InputConstants.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), InputConstants.KEY_C)) {
									FuturisticcarsModVariables.canshoot = 4;
								} else {
									FuturisticcarsModVariables.canshoot = 0;
								}
							} else {
								if (entity instanceof InfiniteCarRedEntity) {
									if (InputConstants.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), InputConstants.KEY_C)) {
										FuturisticcarsModVariables.canshoot = 4;
									} else {
										FuturisticcarsModVariables.canshoot = 0;
									}
								} else {
									if (entity instanceof InfiniteCarWhiteEntity) {
										if (InputConstants.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), InputConstants.KEY_C)) {
											FuturisticcarsModVariables.canshoot = 4;
										} else {
											FuturisticcarsModVariables.canshoot = 0;
										}
									}
								}
							}
						}
					}
				}
				if (FuturisticcarsModVariables.canshoot == 1) {
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level) {
										@Override
										public byte getPierceLevel() {
											return piercing;
										}

										@Override
										protected void doKnockback(LivingEntity livingEntity, DamageSource damageSource) {
											if (knockback > 0) {
												double d1 = Math.max(0.0, 1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
												Vec3 vec3 = this.getDeltaMovement().multiply(1.0, 0.0, 1.0).normalize().scale(knockback * 0.6 * d1);
												if (vec3.lengthSqr() > 0.0) {
													livingEntity.push(vec3.x, 0.1, vec3.z);
												}
											}
										}
									};
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.igniteForSeconds(100);
									entityToSpawn.setCritArrow(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, 10, 1, (byte) 0);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 3, 1);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level) {
										@Override
										public byte getPierceLevel() {
											return piercing;
										}

										@Override
										protected void doKnockback(LivingEntity livingEntity, DamageSource damageSource) {
											if (knockback > 0) {
												double d1 = Math.max(0.0, 1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
												Vec3 vec3 = this.getDeltaMovement().multiply(1.0, 0.0, 1.0).normalize().scale(knockback * 0.6 * d1);
												if (vec3.lengthSqr() > 0.0) {
													livingEntity.push(vec3.x, 0.1, vec3.z);
												}
											}
										}
									};
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.igniteForSeconds(100);
									entityToSpawn.setCritArrow(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, 10, 1, (byte) 0);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 3, -1);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
				}
				if (FuturisticcarsModVariables.canshoot == 2) {
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level) {
										@Override
										public byte getPierceLevel() {
											return piercing;
										}

										@Override
										protected void doKnockback(LivingEntity livingEntity, DamageSource damageSource) {
											if (knockback > 0) {
												double d1 = Math.max(0.0, 1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
												Vec3 vec3 = this.getDeltaMovement().multiply(1.0, 0.0, 1.0).normalize().scale(knockback * 0.6 * d1);
												if (vec3.lengthSqr() > 0.0) {
													livingEntity.push(vec3.x, 0.1, vec3.z);
												}
											}
										}
									};
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.igniteForSeconds(100);
									entityToSpawn.setCritArrow(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, 7, 1, (byte) 0);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, 1);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level) {
										@Override
										public byte getPierceLevel() {
											return piercing;
										}

										@Override
										protected void doKnockback(LivingEntity livingEntity, DamageSource damageSource) {
											if (knockback > 0) {
												double d1 = Math.max(0.0, 1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
												Vec3 vec3 = this.getDeltaMovement().multiply(1.0, 0.0, 1.0).normalize().scale(knockback * 0.6 * d1);
												if (vec3.lengthSqr() > 0.0) {
													livingEntity.push(vec3.x, 0.1, vec3.z);
												}
											}
										}
									};
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.igniteForSeconds(100);
									entityToSpawn.setCritArrow(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, 7, 1, (byte) 0);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, -1);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
				}
				if (FuturisticcarsModVariables.canshoot == 3) {
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level) {
										@Override
										public byte getPierceLevel() {
											return piercing;
										}

										@Override
										protected void doKnockback(LivingEntity livingEntity, DamageSource damageSource) {
											if (knockback > 0) {
												double d1 = Math.max(0.0, 1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
												Vec3 vec3 = this.getDeltaMovement().multiply(1.0, 0.0, 1.0).normalize().scale(knockback * 0.6 * d1);
												if (vec3.lengthSqr() > 0.0) {
													livingEntity.push(vec3.x, 0.1, vec3.z);
												}
											}
										}
									};
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.igniteForSeconds(100);
									entityToSpawn.setCritArrow(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, 9, 1, (byte) 0);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, 1);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level) {
										@Override
										public byte getPierceLevel() {
											return piercing;
										}

										@Override
										protected void doKnockback(LivingEntity livingEntity, DamageSource damageSource) {
											if (knockback > 0) {
												double d1 = Math.max(0.0, 1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
												Vec3 vec3 = this.getDeltaMovement().multiply(1.0, 0.0, 1.0).normalize().scale(knockback * 0.6 * d1);
												if (vec3.lengthSqr() > 0.0) {
													livingEntity.push(vec3.x, 0.1, vec3.z);
												}
											}
										}
									};
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.igniteForSeconds(100);
									entityToSpawn.setCritArrow(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, 9, 1, (byte) 0);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2, -1);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
				}
				if (FuturisticcarsModVariables.canshoot == 4) {
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level) {
										@Override
										public byte getPierceLevel() {
											return piercing;
										}

										@Override
										protected void doKnockback(LivingEntity livingEntity, DamageSource damageSource) {
											if (knockback > 0) {
												double d1 = Math.max(0.0, 1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
												Vec3 vec3 = this.getDeltaMovement().multiply(1.0, 0.0, 1.0).normalize().scale(knockback * 0.6 * d1);
												if (vec3.lengthSqr() > 0.0) {
													livingEntity.push(vec3.x, 0.1, vec3.z);
												}
											}
										}
									};
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.igniteForSeconds(100);
									entityToSpawn.setCritArrow(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, 12, 1, (byte) 0);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 4, 1);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level) {
										@Override
										public byte getPierceLevel() {
											return piercing;
										}

										@Override
										protected void doKnockback(LivingEntity livingEntity, DamageSource damageSource) {
											if (knockback > 0) {
												double d1 = Math.max(0.0, 1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
												Vec3 vec3 = this.getDeltaMovement().multiply(1.0, 0.0, 1.0).normalize().scale(knockback * 0.6 * d1);
												if (vec3.lengthSqr() > 0.0) {
													livingEntity.push(vec3.x, 0.1, vec3.z);
												}
											}
										}
									};
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.igniteForSeconds(100);
									entityToSpawn.setCritArrow(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, 12, 1, (byte) 0);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 4, -1);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level) {
										@Override
										public byte getPierceLevel() {
											return piercing;
										}

										@Override
										protected void doKnockback(LivingEntity livingEntity, DamageSource damageSource) {
											if (knockback > 0) {
												double d1 = Math.max(0.0, 1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
												Vec3 vec3 = this.getDeltaMovement().multiply(1.0, 0.0, 1.0).normalize().scale(knockback * 0.6 * d1);
												if (vec3.lengthSqr() > 0.0) {
													livingEntity.push(vec3.x, 0.1, vec3.z);
												}
											}
										}
									};
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.igniteForSeconds(100);
									entityToSpawn.setCritArrow(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, 12, 1, (byte) 0);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 4, 2);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level();
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
									AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level) {
										@Override
										public byte getPierceLevel() {
											return piercing;
										}

										@Override
										protected void doKnockback(LivingEntity livingEntity, DamageSource damageSource) {
											if (knockback > 0) {
												double d1 = Math.max(0.0, 1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
												Vec3 vec3 = this.getDeltaMovement().multiply(1.0, 0.0, 1.0).normalize().scale(knockback * 0.6 * d1);
												if (vec3.lengthSqr() > 0.0) {
													livingEntity.push(vec3.x, 0.1, vec3.z);
												}
											}
										}
									};
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.igniteForSeconds(100);
									entityToSpawn.setCritArrow(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, 12, 1, (byte) 0);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 4, -2);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
				}
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("There Is No Fuel In The Car!"), true);
		}
	}
}
