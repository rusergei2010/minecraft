package com.mrcrayfish.tutorial.init;


import com.mrcrayfish.tutorial.blocks.BlockCheese;

import com.mrcrayfish.tutorial.blocks.BlockCracker;
import com.mrcrayfish.tutorial.blocks.BlockTNT;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	public static Block cheese;
	public static Block cracker;
	public static Block tnt;
	
	
	public static void init() {
		cheese = new BlockCheese();
		cracker = new BlockCracker();
		tnt = new BlockTNT();
	}
	
	public static void register() {
		registerBlock(cheese);
		registerBlock(cracker);
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
