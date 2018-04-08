package com.mrcrayfish.tutorial.blocks;

import com.mrcrayfish.tutorial.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCracker extends Block {

	public BlockCracker() {
		super(Material.ICE);
		setUnlocalizedName(Reference.TutorialBlocks.CRACKER.getUnlocalizedName());
		setRegistryName(Reference.TutorialBlocks.CRACKER.getRegistryName());
		setHardness(1.0f);
		setLightOpacity(1);
	}
}
