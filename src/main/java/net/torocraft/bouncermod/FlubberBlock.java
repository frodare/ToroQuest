package net.torocraft.bouncermod;

import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class FlubberBlock extends BounceBlock {
	
	public static final String NAME = "flubberBlock";

	public FlubberBlock() {
		super();
		setUnlocalizedName(NAME);
		this.springiness = 1.25;
        this.slipperiness = 0.8F;
		this.translucent = true;

	}

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.TRANSLUCENT;
    }
}
