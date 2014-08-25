package com.kirkiplaid.sycraft.block;

import com.kirkiplaid.sycraft.creativetab.CreativeTabSC;

/**
 * Created by ItsKirkiplaid on 8/25/2014.
 */
public class BlockGreenBale extends BlockSC {

    public BlockGreenBale() {

    super();
        this.setBlockName("GreenBale");
        this.setBlockTextureName("GreenBale");
        this.setStepSound(soundTypeGrass);
        this.setCreativeTab(CreativeTabSC.SC_TAB);



    }


}
