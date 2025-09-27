package net.mcreator.futuristiccars.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.futuristiccars.entity.FlyingCarYellowEntity;

public class FlyingCarYellowModel extends GeoModel<FlyingCarYellowEntity> {
	@Override
	public ResourceLocation getAnimationResource(FlyingCarYellowEntity entity) {
		return ResourceLocation.parse("futuristiccars:animations/flyingcar.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FlyingCarYellowEntity entity) {
		return ResourceLocation.parse("futuristiccars:geo/flyingcar.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FlyingCarYellowEntity entity) {
		return ResourceLocation.parse("futuristiccars:textures/entities/" + entity.getTexture() + ".png");
	}

}
