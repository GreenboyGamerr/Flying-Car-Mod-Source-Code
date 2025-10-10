
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.futuristiccars.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.futuristiccars.FuturisticcarsMod;

public class FuturisticcarsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FuturisticcarsMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> FLYING_CARS_TAB = REGISTRY.register("flying_cars_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.futuristiccars.flying_cars_tab")).icon(() -> new ItemStack(FuturisticcarsModItems.NORMAL_FLYING_CAR.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FuturisticcarsModItems.NORMAL_FLYING_CAR.get());
				tabData.accept(FuturisticcarsModItems.ADV_FLYING_CAR.get());
				tabData.accept(FuturisticcarsModItems.FUTFLYING_CAR.get());
				tabData.accept(FuturisticcarsModItems.WINGEDCAR.get());
				tabData.accept(FuturisticcarsModItems.CARSON_CAR.get());
				tabData.accept(FuturisticcarsModItems.INFINEN_CAR.get());
				tabData.accept(FuturisticcarsModBlocks.FUEL_MAKER.get().asItem());
				tabData.accept(FuturisticcarsModItems.CAR_FUEL_LIGHT.get());
				tabData.accept(FuturisticcarsModItems.CAR_FUEL_MED.get());
				tabData.accept(FuturisticcarsModItems.CAR_FUEL_HEAVY.get());
				tabData.accept(FuturisticcarsModItems.RED_PAINT.get());
				tabData.accept(FuturisticcarsModItems.YELLOW_PAINT.get());
				tabData.accept(FuturisticcarsModItems.WHITE_PAINT.get());
			}).build());
}
