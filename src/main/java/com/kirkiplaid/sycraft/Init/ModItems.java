package com.kirkiplaid.sycraft.Init;

import com.kirkiplaid.sycraft.item.InfuseGreenWheat;
import com.kirkiplaid.sycraft.item.ItemSC;
import com.kirkiplaid.sycraft.item.RichWheat;
import com.kirkiplaid.sycraft.item.RustWheat;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * Created by ItsKirkiplaid on 8/24/2014.
 */



public class ModItems {

    public static final ItemSC GreenWheat= new InfuseGreenWheat();
    public static final ItemSC RustWheat = new RustWheat();
    public static final ItemSC RichWheat = new RichWheat();

    public static void init() {

        GameRegistry.registerItem(GreenWheat, "InfuseGreenWheat");
        GameRegistry.registerItem(RustWheat, "RustWheat");
        GameRegistry.registerItem(RichWheat, "RichWheat");
    }
}
