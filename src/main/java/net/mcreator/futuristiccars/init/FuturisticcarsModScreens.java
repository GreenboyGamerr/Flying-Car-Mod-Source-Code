
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.futuristiccars.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.futuristiccars.client.gui.INVScreen;
import net.mcreator.futuristiccars.client.gui.FuelMakerInvScreen;
import net.mcreator.futuristiccars.client.gui.CarsinvScreen;
import net.mcreator.futuristiccars.client.gui.CarCustomizerINVScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FuturisticcarsModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(FuturisticcarsModMenus.INV.get(), INVScreen::new);
		event.register(FuturisticcarsModMenus.FUEL_MAKER_INV.get(), FuelMakerInvScreen::new);
		event.register(FuturisticcarsModMenus.CAR_CUSTOMIZER_INV.get(), CarCustomizerINVScreen::new);
		event.register(FuturisticcarsModMenus.CARSINV.get(), CarsinvScreen::new);
	}
}
