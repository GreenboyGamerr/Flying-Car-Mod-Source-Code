
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.futuristiccars.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.futuristiccars.FuturisticcarsMod;

public class FuturisticcarsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, FuturisticcarsMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> FLYINGCAR = REGISTRY.register("flyingcar", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("futuristiccars", "flyingcar")));
}
