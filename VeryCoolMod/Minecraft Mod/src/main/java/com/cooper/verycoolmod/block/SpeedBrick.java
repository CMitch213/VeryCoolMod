package com.cooper.verycoolmod.block;

import com.cooper.verycoolmod.VeryCoolMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;

public class SpeedBrick extends Block {
    public SpeedBrick(){
        super(AbstractBlock.Properties.of(Material.GLASS)
                .strength(3.0f, 5.0f)
                .sound(SoundType.ANCIENT_DEBRIS)
                .friction(0.3f)
                .jumpFactor(2.0f)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE));
        new Item.Properties().tab(VeryCoolMod.CUSTOM_GROUP);
    }
}
