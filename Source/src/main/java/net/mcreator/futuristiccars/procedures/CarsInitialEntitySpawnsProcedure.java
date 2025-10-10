package net.mcreator.futuristiccars.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

import net.mcreator.futuristiccars.network.FuturisticcarsModVariables;

public class CarsInitialEntitySpawnsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(new Vec3(FuturisticcarsModVariables.X, FuturisticcarsModVariables.Y, FuturisticcarsModVariables.Z));
	}
}
