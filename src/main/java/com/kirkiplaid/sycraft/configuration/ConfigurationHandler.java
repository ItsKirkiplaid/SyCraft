package com.kirkiplaid.sycraft.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by USER on 8/24/2014.
 */
public class ConfigurationHandler {


    public static void init(File configFile) {

        Configuration configuration = new Configuration(configFile);

        try
        {
            configuration.load();
        }
        catch (Exception e)
        {

        }
        finally {
            configuration.save();
        }

    }
}
