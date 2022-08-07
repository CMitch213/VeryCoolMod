package com.cooper.verycoolmod.item;

import com.cooper.verycoolmod.VeryCoolMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;

public class Cutlass extends SwordItem {
    public static int atkdmg = 7;
    public static float atkspd = -2f;

    public Cutlass(){
        super(ItemTier.IRON,atkdmg,atkspd,new Item.Properties().tab(VeryCoolMod.CUSTOM_GROUP));
        new Item.Properties().tab(ItemGroup.TAB_SEARCH);

    }
}
