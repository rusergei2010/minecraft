package com.mrcrayfish.tutorial.handlers;

import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BlockHandler {
    @SubscribeEvent
    public void createBlock(PlayerInteractEvent.RightClickBlock event) {
        World world = event.getWorld();
        world.tick();
        world.addWeatherEffect(new EntityLightningBolt(world
                , event.getEntityPlayer().posX
                , event.getEntityPlayer().posY
                , event.getEntityPlayer().posZ
                , false
        ));
    }
}
