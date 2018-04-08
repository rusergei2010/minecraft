package com.mrcrayfish.tutorial.handlers;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityGolem;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BlockCurator {

    @SubscribeEvent
    public void blockClickHandler(PlayerInteractEvent.RightClickBlock event) {
        World world = event.getWorld();
        EntityPlayer player = event.getEntityPlayer();
        world.getLoadedEntityList().add(new EntityGolem(world) {
            @Override
            public void fall(float distance, float damageMultiplier) {
                super.fall(0, 1);
            }
        });

        // Add Some Cubes
        for (int x = 2; x < 12; x++) {
            for (int y = -5; y < 6; y++) {
                EntityItem item = new EntityItem(world, player.posX + x, player.posY + y, player.posZ, new ItemStack(Blocks.TNT));
//            item.copyLocationAndAnglesFrom(event.getEntity());
                world.getLoadedEntityList().add(item);
            }
        }
    }
}


