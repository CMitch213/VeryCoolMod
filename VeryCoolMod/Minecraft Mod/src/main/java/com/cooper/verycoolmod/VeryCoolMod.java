package com.cooper.verycoolmod;

import com.cooper.verycoolmod.client.renderer.PenguinRenderer;
import com.cooper.verycoolmod.entity.BombEntity;
import com.cooper.verycoolmod.entity.PenguinEntityAI;
import com.cooper.verycoolmod.loot.ModLootModifier;
import com.cooper.verycoolmod.util.RegistryHandler;
import com.cooper.verycoolmod.world.gen.OreGenerator;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.SpriteRenderer;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.gen.Heightmap;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.world.MobSpawnInfoBuilder;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nonnull;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Objects;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("verycoolmod")
public class VeryCoolMod
{

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static String MOD_ID = "verycoolmod";
    public static final ItemGroup CUSTOM_GROUP = new VeryCoolTab("verycooltab");
    //private final Object LootModifierEvents;


    public VeryCoolMod() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        //MinecraftForge.EVENT_BUS.register(this.LootModifierEvents);
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGenerator::generateOres);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());

        // Code for loading things before World Gen

        //set biomes
        event.enqueueWork(() -> {
            setupBiome(RegistryHandler.ENCHANTED_FOREST.get(), BiomeManager.BiomeType.COOL, 350, BiomeDictionary.Type.MAGICAL);
            setupBiome(RegistryHandler.SWAMP_REVISED.get(), BiomeManager.BiomeType.WARM, 401, BiomeDictionary.Type.SWAMP);
            setupBiome(RegistryHandler.FANCY_BEACH.get(), BiomeManager.BiomeType.WARM, 401, BiomeDictionary.Type.BEACH);
        });

        //set entity attributes
        event.enqueueWork(()->{
            GlobalEntityTypeAttributes.put(RegistryHandler.PENGUIN_ENTITY.get(), PenguinEntityAI.setCustomAttributes());
            EntitySpawnPlacementRegistry.register(RegistryHandler.PENGUIN_ENTITY.get(), EntitySpawnPlacementRegistry.PlacementType.NO_RESTRICTIONS, Heightmap.Type.WORLD_SURFACE, PenguinEntityAI::checkPenguinSpawnRules);
        });



    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client

        RenderingRegistry.registerEntityRenderingHandler(RegistryHandler.BOMB_ENTITY.get(),
                renderManager -> new SpriteRenderer<BombEntity>(renderManager, Minecraft.getInstance().getItemRenderer()));


        RenderingRegistry.registerEntityRenderingHandler(RegistryHandler.PENGUIN_ENTITY.get(),
                PenguinRenderer::new);

        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().options);
    }

    // Biome setup and Registry Keys
    private static RegistryKey<Biome> key(final Biome biome){
        return RegistryKey.create(ForgeRegistries.Keys.BIOMES, Objects.requireNonNull(ForgeRegistries.BIOMES.getKey(biome), "Hi, Biome Registry was Null"));
    }

    private static void setupBiome(final Biome biome, final BiomeManager.BiomeType biomeType, final int weight, final BiomeDictionary.Type... types){
        BiomeDictionary.addTypes(key(biome), types);
        BiomeManager.addBiome(biomeType, new BiomeManager.BiomeEntry(key(biome), weight));
        LOGGER.info("HELLO from biome setup!");
    }


    public static class VeryCoolTab extends ItemGroup{
        public VeryCoolTab(String label){
            super(label);
        }
        @Override
        public ItemStack makeIcon(){return RegistryHandler.TITANIUM_ORE_BLOCK_ITEM.get().getDefaultInstance();}
    }


    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    @SubscribeEvent
    public void onBiomeLoadingEvent(BiomeLoadingEvent event){
        MobSpawnInfoBuilder spawns = event.getSpawns();
        List<MobSpawnInfo.Spawners> spawnersList = spawns.getSpawner(EntityType.POLAR_BEAR.getCategory());
        for (MobSpawnInfo.Spawners spawners : spawnersList){
            if(spawners.type == EntityType.POLAR_BEAR){
                spawns.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(RegistryHandler.PENGUIN_ENTITY.get(),
                        50 //what perecent of spawns are this mob
                         , 5 // min spawns at once
                         , 15 //max spawns at once
                        ));
                break;
            }
        }
    }

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public class LootModifierEvents {
        @SubscribeEvent
        public void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>> event) {
            event.getRegistry().register(new ModLootModifier.Serializer().setRegistryName(new ResourceLocation(MOD_ID, "oak_log")));
            LOGGER.info("HELLO from Mod Serializer (:");
        }
    }


    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
            LOGGER.info("HELLO from Register Block");
        }
    }
}
