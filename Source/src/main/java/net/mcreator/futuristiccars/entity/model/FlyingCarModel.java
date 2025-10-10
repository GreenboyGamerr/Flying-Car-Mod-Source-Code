package net.mcreator.futuristiccars.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.futuristiccars.entity.FlyingCarEntity;

public class FlyingCarModel extends GeoModel<FlyingCarEntity> {
	@Override
	public ResourceLocation getAnimationResource(FlyingCarEntity entity) {
		return ResourceLocation.parse("futuristiccars:animations/flyingcar.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FlyingCarEntity entity) {
		return ResourceLocation.parse("futuristiccars:geo/flyingcar.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FlyingCarEntity entity) {
		return ResourceLocation.parse("futuristiccars:textures/entities/" + entity.getTexture() + ".png");
	}

}
