package co.uk.silvania.cities.food;

import co.uk.silvania.cities.food.items.ItemVendingMachineBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class CommonProxy {
	
    public void registerRenderThings() {
    }
    
    public void registerRenderers() {
    }
    
    public void registerBlocks() {
        GameRegistry.registerBlock(FCF_Blocks.fridgeBlock, "fridgeBlock");
        GameRegistry.registerBlock(FCF_Blocks.largeFridgeBlock, "largeFridgeBlock");
        GameRegistry.registerBlock(FCF_Blocks.vendingMachine, ItemVendingMachineBlock.class, "FlenixCities" + (FCF_Blocks.vendingMachine.getUnlocalizedName().substring(5)));

        GameRegistry.registerItem(FCF_Items.foodBurger, "foodBurger");
        GameRegistry.registerItem(FCF_Items.foodHotDog, "foodHotDog");
        GameRegistry.registerItem(FCF_Items.foodPizza, "foodPizza");
        GameRegistry.registerItem(FCF_Items.foodNoodles, "foodNoodles");
        GameRegistry.registerItem(FCF_Items.foodChocolateBar, "foodChocolateBar");
        GameRegistry.registerItem(FCF_Items.foodCrisps, "foodCrisps");
        GameRegistry.registerItem(FCF_Items.foodEnergyBar, "foodEnergyBar");
        GameRegistry.registerItem(FCF_Items.foodCheese, "foodCheese");
        GameRegistry.registerItem(FCF_Items.foodTomato, "foodTomato");
        GameRegistry.registerItem(FCF_Items.foodDonut, "foodDonut");
        GameRegistry.registerItem(FCF_Items.foodSweets, "foodSweets");
        GameRegistry.registerItem(FCF_Items.foodFries, "foodFries");
        GameRegistry.registerItem(FCF_Items.foodPopcorn, "foodPopcorn");
        GameRegistry.registerItem(FCF_Items.foodIceCream, "foodIceCream");
        GameRegistry.registerItem(FCF_Items.foodChickenNuggets, "foodChickenNuggets");
        GameRegistry.registerItem(FCF_Items.foodChickenWings, "foodChickenWings");
        
        GameRegistry.registerItem(FCF_Items.drinkAppleJuice, "drinkAppleJuice");
        GameRegistry.registerItem(FCF_Items.drinkCola, "drinkCola");
        GameRegistry.registerItem(FCF_Items.drinkOrangeJuice, "drinkOrangeJuice");
        GameRegistry.registerItem(FCF_Items.drinkWaterBottle, "drinkWaterBottle");
        GameRegistry.registerItem(FCF_Items.drinkMilkBottle, "drinkMilkBottle");
        GameRegistry.registerItem(FCF_Items.drinkEnergyDrink, "drinkEnergyDrink");
        GameRegistry.registerItem(FCF_Items.drinkMilkshake, "drinkMilkshake");
        GameRegistry.registerItem(FCF_Items.drinkCoffee, "drinkCoffee");
        GameRegistry.registerItem(FCF_Items.drinkHotChocolate, "drinkHotChocolate");
    }
    
    public void addNames() {
        LanguageRegistry.addName(FCF_Blocks.fridgeBlock, "Fridge");
        LanguageRegistry.addName(FCF_Blocks.largeFridgeBlock, "Large Fridge");
        
        LanguageRegistry.addName(FCF_Items.foodBurger, "Burger");
        LanguageRegistry.addName(FCF_Items.foodHotDog, "Hot Dog");
        LanguageRegistry.addName(FCF_Items.foodPizza, "Pizza");
        LanguageRegistry.addName(FCF_Items.foodNoodles, "Noodles");
        LanguageRegistry.addName(FCF_Items.foodChocolateBar, "Chocolate Bar");
        LanguageRegistry.addName(FCF_Items.foodCrisps, "Crisps");
        LanguageRegistry.addName(FCF_Items.foodEnergyBar, "Energy Bar");
        LanguageRegistry.addName(FCF_Items.foodCheese, "Cheese");
        LanguageRegistry.addName(FCF_Items.foodTomato, "Tomato");
        LanguageRegistry.addName(FCF_Items.foodDonut, "Donut");
        LanguageRegistry.addName(FCF_Items.foodSweets, "Sweets");
        LanguageRegistry.addName(FCF_Items.foodFries, "Fries");
        LanguageRegistry.addName(FCF_Items.foodPopcorn, "Popcorn");
        LanguageRegistry.addName(FCF_Items.foodIceCream, "Ice Cream");
        LanguageRegistry.addName(FCF_Items.foodChickenNuggets, "Chicken Nuggets");
        LanguageRegistry.addName(FCF_Items.foodChickenWings, "Chicken Wings");
        
        LanguageRegistry.addName(FCF_Items.drinkAppleJuice, "Apple Juice");
        LanguageRegistry.addName(FCF_Items.drinkCola, "Cola");
        LanguageRegistry.addName(FCF_Items.drinkOrangeJuice, "Orange Juice");
        LanguageRegistry.addName(FCF_Items.drinkWaterBottle, "Water Bottle");
        LanguageRegistry.addName(FCF_Items.drinkMilkBottle, "Milk Bottle");
        LanguageRegistry.addName(FCF_Items.drinkEnergyDrink, "Energy Drink");
        LanguageRegistry.addName(FCF_Items.drinkMilkshake, "Milkshake");
        LanguageRegistry.addName(FCF_Items.drinkCoffee, "Coffee");
        LanguageRegistry.addName(FCF_Items.drinkHotChocolate, "Hot Chocolate");
        
        LanguageRegistry.addName(new ItemStack(FCF_Blocks.vendingMachine, 1, 0), "Vending Machine");
        LanguageRegistry.addName(new ItemStack(FCF_Blocks.vendingMachine, 1, 4), "Vending Machine");
        LanguageRegistry.addName(new ItemStack(FCF_Blocks.vendingMachine, 1, 8), "Vending Machine");
        LanguageRegistry.addName(new ItemStack(FCF_Blocks.vendingMachine, 1, 12), "Vending Machine");
    }
    
    public void addRecipes() {
    	
    }
}