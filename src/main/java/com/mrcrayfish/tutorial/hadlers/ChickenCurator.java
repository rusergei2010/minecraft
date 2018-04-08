package com.mrcrayfish.tutorial.hadlers;

import com.sun.nio.sctp.SctpSocketOption;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ChickenCurator {
    @SubscribeEvent
    public void blockClickHandler(PlayerInteractEvent.RightClickEmpty event) {
        World world = event.getWorld();
        EntityPlayer player = event.getEntityPlayer();

        EntityChicken chicken = new EntityChicken(world);
        chicken.setPosition(player.posX + 20, player.posY + 20, player.posZ);
        world.spawnEntityInWorld(chicken);

        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
//                EntityChicken chicken = new EntityChicken(world);
//                chicken.setPosition(player.posX + x, player.posY + y, player.posZ);
//                world.getLoadedEntityList().add(chicken);

                EntityBat bat = new EntityBat(world);
                bat.setPosition(player.posX + x, player.posY + y, player.posZ);
                bat.setAIMoveSpeed(10);
                bat.setAttackTarget(chicken);
                bat.setFire(100);
                bat.forceSpawn = true;
                boolean life = world.spawnEntityInWorld(bat);
                System.out.println(life);
            }
        }
    }
}
