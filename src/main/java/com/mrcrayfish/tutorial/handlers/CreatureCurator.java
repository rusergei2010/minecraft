package com.mrcrayfish.tutorial.handlers;

import net.minecraft.entity.monster.EntityGolem;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CreatureCurator {

    @SubscribeEvent
    public void blockClickHandler(PlayerInteractEvent.RightClickEmpty event) {
        World world = event.getWorld();
        EntityPlayer player = event.getEntityPlayer();
        world.getLoadedEntityList().add(new EntityGolem(world) {
            @Override
            public void fall(float distance, float damageMultiplier) {
                super.fall(0, 1);
            }
        });

        // Add Motionless Cows
        for (int x = -3; x < 4; x++) {
            for (int y = 1; y < 6 ; y++) {
                for (int z = -3; z < 4; z++) {
                    MyEntityCow chicken = new MyEntityCow(world);
                    chicken.setPosition(player.posX + x, player.posY + y, player.posZ + z);
                    world.getLoadedEntityList().add(chicken);
                }
            }
        }
    }
}


class MyEntityCow extends EntityChicken {
    public MyEntityCow(World worldIn) {
        super(worldIn);
    }

    @Override
    public void initEntityAI() {
        super.initEntityAI();
    }
}


