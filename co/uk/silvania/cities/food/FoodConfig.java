package co.uk.silvania.cities.food;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class FoodConfig {
	public static int fridgeID;
	public static int largeFridgeID;
	public static int vendingMachineID;
	
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
	
	
	public static void loadConfig(FMLPreInitializationEvent event) {
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		
		config.load();
		fridgeID = config.getBlock("Fridge", 1437).getInt();
		largeFridgeID = config.getBlock("Large Fridge", 1438).getInt();
		vendingMachineID = config.getBlock("Vending Machine", 1426).getInt();
		
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
		config.save();
	}
}
