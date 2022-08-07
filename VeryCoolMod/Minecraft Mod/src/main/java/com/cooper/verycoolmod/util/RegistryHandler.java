package com.cooper.verycoolmod.util;

import com.cooper.verycoolmod.VeryCoolMod;
import com.cooper.verycoolmod.block.*;
import com.cooper.verycoolmod.entity.*;
import com.cooper.verycoolmod.item.*;
import com.cooper.verycoolmod.world.biome.EnchantedForestBiome;
import com.cooper.verycoolmod.world.biome.FancyBeach;
import com.cooper.verycoolmod.world.biome.SwampRevised;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VeryCoolMod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, VeryCoolMod.MOD_ID);
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, VeryCoolMod.MOD_ID);
    public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, VeryCoolMod.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
        BIOMES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //My Items
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot", ItemBase::new);
    public static final RegistryObject<Item> TITANIUM_ORE = ITEMS.register("titanium_ore", ItemBase::new);
    public static final RegistryObject<Item> SULFUR_ORE = ITEMS.register("sulfurore", ItemBase::new);
    public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot", ItemBase::new);
    public static final RegistryObject<Item> ALUMINUM_NUGGET = ITEMS.register("aluminum_nugget", ItemBase::new);
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    public static final RegistryObject<Item> COIN = ITEMS.register("coin", ItemBase::new);
    public static final RegistryObject<Item> ENDIUM_INGOT = ITEMS.register("endium_ingot", ItemBase::new);
    public static final RegistryObject<Item> BARK = ITEMS.register("bark", ItemBase::new);
    public static final RegistryObject<Item> NICKEL = ITEMS.register("nickel", ItemBase::new);
    public static final RegistryObject<Item> CALCITE_INGOT = ITEMS.register("calcite_ingot", ItemBase::new);
    public static final RegistryObject<Item> SALT = ITEMS.register("salt",ItemBase::new);
    public static final RegistryObject<Item> EMERALD_NUGGET = ITEMS.register("emerald_nugget", ItemBase::new);




    //TOOLS
    public static final RegistryObject<Item> AXELOTL = ITEMS.register("axelotl", Axelotl::new);
        //aluminum tools
        public static final RegistryObject<Item> ALUMINUM_AXE = ITEMS.register("aluminum_axe", AluminumAxe::new);
        public static final RegistryObject<Item> ALUMINUM_HOE = ITEMS.register("aluminum_hoe", AluminumHoe::new);
        public static final RegistryObject<Item> ALUMINUM_PICKAXE = ITEMS.register("aluminum_pickaxe", AluminumPickaxe::new);
        public static final RegistryObject<Item> ALUMINUM_SPADE = ITEMS.register("aluminum_spade", AluminumSpade::new);
        //ruby tools
        public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe", RubyAxe::new);
        public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe", RubyHoe::new);
        public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", RubyPickaxe::new);
        public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel", RubyShovel::new);

        //titanium tools
        public static final RegistryObject<Item> TITANIUM_SPADE = ITEMS.register("titanium_spade", TitaniumSpade::new);
        public static final RegistryObject<Item> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe", TitaniumPickaxe::new);
        public static final RegistryObject<Item> TITANIUM_AXE = ITEMS.register("titanium_axe", TitaniumAxe::new);
        public static final RegistryObject<Item> TITANIUM_HOE = ITEMS.register("titanium_hoe", TitaniumHoe::new);

        //nickel tools
        public static final RegistryObject<Item> NICKEL_AXE = ITEMS.register("nickel_axe", NickelAxe::new);
        public static final RegistryObject<Item> NICKEL_HOE = ITEMS.register("nickel_hoe", NickelHoe::new);
        public static final RegistryObject<Item> NICKEL_PICKAXE = ITEMS.register("nickel_pickaxe", NickelPickaxe::new);
        public static final RegistryObject<Item> NICKEL_SHOVEL = ITEMS.register("nickel_shovel", NickelShovel::new);

        //calcite tools
        public static final RegistryObject<Item> CALCITE_AXE = ITEMS.register("calcite_axe", CalciteAxe::new);
        public static final RegistryObject<Item> CALCITE_HOE = ITEMS.register("calcite_hoe", CalciteHoe::new);
        public static final RegistryObject<Item> CALCITE_PICKAXE = ITEMS.register("calcite_pickaxe", CalcitePickaxe::new);
        public static final RegistryObject<Item> CALCITE_SHOVEL = ITEMS.register("calcite_shovel", CalciteShovel::new);

        //emerald tools
        public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe", EmeraldAxe::new);
        public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register("emerald_hoe", EmeraldHoe::new);
        public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", EmeraldPickaxe::new);
        public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", EmeraldShovel::new);

    //melee combat
    public static final RegistryObject<Item> TITANIUM_SWORD = ITEMS.register("titanium_sword", TitaniumSword::new);
    public static final RegistryObject<Item> DAGGER = ITEMS.register("dagger", Dagger::new);
    public static final RegistryObject<Item> KNIFE = ITEMS.register("knife", Knife::new);
    public static final RegistryObject<Item> DOUBLE_AXE = ITEMS.register("doubleaxe", DoubleAxe::new);
    public static final RegistryObject<Item> BALISONG = ITEMS.register("balisong", Balisong::new);
    public static final RegistryObject<Item> SPEAR = ITEMS.register("spear", Spear::new);
    public static final RegistryObject<Item> GREAT_SWORD = ITEMS.register("great_sword", GreatSword::new);
    public static final RegistryObject<Item> EXCALIBUR = ITEMS.register("excalibur", Excalibur::new);
    public static final RegistryObject<Item> SHARKY = ITEMS.register("sharky", Sharky::new);
    public static final RegistryObject<Item> BEZERKER = ITEMS.register("bezerker", Bezerker::new);
    public static final RegistryObject<Item> KATANA = ITEMS.register("katana", Katana::new);
    public static final RegistryObject<Item> FROST_SCYTHE = ITEMS.register("frost_scythe", FrostScythe::new);
    public static final RegistryObject<Item> TITANIUM_KNIFE = ITEMS.register("titanium_knife", TitaniumKnife::new);
    public static final RegistryObject<Item> TITANIUM_STAFF = ITEMS.register("titanium_staff", TitaniumStaff::new);
    public static final RegistryObject<Item> CUTLASS = ITEMS.register("cutlass", Cutlass::new);
    public static final RegistryObject<Item> DOUBLE_BLADE = ITEMS.register("double_blade", DoubleBlade::new);
    public static final RegistryObject<Item> ALUMINUM_SWORD = ITEMS.register("aluminum_sword", AluminumSword::new);
    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword", RubySword::new);
    public static final RegistryObject<Item> NICKEL_SWORD = ITEMS.register("nickel_sword", NickelSword::new);
    public static final RegistryObject<Item> CALCITE_SWORD = ITEMS.register("calcite_sword", CalciteSword::new);
    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword", EmeraldSword::new);
    public static final RegistryObject<Item> PARRYDAGGER = ITEMS.register("parrying_dagger", ParryDagger::new);
    public static final RegistryObject<Item> BUSTERSWORD = ITEMS.register("bustersword", BusterSword::new);
    public static final RegistryObject<Item> MASTERSWORD = ITEMS.register("mastersword", Mastersword::new);
    public static final RegistryObject<Item> ENERGY_SWORD = ITEMS.register("energy_sword", EnergySword::new);

    //long distance combat
    public static final RegistryObject<Item> BOMB = ITEMS.register("bomb", BombItem::new);
    public static final RegistryObject<Item> BIG_BOMB = ITEMS.register("big_bomb", BigBombItem::new);
    public static final RegistryObject<Item> LARGE_BOMB = ITEMS.register("large_bomb", LargeBombItem::new);
    public static final RegistryObject<Item> MORTAR = ITEMS.register("mortar", MortarItem::new);
    public static final RegistryObject<Item> MISSILE = ITEMS.register("missile",MissileItem::new);



    public static final RegistryObject<Item> THROWING_KNIFE = ITEMS.register("throwing_knife", Bezerker::new);

    //armour
    public static final RegistryObject<Item> TITANIUM_BOOTS = ITEMS.register("titanium_boots", TitaniumBoots::new);
    public static final RegistryObject<Item> TITANIUM_LEGS = ITEMS.register("titanium_legs", TitaniumLegs::new);
    public static final RegistryObject<Item> TITANIUM_CHEST = ITEMS.register("titanium_chest", TitaniumChest::new);
    public static final RegistryObject<Item> TITANIUM_HEAD = ITEMS.register("titanium_head", TitaniumHead::new);

    public static final RegistryObject<Item> CALCITE_BOOTS = ITEMS.register("calcite_boots", CalciteBoots::new);
    public static final RegistryObject<Item> CALCITE_LEGS = ITEMS.register("calcite_legs", CalciteLegs::new);
    public static final RegistryObject<Item> CALCITE_CHEST = ITEMS.register("calcite_chest", CalciteChest::new);
    public static final RegistryObject<Item> CALCITE_HEAD = ITEMS.register("calcite_head", CalciteHead::new);

    public static final RegistryObject<Item> EMERALD_BOOTS = ITEMS.register("emerald_boots", EmeraldBoots::new);
    public static final RegistryObject<Item> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", EmeraldLeggings::new);
    public static final RegistryObject<Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", EmeraldChestplate::new);
    public static final RegistryObject<Item> EMERALD_HELMET = ITEMS.register("emerald_helmet", EmeraldHelmet::new);

    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots", RubyBoots::new);
    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", RubyLeggings::new);
    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", RubyChestplate::new);
    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet", RubyHelmet::new);
    //food
    public static final RegistryObject<Item> SANDWICH = ITEMS.register("sandwich", ItemBase::new);

    //My Blocks
    public static final RegistryObject<Block> TITANIUM_ORE_BLOCK = BLOCKS.register("titanium_ore_block", TitaniumOreBlock::new);
    public static final RegistryObject<Block> STRONG_BRICK = BLOCKS.register("strong_brick", StrongBrick::new);
    public static final RegistryObject<Block> MOSS_STONE = BLOCKS.register("moss_stone", MossStone::new);
    public static final RegistryObject<Block> TITANIUM_BLOCK = BLOCKS.register("titanium_block", TitaniumBlock::new);
    public static final RegistryObject<Block> SULFUR_BLOCK = BLOCKS.register("sulfurblock", SulfurBlock::new);
    public static final RegistryObject<Block> ALUMINUM_ORE = BLOCKS.register("aluminum_ore", AluminumOre::new);
    public static final RegistryObject<Block> ALUMINUM_BLOCK = BLOCKS.register("aluminum_block", AluminumBlock::new);
    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", RubyOre::new);
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<Block> MARBLE = BLOCKS.register("marble", Marble::new);
    public static final RegistryObject<Block> DARK_GLASS = BLOCKS.register("dark_glass", DarkGlass::new);
    public static final RegistryObject<Block> MIXED_BRICK = BLOCKS.register("mixed_brick", BlockBase::new);
    public static final RegistryObject<Block> OLD_BRICK = BLOCKS.register("old_brick", BlockBase::new);
    public static final RegistryObject<Block> MARBLE_BRICK = BLOCKS.register("marble_brick", BlockBase::new);
    public static final RegistryObject<Block> LIMESTONE = BLOCKS.register("limestone", BlockBase::new);
    public static final RegistryObject<Block> ENDIUM = BLOCKS.register("endium", AluminumOre::new);
    public static final RegistryObject<Block> WET_WOOD = BLOCKS.register("wet_wood", WetWood::new);
    public static final RegistryObject<Block> NICKEL_ORE = BLOCKS.register("nickel_ore", NickelOre::new);
    public static final RegistryObject<Block> CALCITE = BLOCKS.register("calcite", Calcite::new);
    public static final RegistryObject<Block> AQUAMARINE = BLOCKS.register("aquamarine", BlockBase::new);
    public static final RegistryObject<Block> MARBLESLAB  = BLOCKS.register("marbleslab", BlockBase::new);
    public static final RegistryObject<Block> SALT_ORE = BLOCKS.register("salt_ore", BlockBase::new);
    public static final RegistryObject<Block> SPEEDBRICK = BLOCKS.register("speedbrick", SpeedBrick::new);

    //My Blocks As Items
    public static final RegistryObject<Item> TITANIUM_ORE_BLOCK_ITEM = ITEMS.register("titanium_ore_block", () -> new BlockItemBase(TITANIUM_ORE_BLOCK.get()));
    public static final RegistryObject<Item> STRONG_BRICK_ITEM = ITEMS.register("strong_brick", () -> new BlockItemBase(STRONG_BRICK.get()));
    public static final RegistryObject<Item> MOSS_STONE_ITEM = ITEMS.register("moss_stone", () -> new BlockItemBase(MOSS_STONE.get()));
    public static final RegistryObject<Item> TITANIUM_BLOCK_ITEM = ITEMS.register("titanium_block", () -> new BlockItemBase(TITANIUM_BLOCK.get()));
    public static final RegistryObject<Item> SULFUR_BLOCK_ITEM = ITEMS.register("sulfurblock", () -> new BlockItemBase(SULFUR_BLOCK.get()));
    public static final RegistryObject<Item> ALUMINUM_ORE_ITEM = ITEMS.register("aluminum_ore", () -> new BlockItemBase(ALUMINUM_ORE.get()));
    public static final RegistryObject<Item> ALUMINUM_BLOCK_ITEM = ITEMS.register("aluminum_block", () -> new BlockItemBase(ALUMINUM_BLOCK.get()));
    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore", () -> new BlockItemBase(RUBY_ORE.get()));
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_BLOCK.get()));
    public static final RegistryObject<Item> MARBLE_ITEM = ITEMS.register("marble", () -> new BlockItemBase(MARBLE.get()));
    public static final RegistryObject<Item> DARK_GLASS_ITEM = ITEMS.register("dark_glass", () -> new BlockItemBase(DARK_GLASS.get()));
    public static final RegistryObject<Item> MIXED_BRICK_ITEM = ITEMS.register("mixed_brick", () -> new BlockItemBase(MIXED_BRICK.get()));
    public static final RegistryObject<Item> OLD_BRICK_ITEM = ITEMS.register("old_brick", () -> new BlockItemBase(OLD_BRICK.get()));
    public static final RegistryObject<Item> MARBLE_BRICK_ITEM = ITEMS.register("marble_brick", () -> new BlockItemBase(MARBLE_BRICK.get()));
    public static final RegistryObject<Item> LIMESTONE_ITEM = ITEMS.register("limestone", () -> new BlockItemBase(LIMESTONE.get()));
    public static final RegistryObject<Item> ENDIUM_ITEM = ITEMS.register("endium", () -> new BlockItemBase(ENDIUM.get()));
    public static final RegistryObject<Item> WET_WOOD_ITEM = ITEMS.register("wet_wood", () -> new BlockItemBase(WET_WOOD.get()));
    public static final RegistryObject<Item> NICKEL_ORE_ITEM = ITEMS.register("nickel_ore", () -> new BlockItemBase(NICKEL_ORE.get()));
    public static final RegistryObject<Item> CALCITE_ORE_ITEM = ITEMS.register("calcite", () -> new BlockItemBase(CALCITE.get()));
    public static final RegistryObject<Item> AQUAMARINE_ITEM = ITEMS.register("aquamarine", () -> new BlockItemBase(AQUAMARINE.get()));
    public static final RegistryObject<Item> MARBLESLAB_ITEM = ITEMS.register("marbleslab", () -> new BlockItemBase(MARBLESLAB.get()));
    public static final RegistryObject<Item> SALT_ORE_ITEM = ITEMS.register("salt_ore", () -> new BlockItemBase(SALT_ORE.get()));
    public static final RegistryObject<Item> SPEEDBRICK_ITEM = ITEMS.register("speedbrick", () -> new BlockItemBase(SPEEDBRICK.get()));

    //My Entities
    public static final RegistryObject<EntityType<BombEntity>> BOMB_ENTITY = ENTITIES.register("bomb",
            () -> EntityType.Builder.<BombEntity>of(BombEntity::new, EntityClassification.MISC)
                    .sized(0.5f, 0.5f)
                    .build("bomb"));

    public static final RegistryObject<EntityType<BigBombEntity>> BIG_BOMB_ENTITY = ENTITIES.register("big_bomb",
            () -> EntityType.Builder.<BigBombEntity>of(BigBombEntity::new, EntityClassification.MISC)
                    .sized(1f, 1f)
                    .build("big_bomb"));

    public static final RegistryObject<EntityType<LargeBombEntity>> LARGE_BOMB_ENTITY = ENTITIES.register("large_bomb",
            () -> EntityType.Builder.<LargeBombEntity>of(LargeBombEntity::new, EntityClassification.MISC)
                    .sized(4f, 4f)
                    .build("large_bomb"));

    public static final RegistryObject<EntityType<MortarEntity>> MORTAR_ENTITY = ENTITIES.register("mortar",
            () -> EntityType.Builder.<MortarEntity>of(MortarEntity::new, EntityClassification.MISC)
                    .sized(6f, 6f)
                    .build("mortar"));

    public static final RegistryObject<EntityType<MissileEntity>> MISSILE_ENTITY = ENTITIES.register("missile",
            () -> EntityType.Builder.<MissileEntity>of(MissileEntity::new, EntityClassification.MISC)
                    .sized(20f, 20f)
                    .build("missile"));

    public static final RegistryObject<EntityType<PenguinEntityAI>> PENGUIN_ENTITY = ENTITIES.register("penguin",
            () -> EntityType.Builder.<PenguinEntityAI>of(PenguinEntityAI::new, EntityClassification.CREATURE)
                    .sized(1.5f,1.5f)
                    .build("penguin"));


    //My Biomes
    public static final RegistryObject<Biome> ENCHANTED_FOREST = BIOMES.register("enchanted_forest", EnchantedForestBiome::createBiome);
    public static final RegistryObject<Biome> SWAMP_REVISED = BIOMES.register("swamp_revised", SwampRevised::createBiome);
    public static final RegistryObject<Biome> FANCY_BEACH = BIOMES.register("fancy_beach", FancyBeach::createBiome);
}
