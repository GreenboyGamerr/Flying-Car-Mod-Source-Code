package net.mcreator.futuristiccars.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.futuristiccars.entity.InfiniteCarWhiteEntity;

public class InfiniteCarWhiteModel extends GeoModel<InfiniteCarWhiteEntity> {
	@Override
	public ResourceLocation getAnimationResource(InfiniteCarWhiteEntity entity) {
		return ResourceLocation.parse("futuristiccars:animations/carinfine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(InfiniteCarWhiteEntity entity) {
		return ResourceLocation.parse("futuristiccars:geo/carinfine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(InfiniteCarWhiteEntity entity) {
		return ResourceLocation.parse("futuristiccars:textures/entities/" + entity.getTexture() + ".png");
	}

}
