package com.cooper.verycoolmod.world.gen;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.feature.template.TagMatchRuleTest;

public class EndFeatureConfig extends OreFeatureConfig {
    public static final Codec<OreFeatureConfig> CODEC = RecordCodecBuilder.create((p_236568_0_) -> {
        return p_236568_0_.group(RuleTest.CODEC.fieldOf("target").forGetter((p_236570_0_) -> {
            return p_236570_0_.target;
        }), BlockState.CODEC.fieldOf("state").forGetter((p_236569_0_) -> {
            return p_236569_0_.state;
        }), Codec.intRange(0, 64).fieldOf("size").forGetter((p_236567_0_) -> {
            return p_236567_0_.size;
        })).apply(p_236568_0_, OreFeatureConfig::new);
    });
    public EndFeatureConfig(RuleTest target, BlockState blockstate, int size) {
        super(target, blockstate, size);
    }

    public static final class ModReplacables {
        public static final RuleTest NATURAL_END = new TagMatchRuleTest(BlockTags.DRAGON_IMMUNE);
    }
}
