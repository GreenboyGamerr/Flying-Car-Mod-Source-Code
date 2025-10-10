package net.mcreator.futuristiccars.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.futuristiccars.init.FuturisticcarsModItems;

import java.util.function.Supplier;
import java.util.Map;

public class FuelMakerInvWhileThisGUIIsOpenTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.OAK_LOG.asItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(FuturisticcarsModItems.CAR_FUEL_LIGHT.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get(1)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.COAL_BLOCK.asItem()) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(FuturisticcarsModItems.CAR_FUEL_MED.get()).copy();
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Items.ENDER_PEARL) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(FuturisticcarsModItems.CAR_FUEL_HEAVY.get()).copy();
						_setstack.setCount(1);
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
			}
		}
	}
}
