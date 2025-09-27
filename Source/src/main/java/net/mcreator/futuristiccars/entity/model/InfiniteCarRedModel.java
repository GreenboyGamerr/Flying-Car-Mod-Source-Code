package net.mcreator.futuristiccars.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.futuristiccars.entity.InfiniteCarRedEntity;

public class InfiniteCarRedModel extends GeoModel<InfiniteCarRedEntity> {
	@Override
	public ResourceLocation getAnimationResource(InfiniteCarRedEntity entity) {
		return ResourceLocation.parse("futuristiccars:animations/carinfine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(InfiniteCarRedEntity entity) {
		return ResourceLocation.parse("futuristiccars:geo/carinfine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(InfiniteCarRedEntity entity) {
		return ResourceLocation.parse("futuristiccars:textures/entities/" + entity.getTexture() + ".png");
	}

}
