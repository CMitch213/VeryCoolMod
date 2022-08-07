package com.cooper.verycoolmod.item;

import com.cooper.verycoolmod.VeryCoolMod;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;

public class DoubleAxe extends AxeItem {

    public static int atkdmg = 14;
    public static float atkspd = 1f;

    public DoubleAxe(){
        super(ItemTier.STONE, atkdmg,atkspd ,new Item.Properties().tab(VeryCoolMod.CUSTOM_GROUP));
        new Item.Properties().tab(ItemGroup.TAB_SEARCH);

    }
}
