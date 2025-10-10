package net.mcreator.futuristiccars.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.futuristiccars.entity.WingedFlyingCarRedEntity;

public class WingedFlyingCarRedModel extends GeoModel<WingedFlyingCarRedEntity> {
	@Override
	public ResourceLocation getAnimationResource(WingedFlyingCarRedEntity entity) {
		return ResourceLocation.parse("futuristiccars:animations/flyingcar4.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WingedFlyingCarRedEntity entity) {
		return ResourceLocation.parse("futuristiccars:geo/flyingcar4.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WingedFlyingCarRedEntity entity) {
		return ResourceLocation.parse("futuristiccars:textures/entities/" + entity.getTexture() + ".png");
	}

}
