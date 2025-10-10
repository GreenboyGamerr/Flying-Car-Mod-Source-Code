
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.futuristiccars.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.futuristiccars.item.YellowPaintItem;
import net.mcreator.futuristiccars.item.WingedcarItem;
import net.mcreator.futuristiccars.item.WingedCarWhiteItem;
import net.mcreator.futuristiccars.item.WingedCarRedItem;
import net.mcreator.futuristiccars.item.WhitePaintItem;
import net.mcreator.futuristiccars.item.RedPaintItem;
import net.mcreator.futuristiccars.item.NormalFlyingCarYellowItem;
import net.mcreator.futuristiccars.item.NormalFlyingCarRedItem;
import net.mcreator.futuristiccars.item.NormalFlyingCarItem;
import net.mcreator.futuristiccars.item.InfinenCarItem;
import net.mcreator.futuristiccars.item.InfineCarWhiteItem;
import net.mcreator.futuristiccars.item.InfinRedItem;
import net.mcreator.futuristiccars.item.FutflyingCarItem;
import net.mcreator.futuristiccars.item.FastestFyingCarWhiteItem;
import net.mcreator.futuristiccars.item.FastestFyingCarRedItem;
import net.mcreator.futuristiccars.item.CarsonYellowItem;
import net.mcreator.futuristiccars.item.CarsonRedItem;
import net.mcreator.futuristiccars.item.CarsonCarItem;
import net.mcreator.futuristiccars.item.CarFuelMedItem;
import net.mcreator.futuristiccars.item.CarFuelLightItem;
import net.mcreator.futuristiccars.item.CarFuelHeavyItem;
import net.mcreator.futuristiccars.item.ADVFlyuingCarYellwoItem;
import net.mcreator.futuristiccars.item.ADVFlyingCarItem;
import net.mcreator.futuristiccars.item.ADVFkyingCarWhiteItem;
import net.mcreator.futuristiccars.FuturisticcarsMod;

