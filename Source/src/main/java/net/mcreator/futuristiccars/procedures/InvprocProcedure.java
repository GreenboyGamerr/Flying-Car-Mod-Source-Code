package net.mcreator.futuristiccars.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.futuristiccars.network.FuturisticcarsModVariables;
import net.mcreator.futuristiccars.init.FuturisticcarsModItems;
import net.mcreator.futuristiccars.FuturisticcarsMod;

import java.util.function.Supplier;
import java.util.Map;

public class InvprocProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == FuturisticcarsModItems.CAR_FUEL_LIGHT
				.get()) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Fueling....."), true);
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get(1)).set(ItemStack.EMPTY);
				_player.containerMenu.broadcastChanges();
			}
			FuturisticcarsMod.queueServerWork(120, () -> {
				FuturisticcarsModVariables.normalcar = 5000;
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Fueling Completed For All Cars!"), true);
			});
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == FuturisticcarsModItems.CAR_FUEL_MED
				.get()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get(1)).set(ItemStack.EMPTY);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Fueling....."), true);
			FuturisticcarsMod.queueServerWork(120, () -> {
				FuturisticcarsModVariables.normalcar = 10000;
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Fueling Completed For All Cars!"), true);
			});
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == FuturisticcarsModItems.CAR_FUEL_HEAVY
				.get()) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Fueling....."), true);
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get(1)).set(ItemStack.EMPTY);
				_player.containerMenu.broadcastChanges();
			}
			FuturisticcarsMod.queueServerWork(120, () -> {
				FuturisticcarsModVariables.normalcar = 20000;
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Fueling Completed For All Cars!"), true);
			});
		}
	}
}
