package com.mrcrayfish.tutorial.init;

import com.mrcrayfish.tutorial.Reference;
import com.mrcrayfish.tutorial.itmes.ItemCheese;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item cheese;
	
	public static void init() {
		cheese = new ItemCheese();
	}
	
	public static void register() {
		GameRegistry.register(cheese);
	}
	
	public static void registerRenders() {
		registerRender(cheese);
	}
	
	public static void registerRender(Item item) {
		RenderItem render = Minecraft.getMinecraft().getRenderItem();
		ItemModelMesher mesher = render.getItemModelMesher();
		mesher.register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "Inventory"));
	}
}
