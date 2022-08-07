package com.cooper.verycoolmod.entity;

import com.cooper.verycoolmod.util.RegistryHandler;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ProjectileItemEntity;
import net.minecraft.item.Item;
import net.minecraft.network.IPacket;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class MissileEntity extends ProjectileItemEntity {
    public MissileEntity(EntityType<? extends ProjectileItemEntity> entityType, World world) {
        super(entityType, world);
    }

    public MissileEntity(double x, double y, double z, World world) {
        super(RegistryHandler.MISSILE_ENTITY.get(), x, y, z, world);
    }

    public MissileEntity(LivingEntity player, World world) {
        super(RegistryHandler.MISSILE_ENTITY.get(), player, world);
    }

    protected void onHitEntity(EntityRayTraceResult hitLocation) {
        super.onHitEntity(hitLocation);
        hitLocation.getEntity().hurt(DamageSource.thrown(this, this.getOwner()), 99999999.0F);
    }

    protected void onHit(RayTraceResult hitLocation) {
        super.onHit(hitLocation);
        if (!this.level.isClientSide) {

            this.level.explode(this, this.getX(), this.getY(), this.getZ(), 40.0f, Explosion.Mode.BREAK);

            this.remove();
        }

    }

    @Override
    public IPacket<?> getAddEntityPacket(){ return NetworkHooks.getEntitySpawningPacket(this);}

    @Override
    protected Item getDefaultItem() {
        return RegistryHandler.MISSILE.get();
    }
}

