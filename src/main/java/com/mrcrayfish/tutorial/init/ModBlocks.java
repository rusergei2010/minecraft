package com.mrcrayfish.tutorial.init;


import com.mrcrayfish.tutorial.blocks.BlockCheese;
import com.mrcrayfish.tutorial.blocks.MyBlockTNT;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemMinecart;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	public static Block cheese;
	public static Block tnt;
	
	
	public static void init() {
		cheese = new BlockCheese();
		tnt = new MyBlockTNT();
	}
	
	public static void register() {
		registerBlock(cheese);
		registerBlock(tnt);
	}
	
	private static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders() {
		registerRender(cheese);
		registerRender(tnt);
	}
	
	public static void registerRender(Block block) {
		RenderItem render = Minecraft.getMinecraft().getRenderItem();
		ItemModelMesher mesher = render.getItemModelMesher();
		mesher.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
