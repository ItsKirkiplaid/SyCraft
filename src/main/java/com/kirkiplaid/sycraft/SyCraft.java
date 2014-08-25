package com.kirkiplaid.sycraft;

import com.kirkiplaid.sycraft.Init.ModBlocks;
import com.kirkiplaid.sycraft.Init.ModItems;
import com.kirkiplaid.sycraft.handler.ConfigurationHandler;
import com.kirkiplaid.sycraft.proxy.IProxy;
import com.kirkiplaid.sycraft.reference.Reference;
import com.kirkiplaid.sycraft.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by ItsKirkiplaid on 8/24/2014.
 */

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version= Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class SyCraft {


    @Mod.Instance(Reference.MOD_ID)
     public static SyCraft instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Pre-Init Complete!");

        ModItems.init();

        ModBlocks.init();
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {
        LogHelper.info("Init Complete!");

    }


    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post-Init Complete!");

    }

}
