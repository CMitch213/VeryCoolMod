package com.cooper.verycoolmod.item;

import com.cooper.verycoolmod.VeryCoolMod;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class AluminumAxe extends AxeItem {
    public static int atkdmg = 6;
    public static float atkspd = -3f;

    public AluminumAxe(){
        super(ModItemTier.ALUMINUM, atkdmg, atkspd, new Item.Properties().tab(VeryCoolMod.CUSTOM_GROUP));
        new Item.Properties().tab(ItemGroup.TAB_SEARCH);

    }

}
