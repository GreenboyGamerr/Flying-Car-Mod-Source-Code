package net.mcreator.futuristiccars.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.futuristiccars.entity.FlyingCarRedEntity;

public class FlyingCarRedModel extends GeoModel<FlyingCarRedEntity> {
	@Override
	public ResourceLocation getAnimationResource(FlyingCarRedEntity entity) {
		return ResourceLocation.parse("futuristiccars:animations/flyingcar.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FlyingCarRedEntity entity) {
		return ResourceLocation.parse("futuristiccars:geo/flyingcar.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FlyingCarRedEntity entity) {
		return ResourceLocation.parse("futuristiccars:textures/entities/" + entity.getTexture() + ".png");
	}

}
