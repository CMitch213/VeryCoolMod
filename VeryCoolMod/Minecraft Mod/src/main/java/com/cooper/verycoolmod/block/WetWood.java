package com.cooper.verycoolmod.block;

import com.cooper.verycoolmod.VeryCoolMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;

public class WetWood extends Block {
    public WetWood(){
        super(AbstractBlock.Properties.of(Material.WOOD)
                .strength(5.0f, 4.0f)
                .sound(SoundType.WOOD)
                .jumpFactor(1f)
                .harvestLevel(1)
                .harvestTool(ToolType.AXE));
        new Item.Properties().tab(VeryCoolMod.CUSTOM_GROUP);
    }
}
