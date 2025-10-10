package net.mcreator.futuristiccars.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.futuristiccars.entity.CatsonFlyingCarEntity;

public class CatsonFlyingCarModel extends GeoModel<CatsonFlyingCarEntity> {
	@Override
	public ResourceLocation getAnimationResource(CatsonFlyingCarEntity entity) {
		return ResourceLocation.parse("futuristiccars:animations/flyingcar5.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CatsonFlyingCarEntity entity) {
		return ResourceLocation.parse("futuristiccars:geo/flyingcar5.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CatsonFlyingCarEntity entity) {
		return ResourceLocation.parse("futuristiccars:textures/entities/" + entity.getTexture() + ".png");
	}

}
