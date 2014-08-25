package com.kirkiplaid.sycraft.creativetab;

import com.kirkiplaid.sycraft.Init.ModItems;
import com.kirkiplaid.sycraft.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by ItsKirkiplaid on 8/25/2014.
 */
public class CreativeTabSC {

    public static final CreativeTabs SC_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ModItems.GreenWheat;
        }
    };
}
