package com.cooper.verycoolmod.item;

import com.cooper.verycoolmod.util.RegistryHandler;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

import java.util.function.Supplier;

public enum ModArmourMaterial implements IArmorMaterial {
    TITANIUM("verycoolmod:titanium", 9999, new int[]{10, 20, 25, 12}, 45, SoundEvents.ARMOR_EQUIP_NETHERITE, 30.0F, 25.0F, () -> {
        return Ingredient.of(RegistryHandler.TITANIUM_INGOT.get());
    }),
    EMERALD("verycoolmod:emerald", 500, new int[]{4, 7, 9, 5}, 45, SoundEvents.ARMOR_EQUIP_DIAMOND, 4.0F, -10.0F, () -> {
        return Ingredient.of(RegistryHandler.TITANIUM_INGOT.get());
    }),
    CALCITE("verycoolmod:calcite", 999999, new int[]{30, 50, 60, 40}, 55, SoundEvents.ARMOR_EQUIP_NETHERITE, 300.0F, 250.0F, () -> {
        return Ingredient.of(RegistryHandler.CALCITE_INGOT.get());
    }),

    RUBY("verycoolmod:ruby", 1000, new int[]{8, 10, 12, 8}, 55, SoundEvents.ARMOR_EQUIP_NETHERITE, 15.0F, 2.0F, () -> {
        return Ingredient.of(RegistryHandler.CALCITE_INGOT.get());
    });

    private static final int[] HEALTH_PER_SLOT = new int[]{23, 25, 26, 21};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyValue<Ingredient> repairIngredient;

    ModArmourMaterial(String name, int durMultp, int[] slotProtection, int enchLvl, SoundEvent Sound, float tough, float kbRes, Supplier<Ingredient> p_i231593_10_) {
        this.name = name;
        this.durabilityMultiplier = durMultp;
        this.slotProtections = slotProtection;
        this.enchantmentValue = enchLvl;
        this.sound = Sound;
        this.toughness = tough;
        this.knockbackResistance = kbRes;
        this.repairIngredient = new LazyValue<>(p_i231593_10_);
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlotType p_200896_1_) {
        return this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlotType p_200902_1_) {
        return this.slotProtections[p_200902_1_.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.sound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
