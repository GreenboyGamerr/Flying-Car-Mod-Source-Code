package net.mcreator.futuristiccars.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.futuristiccars.entity.InfiniteCarEntity;

public class InfiniteCarModel extends GeoModel<InfiniteCarEntity> {
	@Override
	public ResourceLocation getAnimationResource(InfiniteCarEntity entity) {
		return ResourceLocation.parse("futuristiccars:animations/carinfine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(InfiniteCarEntity entity) {
		return ResourceLocation.parse("futuristiccars:geo/carinfine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(InfiniteCarEntity entity) {
		return ResourceLocation.parse("futuristiccars:textures/entities/" + entity.getTexture() + ".png");
	}

}
