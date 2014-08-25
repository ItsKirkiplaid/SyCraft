package com.kirkiplaid.sycraft.Init;

import com.kirkiplaid.sycraft.block.*;
import com.kirkiplaid.sycraft.item.InfuseGreenWheat;
import com.kirkiplaid.sycraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by ItsKirkiplaid on 8/25/2014.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    public static final BlockSC GreenBale = new BlockGreenBale();
    public static final BlockSC RustBale = new BlockRustBale();
    public static final BlockSC RichBale = new BlockRichBale();
    public static final BlockSC FertileBale = new BlockFertileBale();
    public static final BlockSC SearedBale = new BlockSearedBale();
    public static final BlockSC FertileSoil = new BlockFertileSoil();
    public static void init() {

        GameRegistry.registerBlock(GreenBale, "GreenBale");
        GameRegistry.registerBlock(RustBale, "RustBale");
        GameRegistry.registerBlock(RichBale, "RichBale");
        GameRegistry.registerBlock(FertileBale, "FertileBale");
        GameRegistry.registerBlock(SearedBale, "SearedBale");
        GameRegistry.registerBlock(FertileSoil, "FertileSoil");

    }
}
