package com.mrcrayfish.tutorial.hadlers;

import net.minecraft.entity.item.EntityItem;
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

        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                EntityItem item = new EntityItem(
                        world, player.posX + x, player.posY + y, player.posZ, new ItemStack(Blocks.TNT));
                world.getLoadedEntityList().add(item);
            }
        }
    }
}
