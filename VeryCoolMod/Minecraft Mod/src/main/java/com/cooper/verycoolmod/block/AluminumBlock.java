package com.cooper.verycoolmod.block;

import com.cooper.verycoolmod.VeryCoolMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;

public class AluminumBlock extends Block {
    public AluminumBlock(){
        super(AbstractBlock.Properties.of(Material.METAL)
                .strength(12.0f, 7.0f)
                .sound(SoundType.STONE)
                .jumpFactor(1f)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE));
        new Item.Properties().tab(VeryCoolMod.CUSTOM_GROUP);
    }
}
