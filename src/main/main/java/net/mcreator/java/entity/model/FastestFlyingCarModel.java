package net.mcreator.futuristiccars.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.futuristiccars.entity.FastestFlyingCarEntity;

public class FastestFlyingCarModel extends GeoModel<FastestFlyingCarEntity> {
	@Override
	public ResourceLocation getAnimationResource(FastestFlyingCarEntity entity) {
		return ResourceLocation.parse("futuristiccars:animations/flyingcar3.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FastestFlyingCarEntity entity) {
		return ResourceLocation.parse("futuristiccars:geo/flyingcar3.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FastestFlyingCarEntity entity) {
		return ResourceLocation.parse("futuristiccars:textures/entities/" + entity.getTexture() + ".png");
	}

}
