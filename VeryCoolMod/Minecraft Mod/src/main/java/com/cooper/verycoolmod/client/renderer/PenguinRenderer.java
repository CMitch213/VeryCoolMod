package com.cooper.verycoolmod.client.renderer;

import com.cooper.verycoolmod.VeryCoolMod;
import com.cooper.verycoolmod.entity.PenguinEntityAI;
import com.cooper.verycoolmod.models.PenguinEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class PenguinRenderer extends MobRenderer<PenguinEntityAI, PenguinEntity<PenguinEntityAI>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(VeryCoolMod.MOD_ID, "textures/entity/penguin.png");

    public PenguinRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new PenguinEntity<PenguinEntityAI>(), 1.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(PenguinEntityAI penguinEntity) {
        return TEXTURE;
    }
}
