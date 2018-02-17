package com.mrcrayfish.tutorial.itmes;

import com.mrcrayfish.tutorial.Reference;

import net.minecraft.entity.item.EntityMinecart.Type;
import net.minecraft.item.ItemMinecart;

public class MyTntItemMinecart extends ItemMinecart {

	public MyTntItemMinecart() {
		super(Type.TNT);
		setUnlocalizedName(Reference.TutorialItems.TNT.getUnlocalizedName());
		setRegistryName(Reference.TutorialItems.TNT.getRegistryName());
	}
}
