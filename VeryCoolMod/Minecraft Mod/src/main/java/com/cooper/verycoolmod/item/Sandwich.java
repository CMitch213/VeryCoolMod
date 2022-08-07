package com.cooper.verycoolmod.item;

import net.minecraft.item.Food;
import net.minecraft.item.Foods;

public class Sandwich extends Foods {
    public static final Food SANDWICH = (new Food.Builder()).nutrition(20).saturationMod(4.3F).build();
}
