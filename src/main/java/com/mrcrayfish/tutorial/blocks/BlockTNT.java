package com.mrcrayfish.tutorial.blocks;

import com.mrcrayfish.tutorial.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTNT extends Block {

	public BlockTNT() {
		super(Material.DRAGON_EGG);
		setUnlocalizedName(Reference.TutorialBlocks.TNT.getUnlocalizedName());
		setRegistryName(Reference.TutorialBlocks.TNT.getRegistryName());
		setHardness(1.0f);
		setLightOpacity(1);
	}
}
