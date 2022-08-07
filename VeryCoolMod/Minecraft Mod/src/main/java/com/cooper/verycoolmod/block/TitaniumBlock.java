package com.cooper.verycoolmod.block;

import com.cooper.verycoolmod.VeryCoolMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;

public class TitaniumBlock extends Block {
    public TitaniumBlock(){
        super(AbstractBlock.Properties.of(Material.METAL)
                .strength(25.0f, 12000.0f)
                .sound(SoundType.ANCIENT_DEBRIS)
                .friction(0.1f)
                .jumpFactor(4.0f)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE));
        new Item.Properties().tab(VeryCoolMod.CUSTOM_GROUP);
    }
}
