package com.cooper.verycoolmod.commands;

import com.cooper.verycoolmod.VeryCoolMod;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.text.StringTextComponent;

public class ReturnHomeCommand {
    public ReturnHomeCommand(CommandDispatcher<CommandSource> dispatcher){
        //home return
        dispatcher.register(Commands.literal("home").then(Commands.literal("return").executes((command) -> {
            return returnHome(command.getSource());
        })));

    }

    private int returnHome(CommandSource source) throws CommandSyntaxException{
        ServerPlayerEntity player = source.getPlayerOrException();
        boolean hasHomepos = player.getPersistentData().getIntArray(VeryCoolMod.MOD_ID + "homepos").length != 0;

        if (hasHomepos){
            int[] playerPos = player.getPersistentData().getIntArray(VeryCoolMod.MOD_ID + "homepos");
            player.setPosAndOldPos(playerPos[0], playerPos[1], playerPos[2]);

            source.sendSuccess(new StringTextComponent("Player Returned Home"), true);
            return 1;
        } else {
            source.sendFailure(new StringTextComponent("No Home Set"));
            return -1;
        }
    }

}
