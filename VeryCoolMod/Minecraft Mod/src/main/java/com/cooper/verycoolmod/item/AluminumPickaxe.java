package com.cooper.verycoolmod.item;

import com.cooper.verycoolmod.VeryCoolMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;

public class AluminumPickaxe extends PickaxeItem {
    public static int atkdmg = 1;
    public static float atkspd = -3f;

    public AluminumPickaxe(){
        super(ModItemTier.ALUMINUM, atkdmg, atkspd, new Item.Properties().tab(VeryCoolMod.CUSTOM_GROUP));
        new Item.Properties().tab(ItemGroup.TAB_SEARCH);

    }

}
