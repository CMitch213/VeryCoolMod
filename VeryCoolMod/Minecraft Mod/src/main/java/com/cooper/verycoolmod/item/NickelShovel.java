package com.cooper.verycoolmod.item;

import com.cooper.verycoolmod.VeryCoolMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;

public class NickelShovel extends ShovelItem {

    public static int atkdmg = 11;
    public static float atkspd = 3f;

    public NickelShovel(){
        super(ModItemTier.NICKEL, atkdmg,atkspd ,new Item.Properties().tab(VeryCoolMod.CUSTOM_GROUP));
        new Item.Properties().tab(ItemGroup.TAB_SEARCH);

    }


}
