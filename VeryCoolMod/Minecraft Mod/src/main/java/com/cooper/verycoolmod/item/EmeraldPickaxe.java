package com.cooper.verycoolmod.item;

import com.cooper.verycoolmod.VeryCoolMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;

public class EmeraldPickaxe extends PickaxeItem {
    public static int atkdmg = 2;
    public static float atkspd = -3f;

    public EmeraldPickaxe(){
        super(ModItemTier.EMERALD, atkdmg, atkspd, new Item.Properties().tab(VeryCoolMod.CUSTOM_GROUP));
        new Item.Properties().tab(ItemGroup.TAB_SEARCH);

    }
}
