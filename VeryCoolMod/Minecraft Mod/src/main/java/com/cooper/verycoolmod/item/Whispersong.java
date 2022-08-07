package com.cooper.verycoolmod.item;

import com.cooper.verycoolmod.VeryCoolMod;
import net.minecraft.item.BowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class Whispersong extends BowItem {
    public Whispersong() {
        super(new Item.Properties().tab(VeryCoolMod.CUSTOM_GROUP).stacksTo(1));
        new Item.Properties().tab(ItemGroup.TAB_SEARCH);
    }
}
