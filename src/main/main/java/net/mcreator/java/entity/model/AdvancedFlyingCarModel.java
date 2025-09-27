package net.mcreator.futuristiccars.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.futuristiccars.entity.AdvancedFlyingCarEntity;

public class AdvancedFlyingCarModel extends GeoModel<AdvancedFlyingCarEntity> {
	@Override
	public ResourceLocation getAnimationResource(AdvancedFlyingCarEntity entity) {
		return ResourceLocation.parse("futuristiccars:animations/flyingcar2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AdvancedFlyingCarEntity entity) {
		return ResourceLocation.parse("futuristiccars:geo/flyingcar2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AdvancedFlyingCarEntity entity) {
		return ResourceLocation.parse("futuristiccars:textures/entities/" + entity.getTexture() + ".png");
	}

}
