
package net.mcreator.futuristiccars.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.futuristiccars.entity.model.InfiniteCarModel;
import net.mcreator.futuristiccars.entity.InfiniteCarEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class InfiniteCarRenderer extends GeoEntityRenderer<InfiniteCarEntity> {
	public InfiniteCarRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new InfiniteCarModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(InfiniteCarEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, InfiniteCarEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, int color) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, color);
	}

	@Override
	protected float getDeathMaxRotation(InfiniteCarEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
