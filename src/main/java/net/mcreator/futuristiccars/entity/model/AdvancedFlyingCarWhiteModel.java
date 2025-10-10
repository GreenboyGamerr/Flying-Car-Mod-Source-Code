package net.mcreator.futuristiccars.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.futuristiccars.entity.AdvancedFlyingCarWhiteEntity;

public class AdvancedFlyingCarWhiteModel extends GeoModel<AdvancedFlyingCarWhiteEntity> {
	@Override
	public ResourceLocation getAnimationResource(AdvancedFlyingCarWhiteEntity entity) {
		return ResourceLocation.parse("futuristiccars:animations/flyingcar2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AdvancedFlyingCarWhiteEntity entity) {
		return ResourceLocation.parse("futuristiccars:geo/flyingcar2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AdvancedFlyingCarWhiteEntity entity) {
		return ResourceLocation.parse("futuristiccars:textures/entities/" + entity.getTexture() + ".png");
	}

}
