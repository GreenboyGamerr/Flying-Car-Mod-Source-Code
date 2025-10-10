package net.mcreator.futuristiccars.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.futuristiccars.entity.CatsonFlyingCarYellowEntity;

public class CatsonFlyingCarYellowModel extends GeoModel<CatsonFlyingCarYellowEntity> {
	@Override
	public ResourceLocation getAnimationResource(CatsonFlyingCarYellowEntity entity) {
		return ResourceLocation.parse("futuristiccars:animations/flyingcar5.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CatsonFlyingCarYellowEntity entity) {
		return ResourceLocation.parse("futuristiccars:geo/flyingcar5.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CatsonFlyingCarYellowEntity entity) {
		return ResourceLocation.parse("futuristiccars:textures/entities/" + entity.getTexture() + ".png");
	}

}
