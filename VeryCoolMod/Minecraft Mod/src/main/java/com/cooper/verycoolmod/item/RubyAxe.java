package com.cooper.verycoolmod.item;

import com.cooper.verycoolmod.VeryCoolMod;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class RubyAxe extends AxeItem {

    public static int atkdmg = 7;
    public static float atkspd = -3f;

    public RubyAxe(){
        super(ModItemTier.RUBY, atkdmg, atkspd, new Item.Properties().tab(VeryCoolMod.CUSTOM_GROUP));
        new Item.Properties().tab(ItemGroup.TAB_SEARCH);
    }

}
