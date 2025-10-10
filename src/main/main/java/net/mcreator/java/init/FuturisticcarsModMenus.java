
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.futuristiccars.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.futuristiccars.world.inventory.INVMenu;
import net.mcreator.futuristiccars.world.inventory.FuelMakerInvMenu;
import net.mcreator.futuristiccars.world.inventory.CarsinvMenu;
import net.mcreator.futuristiccars.world.inventory.CarCustomizerINVMenu;
import net.mcreator.futuristiccars.FuturisticcarsMod;

public class FuturisticcarsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, FuturisticcarsMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<INVMenu>> INV = REGISTRY.register("inv", () -> IMenuTypeExtension.create(INVMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<FuelMakerInvMenu>> FUEL_MAKER_INV = REGISTRY.register("fuel_maker_inv", () -> IMenuTypeExtension.create(FuelMakerInvMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<CarCustomizerINVMenu>> CAR_CUSTOMIZER_INV = REGISTRY.register("car_customizer_inv", () -> IMenuTypeExtension.create(CarCustomizerINVMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<CarsinvMenu>> CARSINV = REGISTRY.register("carsinv", () -> IMenuTypeExtension.create(CarsinvMenu::new));
}
