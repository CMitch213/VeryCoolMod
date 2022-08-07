package com.cooper.verycoolmod.item;

import com.cooper.verycoolmod.VeryCoolMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ActionResult;

public class GreatSword extends SwordItem {

    public static int atkdmg = 552;
    public static float atkspd = -3;


    public GreatSword(){
        super(ModItemTier.TITANIUM,atkdmg,atkspd,new Item.Properties().tab(VeryCoolMod.CUSTOM_GROUP));
        new Item.Properties().tab(ItemGroup.TAB_SEARCH);
        new Item.Properties().fireResistant();

    }


}
