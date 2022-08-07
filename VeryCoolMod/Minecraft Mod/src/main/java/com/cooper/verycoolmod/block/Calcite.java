package com.cooper.verycoolmod.block;

import com.cooper.verycoolmod.VeryCoolMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;

public class Calcite extends Block {
    public Calcite(){
        super(AbstractBlock.Properties.of(Material.METAL)
                .strength(50.0f, 120000000000.0f)
                .sound(SoundType.ANCIENT_DEBRIS)
                .jumpFactor(20.0f)
                .harvestLevel(4)
                .harvestTool(ToolType.PICKAXE));
        new Item.Properties().tab(VeryCoolMod.CUSTOM_GROUP);
    }
}
