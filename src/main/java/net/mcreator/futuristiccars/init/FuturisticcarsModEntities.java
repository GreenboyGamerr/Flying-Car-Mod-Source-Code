
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.futuristiccars.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.EventPriority;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

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

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class FuturisticcarsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, FuturisticcarsMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<FlyingCarEntity>> FLYING_CAR = register("flying_car",
			EntityType.Builder.<FlyingCarEntity>of(FlyingCarEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<AdvancedFlyingCarEntity>> ADVANCED_FLYING_CAR = register("advanced_flying_car",
			EntityType.Builder.<AdvancedFlyingCarEntity>of(AdvancedFlyingCarEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<FastestFlyingCarEntity>> FASTEST_FLYING_CAR = register("fastest_flying_car",
			EntityType.Builder.<FastestFlyingCarEntity>of(FastestFlyingCarEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<WingedFlyingCarEntity>> WINGED_FLYING_CAR = register("winged_flying_car",
			EntityType.Builder.<WingedFlyingCarEntity>of(WingedFlyingCarEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CatsonFlyingCarEntity>> CATSON_FLYING_CAR = register("catson_flying_car",
			EntityType.Builder.<CatsonFlyingCarEntity>of(CatsonFlyingCarEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<CatsonFlyingCarRedEntity>> CATSON_FLYING_CAR_RED = register("catson_flying_car_red",
			EntityType.Builder.<CatsonFlyingCarRedEntity>of(CatsonFlyingCarRedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CatsonFlyingCarYellowEntity>> CATSON_FLYING_CAR_YELLOW = register("catson_flying_car_yellow",
			EntityType.Builder.<CatsonFlyingCarYellowEntity>of(CatsonFlyingCarYellowEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<FastestFlyingCarRedEntity>> FASTEST_FLYING_CAR_RED = register("fastest_flying_car_red",
			EntityType.Builder.<FastestFlyingCarRedEntity>of(FastestFlyingCarRedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<FastestFlyingCarWhiteEntity>> FASTEST_FLYING_CAR_WHITE = register("fastest_flying_car_white",
			EntityType.Builder.<FastestFlyingCarWhiteEntity>of(FastestFlyingCarWhiteEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<FlyingCarRedEntity>> FLYING_CAR_RED = register("flying_car_red",
			EntityType.Builder.<FlyingCarRedEntity>of(FlyingCarRedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<FlyingCarYellowEntity>> FLYING_CAR_YELLOW = register("flying_car_yellow",
			EntityType.Builder.<FlyingCarYellowEntity>of(FlyingCarYellowEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<WingedFlyingCarRedEntity>> WINGED_FLYING_CAR_RED = register("winged_flying_car_red",
			EntityType.Builder.<WingedFlyingCarRedEntity>of(WingedFlyingCarRedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<WingedFlyingCarWhiteEntity>> WINGED_FLYING_CAR_WHITE = register("winged_flying_car_white",
			EntityType.Builder.<WingedFlyingCarWhiteEntity>of(WingedFlyingCarWhiteEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<AdvancedFlyingCarWhiteEntity>> ADVANCED_FLYING_CAR_WHITE = register("advanced_flying_car_white",
			EntityType.Builder.<AdvancedFlyingCarWhiteEntity>of(AdvancedFlyingCarWhiteEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<AdvancedFlyingCarYelliowEntity>> ADVANCED_FLYING_CAR_YELLIOW = register("advanced_flying_car_yelliow",
			EntityType.Builder.<AdvancedFlyingCarYelliowEntity>of(AdvancedFlyingCarYelliowEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<InfiniteCarEntity>> INFINITE_CAR = register("infinite_car",
			EntityType.Builder.<InfiniteCarEntity>of(InfiniteCarEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<InfiniteCarRedEntity>> INFINITE_CAR_RED = register("infinite_car_red",
			EntityType.Builder.<InfiniteCarRedEntity>of(InfiniteCarRedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<InfiniteCarWhiteEntity>> INFINITE_CAR_WHITE = register("infinite_car_white",
			EntityType.Builder.<InfiniteCarWhiteEntity>of(InfiniteCarWhiteEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerEntity(Capabilities.ItemHandler.ENTITY, FLYING_CAR.get(), (living, context) -> living.getInventory());
		event.registerEntity(Capabilities.ItemHandler.ENTITY, ADVANCED_FLYING_CAR.get(), (living, context) -> living.getInventory());
		event.registerEntity(Capabilities.ItemHandler.ENTITY, FASTEST_FLYING_CAR.get(), (living, context) -> living.getInventory());
		event.registerEntity(Capabilities.ItemHandler.ENTITY, WINGED_FLYING_CAR.get(), (living, context) -> living.getInventory());
		event.registerEntity(Capabilities.ItemHandler.ENTITY, CATSON_FLYING_CAR.get(), (living, context) -> living.getInventory());
		event.registerEntity(Capabilities.ItemHandler.ENTITY, CATSON_FLYING_CAR_RED.get(), (living, context) -> living.getInventory());
		event.registerEntity(Capabilities.ItemHandler.ENTITY, CATSON_FLYING_CAR_YELLOW.get(), (living, context) -> living.getInventory());
		event.registerEntity(Capabilities.ItemHandler.ENTITY, FASTEST_FLYING_CAR_RED.get(), (living, context) -> living.getInventory());
		event.registerEntity(Capabilities.ItemHandler.ENTITY, FASTEST_FLYING_CAR_WHITE.get(), (living, context) -> living.getInventory());
		event.registerEntity(Capabilities.ItemHandler.ENTITY, FLYING_CAR_RED.get(), (living, context) -> living.getInventory());
		event.registerEntity(Capabilities.ItemHandler.ENTITY, FLYING_CAR_YELLOW.get(), (living, context) -> living.getInventory());
		event.registerEntity(Capabilities.ItemHandler.ENTITY, WINGED_FLYING_CAR_RED.get(), (living, context) -> living.getInventory());
		event.registerEntity(Capabilities.ItemHandler.ENTITY, WINGED_FLYING_CAR_WHITE.get(), (living, context) -> living.getInventory());
		event.registerEntity(Capabilities.ItemHandler.ENTITY, ADVANCED_FLYING_CAR_WHITE.get(), (living, context) -> living.getInventory());
		event.registerEntity(Capabilities.ItemHandler.ENTITY, ADVANCED_FLYING_CAR_YELLIOW.get(), (living, context) -> living.getInventory());
		event.registerEntity(Capabilities.ItemHandler.ENTITY, INFINITE_CAR.get(), (living, context) -> living.getInventory());
		event.registerEntity(Capabilities.ItemHandler.ENTITY, INFINITE_CAR_RED.get(), (living, context) -> living.getInventory());
		event.registerEntity(Capabilities.ItemHandler.ENTITY, INFINITE_CAR_WHITE.get(), (living, context) -> living.getInventory());
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		FlyingCarEntity.init(event);
		AdvancedFlyingCarEntity.init(event);
		FastestFlyingCarEntity.init(event);
		WingedFlyingCarEntity.init(event);
		CatsonFlyingCarEntity.init(event);
		CatsonFlyingCarRedEntity.init(event);
		CatsonFlyingCarYellowEntity.init(event);
		FastestFlyingCarRedEntity.init(event);
		FastestFlyingCarWhiteEntity.init(event);
		FlyingCarRedEntity.init(event);
		FlyingCarYellowEntity.init(event);
		WingedFlyingCarRedEntity.init(event);
		WingedFlyingCarWhiteEntity.init(event);
		AdvancedFlyingCarWhiteEntity.init(event);
		AdvancedFlyingCarYelliowEntity.init(event);
		InfiniteCarEntity.init(event);
		InfiniteCarRedEntity.init(event);
		InfiniteCarWhiteEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(FLYING_CAR.get(), FlyingCarEntity.createAttributes().build());
		event.put(ADVANCED_FLYING_CAR.get(), AdvancedFlyingCarEntity.createAttributes().build());
		event.put(FASTEST_FLYING_CAR.get(), FastestFlyingCarEntity.createAttributes().build());
		event.put(WINGED_FLYING_CAR.get(), WingedFlyingCarEntity.createAttributes().build());
		event.put(CATSON_FLYING_CAR.get(), CatsonFlyingCarEntity.createAttributes().build());
		event.put(CATSON_FLYING_CAR_RED.get(), CatsonFlyingCarRedEntity.createAttributes().build());
		event.put(CATSON_FLYING_CAR_YELLOW.get(), CatsonFlyingCarYellowEntity.createAttributes().build());
		event.put(FASTEST_FLYING_CAR_RED.get(), FastestFlyingCarRedEntity.createAttributes().build());
		event.put(FASTEST_FLYING_CAR_WHITE.get(), FastestFlyingCarWhiteEntity.createAttributes().build());
		event.put(FLYING_CAR_RED.get(), FlyingCarRedEntity.createAttributes().build());
		event.put(FLYING_CAR_YELLOW.get(), FlyingCarYellowEntity.createAttributes().build());
		event.put(WINGED_FLYING_CAR_RED.get(), WingedFlyingCarRedEntity.createAttributes().build());
		event.put(WINGED_FLYING_CAR_WHITE.get(), WingedFlyingCarWhiteEntity.createAttributes().build());
		event.put(ADVANCED_FLYING_CAR_WHITE.get(), AdvancedFlyingCarWhiteEntity.createAttributes().build());
		event.put(ADVANCED_FLYING_CAR_YELLIOW.get(), AdvancedFlyingCarYelliowEntity.createAttributes().build());
		event.put(INFINITE_CAR.get(), InfiniteCarEntity.createAttributes().build());
		event.put(INFINITE_CAR_RED.get(), InfiniteCarRedEntity.createAttributes().build());
		event.put(INFINITE_CAR_WHITE.get(), InfiniteCarWhiteEntity.createAttributes().build());
	}
}
