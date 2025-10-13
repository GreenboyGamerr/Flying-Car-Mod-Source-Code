package net.mcreator.futuristiccars.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.futuristiccars.init.FuturisticcarsModItems;

import java.util.function.Supplier;
import java.util.Map;

public class CarCustomizerINVWhileThisGUIIsOpenTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == FuturisticcarsModItems.CARSON_CAR.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == FuturisticcarsModItems.RED_PAINT
						.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(FuturisticcarsModItems.CARSON_RED.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(2)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == FuturisticcarsModItems.CARSON_YELLOW
					.get()
					&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == FuturisticcarsModItems.RED_PAINT
							.get()) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(FuturisticcarsModItems.CARSON_RED.get()).copy();
					_setstack.setCount(1);
					((Slot) _slots.get(2)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == FuturisticcarsModItems.CARSON_CAR
						.get()
						&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
								.getItem() == FuturisticcarsModItems.YELLOW_PAINT.get()) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(FuturisticcarsModItems.CARSON_YELLOW.get()).copy();
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
							.getItem() == FuturisticcarsModItems.CARSON_RED.get()
							&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
									.getItem() == FuturisticcarsModItems.YELLOW_PAINT.get()) {
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack _setstack = new ItemStack(FuturisticcarsModItems.CARSON_YELLOW.get()).copy();
							_setstack.setCount(1);
							((Slot) _slots.get(2)).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
					} else {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
								.getItem() == FuturisticcarsModItems.CARSON_RED.get()
								&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
										.getItem() == FuturisticcarsModItems.WHITE_PAINT.get()) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = new ItemStack(FuturisticcarsModItems.CARSON_CAR.get()).copy();
								_setstack.setCount(1);
								((Slot) _slots.get(2)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
						} else {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
									.getItem() == FuturisticcarsModItems.CARSON_YELLOW.get()
									&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
											.getItem() == FuturisticcarsModItems.WHITE_PAINT.get()) {
								if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
									ItemStack _setstack = new ItemStack(FuturisticcarsModItems.CARSON_CAR.get()).copy();
									_setstack.setCount(1);
									((Slot) _slots.get(2)).set(_setstack);
									_player.containerMenu.broadcastChanges();
								}
							} else {
								if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
										.getItem() == FuturisticcarsModItems.FUTFLYING_CAR.get()
										&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
												.getItem() == FuturisticcarsModItems.RED_PAINT.get()) {
									if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
										ItemStack _setstack = new ItemStack(FuturisticcarsModItems.FASTEST_FYING_CAR_RED.get()).copy();
										_setstack.setCount(1);
										((Slot) _slots.get(2)).set(_setstack);
										_player.containerMenu.broadcastChanges();
									}
								} else {
									if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
											.getItem() == FuturisticcarsModItems.FASTEST_FYING_CAR_WHITE.get()
											&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
													.getItem() == FuturisticcarsModItems.RED_PAINT.get()) {
										if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
											ItemStack _setstack = new ItemStack(FuturisticcarsModItems.FASTEST_FYING_CAR_RED.get()).copy();
											_setstack.setCount(1);
											((Slot) _slots.get(2)).set(_setstack);
											_player.containerMenu.broadcastChanges();
										}
									} else {
										if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
												.getItem() == FuturisticcarsModItems.FASTEST_FYING_CAR_RED.get()
												&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
														.getItem() == FuturisticcarsModItems.YELLOW_PAINT.get()) {
											if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
												ItemStack _setstack = new ItemStack(FuturisticcarsModItems.FUTFLYING_CAR.get()).copy();
												_setstack.setCount(1);
												((Slot) _slots.get(2)).set(_setstack);
												_player.containerMenu.broadcastChanges();
											}
										} else {
											if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
													.getItem() == FuturisticcarsModItems.FASTEST_FYING_CAR_WHITE.get()
													&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
															.getItem() == FuturisticcarsModItems.YELLOW_PAINT.get()) {
												if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
													ItemStack _setstack = new ItemStack(FuturisticcarsModItems.FUTFLYING_CAR.get()).copy();
													_setstack.setCount(1);
													((Slot) _slots.get(2)).set(_setstack);
													_player.containerMenu.broadcastChanges();
												}
											} else {
												if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
														.getItem() == FuturisticcarsModItems.FASTEST_FYING_CAR_RED.get()
														&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
																.getItem() == FuturisticcarsModItems.WHITE_PAINT.get()) {
													if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
														ItemStack _setstack = new ItemStack(FuturisticcarsModItems.FASTEST_FYING_CAR_WHITE.get()).copy();
														_setstack.setCount(1);
														((Slot) _slots.get(2)).set(_setstack);
														_player.containerMenu.broadcastChanges();
													}
												} else {
													if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
															.getItem() == FuturisticcarsModItems.FUTFLYING_CAR.get()
															&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
																	.getItem() == FuturisticcarsModItems.WHITE_PAINT.get()) {
														if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
															ItemStack _setstack = new ItemStack(FuturisticcarsModItems.FASTEST_FYING_CAR_WHITE.get()).copy();
															_setstack.setCount(1);
															((Slot) _slots.get(2)).set(_setstack);
															_player.containerMenu.broadcastChanges();
														}
													} else {
														if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
																.getItem() == FuturisticcarsModItems.NORMAL_FLYING_CAR_YELLOW.get()
																&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
																		.getItem() == FuturisticcarsModItems.RED_PAINT.get()) {
															if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																ItemStack _setstack = new ItemStack(FuturisticcarsModItems.NORMAL_FLYING_CAR_RED.get()).copy();
																_setstack.setCount(1);
																((Slot) _slots.get(2)).set(_setstack);
																_player.containerMenu.broadcastChanges();
															}
														} else {
															if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
																	.getItem() == FuturisticcarsModItems.NORMAL_FLYING_CAR.get()
																	&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																			? ((Slot) _slt.get(1)).getItem()
																			: ItemStack.EMPTY).getItem() == FuturisticcarsModItems.RED_PAINT.get()) {
																if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																	ItemStack _setstack = new ItemStack(FuturisticcarsModItems.NORMAL_FLYING_CAR_RED.get()).copy();
																	_setstack.setCount(1);
																	((Slot) _slots.get(2)).set(_setstack);
																	_player.containerMenu.broadcastChanges();
																}
															} else {
																if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
																		.getItem() == FuturisticcarsModItems.NORMAL_FLYING_CAR.get()
																		&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																				? ((Slot) _slt.get(1)).getItem()
																				: ItemStack.EMPTY).getItem() == FuturisticcarsModItems.YELLOW_PAINT.get()) {
																	if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																		ItemStack _setstack = new ItemStack(FuturisticcarsModItems.NORMAL_FLYING_CAR_YELLOW.get()).copy();
																		_setstack.setCount(1);
																		((Slot) _slots.get(2)).set(_setstack);
																		_player.containerMenu.broadcastChanges();
																	}
																} else {
																	if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																			? ((Slot) _slt.get(0)).getItem()
																			: ItemStack.EMPTY).getItem() == FuturisticcarsModItems.NORMAL_FLYING_CAR_RED.get()
																			&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																					? ((Slot) _slt.get(1)).getItem()
																					: ItemStack.EMPTY).getItem() == FuturisticcarsModItems.YELLOW_PAINT.get()) {
																		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																			ItemStack _setstack = new ItemStack(FuturisticcarsModItems.NORMAL_FLYING_CAR_YELLOW.get()).copy();
																			_setstack.setCount(1);
																			((Slot) _slots.get(2)).set(_setstack);
																			_player.containerMenu.broadcastChanges();
																		}
																	} else {
																		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																				? ((Slot) _slt.get(0)).getItem()
																				: ItemStack.EMPTY).getItem() == FuturisticcarsModItems.NORMAL_FLYING_CAR_RED.get()
																				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																						? ((Slot) _slt.get(1)).getItem()
																						: ItemStack.EMPTY).getItem() == FuturisticcarsModItems.WHITE_PAINT.get()) {
																			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																				ItemStack _setstack = new ItemStack(FuturisticcarsModItems.NORMAL_FLYING_CAR.get()).copy();
																				_setstack.setCount(1);
																				((Slot) _slots.get(2)).set(_setstack);
																				_player.containerMenu.broadcastChanges();
																			}
																		} else {
																			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																					? ((Slot) _slt.get(0)).getItem()
																					: ItemStack.EMPTY).getItem() == FuturisticcarsModItems.NORMAL_FLYING_CAR_YELLOW.get()
																					&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																							? ((Slot) _slt.get(1)).getItem()
																							: ItemStack.EMPTY).getItem() == FuturisticcarsModItems.WHITE_PAINT.get()) {
																				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																					ItemStack _setstack = new ItemStack(FuturisticcarsModItems.NORMAL_FLYING_CAR.get()).copy();
																					_setstack.setCount(1);
																					((Slot) _slots.get(2)).set(_setstack);
																					_player.containerMenu.broadcastChanges();
																				}
																			} else {
																				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																						? ((Slot) _slt.get(0)).getItem()
																						: ItemStack.EMPTY).getItem() == FuturisticcarsModItems.WINGEDCAR.get()
																						&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																								? ((Slot) _slt.get(1)).getItem()
																								: ItemStack.EMPTY).getItem() == FuturisticcarsModItems.RED_PAINT.get()) {
																					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																						ItemStack _setstack = new ItemStack(FuturisticcarsModItems.WINGED_CAR_RED.get()).copy();
																						_setstack.setCount(1);
																						((Slot) _slots.get(2)).set(_setstack);
																						_player.containerMenu.broadcastChanges();
																					}
																				} else {
																					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																							? ((Slot) _slt.get(0)).getItem()
																							: ItemStack.EMPTY).getItem() == FuturisticcarsModItems.WINGED_CAR_WHITE.get()
																							&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																									? ((Slot) _slt.get(1)).getItem()
																									: ItemStack.EMPTY).getItem() == FuturisticcarsModItems.RED_PAINT.get()) {
																						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																							ItemStack _setstack = new ItemStack(FuturisticcarsModItems.WINGED_CAR_RED.get()).copy();
																							_setstack.setCount(1);
																							((Slot) _slots.get(2)).set(_setstack);
																							_player.containerMenu.broadcastChanges();
																						}
																					} else {
																						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																								? ((Slot) _slt.get(0)).getItem()
																								: ItemStack.EMPTY).getItem() == FuturisticcarsModItems.WINGED_CAR_RED.get()
																								&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																										? ((Slot) _slt.get(1)).getItem()
																										: ItemStack.EMPTY).getItem() == FuturisticcarsModItems.YELLOW_PAINT.get()) {
																							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																								ItemStack _setstack = new ItemStack(FuturisticcarsModItems.WINGEDCAR.get()).copy();
																								_setstack.setCount(1);
																								((Slot) _slots.get(2)).set(_setstack);
																								_player.containerMenu.broadcastChanges();
																							}
																						} else {
																							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																									? ((Slot) _slt.get(0)).getItem()
																									: ItemStack.EMPTY).getItem() == FuturisticcarsModItems.WINGED_CAR_WHITE.get()
																									&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																											? ((Slot) _slt.get(1)).getItem()
																											: ItemStack.EMPTY).getItem() == FuturisticcarsModItems.YELLOW_PAINT.get()) {
																								if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																									ItemStack _setstack = new ItemStack(FuturisticcarsModItems.WINGEDCAR.get()).copy();
																									_setstack.setCount(1);
																									((Slot) _slots.get(2)).set(_setstack);
																									_player.containerMenu.broadcastChanges();
																								}
																							} else {
																								if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																										? ((Slot) _slt.get(0)).getItem()
																										: ItemStack.EMPTY).getItem() == FuturisticcarsModItems.WINGEDCAR.get()
																										&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																												? ((Slot) _slt.get(1)).getItem()
																												: ItemStack.EMPTY).getItem() == FuturisticcarsModItems.WHITE_PAINT.get()) {
																									if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																										ItemStack _setstack = new ItemStack(FuturisticcarsModItems.WINGED_CAR_WHITE.get()).copy();
																										_setstack.setCount(1);
																										((Slot) _slots.get(2)).set(_setstack);
																										_player.containerMenu.broadcastChanges();
																									}
																								} else {
																									if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																											? ((Slot) _slt.get(0)).getItem()
																											: ItemStack.EMPTY).getItem() == FuturisticcarsModItems.WINGED_CAR_RED.get()
																											&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																													? ((Slot) _slt.get(1)).getItem()
																													: ItemStack.EMPTY).getItem() == FuturisticcarsModItems.WHITE_PAINT.get()) {
																										if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																											ItemStack _setstack = new ItemStack(FuturisticcarsModItems.WINGED_CAR_WHITE.get()).copy();
																											_setstack.setCount(1);
																											((Slot) _slots.get(2)).set(_setstack);
																											_player.containerMenu.broadcastChanges();
																										}
																									} else {
																										if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																												? ((Slot) _slt.get(0)).getItem()
																												: ItemStack.EMPTY).getItem() == FuturisticcarsModItems.ADV_FKYING_CAR_WHITE.get()
																												&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																														? ((Slot) _slt.get(1)).getItem()
																														: ItemStack.EMPTY).getItem() == FuturisticcarsModItems.RED_PAINT.get()) {
																											if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																												ItemStack _setstack = new ItemStack(FuturisticcarsModItems.ADV_FLYING_CAR.get()).copy();
																												_setstack.setCount(1);
																												((Slot) _slots.get(2)).set(_setstack);
																												_player.containerMenu.broadcastChanges();
																											}
																										} else {
																											if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																													? ((Slot) _slt.get(0)).getItem()
																													: ItemStack.EMPTY).getItem() == FuturisticcarsModItems.ADV_FLYUING_CAR_YELLWO.get()
																													&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																															? ((Slot) _slt.get(1)).getItem()
																															: ItemStack.EMPTY).getItem() == FuturisticcarsModItems.RED_PAINT.get()) {
																												if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																													ItemStack _setstack = new ItemStack(FuturisticcarsModItems.ADV_FLYING_CAR.get()).copy();
																													_setstack.setCount(1);
																													((Slot) _slots.get(2)).set(_setstack);
																													_player.containerMenu.broadcastChanges();
																												}
																											} else {
																												if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																														? ((Slot) _slt.get(0)).getItem()
																														: ItemStack.EMPTY).getItem() == FuturisticcarsModItems.ADV_FKYING_CAR_WHITE.get()
																														&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
																																&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
																																.getItem() == FuturisticcarsModItems.YELLOW_PAINT.get()) {
																													if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
																														ItemStack _setstack = new ItemStack(FuturisticcarsModItems.ADV_FLYUING_CAR_YELLWO.get()).copy();
																														_setstack.setCount(1);
																														((Slot) _slots.get(2)).set(_setstack);
																														_player.containerMenu.broadcastChanges();
																													}
																												} else {
																													if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																															? ((Slot) _slt.get(0)).getItem()
																															: ItemStack.EMPTY).getItem() == FuturisticcarsModItems.ADV_FLYING_CAR.get()
																															&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
																																	&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
																																	.getItem() == FuturisticcarsModItems.YELLOW_PAINT.get()) {
																														if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current
																																&& _current.get() instanceof Map _slots) {
																															ItemStack _setstack = new ItemStack(FuturisticcarsModItems.ADV_FLYUING_CAR_YELLWO.get()).copy();
																															_setstack.setCount(1);
																															((Slot) _slots.get(2)).set(_setstack);
																															_player.containerMenu.broadcastChanges();
																														}
																													} else {
																														if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
																																&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
																																.getItem() == FuturisticcarsModItems.ADV_FLYING_CAR.get()
																																&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
																																		&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
																																		.getItem() == FuturisticcarsModItems.WHITE_PAINT.get()) {
																															if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current
																																	&& _current.get() instanceof Map _slots) {
																																ItemStack _setstack = new ItemStack(FuturisticcarsModItems.ADV_FKYING_CAR_WHITE.get()).copy();
																																_setstack.setCount(1);
																																((Slot) _slots.get(2)).set(_setstack);
																																_player.containerMenu.broadcastChanges();
																															}
																														} else {
																															if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
																																	&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
																																	.getItem() == FuturisticcarsModItems.ADV_FLYUING_CAR_YELLWO.get()
																																	&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
																																			&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
																																			.getItem() == FuturisticcarsModItems.WHITE_PAINT.get()) {
																																if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current
																																		&& _current.get() instanceof Map _slots) {
																																	ItemStack _setstack = new ItemStack(FuturisticcarsModItems.ADV_FKYING_CAR_WHITE.get()).copy();
																																	_setstack.setCount(1);
																																	((Slot) _slots.get(2)).set(_setstack);
																																	_player.containerMenu.broadcastChanges();
																																}
																															} else {
																																if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
																																		&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
																																		.getItem() == FuturisticcarsModItems.INFINEN_CAR.get()
																																		&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
																																				&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
																																				.getItem() == FuturisticcarsModItems.RED_PAINT.get()) {
																																	if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current
																																			&& _current.get() instanceof Map _slots) {
																																		ItemStack _setstack = new ItemStack(FuturisticcarsModItems.INFIN_RED.get()).copy();
																																		_setstack.setCount(1);
																																		((Slot) _slots.get(2)).set(_setstack);
																																		_player.containerMenu.broadcastChanges();
																																	}
																																} else {
																																	if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
																																			&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
																																			.getItem() == FuturisticcarsModItems.INFINE_CAR_WHITE.get()
																																			&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
																																					&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
																																					.getItem() == FuturisticcarsModItems.RED_PAINT.get()) {
																																		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current
																																				&& _current.get() instanceof Map _slots) {
																																			ItemStack _setstack = new ItemStack(FuturisticcarsModItems.INFINEN_CAR.get()).copy();
																																			_setstack.setCount(1);
																																			((Slot) _slots.get(2)).set(_setstack);
																																			_player.containerMenu.broadcastChanges();
																																		}
																																	} else {
																																		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
																																				&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
																																				.getItem() == FuturisticcarsModItems.INFIN_RED.get()
																																				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
																																						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
																																						.getItem() == FuturisticcarsModItems.YELLOW_PAINT.get()) {
																																			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current
																																					&& _current.get() instanceof Map _slots) {
																																				ItemStack _setstack = new ItemStack(FuturisticcarsModItems.INFINEN_CAR.get()).copy();
																																				_setstack.setCount(1);
																																				((Slot) _slots.get(2)).set(_setstack);
																																				_player.containerMenu.broadcastChanges();
																																			}
																																		} else {
																																			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
																																					&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
																																					.getItem() == FuturisticcarsModItems.INFINE_CAR_WHITE.get()
																																					&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
																																							&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
																																							.getItem() == FuturisticcarsModItems.YELLOW_PAINT.get()) {
																																				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current
																																						&& _current.get() instanceof Map _slots) {
																																					ItemStack _setstack = new ItemStack(FuturisticcarsModItems.INFINEN_CAR.get()).copy();
																																					_setstack.setCount(1);
																																					((Slot) _slots.get(2)).set(_setstack);
																																					_player.containerMenu.broadcastChanges();
																																				}
																																			} else {
																																				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
																																						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
																																						.getItem() == FuturisticcarsModItems.INFINEN_CAR.get()
																																						&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
																																								&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
																																								.getItem() == FuturisticcarsModItems.WHITE_PAINT.get()) {
																																					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current
																																							&& _current.get() instanceof Map _slots) {
																																						ItemStack _setstack = new ItemStack(FuturisticcarsModItems.INFINE_CAR_WHITE.get()).copy();
																																						_setstack.setCount(1);
																																						((Slot) _slots.get(2)).set(_setstack);
																																						_player.containerMenu.broadcastChanges();
																																					}
																																				} else {
																																					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
																																							&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
																																							.getItem() == FuturisticcarsModItems.INFINE_CAR_WHITE.get()
																																							&& (entity instanceof Player _plrSlotItem
																																									&& _plrSlotItem.containerMenu instanceof Supplier _splr
																																									&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
																																									.getItem() == FuturisticcarsModItems.WHITE_PAINT.get()) {
																																						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current
																																								&& _current.get() instanceof Map _slots) {
																																							ItemStack _setstack = new ItemStack(FuturisticcarsModItems.INFINE_CAR_WHITE.get()).copy();
																																							_setstack.setCount(1);
																																							((Slot) _slots.get(2)).set(_setstack);
																																							_player.containerMenu.broadcastChanges();
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
								}
							}
						}
					}
				}
			}
		}
	}
}
