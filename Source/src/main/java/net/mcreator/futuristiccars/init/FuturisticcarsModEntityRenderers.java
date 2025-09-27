
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.futuristiccars.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.futuristiccars.client.renderer.WingedFlyingCarWhiteRenderer;
import net.mcreator.futuristiccars.client.renderer.WingedFlyingCarRenderer;
import net.mcreator.futuristiccars.client.renderer.WingedFlyingCarRedRenderer;
import net.mcreator.futuristiccars.client.renderer.InfiniteCarWhiteRenderer;
import net.mcreator.futuristiccars.client.renderer.InfiniteCarRenderer;
import net.mcreator.futuristiccars.client.renderer.InfiniteCarRedRenderer;
import net.mcreator.futuristiccars.client.renderer.FlyingCarYellowRenderer;
import net.mcreator.futuristiccars.client.renderer.FlyingCarRenderer;
import net.mcreator.futuristiccars.client.renderer.FlyingCarRedRenderer;
import net.mcreator.futuristiccars.client.renderer.FastestFlyingCarWhiteRenderer;
import net.mcreator.futuristiccars.client.renderer.FastestFlyingCarRenderer;
import net.mcreator.futuristiccars.client.renderer.FastestFlyingCarRedRenderer;
import net.mcreator.futuristiccars.client.renderer.CatsonFlyingCarYellowRenderer;
import net.mcreator.futuristiccars.client.renderer.CatsonFlyingCarRenderer;
import net.mcreator.futuristiccars.client.renderer.CatsonFlyingCarRedRenderer;
import net.mcreator.futuristiccars.client.renderer.AdvancedFlyingCarYelliowRenderer;
import net.mcreator.futuristiccars.client.renderer.AdvancedFlyingCarWhiteRenderer;
import net.mcreator.futuristiccars.client.renderer.AdvancedFlyingCarRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FuturisticcarsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(FuturisticcarsModEntities.FLYING_CAR.get(), FlyingCarRenderer::new);
		event.registerEntityRenderer(FuturisticcarsModEntities.ADVANCED_FLYING_CAR.get(), AdvancedFlyingCarRenderer::new);
		event.registerEntityRenderer(FuturisticcarsModEntities.FASTEST_FLYING_CAR.get(), FastestFlyingCarRenderer::new);
		event.registerEntityRenderer(FuturisticcarsModEntities.WINGED_FLYING_CAR.get(), WingedFlyingCarRenderer::new);
		event.registerEntityRenderer(FuturisticcarsModEntities.CATSON_FLYING_CAR.get(), CatsonFlyingCarRenderer::new);
		event.registerEntityRenderer(FuturisticcarsModEntities.CATSON_FLYING_CAR_RED.get(), CatsonFlyingCarRedRenderer::new);
		event.registerEntityRenderer(FuturisticcarsModEntities.CATSON_FLYING_CAR_YELLOW.get(), CatsonFlyingCarYellowRenderer::new);
		event.registerEntityRenderer(FuturisticcarsModEntities.FASTEST_FLYING_CAR_RED.get(), FastestFlyingCarRedRenderer::new);
		event.registerEntityRenderer(FuturisticcarsModEntities.FASTEST_FLYING_CAR_WHITE.get(), FastestFlyingCarWhiteRenderer::new);
		event.registerEntityRenderer(FuturisticcarsModEntities.FLYING_CAR_RED.get(), FlyingCarRedRenderer::new);
		event.registerEntityRenderer(FuturisticcarsModEntities.FLYING_CAR_YELLOW.get(), FlyingCarYellowRenderer::new);
		event.registerEntityRenderer(FuturisticcarsModEntities.WINGED_FLYING_CAR_RED.get(), WingedFlyingCarRedRenderer::new);
		event.registerEntityRenderer(FuturisticcarsModEntities.WINGED_FLYING_CAR_WHITE.get(), WingedFlyingCarWhiteRenderer::new);
		event.registerEntityRenderer(FuturisticcarsModEntities.ADVANCED_FLYING_CAR_WHITE.get(), AdvancedFlyingCarWhiteRenderer::new);
		event.registerEntityRenderer(FuturisticcarsModEntities.ADVANCED_FLYING_CAR_YELLIOW.get(), AdvancedFlyingCarYelliowRenderer::new);
		event.registerEntityRenderer(FuturisticcarsModEntities.INFINITE_CAR.get(), InfiniteCarRenderer::new);
		event.registerEntityRenderer(FuturisticcarsModEntities.INFINITE_CAR_RED.get(), InfiniteCarRedRenderer::new);
		event.registerEntityRenderer(FuturisticcarsModEntities.INFINITE_CAR_WHITE.get(), InfiniteCarWhiteRenderer::new);
	}
}
