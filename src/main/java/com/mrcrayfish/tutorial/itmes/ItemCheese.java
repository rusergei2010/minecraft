package com.mrcrayfish.tutorial.itmes;

import com.mrcrayfish.tutorial.Reference;

import net.minecraft.item.Item;

public class ItemCheese extends Item {
	public ItemCheese() {
		setUnlocalizedName(Reference.TutorialItems.CHEESE.getUnlocalizedName());
		setRegistryName(Reference.TutorialItems.CHEESE.getRegistryName());
	}
}
