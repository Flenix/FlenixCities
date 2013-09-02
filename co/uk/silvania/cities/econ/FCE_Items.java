package co.uk.silvania.cities.econ;

import net.minecraft.item.Item;
import co.uk.silvania.cities.core.items.CraftingIngredientItems;
import co.uk.silvania.cities.econ.items.*;

public class FCE_Items {
	private static EconConfig config;
	
	public static Item coin1;
	public static Item coin2;
	public static Item coin5;
	public static Item coin10;
	public static Item coin25;
	public static Item coin50;
	public static Item coin100;
	public static Item note100;
	public static Item note200;
	public static Item note500;
	public static Item note1000;
	public static Item note2000;
	public static Item note5000;
	public static Item note10000;

	public static Item debitCard;
	public static Item atmItem;
	public static Item ringItem;
	public static Item diamondRing;
	public static Item necklaceItem;
	public static Item rubyNecklace;
	
	public static void init() {
		initMoney();
		initOther();
	}
	
	public static void initMoney() {
    	coin1 = new ItemCoin1(config.coin1ID).setUnlocalizedName("coin1");
    	coin2 = new ItemCoin2(config.coin2ID).setUnlocalizedName("coin2");
    	coin5 = new ItemCoin5(config.coin5ID).setUnlocalizedName("coin5");
    	coin10 = new ItemCoin10(config.coin10ID).setUnlocalizedName("coin10");
    	coin25 = new ItemCoin25(config.coin25ID).setUnlocalizedName("coin25");
    	coin50 = new ItemCoin50(config.coin50ID).setUnlocalizedName("coin50");
    	coin100 = new ItemCoin100(config.coin100ID).setUnlocalizedName("coin100");
    	note100 = new ItemNote1(config.note100ID).setUnlocalizedName("note100");
    	note200 = new ItemNote2(config.note200ID).setUnlocalizedName("note500");
    	note500 = new ItemNote5(config.note500ID).setUnlocalizedName("note1000");
    	note1000 = new ItemNote10(config.note1000ID).setUnlocalizedName("note2000");
    	note2000 = new ItemNote20(config.note2000ID).setUnlocalizedName("note5000");
    	note5000 = new ItemNote50(config.note5000ID).setUnlocalizedName("note10000");
    	note10000 = new ItemNote100(config.note10000ID).setUnlocalizedName("note10000");
	}
	
	public static void initOther() {
    	debitCard = new DebitCard(config.debitCardID).setUnlocalizedName("debitCard");
		ringItem = new CraftingIngredientItems(config.ringItemID, 64).setUnlocalizedName("ringItem");
		diamondRing = new CraftingIngredientItems(config.diamondRingID, 64).setUnlocalizedName("diamondRing");
		necklaceItem = new CraftingIngredientItems(config.necklaceItemID, 64).setUnlocalizedName("necklaceItem");
		rubyNecklace = new CraftingIngredientItems(config.rubyNecklaceID, 64).setUnlocalizedName("rubyNecklace");
	}

}
