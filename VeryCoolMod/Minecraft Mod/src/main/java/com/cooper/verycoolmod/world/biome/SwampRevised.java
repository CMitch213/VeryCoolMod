package com.cooper.verycoolmod.world.biome;

import net.minecraft.block.Blocks;
import net.minecraft.client.audio.BackgroundMusicTracks;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class SwampRevised {

    //Swampy biome wild update esque
    //LARGE eery biome

    public static Biome createBiome(){

        //What mobtypes can spawn here
        final MobSpawnInfo.Builder mobSpawnInfo = new MobSpawnInfo.Builder();
        DefaultBiomeFeatures.commonSpawns(mobSpawnInfo);

        //Builds the surface level
        final BiomeGenerationSettings.Builder biomeGenBuilder = new BiomeGenerationSettings.Builder().surfaceBuilder(
                SurfaceBuilder.DEFAULT.configured(new SurfaceBuilderConfig(
                        //Surface Block
                        Blocks.GRASS_BLOCK.defaultBlockState(),
                        //Underlayer Block
                        Blocks.DIRT.defaultBlockState(),
                        //Underwater Block
                        Blocks.CLAY.defaultBlockState()
                ))
        );

        //Extra Default Features
        DefaultBiomeFeatures.addDefaultOres(biomeGenBuilder);
        DefaultBiomeFeatures.addAncientDebris(biomeGenBuilder);
        DefaultBiomeFeatures.addExtraGold(biomeGenBuilder);
        DefaultBiomeFeatures.addExtraEmeralds(biomeGenBuilder);
        DefaultBiomeFeatures.addTaigaTrees(biomeGenBuilder);
        DefaultBiomeFeatures.addWaterTrees(biomeGenBuilder);
        DefaultBiomeFeatures.addShatteredSavannaTrees(biomeGenBuilder);
        DefaultBiomeFeatures.addDefaultLakes(biomeGenBuilder);
        DefaultBiomeFeatures.addDefaultSprings(biomeGenBuilder);
        DefaultBiomeFeatures.addSwampClayDisk(biomeGenBuilder);
        DefaultBiomeFeatures.addSwampExtraVegetation(biomeGenBuilder);
        DefaultBiomeFeatures.addSwampVegetation(biomeGenBuilder);



        //custom effects to add to biome
        return new Biome.Builder()
                .precipitation(Biome.RainType.RAIN)
                .downfall(0.69f) //0-1
                .temperature(0.7f) // 0-1
                .biomeCategory(Biome.Category.SWAMP)
                .depth(0.05F) //0-1
                .scale(0.3f)    //0-1
                .specialEffects(
                        new BiomeAmbience.Builder()
                                //colours in hex 0x + hex code
                                .waterColor(0x4DFF29) // Lime Green Water
                                .waterFogColor(0x0F5A00) // Dark Green Fog
                                .skyColor(0x007D4D) // Bluey Green Sky
                                .fogColor(0x64440A) // Brown Sky Fog
                                .grassColorModifier(BiomeAmbience.GrassColorModifier.SWAMP)
                                .ambientMoodSound(MoodSoundAmbience.LEGACY_CAVE_SETTINGS)
                                .backgroundMusic(BackgroundMusicTracks.CREATIVE)
                                .foliageColorOverride(1)
                                .build()
                )
                .generationSettings(biomeGenBuilder.build())
                .mobSpawnSettings(mobSpawnInfo.build())
                .build();
    }


}

