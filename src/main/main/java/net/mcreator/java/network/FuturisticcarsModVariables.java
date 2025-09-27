package net.mcreator.futuristiccars.network;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.mcreator.futuristiccars.FuturisticcarsMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class FuturisticcarsModVariables {
	public static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES = DeferredRegister.create(NeoForgeRegistries.Keys.ATTACHMENT_TYPES, FuturisticcarsMod.MODID);
	public static double moveup = 0;
	public static double movedown = 0;
	public static double X = 0;
	public static double Y = 0;
	public static double Z = 0;
	public static double canshoot = 0;
	public static double normalcar = 0;
	public static double redcar = 0;
	public static double catson = 0;
	public static double yellowcar = 0;
	public static double orangecar = 0;

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
	}
}
