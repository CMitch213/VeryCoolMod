package com.cooper.verycoolmod.item;

import com.cooper.verycoolmod.entity.BombEntity;
import com.cooper.verycoolmod.entity.LargeBombEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class LargeBombItem extends ItemBase{
    public LargeBombItem(){super();}



    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        world.playSound((PlayerEntity) null, player.getX(), player.getY(), player.getZ(), SoundEvents.EGG_THROW, SoundCategory.PLAYERS, 0.5F, 0.4F / (random.nextFloat() * 0.4F + 0.8F));
        if (!world.isClientSide) {
            LargeBombEntity largebombentity = new LargeBombEntity(player, world);
            largebombentity.setItem(itemstack);
            largebombentity.shootFromRotation(player, player.xRot, player.yRot, 0.0F, 3.5F, 1.0F);
            world.addFreshEntity(largebombentity);
        }

        player.awardStat(Stats.ITEM_USED.get(this));
        if (!player.abilities.instabuild) {
            itemstack.shrink(1);
        }

        return ActionResult.sidedSuccess(itemstack, world.isClientSide());
    }
}
