package com.kirkiplaid.sycraft.handler;

import com.kirkiplaid.sycraft.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by ItsKirkiplaid on 8/24/2014.
 */
public class ConfigurationHandler {

    public static Configuration configuration;
    public static boolean testValue = false;


    public static void init(File configFile) {

        if (configuration == null)
        {


        Configuration configuration = new Configuration(configFile);

         }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent (ConfigChangedEvent.OnConfigChangedEvent event)

    {

    if (event.modID.equalsIgnoreCase(Reference.MOD_ID))

    {
    }
    }

    public void loadConfigurationEvent()
    {
testValue = configuration.getBoolean("configValue", configuration.CATEGORY_GENERAL, false, "This is a Test Config Value");

        if(configuration.hasChanged()) {

            configuration.save();

            }

        }
    }
