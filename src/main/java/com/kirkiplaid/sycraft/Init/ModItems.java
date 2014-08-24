package com.kirkiplaid.sycraft.Init;

import com.kirkiplaid.sycraft.item.ItemGreenBale;
import com.kirkiplaid.sycraft.item.ItemSC;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by ItsKirkiplaid on 8/24/2014.
 */



public class ModItems {

    public static final ItemSC GreenBale = new ItemGreenBale();

    public static void init() {

        GameRegistry.registerItem(GreenBale, "InfusedGreenBale");
    }
}
