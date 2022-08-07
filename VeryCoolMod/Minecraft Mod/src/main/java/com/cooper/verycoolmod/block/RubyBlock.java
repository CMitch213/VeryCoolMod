package com.cooper.verycoolmod.block;

import com.cooper.verycoolmod.VeryCoolMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;

public class RubyBlock extends Block {
    public RubyBlock(){
        super(AbstractBlock.Properties.of(Material.METAL)
                .strength(12.0f, 7.0f)
                .sound(SoundType.METAL)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE));
        new Item.Properties().tab(VeryCoolMod.CUSTOM_GROUP);
    }
}
