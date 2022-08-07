package com.cooper.verycoolmod.item;

import com.cooper.verycoolmod.VeryCoolMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;

public class NickelSword extends SwordItem {
    public static int atkdmg = 15;
    public static float atkspd = 35f;

    public NickelSword(){
        super(ModItemTier.NICKEL, atkdmg, atkspd, new Item.Properties().tab(VeryCoolMod.CUSTOM_GROUP));
        new Item.Properties().tab(ItemGroup.TAB_SEARCH);

    }
}
