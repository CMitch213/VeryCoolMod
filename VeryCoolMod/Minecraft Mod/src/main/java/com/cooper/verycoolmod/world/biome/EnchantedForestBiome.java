package com.cooper.verycoolmod.world.biome;

import com.cooper.verycoolmod.util.RegistryHandler;
import net.minecraft.block.Blocks;
import net.minecraft.client.audio.BackgroundMusicSelector;
import net.minecraft.client.audio.BackgroundMusicTracks;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class EnchantedForestBiome {

    //Twilight Forest style biome
    //LARGE eery biome

    public static Biome createBiome(){

        //What mobtypes can spawn here
        final MobSpawnInfo.Builder mobSpawnInfo = new MobSpawnInfo.Builder();
        DefaultBiomeFeatures.commonSpawns(mobSpawnInfo);
        DefaultBiomeFeatures.farmAnimals(mobSpawnInfo);
        DefaultBiomeFeatures.plainsSpawns(mobSpawnInfo);
        DefaultBiomeFeatures.endSpawns(mobSpawnInfo);
        DefaultBiomeFeatures.mooshroomSpawns(mobSpawnInfo);


        //Builds the surface level
        final BiomeGenerationSettings.Builder biomeGenBuilder = new BiomeGenerationSettings.Builder().surfaceBuilder(
                SurfaceBuilder.DEFAULT.configured(new SurfaceBuilderConfig(
                        //Surface Block
                        Blocks.MYCELIUM.defaultBlockState(),
                        //Underlayer Block
                        Blocks.PINK_WOOL.defaultBlockState(),
                        //Underwater Block
                        Blocks.SAND.defaultBlockState()
                ))
        );

        //Extra Default Features
        DefaultBiomeFeatures.addDefaultOres(biomeGenBuilder);
        DefaultBiomeFeatures.addAncientDebris(biomeGenBuilder);
        DefaultBiomeFeatures.addBerryBushes(biomeGenBuilder);
        DefaultBiomeFeatures.addForestGrass(biomeGenBuilder);
        DefaultBiomeFeatures.addExtraGold(biomeGenBuilder);
        DefaultBiomeFeatures.addExtraEmeralds(biomeGenBuilder);
        DefaultBiomeFeatures.addTaigaTrees(biomeGenBuilder);
        DefaultBiomeFeatures.addDefaultLakes(biomeGenBuilder);
        DefaultBiomeFeatures.addDefaultSprings(biomeGenBuilder);


        //custom effects to add to biome
        return new Biome.Builder()
                .precipitation(Biome.RainType.RAIN)
                .downfall(3f) //0-1
                .temperature(0.4f) // 0-1
                .biomeCategory(Biome.Category.FOREST)
                .depth(0.35F) //0-1
                .scale(5f)    //0-1
                .specialEffects(
                        new BiomeAmbience.Builder()
                                //colours in hex 0x + hex code
                                .waterColor(0xF4C2C2) // Baby Pink Water
                                .waterFogColor(0xA020F0) // Purple Water Fog
                                .skyColor(0x040021) // Navy Blue Sky
                                .fogColor(0x040021) // Navy Blue Sky Fog
                                .grassColorModifier(BiomeAmbience.GrassColorModifier.DARK_FOREST)
                                .ambientMoodSound(MoodSoundAmbience.LEGACY_CAVE_SETTINGS)
                                .backgroundMusic(BackgroundMusicTracks.END_BOSS)
                                .foliageColorOverride(3)
                                .build()
                )
                .generationSettings(biomeGenBuilder.build())
                .mobSpawnSettings(mobSpawnInfo.build())
                .build();
    }


}
