package com.cooper.verycoolmod.entity;
//Teacher has it named PenguinEntity
import com.cooper.verycoolmod.util.RegistryHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PolarBearEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.network.IPacket;
import net.minecraft.util.DamageSource;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.fml.network.NetworkHooks;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;

public class PenguinEntityAI extends AnimalEntity {

    private static Ingredient TEMPT_ING = Ingredient.of(Items.COD, Items.SALMON, Items.COD_BUCKET, Items.SALMON_BUCKET);

    public PenguinEntityAI(final World world){
        super(RegistryHandler.PENGUIN_ENTITY.get(),world);
    }

    public PenguinEntityAI(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
    }

    public void registerGoals(){
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 2.0D));
        this.goalSelector.addGoal(2, new TemptGoal(this, 4.25D, TEMPT_ING, false));
        this.goalSelector.addGoal(3, new BreedGoal(this, 4.0D));
        this.goalSelector.addGoal(4, new LookRandomlyGoal(this));
        this.goalSelector.addGoal(5, new LookAtGoal(this, PlayerEntity.class, 6.0F));
        this.goalSelector.addGoal(6, new FindWaterGoal(this));
        this.goalSelector.addGoal(7, new SwimGoal(this));
        this.goalSelector.addGoal(8, new BreatheAirGoal(this));
        this.goalSelector.addGoal(9, new FleeSunGoal(this, 0.2D));
    }

    public static AttributeModifierMap setCustomAttributes() {
        return LivingEntity.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 25.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.2D)
                .add(Attributes.JUMP_STRENGTH, 6.0D)
                .add(Attributes.FOLLOW_RANGE, 50.0D)
                .add(Attributes.KNOCKBACK_RESISTANCE, 2.0D)
                .build();
    }

    public boolean isFood(ItemStack itemStack){
        return TEMPT_ING.test(itemStack);
    }
    public SoundEvent getAmbientSound() {
        return SoundEvents.DOLPHIN_AMBIENT;
    }

    public SoundEvent getHurtSound(DamageSource p_184601_1_) {
        return SoundEvents.PANDA_HURT;
    }

    public SoundEvent getDeathSound() {
        return SoundEvents.PANDA_DEATH;
    }

    public void playStepSound(BlockPos p_180429_1_, BlockState p_180429_2_) {
        this.playSound(SoundEvents.CHICKEN_STEP, 0.15F, 1.0F);
    }

    @Override
    public IPacket<?> getAddEntityPacket(){
        return NetworkHooks.getEntitySpawningPacket(this);
    }



    @Override
    public AgeableEntity getBreedOffspring(ServerWorld world, AgeableEntity p_241840_2_) {
        return RegistryHandler.PENGUIN_ENTITY.get().create(world);
    }

    public static boolean checkPenguinSpawnRules(EntityType<PenguinEntityAI> entityType, IWorld world, SpawnReason spawnReason, BlockPos blockPos, Random random) {
        Optional<RegistryKey<Biome>> optional = world.getBiomeName(blockPos);
        if (!Objects.equals(optional, Optional.of(Biomes.FROZEN_OCEAN)) && !Objects.equals(optional, Optional.of(Biomes.DEEP_FROZEN_OCEAN))) {
            return checkAnimalSpawnRules(entityType, world, spawnReason, blockPos, random);
        } else {
            return world.getRawBrightness(blockPos, 0) > 3 && world.getBlockState(blockPos.below()).is(Blocks.ICE);
        }
    }


}
