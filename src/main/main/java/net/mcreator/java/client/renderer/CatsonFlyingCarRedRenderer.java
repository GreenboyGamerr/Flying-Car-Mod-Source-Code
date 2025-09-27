
package net.mcreator.futuristiccars.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.futuristiccars.entity.model.CatsonFlyingCarRedModel;
import net.mcreator.futuristiccars.entity.CatsonFlyingCarRedEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CatsonFlyingCarRedRenderer extends GeoEntityRenderer<CatsonFlyingCarRedEntity> {
	public CatsonFlyingCarRedRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new CatsonFlyingCarRedModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(CatsonFlyingCarRedEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, CatsonFlyingCarRedEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, int color) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, color);
	}

	@Override
	protected float getDeathMaxRotation(CatsonFlyingCarRedEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
