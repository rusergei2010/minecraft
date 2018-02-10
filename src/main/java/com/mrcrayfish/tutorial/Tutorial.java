package com.mrcrayfish.tutorial;

import com.mrcrayfish.tutorial.init.ModItems;
import com.mrcrayfish.tutorial.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSION)
public class Tutorial {
	
	@Instance(Reference.MOD_ID)
	public static Tutorial instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("preInit");
		ModItems.init();
		ModItems.register();		
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		System.out.println("init");
		proxy.init();
	}	
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		System.out.println("postInit");		
	}	
}
