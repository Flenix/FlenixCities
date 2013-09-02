package co.uk.silvania.cities.econ;

import co.uk.silvania.cities.econ.blocks.FloatingShelvesBlock;
import co.uk.silvania.cities.econ.blocks.TileEntityATMBlock;
import net.minecraft.block.Block;

public class FCE_Blocks {
	private static EconConfig config;
	
	public static Block atmBlock;
	public static Block floatingShelvesBlock;
	
	public static void init() {
		initTileEntities();
	}
	
	public static void initTileEntities() {
		atmBlock = new TileEntityATMBlock(config.atmID).setUnlocalizedName("atmBlock");
		floatingShelvesBlock = new FloatingShelvesBlock(config.floatingShelvesID).setUnlocalizedName("floatingShelvesBlock");	
	}
}
