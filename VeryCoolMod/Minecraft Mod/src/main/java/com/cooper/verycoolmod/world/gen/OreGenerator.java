package com.cooper.verycoolmod.world.gen;

import com.cooper.verycoolmod.util.RegistryHandler;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OreGenerator {
    // Rules

    public static void generateOres(final BiomeLoadingEvent event){
        if(!event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND)) {
            if (event.getCategory().equals(Biome.Category.SAVANNA)) {
                attachOre(event.getGeneration(),
                        OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                        RegistryHandler.TITANIUM_ORE_BLOCK.get().defaultBlockState(),
                        4, 2, 15, 2);
            }
            if (event.getCategory().equals(Biome.Category.EXTREME_HILLS)) {
                attachOre(event.getGeneration(),
                        OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                        RegistryHandler.RUBY_ORE.get().defaultBlockState(),
                        6, 2, 30, 3);
            }
            if (event.getCategory().equals(Biome.Category.PLAINS)) {
                attachOre(event.getGeneration(),
                        OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                        RegistryHandler.ALUMINUM_ORE.get().defaultBlockState(),
                        8, 2, 47, 4);
            }

            if (event.getCategory().equals(Biome.Category.OCEAN)) {
                attachOre(event.getGeneration(),
                        OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                        RegistryHandler.SULFUR_BLOCK.get().defaultBlockState(),
                        7, 2, 60, 6);
            }

            if (event.getCategory().equals(Biome.Category.THEEND)) {
                attachOre(event.getGeneration(),
                        OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                        RegistryHandler.ENDIUM.get().defaultBlockState(),
                        7, 2, 60, 7);
            }
            attachOre(event.getGeneration(),
                    OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    RegistryHandler.TITANIUM_ORE_BLOCK.get().defaultBlockState(),
                    6, 2, 15, 1);

            attachOre(event.getGeneration(),
                    OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    RegistryHandler.RUBY_ORE.get().defaultBlockState(),
                    9, 2, 30, 3);

            attachOre(event.getGeneration(),
                    OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    RegistryHandler.ALUMINUM_ORE.get().defaultBlockState(),
                    9, 2, 47, 4);

            attachOre(event.getGeneration(),
                    OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    RegistryHandler.MARBLE.get().defaultBlockState(),
                    13, 2, 47, 6);

            attachOre(event.getGeneration(),
                    OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    RegistryHandler.NICKEL_ORE.get().defaultBlockState(),
                    3, 2, 14, 1);

            attachOre(event.getGeneration(),
                    OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    RegistryHandler.SULFUR_BLOCK.get().defaultBlockState(),
                    2, 2, 55, 2);

            attachOre(event.getGeneration(),
                    OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    RegistryHandler.LIMESTONE.get().defaultBlockState(),
                    24, 2, 57, 5);

            attachOre(event.getGeneration(),
                    OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    RegistryHandler.CALCITE.get().defaultBlockState(),
                    3, 2, 10, 2);

            attachOre(event.getGeneration(),
                    OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    RegistryHandler.AQUAMARINE.get().defaultBlockState(),
                    5, 2, 50, 4);

            attachOre(event.getGeneration(),
                    OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    RegistryHandler.SALT_ORE.get().defaultBlockState(),
                    3, 2, 50, 2);
        }
    }


    // Ores & Other Blocks

    public static void attachOre(BiomeGenerationSettingsBuilder settings, RuleTest filler, BlockState block, int veinSize, int minHeight, int maxHeight, int amount){
        settings.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.configured(new OreFeatureConfig(filler, block, veinSize))
                        .decorated(Placement.RANGE.configured(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
                        .squared().count(amount));
    }

}
