package net.mcreator.futuristiccars.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.futuristiccars.entity.WingedFlyingCarWhiteEntity;

public class WingedFlyingCarWhiteModel extends GeoModel<WingedFlyingCarWhiteEntity> {
	@Override
	public ResourceLocation getAnimationResource(WingedFlyingCarWhiteEntity entity) {
		return ResourceLocation.parse("futuristiccars:animations/flyingcar4.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WingedFlyingCarWhiteEntity entity) {
		return ResourceLocation.parse("futuristiccars:geo/flyingcar4.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WingedFlyingCarWhiteEntity entity) {
		return ResourceLocation.parse("futuristiccars:textures/entities/" + entity.getTexture() + ".png");
	}

}
