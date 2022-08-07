package com.cooper.verycoolmod.item;

import com.cooper.verycoolmod.VeryCoolMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;

public class ParryDagger extends SwordItem {
    public static int atkdmg = 5;
    public static float atkspd = 4f;

    public ParryDagger(){
        super(ModItemTier.EMERALD, atkdmg, atkspd, new Item.Properties().tab(VeryCoolMod.CUSTOM_GROUP));
        new Item.Properties().tab(ItemGroup.TAB_SEARCH);


    }
}
