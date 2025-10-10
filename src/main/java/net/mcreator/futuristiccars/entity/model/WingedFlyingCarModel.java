package net.mcreator.futuristiccars.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.futuristiccars.entity.WingedFlyingCarEntity;

public class WingedFlyingCarModel extends GeoModel<WingedFlyingCarEntity> {
	@Override
	public ResourceLocation getAnimationResource(WingedFlyingCarEntity entity) {
		return ResourceLocation.parse("futuristiccars:animations/flyingcar4.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WingedFlyingCarEntity entity) {
		return ResourceLocation.parse("futuristiccars:geo/flyingcar4.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WingedFlyingCarEntity entity) {
		return ResourceLocation.parse("futuristiccars:textures/entities/" + entity.getTexture() + ".png");
	}

}
