package com.mrcrayfish.tutorial.init;

import com.mrcrayfish.tutorial.items.ItemCracker;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
    public static Item cracker;

    public static void init() {
        cracker = new ItemCracker();
    }

    public static void register() {
        registerItem(cracker);
    }

    private static void registerItem(Item item) {
        GameRegistry.register(item);
    }

    public static void registerRenders(){
        registerRender(cracker);
    }

    public static void registerRender(Item item){
        RenderItem render = Minecraft.getMinecraft().getRenderItem();
        ItemModelMesher mesher = render.getItemModelMesher();
        mesher.register(item, 0,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
