package com.cooper.verycoolmod.block;

import com.cooper.verycoolmod.VeryCoolMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;

public class StrongBrick extends Block {
    public StrongBrick(){
        super(AbstractBlock.Properties.of(Material.METAL)
                .strength(99.0f, 25.0f)
                .sound(SoundType.STONE)
                .jumpFactor(0.5f)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE));
        new Item.Properties().tab(VeryCoolMod.CUSTOM_GROUP);
    }
}
