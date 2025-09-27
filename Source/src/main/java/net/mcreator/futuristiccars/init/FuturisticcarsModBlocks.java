
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.futuristiccars.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.futuristiccars.block.FuelMakerBlock;
import net.mcreator.futuristiccars.FuturisticcarsMod;

public class FuturisticcarsModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(FuturisticcarsMod.MODID);
	public static final DeferredBlock<Block> FUEL_MAKER = REGISTRY.register("fuel_maker", FuelMakerBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
