package com.cooper.verycoolmod.item;

import com.cooper.verycoolmod.VeryCoolMod;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;

public class Bezerker extends AxeItem {
    public static int atkdmg = 1;
    public static float atkspd = 995;


    public Bezerker(){
        super(ModItemTier.TITANIUM,atkdmg,atkspd,new Item.Properties().tab(VeryCoolMod.CUSTOM_GROUP));
        new Item.Properties().tab(ItemGroup.TAB_SEARCH);
        new Item.Properties().fireResistant();

    }
}
