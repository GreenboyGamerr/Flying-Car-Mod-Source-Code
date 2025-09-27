
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.futuristiccars.init;

import org.lwjgl.glfw.GLFW;

import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.futuristiccars.network.YMessage;
import net.mcreator.futuristiccars.network.CarpainterMessage;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class FuturisticcarsModKeyMappings {
	public static final KeyMapping Y = new KeyMapping("key.futuristiccars.y", GLFW.GLFW_KEY_Y, "key.categories.flyingcars") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new YMessage(0, 0));
				YMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping CARPAINTER = new KeyMapping("key.futuristiccars.carpainter", GLFW.GLFW_KEY_V, "key.categories.flyingcars") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new CarpainterMessage(0, 0));
				CarpainterMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(Y);
		event.register(CARPAINTER);
	}

	@EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(ClientTickEvent.Post event) {
			if (Minecraft.getInstance().screen == null) {
				Y.consumeClick();
				CARPAINTER.consumeClick();
			}
		}
	}
}
