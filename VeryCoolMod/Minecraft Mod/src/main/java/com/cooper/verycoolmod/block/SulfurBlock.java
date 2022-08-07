package com.cooper.verycoolmod.block;

import com.cooper.verycoolmod.VeryCoolMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;

public class SulfurBlock extends Block {

    public SulfurBlock(){
        super(AbstractBlock.Properties.of(Material.CLAY)
                .strength(0)
                .sound(SoundType.GRAVEL)
                .harvestLevel(1)
                .harvestTool(ToolType.SHOVEL));
        new Item.Properties().tab(VeryCoolMod.CUSTOM_GROUP);
    }
}
