package com.cooper.verycoolmod.item;

import com.cooper.verycoolmod.VeryCoolMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;

public class AluminumSword extends SwordItem {
    public static int atkdmg = 2;
    public static float atkspd = -2.2f;

    public AluminumSword(){
        super(ModItemTier.TITANIUM, atkdmg, atkspd, new Item.Properties().tab(VeryCoolMod.CUSTOM_GROUP));
        new Item.Properties().tab(ItemGroup.TAB_SEARCH);

    }
}
