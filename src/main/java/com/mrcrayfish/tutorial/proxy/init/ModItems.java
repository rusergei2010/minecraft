package com.mrcrayfish.tutorial.proxy.init;

import com.mrcrayfish.tutorial.proxy.itmes.ItemFire;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item fire;
	
	public static void init() {
		fire = new ItemFire();
	}
	
	public static void register() {
		GameRegistry.register(fire);
	}
	
	public static void registerRenders() {
		registerRender(fire);
	}
	
	public static void registerRender(Item item) {
		RenderItem render = Minecraft.getMinecraft().getRenderItem();
		ItemModelMesher mesher = render.getItemModelMesher();
		mesher.register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
