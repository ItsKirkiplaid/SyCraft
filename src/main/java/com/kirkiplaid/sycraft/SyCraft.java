package com.kirkiplaid.sycraft;

import com.kirkiplaid.sycraft.handler.ConfigurationHandler;
import com.kirkiplaid.sycraft.proxy.IProxy;
import com.kirkiplaid.sycraft.reference.Reference;
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
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {

    }


    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }

}
