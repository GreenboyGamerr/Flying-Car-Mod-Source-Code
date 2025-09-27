package net.mcreator.futuristiccars.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.futuristiccars.entity.FastestFlyingCarRedEntity;

public class FastestFlyingCarRedModel extends GeoModel<FastestFlyingCarRedEntity> {
	@Override
	public ResourceLocation getAnimationResource(FastestFlyingCarRedEntity entity) {
		return ResourceLocation.parse("futuristiccars:animations/flyingcar3.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FastestFlyingCarRedEntity entity) {
		return ResourceLocation.parse("futuristiccars:geo/flyingcar3.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FastestFlyingCarRedEntity entity) {
		return ResourceLocation.parse("futuristiccars:textures/entities/" + entity.getTexture() + ".png");
	}

}