public class FuturisticcarsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(FuturisticcarsMod.MODID);
	public static final DeferredItem<Item> FLYING_CAR_SPAWN_EGG = REGISTRY.register("flying_car_spawn_egg", () -> new DeferredSpawnEggItem(FuturisticcarsModEntities.FLYING_CAR, -6710887, -1, new Item.Properties()));
	public static final DeferredItem<Item> NORMAL_FLYING_CAR = REGISTRY.register("normal_flying_car", NormalFlyingCarItem::new);
	public static final DeferredItem<Item> ADVANCED_FLYING_CAR_SPAWN_EGG = REGISTRY.register("advanced_flying_car_spawn_egg", () -> new DeferredSpawnEggItem(FuturisticcarsModEntities.ADVANCED_FLYING_CAR, -10092544, -1, new Item.Properties()));
	public static final DeferredItem<Item> ADV_FLYING_CAR = REGISTRY.register("adv_flying_car", ADVFlyingCarItem::new);
	public static final DeferredItem<Item> FASTEST_FLYING_CAR_SPAWN_EGG = REGISTRY.register("fastest_flying_car_spawn_egg", () -> new DeferredSpawnEggItem(FuturisticcarsModEntities.FASTEST_FLYING_CAR, -3381760, -6724096, new Item.Properties()));
	public static final DeferredItem<Item> FUTFLYING_CAR = REGISTRY.register("futflying_car", FutflyingCarItem::new);
	public static final DeferredItem<Item> WINGED_FLYING_CAR_SPAWN_EGG = REGISTRY.register("winged_flying_car_spawn_egg", () -> new DeferredSpawnEggItem(FuturisticcarsModEntities.WINGED_FLYING_CAR, -256, -16777216, new Item.Properties()));
	public static final DeferredItem<Item> CATSON_FLYING_CAR_SPAWN_EGG = REGISTRY.register("catson_flying_car_spawn_egg", () -> new DeferredSpawnEggItem(FuturisticcarsModEntities.CATSON_FLYING_CAR, -6710887, -256, new Item.Properties()));
	public static final DeferredItem<Item> WINGEDCAR = REGISTRY.register("wingedcar", WingedcarItem::new);
	public static final DeferredItem<Item> CARSON_CAR = REGISTRY.register("carson_car", CarsonCarItem::new);
	public static final DeferredItem<Item> FUEL_MAKER = block(FuturisticcarsModBlocks.FUEL_MAKER);
	public static final DeferredItem<Item> CAR_FUEL_LIGHT = REGISTRY.register("car_fuel_light", CarFuelLightItem::new);
	public static final DeferredItem<Item> CAR_FUEL_MED = REGISTRY.register("car_fuel_med", CarFuelMedItem::new);
	public static final DeferredItem<Item> CAR_FUEL_HEAVY = REGISTRY.register("car_fuel_heavy", CarFuelHeavyItem::new);
	public static final DeferredItem<Item> CATSON_FLYING_CAR_RED_SPAWN_EGG = REGISTRY.register("catson_flying_car_red_spawn_egg", () -> new DeferredSpawnEggItem(FuturisticcarsModEntities.CATSON_FLYING_CAR_RED, -6710887, -256, new Item.Properties()));
	public static final DeferredItem<Item> RED_PAINT = REGISTRY.register("red_paint", RedPaintItem::new);
	public static final DeferredItem<Item> YELLOW_PAINT = REGISTRY.register("yellow_paint", YellowPaintItem::new);
	public static final DeferredItem<Item> WHITE_PAINT = REGISTRY.register("white_paint", WhitePaintItem::new);
	public static final DeferredItem<Item> CATSON_FLYING_CAR_YELLOW_SPAWN_EGG = REGISTRY.register("catson_flying_car_yellow_spawn_egg",
			() -> new DeferredSpawnEggItem(FuturisticcarsModEntities.CATSON_FLYING_CAR_YELLOW, -6710887, -256, new Item.Properties()));
	public static final DeferredItem<Item> FASTEST_FLYING_CAR_RED_SPAWN_EGG = REGISTRY.register("fastest_flying_car_red_spawn_egg",
			() -> new DeferredSpawnEggItem(FuturisticcarsModEntities.FASTEST_FLYING_CAR_RED, -3381760, -6724096, new Item.Properties()));
	public static final DeferredItem<Item> FASTEST_FLYING_CAR_WHITE_SPAWN_EGG = REGISTRY.register("fastest_flying_car_white_spawn_egg",
			() -> new DeferredSpawnEggItem(FuturisticcarsModEntities.FASTEST_FLYING_CAR_WHITE, -3381760, -6724096, new Item.Properties()));
	public static final DeferredItem<Item> FLYING_CAR_RED_SPAWN_EGG = REGISTRY.register("flying_car_red_spawn_egg", () -> new DeferredSpawnEggItem(FuturisticcarsModEntities.FLYING_CAR_RED, -6710887, -1, new Item.Properties()));
	public static final DeferredItem<Item> FLYING_CAR_YELLOW_SPAWN_EGG = REGISTRY.register("flying_car_yellow_spawn_egg", () -> new DeferredSpawnEggItem(FuturisticcarsModEntities.FLYING_CAR_YELLOW, -6710887, -1, new Item.Properties()));
	public static final DeferredItem<Item> WINGED_FLYING_CAR_RED_SPAWN_EGG = REGISTRY.register("winged_flying_car_red_spawn_egg",
			() -> new DeferredSpawnEggItem(FuturisticcarsModEntities.WINGED_FLYING_CAR_RED, -256, -16777216, new Item.Properties()));
	public static final DeferredItem<Item> WINGED_FLYING_CAR_WHITE_SPAWN_EGG = REGISTRY.register("winged_flying_car_white_spawn_egg",
			() -> new DeferredSpawnEggItem(FuturisticcarsModEntities.WINGED_FLYING_CAR_WHITE, -256, -16777216, new Item.Properties()));
	public static final DeferredItem<Item> ADVANCED_FLYING_CAR_WHITE_SPAWN_EGG = REGISTRY.register("advanced_flying_car_white_spawn_egg",
			() -> new DeferredSpawnEggItem(FuturisticcarsModEntities.ADVANCED_FLYING_CAR_WHITE, -10092544, -1, new Item.Properties()));
	public static final DeferredItem<Item> ADVANCED_FLYING_CAR_YELLIOW_SPAWN_EGG = REGISTRY.register("advanced_flying_car_yelliow_spawn_egg",
			() -> new DeferredSpawnEggItem(FuturisticcarsModEntities.ADVANCED_FLYING_CAR_YELLIOW, -10092544, -1, new Item.Properties()));
	public static final DeferredItem<Item> INFINITE_CAR_SPAWN_EGG = REGISTRY.register("infinite_car_spawn_egg", () -> new DeferredSpawnEggItem(FuturisticcarsModEntities.INFINITE_CAR, -6710887, -256, new Item.Properties()));
	public static final DeferredItem<Item> INFINITE_CAR_RED_SPAWN_EGG = REGISTRY.register("infinite_car_red_spawn_egg", () -> new DeferredSpawnEggItem(FuturisticcarsModEntities.INFINITE_CAR_RED, -6710887, -256, new Item.Properties()));
	public static final DeferredItem<Item> INFINITE_CAR_WHITE_SPAWN_EGG = REGISTRY.register("infinite_car_white_spawn_egg", () -> new DeferredSpawnEggItem(FuturisticcarsModEntities.INFINITE_CAR_WHITE, -6710887, -256, new Item.Properties()));
	public static final DeferredItem<Item> INFINEN_CAR = REGISTRY.register("infinen_car", InfinenCarItem::new);
	public static final DeferredItem<Item> NORMAL_FLYING_CAR_RED = REGISTRY.register("normal_flying_car_red", NormalFlyingCarRedItem::new);
	public static final DeferredItem<Item> NORMAL_FLYING_CAR_YELLOW = REGISTRY.register("normal_flying_car_yellow", NormalFlyingCarYellowItem::new);
	public static final DeferredItem<Item> FASTEST_FYING_CAR_RED = REGISTRY.register("fastest_fying_car_red", FastestFyingCarRedItem::new);
	public static final DeferredItem<Item> FASTEST_FYING_CAR_WHITE = REGISTRY.register("fastest_fying_car_white", FastestFyingCarWhiteItem::new);
	public static final DeferredItem<Item> ADV_FKYING_CAR_WHITE = REGISTRY.register("adv_fkying_car_white", ADVFkyingCarWhiteItem::new);
	public static final DeferredItem<Item> ADV_FLYUING_CAR_YELLWO = REGISTRY.register("adv_flyuing_car_yellwo", ADVFlyuingCarYellwoItem::new);
	public static final DeferredItem<Item> WINGED_CAR_RED = REGISTRY.register("winged_car_red", WingedCarRedItem::new);
	public static final DeferredItem<Item> WINGED_CAR_WHITE = REGISTRY.register("winged_car_white", WingedCarWhiteItem::new);
	public static final DeferredItem<Item> CARSON_RED = REGISTRY.register("carson_red", CarsonRedItem::new);
	public static final DeferredItem<Item> CARSON_YELLOW = REGISTRY.register("carson_yellow", CarsonYellowItem::new);
	public static final DeferredItem<Item> INFIN_RED = REGISTRY.register("infin_red", InfinRedItem::new);
	public static final DeferredItem<Item> INFINE_CAR_WHITE = REGISTRY.register("infine_car_white", InfineCarWhiteItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
