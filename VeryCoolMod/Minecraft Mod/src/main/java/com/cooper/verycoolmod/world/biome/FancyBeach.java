package com.cooper.verycoolmod.world.biome;

import net.minecraft.block.Blocks;
import net.minecraft.client.audio.BackgroundMusicTracks;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class FancyBeach {
    //Beach vibe biome
    //HOT biome

    public static Biome createBiome(){

        //What mobtypes can spawn here
        final MobSpawnInfo.Builder mobSpawnInfo = new MobSpawnInfo.Builder();
        DefaultBiomeFeatures.commonSpawns(mobSpawnInfo);
        DefaultBiomeFeatures.farmAnimals(mobSpawnInfo);
        DefaultBiomeFeatures.plainsSpawns(mobSpawnInfo);



        //Builds the surface level
        final BiomeGenerationSettings.Builder biomeGenBuilder = new BiomeGenerationSettings.Builder().surfaceBuilder(
                SurfaceBuilder.DEFAULT.configured(new SurfaceBuilderConfig(
                        //Surface Block
                        Blocks.SAND.defaultBlockState(),
                        //Underlayer Block
                        Blocks.CLAY.defaultBlockState(),
                        //Underwater Block
                        Blocks.COBBLESTONE.defaultBlockState()
                ))
        );

        //Extra Default Features
        DefaultBiomeFeatures.addDefaultOres(biomeGenBuilder);
        DefaultBiomeFeatures.addAncientDebris(biomeGenBuilder);
        DefaultBiomeFeatures.addForestFlowers(biomeGenBuilder);
        DefaultBiomeFeatures.addFerns(biomeGenBuilder);
        DefaultBiomeFeatures.addExtraGold(biomeGenBuilder);
        DefaultBiomeFeatures.addExtraEmeralds(biomeGenBuilder);
        DefaultBiomeFeatures.addDefaultLakes(biomeGenBuilder);
        DefaultBiomeFeatures.addDefaultSprings(biomeGenBuilder);


        //custom effects to add to biome
        return new Biome.Builder()
                .precipitation(Biome.RainType.RAIN)
                .downfall(0f) //0-1
                .temperature(0.8f) // 0-1
                .biomeCategory(Biome.Category.BEACH)
                .depth(0.05F) //0-1
                .scale(0.5f)    //0-1
                .specialEffects(
                        new BiomeAmbience.Builder()
                                //colours in hex 0x + hex code
                                .waterColor(0x4CE6A1) // Turqouise Water
                                .waterFogColor(0x9FFFD4) // Baby Blue Water Fog
                                .skyColor(0x7FBDEA) // Blue Sky
                                .fogColor(0xDBE8F2) // Foggy Blue Sky Fog
                                .grassColorModifier(BiomeAmbience.GrassColorModifier.NONE)
                                .ambientMoodSound(MoodSoundAmbience.LEGACY_CAVE_SETTINGS)
                                .backgroundMusic(BackgroundMusicTracks.END_BOSS)
                                .foliageColorOverride(0)
                                .build()
                )
                .generationSettings(biomeGenBuilder.build())
                .mobSpawnSettings(mobSpawnInfo.build())
                .build();
    }


}

