package com.cooper.verycoolmod.loot;

import com.google.gson.JsonObject;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;

import javax.annotation.Nonnull;
import java.util.List;

public class ModLootModifier extends LootModifier {



    public ModLootModifier(ILootCondition[] condition){
        super(condition);

    }

    @Nonnull
    @Override
    protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {

        return generatedLoot;
    }

    public static class Serializer extends GlobalLootModifierSerializer<ModLootModifier>{
        @Override
        public ModLootModifier read(ResourceLocation name, JsonObject object, ILootCondition[] conditions){
            return new ModLootModifier(conditions);
        }


        @Override
        public JsonObject write(ModLootModifier inst){
            JsonObject json = makeConditions(inst.conditions);
            return json;
        }
    }
}
