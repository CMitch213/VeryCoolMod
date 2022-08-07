package com.cooper.verycoolmod.item;

import com.cooper.verycoolmod.VeryCoolMod;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class AluminumHoe extends HoeItem {
    public static int atkdmg = 1;
    public static float atkspd = -3;

    public AluminumHoe(){
        super(ModItemTier.ALUMINUM, atkdmg, atkspd, new Item.Properties().tab(VeryCoolMod.CUSTOM_GROUP));
        new Item.Properties().tab(ItemGroup.TAB_SEARCH);

    }
}
