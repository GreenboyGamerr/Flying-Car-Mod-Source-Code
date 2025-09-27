package net.mcreator.futuristiccars.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.futuristiccars.entity.CatsonFlyingCarRedEntity;

public class CatsonFlyingCarRedModel extends GeoModel<CatsonFlyingCarRedEntity> {
	@Override
	public ResourceLocation getAnimationResource(CatsonFlyingCarRedEntity entity) {
		return ResourceLocation.parse("futuristiccars:animations/flyingcar5.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CatsonFlyingCarRedEntity entity) {
		return ResourceLocation.parse("futuristiccars:geo/flyingcar5.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CatsonFlyingCarRedEntity entity) {
		return ResourceLocation.parse("futuristiccars:textures/entities/" + entity.getTexture() + ".png");
	}

}
