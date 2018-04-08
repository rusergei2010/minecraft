package com.mrcrayfish.tutorial.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCracker extends Block {

    public BlockCracker() {
        super(Material.CAKE);
        setUnlocalizedName("cracker");
        setRegistryName("BlockCracker");
        setHardness(1.0f);
        setLightOpacity(1);
    }
}
