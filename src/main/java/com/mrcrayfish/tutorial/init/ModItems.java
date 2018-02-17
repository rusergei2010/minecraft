package com.mrcrayfish.tutorial.init;

import com.mrcrayfish.tutorial.itmes.ItemCheese;
import com.mrcrayfish.tutorial.itmes.ItemCracker;
import com.mrcrayfish.tutorial.itmes.ItemFire;
import com.mrcrayfish.tutorial.itmes.MyTntItemMinecart;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.item.Item;
import net.minecraft.item.ItemMinecart;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static Item cheese;
	public static Item cracker;
	public static Item fire;
	
	public static ItemMinecart itemTntMineCraft;

	public static void init() {
		cheese = new ItemCheese();
		cracker = new ItemCracker();
		fire = new ItemFire();
		
		itemTntMineCraft = new MyTntItemMinecart();
	}

	public static void register() {
		GameRegistry.register(cheese);
		GameRegistry.register(cracker);
		GameRegistry.register(fire);
		
		GameRegistry.register(itemTntMineCraft);		
	}

	public static void registerRenders() {
		registerRender(cheese);
		registerRender(cracker);
		registerRender(fire);
		
		registerRender(itemTntMineCraft);		
	}

	public static void registerRender(Item item) {
		RenderItem render = Minecraft.getMinecraft().getRenderItem();
		ItemModelMesher mesher = render.getItemModelMesher();
		mesher.register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
