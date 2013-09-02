package co.uk.silvania.cities.food;

import co.uk.silvania.cities.food.blocks.FridgeBlock;
import net.minecraft.block.Block;

public class FCF_Blocks {
	private static FoodConfig config;
	
	public static Block fridgeBlock;
	public static Block largeFridgeBlock;
	public static Block vendingMachine;
	
	public static void init() {
		initBlocks();
	}
	
	public static void initBlocks() {
		fridgeBlock = new FridgeBlock(config.fridgeID).setUnlocalizedName("fridgeBlock");
		largeFridgeBlock = new FridgeBlock(config.largeFridgeID).setUnlocalizedName("largeFridgeBlock");
		vendingMachine = new FridgeBlock(config.vendingMachineID).setUnlocalizedName("vendingMachine");
	}
}
