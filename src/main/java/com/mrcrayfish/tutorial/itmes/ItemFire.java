package com.mrcrayfish.tutorial.itmes;

import com.mrcrayfish.tutorial.Reference;

import net.minecraft.item.Item;

public class ItemFire extends Item {
	public ItemFire() {
		setUnlocalizedName(Reference.TutorialItems.FIRE.getUnlocalizedName());
		setRegistryName(Reference.TutorialItems.FIRE.getRegistryName());
	}
}
