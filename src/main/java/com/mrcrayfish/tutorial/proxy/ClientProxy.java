package com.mrcrayfish.tutorial.proxy;

import com.mrcrayfish.tutorial.init.ModItems;

public class ClientProxy implements CommonProxy{

	public void init() {
		ModItems.registerRenders();
	}
}
