package com.mrcrayfish.tutorial.init;

import com.google.common.eventbus.Subscribe;
import ibxm.Player;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Thunder {
    @SubscribeEvent
    public void light(PlayerInteractEvent event){
        World world = event .getWorld();
        event.getWorld().addWeatherEffect(new EntityLightningBolt(
               world
                , event.getEntityPlayer().posX
                , event.getEntityPlayer().posY
                , event.getEntityPlayer().posZ
                , false
        ));
    }
}
