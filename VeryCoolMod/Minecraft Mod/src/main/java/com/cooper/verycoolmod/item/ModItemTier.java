package com.cooper.verycoolmod.item;

import com.cooper.verycoolmod.util.RegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {
    TITANIUM(5, 9999, 99.0F, 4.0F, 25, () -> {
        return Ingredient.of(RegistryHandler.TITANIUM_INGOT.get());
    }),
    ALUMINUM(3, 750, 7.0F, 2.5F, 12, () -> {
        return Ingredient.of(RegistryHandler.ALUMINUM_INGOT.get());
    }),
    AXOLOTL(5, 3, 999.0F, 4.0F, 25, () -> {
        return Ingredient.of(RegistryHandler.AXELOTL.get());
    }),
    NICKEL(3, 200, 999.0F, 4.0F, 55, () -> {
        return Ingredient.of(RegistryHandler.NICKEL.get());
    }),
    CALCITE(6, 25000, 5000.0F, 4.0F, 555, () -> {
        return Ingredient.of(RegistryHandler.CALCITE_INGOT.get());
    }),
    EMERALD(4, 1361, 9.0F, 3.0F, 22, () -> {
        return Ingredient.of(RegistryHandler.RUBY.get());
    }),
    RUBY(3, 750, 15.0F, 2.5F, 12, () -> {
        return Ingredient.of(RegistryHandler.RUBY.get());
    });


    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyValue<Ingredient> repairIngredient;

    ModItemTier(int level, int uses, float speed, float damage, int enchantlvl, Supplier<Ingredient> p_i48458_8_) {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantlvl;
        this.repairIngredient = new LazyValue<>(p_i48458_8_);
    }

    public int getUses() {
        return this.uses;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getAttackDamageBonus() {
        return this.damage;
    }

    public int getLevel() {
        return this.level;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
