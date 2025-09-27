package net.mcreator.futuristiccars.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.futuristiccars.entity.FastestFlyingCarWhiteEntity;

public class FastestFlyingCarWhiteModel extends GeoModel<FastestFlyingCarWhiteEntity> {
	@Override
	public ResourceLocation getAnimationResource(FastestFlyingCarWhiteEntity entity) {
		return ResourceLocation.parse("futuristiccars:animations/flyingcar3.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FastestFlyingCarWhiteEntity entity) {
		return ResourceLocation.parse("futuristiccars:geo/flyingcar3.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FastestFlyingCarWhiteEntity entity) {
		return ResourceLocation.parse("futuristiccars:textures/entities/" + entity.getTexture() + ".png");
	}

}
