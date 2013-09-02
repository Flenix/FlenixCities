package co.uk.silvania.cities.core;

import net.minecraft.item.Item;
import co.uk.silvania.cities.core.items.CraftingIngredientItems;

public class CoreItems {
	private static CityConfig config;
	
	public static Item rubyItem;
	public static Item titaniumIngot;
	public static Item tecmoniumIngot;
	public static Item silverIngot;
	public static Item copperIngot;
	public static Item tinIngot;
	
	public static Item plasticItem;
	public static Item smallPCB;
	public static Item largePCB;
	
	public static void init() {
		initMinerals();
		initCrafting();
	}
	
	public static void initMinerals() {
		rubyItem = new CraftingIngredientItems(config.rubyItemID, 64).setUnlocalizedName("rubyItem");
		titaniumIngot = new CraftingIngredientItems(config.titaniumIngotID, 64).setUnlocalizedName("titaniumIngotItem");
		tecmoniumIngot = new CraftingIngredientItems(config.tecmoniumIngotID, 64).setUnlocalizedName("tecmoniumIngot");
		silverIngot = new CraftingIngredientItems(config.silverIngotID, 64).setUnlocalizedName("silverIngot");
		copperIngot = new CraftingIngredientItems(config.copperIngotID, 64).setUnlocalizedName("copperIngot");
		tinIngot = new CraftingIngredientItems(config.tinIngotID, 64).setUnlocalizedName("tinIngot");
	}
	
	public static void initCrafting() {
		plasticItem = new CraftingIngredientItems(config.plasticItemID, 64).setUnlocalizedName("plasticItem");
		smallPCB = new CraftingIngredientItems(config.smallPCBID, 64).setUnlocalizedName("smallPCB");
		largePCB = new CraftingIngredientItems(config.largePCBID, 64).setUnlocalizedName("largePCB");
	}

}
