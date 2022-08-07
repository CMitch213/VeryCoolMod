package com.cooper.verycoolmod.item;

import com.cooper.verycoolmod.entity.MissileEntity;
import com.cooper.verycoolmod.entity.MortarEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class MissileItem extends ItemBase{
    public MissileItem(){super();}



    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        world.playSound((PlayerEntity) null, player.getX(), player.getY(), player.getZ(), SoundEvents.LAVA_POP, SoundCategory.PLAYERS, 0.5F, 0.4F / (random.nextFloat() * 0.4F + 0.8F));
        if (!world.isClientSide) {
            MissileEntity missileentity = new MissileEntity(player, world);
            missileentity.setItem(itemstack);
            missileentity.shootFromRotation(player, player.xRot, player.yRot, 0.0F, 10.5F, 1.0F);
            world.addFreshEntity(missileentity);
        }

        player.awardStat(Stats.ITEM_USED.get(this));
        if (!player.abilities.instabuild) {
            itemstack.shrink(1);
        }

        return ActionResult.sidedSuccess(itemstack, world.isClientSide());
    }
}
