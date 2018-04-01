package com.mrcrayfish.tutorial.handlers;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraftforge.event.entity.minecart.MinecartCollisionEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MinecartHandler {

    @SubscribeEvent
    public void explode(MinecartCollisionEvent event) {
        EntityMinecart item = event.getMinecart();
        item.worldObj.createExplosion(item,
                item.posX,
                item.posY,
                item.posZ,
                300,
                true
                );
    }
}
