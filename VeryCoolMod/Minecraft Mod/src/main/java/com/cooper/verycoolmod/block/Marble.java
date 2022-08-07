package com.cooper.verycoolmod.block;

import com.cooper.verycoolmod.VeryCoolMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;

public class Marble extends Block {
    public Marble(){
        super(AbstractBlock.Properties.of(Material.METAL)
                .strength(2.0f, 2.0f)
                .sound(SoundType.STONE)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE));
        new Item.Properties().tab(VeryCoolMod.CUSTOM_GROUP);
    }
}
