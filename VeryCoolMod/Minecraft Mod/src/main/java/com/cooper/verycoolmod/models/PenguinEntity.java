
package com.cooper.verycoolmod.models;
//Teacher has it named PenguinModel

import com.cooper.verycoolmod.entity.PenguinEntityAI;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class PenguinEntity<T extends PenguinEntityAI> extends EntityModel<T> {
	private final ModelRenderer main;
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer beak;
	private final ModelRenderer rightarm;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightleg;
	private final ModelRenderer leftleg;

	public PenguinEntity() {
		texWidth = 64;
		texHeight = 32;

		main = new ModelRenderer(this);
		main.setPos(0.0F, 24.0F, 0.0F);


		body = new ModelRenderer(this);
		body.setPos(0.0F, -4.0F, 0.0F);
		main.addChild(body);
		body.texOffs(0, 16).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 8.0F, 4.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setPos(0.0F, -10.0F, 0.0F);
		main.addChild(head);
		head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		beak = new ModelRenderer(this);
		beak.setPos(0.0F, -2.0F, -4.0F);
		head.addChild(beak);
		beak.texOffs(44, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setPos(-4.0F, -10.0F, 0.0F);
		main.addChild(rightarm);
		rightarm.texOffs(23, 15).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setPos(4.0F, -10.0F, 0.5F);
		main.addChild(leftarm);
		leftarm.texOffs(25, 16).addBox(0.0F, 0.0F, -1.5F, 1.0F, 8.0F, 3.0F, 0.0F, false);

		rightleg = new ModelRenderer(this);
		rightleg.setPos(-2.0F, -2.0F, 0.0F);
		main.addChild(rightleg);
		rightleg.texOffs(32, 0).addBox(-2.0F, 0.0F, -5.0F, 3.0F, 2.0F, 6.0F, 0.0F, false);

		leftleg = new ModelRenderer(this);
		leftleg.setPos(2.0F, -2.0F, 0.0F);
		main.addChild(leftleg);
		leftleg.texOffs(32, 0).addBox(-1.0F, 0.0F, -5.0F, 3.0F, 2.0F, 6.0F, 0.0F, false);
	}



	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//arms
		leftarm.xRot = MathHelper.cos(ageInTicks * 0.6662f) * 1.4f * limbSwingAmount;
		leftarm.yRot = 0.0f;

		rightarm.xRot = MathHelper.cos(ageInTicks * 0.6662f + 3.141593f) * 1.4f * limbSwingAmount;
		rightarm.yRot = 0.0f;


		//legs
		leftleg.yRot = MathHelper.cos(ageInTicks) * limbSwingAmount;

		rightleg.yRot = MathHelper.cos(ageInTicks + 3.141593f) * limbSwingAmount;
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
