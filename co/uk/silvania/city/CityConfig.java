package co.uk.silvania.city;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CityConfig {
	
    private String value;
	
	public static int escalatorID;
	public static int travellatorID;
	public static int atmID;
	public static int fridgeID;
	public static int largeFridgeID;
	public static int schoolDeskID;
	public static int floatingShelvesID;
	public static int toiletID;
	
	public static int rubyOreID;
	public static int silverOreID;
	public static int tecmoniumOreID;
	public static int titaniumOreID;
	public static int skyscraperBlocksID;
	public static int stainedGlassID;
	public static int stainedGlassLitID;
	public static int streetBlocksID;
	public static int styledGlassID;
	public static int styledGlassLitID;
	public static int woolCeilingTileID;
	public static int woolStoneID;
	public static int woolWoodID;
	
	public static int coin1ID;
	public static int coin2ID;
	public static int coin5ID;
	public static int coin10ID;
	public static int coin25ID;
	public static int coin50ID;
	public static int coin100ID;
	public static int note100ID;
	public static int note200ID;
	public static int note500ID;
	public static int note1000ID;
	public static int note2000ID;
	public static int note5000ID;
	public static int note10000ID;
	public static int prePaidCardID;
	public static int debitCardID;
	
	public static int heroinItemID;
	
	public static int foodBurgerID;
	public static int foodHotDogID;
	public static int foodPizzaID;
	public static int foodNoodlesID;
	public static int foodChocolateBarID;
	public static int foodCrispsID;
	public static int foodEnergyBarID;
	public static int foodCheeseID;
	public static int foodTomatoID;
	public static int foodDonutID;
	public static int foodSweetsID;
	public static int foodFriesID;
	public static int foodPopcornID;
	public static int foodIceCreamID;
	public static int foodChickenWingsID;
	public static int foodChickenNuggetsID;
	public static int drinkAppleJuiceID;
	public static int drinkColaID;
	public static int drinkOrangeJuiceID;
	public static int drinkWaterBottleID;
	public static int drinkMilkBottleID;
	public static int drinkEnergyDrinkID;
	public static int drinkMilkshakeID;
	public static int drinkCoffeeID;
	public static int drinkHotChocolateID;
	
	public static String currencyLarge;
	public static String currencySmall;
	public static String currencyLargePlural;
	public static String currencySmallPlural;
	
	public static boolean isAdultMode;
	
	
	public static void loadConfig(FMLPreInitializationEvent event) {
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		
		config.load();
		
		escalatorID = config.getBlock("Escalator", 1400).getInt();
		travellatorID = config.getBlock("Travellator", 1401).getInt();
		atmID = config.getBlock("ATM", 1402).getInt();
		fridgeID = config.getBlock("Fridge", 1416).getInt();
		largeFridgeID = config.getBlock("Large Fridge", 1417).getInt();
		schoolDeskID = config.getBlock("School Desk", 1420).getInt();
		floatingShelvesID = config.getBlock("Floating Shelves", 1418).getInt();
		toiletID = config.getBlock("Toilet", 1419).getInt();
		
		rubyOreID = config.getBlock("Ruby Ore", 1403).getInt();
		silverOreID = config.getBlock("Silver Ore", 1404).getInt();
		tecmoniumOreID = config.getBlock("Tecmonium Ore", 1405).getInt();
		titaniumOreID = config.getBlock("Titanium Ore", 1406).getInt();
		skyscraperBlocksID = config.getBlock("Skyscraper Blocks", 1407).getInt();
		stainedGlassID = config.getBlock("Stained Glass", 1409).getInt();
		stainedGlassLitID = config.getBlock("Stained Glass Lit", 1410).getInt();
		streetBlocksID = config.getBlock("Street Blocks", 1408).getInt();
		styledGlassID = config.getBlock("Styled Glass", 1411).getInt();
		styledGlassLitID = config.getBlock("Styled Glass Lit", 1412).getInt();
		woolCeilingTileID = config.getBlock("Wool Ceiling Tile", 1413).getInt();
		woolStoneID = config.getBlock("Wool Stone", 1414).getInt();
		woolWoodID = config.getBlock("Wool Wood", 1415).getInt();
		
		coin1ID = config.getItem("Coin (1)", 18000).getInt();
		coin2ID = config.getItem("Coin (2)", 18001).getInt();
		coin5ID = config.getItem("Coin (5)", 18002).getInt();
		coin10ID = config.getItem("Coin (10)", 18003).getInt();
		coin25ID = config.getItem("Coin (25)", 18004).getInt();
		coin50ID = config.getItem("Coin (50)", 18005).getInt();
		coin100ID = config.getItem("Coin (100)", 18006).getInt();
		note100ID = config.getItem("Note (100)", 18007).getInt();
		note200ID = config.getItem("Note (200)", 18008).getInt();
		note500ID = config.getItem("Note (500)", 18009).getInt();
		note1000ID = config.getItem("Note (1,000)", 18010).getInt();
		note2000ID = config.getItem("Note (2,000)", 18011).getInt();
		note5000ID = config.getItem("Note (5,000)", 18012).getInt();
		note10000ID = config.getItem("Note (10,000)", 18013).getInt();
		prePaidCardID = config.getItem("Pre-Paid Card", 18014).getInt();
		debitCardID = config.getItem("Debit Card", 18015).getInt();
		
		foodBurgerID = config.getItem("Burger", 18020).getInt();
		foodHotDogID = config.getItem("Hot Dog", 18021).getInt();
		foodPizzaID = config.getItem("Pizza", 18022).getInt();
		foodNoodlesID = config.getItem("Noodles", 18023).getInt();
		foodChocolateBarID = config.getItem("Chocolate Bar", 18024).getInt();
		foodCrispsID = config.getItem("Crisps", 18025).getInt();
		foodEnergyBarID = config.getItem("Energy Bar", 18026).getInt();
		foodCheeseID = config.getItem("Cheese", 18027).getInt();
		foodTomatoID = config.getItem("Tomato", 18028).getInt();
		foodDonutID = config.getItem("Donut", 18029).getInt();
		foodSweetsID = config.getItem("Sweets", 18030).getInt();
		foodFriesID = config.getItem("Fries", 18031).getInt();
		foodPopcornID = config.getItem("Popcorn", 18032).getInt();
		foodIceCreamID = config.getItem("Ice Cream", 18033).getInt();
		foodChickenWingsID = config.getItem("Chicken Wings", 18034).getInt();
		foodChickenNuggetsID = config.getItem("Chicken Nuggets", 18035).getInt();
		drinkAppleJuiceID = config.getItem("Apple Juice", 18036).getInt();
		drinkColaID = config.getItem("Cola", 18037).getInt();
		drinkOrangeJuiceID = config.getItem("Orange Juice", 18038).getInt();
		drinkWaterBottleID = config.getItem("Water Bottle", 18039).getInt();
		drinkMilkBottleID = config.getItem("Milk Bottle", 18040).getInt();
		drinkEnergyDrinkID = config.getItem("Energy Drink", 18041).getInt();
		drinkMilkshakeID = config.getItem("Milkshake", 18042).getInt();
		drinkCoffeeID = config.getItem("Coffee", 18043).getInt();
		drinkHotChocolateID = config.getItem("Hot Chocolate", 18044).getInt();
		
		currencySmall = config.get("Currency Small", Configuration.CATEGORY_GENERAL, "Cent").getString();
		currencyLarge = config.get("Currency Large", Configuration.CATEGORY_GENERAL, "Dollar").getString();
		currencySmallPlural = config.get("Currency Small (Plural)", Configuration.CATEGORY_GENERAL, "Cents").getString();
		currencyLargePlural = config.get("Currency Large (Plural)", Configuration.CATEGORY_GENERAL, "Dollars").getString();
		
		isAdultMode = config.get(Configuration.CATEGORY_GENERAL, "isAdultMode", false).getBoolean(false);
		
		heroinItemID = config.getItem("Heroin", 18100).getInt();
		
		
		config.save();
	}

}
