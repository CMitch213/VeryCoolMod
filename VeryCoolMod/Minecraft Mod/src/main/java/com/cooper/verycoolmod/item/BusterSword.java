package com.cooper.verycoolmod.item;

import com.cooper.verycoolmod.VeryCoolMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;

public class BusterSword extends SwordItem {

    public static int atkdmg = 250;
    public static float atkspd = -3;


    public BusterSword(){
        super(ModItemTier.CALCITE,atkdmg,atkspd,new Item.Properties().tab(VeryCoolMod.CUSTOM_GROUP));
        new Item.Properties().tab(ItemGroup.TAB_SEARCH);
        new Item.Properties().fireResistant();

    }
}
