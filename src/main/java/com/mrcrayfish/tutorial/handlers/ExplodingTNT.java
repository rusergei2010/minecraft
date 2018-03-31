package com.mrcrayfish.tutorial.handlers;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraftforge.event.entity.minecart.MinecartCollisionEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ExplodingTNT {
    @SubscribeEvent
    public void explode(MinecartCollisionEvent event) {
        EntityMinecart minecart = event.getMinecart();
        minecart.worldObj.createExplosion(
                minecart,
                minecart.posX,
                minecart.posY,
                minecart.posZ,
                100,
                true);
    }
}
