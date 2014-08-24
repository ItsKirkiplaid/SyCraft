package com.kirkiplaid.sycraft.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by USER on 8/24/2014.
 */
public class ConfigurationHandler {


    public static void init(File configFile) {

        Configuration configuration = new Configuration(configFile);

        boolean configValue = false;
        try
        {
            configuration.load();

           configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an Example Config Value").getBoolean(true);
           configValue = configuration.get("Example Category", "configValue", true, "This is an Example Config Value 2").getBoolean(true);

        }
        catch (Exception e)
        {

        }
        finally {
            configuration.save();
        }

        System.out.println(configValue);
    }
}
