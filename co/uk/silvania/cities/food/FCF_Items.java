package co.uk.silvania.cities.food;

import net.minecraft.item.Item;
import co.uk.silvania.cities.core.items.CraftingIngredientItems;
import co.uk.silvania.cities.econ.items.*;
import co.uk.silvania.cities.food.items.CityDrinks;
import co.uk.silvania.cities.food.items.CityFoods;

public class FCF_Items {
	private static FoodConfig config;
	
	public static Item foodBurger;
	public static Item foodHotDog;
	public static Item foodPizza;
	public static Item foodNoodles;
	public static Item foodChocolateBar;
	public static Item foodCrisps;
	public static Item foodEnergyBar;
	public static Item foodCheese;
	public static Item foodTomato;
	public static Item foodDonut;
	public static Item foodSweets;
	public static Item foodFries;
	public static Item foodPopcorn;
	public static Item foodIceCream;
	public static Item foodChickenWings;
	public static Item foodChickenNuggets;
	
	public static Item drinkAppleJuice;
	public static Item drinkCola;
	public static Item drinkOrangeJuice;
	public static Item drinkWaterBottle;
	public static Item drinkMilkBottle;
	public static Item drinkEnergyDrink;
	public static Item drinkMilkshake;
	public static Item drinkCoffee;
	public static Item drinkHotChocolate;
	
	public static void init() {
		initFood();
		initDrinks();
		initSeeds();
	}
	
	public static void initFood() {
    	foodBurger = new CityFoods(config.foodBurgerID, 14, 1.1F, true).setUnlocalizedName("foodBurger");
    	foodHotDog = new CityFoods(config.foodHotDogID, 14, 1.1F, true).setUnlocalizedName("foodHotDog");
    	foodPizza = new CityFoods(config.foodPizzaID, 12, 1.5F, true).setUnlocalizedName("foodPizza");
    	foodNoodles = new CityFoods(config.foodNoodlesID, 8, 1.0F, true).setUnlocalizedName("foodNoodles");
    	foodChocolateBar = new CityFoods(config.foodChocolateBarID, 3, 0.3F, true).setUnlocalizedName("foodChocolateBar");
    	foodCrisps = new CityFoods(config.foodCrispsID, 4, 0.3F, true).setUnlocalizedName("foodCrisps");
    	foodEnergyBar = new CityFoods(config.foodEnergyBarID, 1, 2.5F, true).setUnlocalizedName("foodEnergyBar");
    	foodCheese = new CityFoods(config.foodCheeseID, 3, 0.2F, true).setUnlocalizedName("foodCheese");
    	foodTomato = new CityFoods(config.foodTomatoID, 3, 0.2F, true).setUnlocalizedName("foodTomato");
    	foodDonut = new CityFoods(config.foodDonutID, 2, 0.4F, true).setUnlocalizedName("foodDonut");
    	foodSweets = new CityFoods(config.foodSweetsID, 2, 0.2F, true).setUnlocalizedName("foodSweets");
    	foodFries = new CityFoods(config.foodFriesID, 4, 0.4F, true).setUnlocalizedName("foodFries");
    	foodPopcorn = new CityFoods(config.foodPopcornID, 5, 0.3F, true).setUnlocalizedName("foodPopcorn");
    	foodIceCream = new CityFoods(config.foodIceCreamID, 6, 0.5F, true).setUnlocalizedName("foodIceCream");
    	foodChickenWings = new CityFoods(config.foodChickenWingsID, 12, 1.5F, true).setUnlocalizedName("foodChickenWings");
    	foodChickenNuggets = new CityFoods(config.foodChickenNuggetsID, 12, 1.5F, true).setUnlocalizedName("foodChickenNuggets");
	}
	
	public static void initDrinks() {
    	drinkAppleJuice = new CityDrinks(config.drinkAppleJuiceID, 4, false).setUnlocalizedName("drinkAppleJuice");
    	drinkCola = new CityDrinks(config.drinkColaID, 2, false).setUnlocalizedName("drinkCola");
    	drinkOrangeJuice = new CityDrinks(config.drinkOrangeJuiceID, 5, false).setUnlocalizedName("drinkOrangeJuice");
    	drinkWaterBottle = new CityDrinks(config.drinkWaterBottleID, 3, false).setUnlocalizedName("drinkWaterBottle");
    	drinkMilkBottle = new CityDrinks(config.drinkMilkBottleID, 4, false).setUnlocalizedName("drinkMilkBottle");
    	drinkEnergyDrink = new CityDrinks(config.drinkEnergyDrinkID, 6, false).setUnlocalizedName("drinkEnergyDrink");
    	drinkMilkshake = new CityDrinks(config.drinkMilkshakeID, 5, false).setUnlocalizedName("drinkMilkshake");
    	drinkCoffee = new CityDrinks(config.drinkCoffeeID, 4, false).setUnlocalizedName("drinkCoffee");
    	drinkHotChocolate = new CityDrinks(config.drinkHotChocolateID, 2, false).setUnlocalizedName("drinkHotChocolate");
	}
	
	public static void initSeeds() {
		
	}

}
