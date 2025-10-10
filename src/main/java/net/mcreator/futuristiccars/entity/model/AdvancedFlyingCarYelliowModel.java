package net.mcreator.futuristiccars.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.futuristiccars.entity.AdvancedFlyingCarYelliowEntity;

public class AdvancedFlyingCarYelliowModel extends GeoModel<AdvancedFlyingCarYelliowEntity> {
	@Override
	public ResourceLocation getAnimationResource(AdvancedFlyingCarYelliowEntity entity) {
		return ResourceLocation.parse("futuristiccars:animations/flyingcar2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AdvancedFlyingCarYelliowEntity entity) {
		return ResourceLocation.parse("futuristiccars:geo/flyingcar2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AdvancedFlyingCarYelliowEntity entity) {
		return ResourceLocation.parse("futuristiccars:textures/entities/" + entity.getTexture() + ".png");
	}

}
