package com.mrcrayfish.tutorial.init;

import com.mrcrayfish.tutorial.blocks.BlockCracker;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
    public static Block cracker;

    public static void init() {
        cracker = new BlockCracker();
    }

    public static void register() {
        registerBlock(cracker);
    }

    private static void registerBlock(Block block) {
        GameRegistry.register(block);
    }

    public static void registerRenders(){
        registerRender(cracker);
    }

    public static void registerRender(Block block){
        RenderItem render = Minecraft.getMinecraft().getRenderItem();
        ItemModelMesher mesher = render.getItemModelMesher();
        mesher.register(Item.getItemFromBlock(block), 0,
                new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
}
