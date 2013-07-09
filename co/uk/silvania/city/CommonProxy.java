package co.uk.silvania.city;

import net.minecraft.item.ItemStack;
import co.uk.silvania.city.items.*;
import co.uk.silvania.city.items.itemblocks.ItemSkyscraperBlocks;
import co.uk.silvania.city.items.itemblocks.ItemStainedGlass;
import co.uk.silvania.city.items.itemblocks.ItemStainedGlassLit;
import co.uk.silvania.city.items.itemblocks.ItemStreetBlocks;
import co.uk.silvania.city.items.itemblocks.ItemStyledGlass;
import co.uk.silvania.city.items.itemblocks.ItemStyledGlassLit;
import co.uk.silvania.city.items.itemblocks.ItemWoolCeilingTile;
import co.uk.silvania.city.items.itemblocks.ItemWoolStone;
import co.uk.silvania.city.tileentities.blocks.ItemATMBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class CommonProxy {
	
    public void registerRenderThings() {
    }
    
    public void registerBlocks() {
        GameRegistry.registerBlock(FlenixCities.escalator, "escalator");
        GameRegistry.registerBlock(FlenixCities.travellator, "travellator");
        GameRegistry.registerBlock(FlenixCities.atmBlock, ItemATMBlock.class, "FlenixCities" + (FlenixCities.atmBlock.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(FlenixCities.fridgeBlock, "fridgeBlock");
        GameRegistry.registerBlock(FlenixCities.largeFridgeBlock, "largeFridgeBlock");
        GameRegistry.registerBlock(FlenixCities.schoolDeskBlock, "schoolDeskBlock");
        GameRegistry.registerBlock(FlenixCities.floatingShelvesBlock, "floatingShelvesBlock");
        GameRegistry.registerBlock(FlenixCities.toiletBlock, "toiletBlock");
        
        GameRegistry.registerBlock(FlenixCities.skyscraperBlocks, ItemSkyscraperBlocks.class, "FlenixCities" + (FlenixCities.skyscraperBlocks.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(FlenixCities.stainedGlass, ItemStainedGlass.class, "FlenixCities" + (FlenixCities.stainedGlass.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(FlenixCities.stainedGlassLit, ItemStainedGlassLit.class, "FlenixCities" + (FlenixCities.stainedGlassLit.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(FlenixCities.streetBlocks, ItemStreetBlocks.class, "FlenixCities" + (FlenixCities.streetBlocks.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(FlenixCities.styledGlass, ItemStyledGlass.class, "FlenixCities" + (FlenixCities.styledGlass.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(FlenixCities.styledGlassLit, ItemStyledGlassLit.class, "FlenixCities" + (FlenixCities.styledGlassLit.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(FlenixCities.woolCeilingTile, ItemWoolCeilingTile.class, "FlenixCities" + (FlenixCities.woolCeilingTile.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(FlenixCities.woolStone, ItemWoolStone.class, "FlenixCities" + (FlenixCities.woolStone.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(FlenixCities.woolWood, ItemWoolStone.class, "FlenixCities" + (FlenixCities.woolWood.getUnlocalizedName().substring(5)));
        
        GameRegistry.registerItem(FlenixCities.coin1,"coin1");
        GameRegistry.registerItem(FlenixCities.coin2,"coin2");
        GameRegistry.registerItem(FlenixCities.coin5,"coin5");
        GameRegistry.registerItem(FlenixCities.coin10,"coin10");
        GameRegistry.registerItem(FlenixCities.coin25,"coin25");
        GameRegistry.registerItem(FlenixCities.coin50,"coin50");
        GameRegistry.registerItem(FlenixCities.coin100,"coin100");
        GameRegistry.registerItem(FlenixCities.note100,"note100");
        GameRegistry.registerItem(FlenixCities.note500,"note500");
        GameRegistry.registerItem(FlenixCities.note1000,"note1000");
        GameRegistry.registerItem(FlenixCities.note2000,"note2000");
        GameRegistry.registerItem(FlenixCities.note5000,"note5000");
        GameRegistry.registerItem(FlenixCities.note10000,"note10000");
        GameRegistry.registerItem(FlenixCities.prePaidCard,"prePaidCard");
        GameRegistry.registerItem(FlenixCities.debitCard,"debitCard");
        
        //Adult Mode Items:
        if (CityConfig.isAdultMode == true) {
        	GameRegistry.registerItem(FlenixCities.heroinItem, "heroinItem");
        }
        
        GameRegistry.registerItem(FlenixCities.foodBurger, "foodBurger");
        GameRegistry.registerItem(FlenixCities.foodHotDog, "foodHotDog");
        GameRegistry.registerItem(FlenixCities.foodPizza, "foodPizza");
        GameRegistry.registerItem(FlenixCities.foodNoodles, "foodNoodles");
        GameRegistry.registerItem(FlenixCities.foodChocolateBar, "foodChocolateBar");
        GameRegistry.registerItem(FlenixCities.foodCrisps, "foodCrisps");
        GameRegistry.registerItem(FlenixCities.foodEnergyBar, "foodEnergyBar");
        GameRegistry.registerItem(FlenixCities.foodCheese, "foodCheese");
        GameRegistry.registerItem(FlenixCities.foodTomato, "foodTomato");
        GameRegistry.registerItem(FlenixCities.foodDonut, "foodDonut");
        GameRegistry.registerItem(FlenixCities.foodSweets, "foodSweets");
        GameRegistry.registerItem(FlenixCities.foodFries, "foodFries");
        GameRegistry.registerItem(FlenixCities.foodPopcorn, "foodPopcorn");
        GameRegistry.registerItem(FlenixCities.foodIceCream, "foodIceCream");
        GameRegistry.registerItem(FlenixCities.foodChickenNuggets, "foodChickenNuggets");
        GameRegistry.registerItem(FlenixCities.foodChickenWings, "foodChickenWings");
        GameRegistry.registerItem(FlenixCities.drinkAppleJuice, "drinkAppleJuice");
        GameRegistry.registerItem(FlenixCities.drinkCola, "drinkCola");
        GameRegistry.registerItem(FlenixCities.drinkOrangeJuice, "drinkOrangeJuice");
        GameRegistry.registerItem(FlenixCities.drinkWaterBottle, "drinkWaterBottle");
        GameRegistry.registerItem(FlenixCities.drinkMilkBottle, "drinkMilkBottle");
        GameRegistry.registerItem(FlenixCities.drinkEnergyDrink, "drinkEnergyDrink");
        GameRegistry.registerItem(FlenixCities.drinkMilkshake, "drinkMilkshake");
        GameRegistry.registerItem(FlenixCities.drinkCoffee, "drinkCoffee");
        GameRegistry.registerItem(FlenixCities.drinkHotChocolate, "drinkHotChocolate");
        
    }
    
    public void addNames() {
        LanguageRegistry.addName(FlenixCities.escalator, "Escalator");
        LanguageRegistry.addName(FlenixCities.travellator, "Travellator");
        LanguageRegistry.addName(FlenixCities.fridgeBlock, "Fridge");
        LanguageRegistry.addName(FlenixCities.largeFridgeBlock, "Large Fridge");
        LanguageRegistry.addName(FlenixCities.schoolDeskBlock, "School Desk");
        LanguageRegistry.addName(FlenixCities.floatingShelvesBlock, "Floating Shelves");
        LanguageRegistry.addName(FlenixCities.toiletBlock, "Toilet");
        
        if (CityConfig.isAdultMode == true) {
        	LanguageRegistry.addName(FlenixCities.heroinItem, "Heroin");
        }
        
        LanguageRegistry.addName(FlenixCities.foodBurger, "Burger");
        LanguageRegistry.addName(FlenixCities.foodHotDog, "Hot Dog");
        LanguageRegistry.addName(FlenixCities.foodPizza, "Pizza");
        LanguageRegistry.addName(FlenixCities.foodNoodles, "Noodles");
        LanguageRegistry.addName(FlenixCities.foodChocolateBar, "Chocolate Bar");
        LanguageRegistry.addName(FlenixCities.foodCrisps, "Crisps");
        LanguageRegistry.addName(FlenixCities.foodEnergyBar, "Energy Bar");
        LanguageRegistry.addName(FlenixCities.foodCheese, "Cheese");
        LanguageRegistry.addName(FlenixCities.foodTomato, "Tomato");
        LanguageRegistry.addName(FlenixCities.foodDonut, "Donut");
        LanguageRegistry.addName(FlenixCities.foodSweets, "Sweets");
        LanguageRegistry.addName(FlenixCities.foodFries, "Fries");
        LanguageRegistry.addName(FlenixCities.foodPopcorn, "Popcorn");
        LanguageRegistry.addName(FlenixCities.foodIceCream, "Ice Cream");
        LanguageRegistry.addName(FlenixCities.foodChickenNuggets, "Chicken Nuggets");
        LanguageRegistry.addName(FlenixCities.foodChickenWings, "Chicken Wings");
        LanguageRegistry.addName(FlenixCities.drinkAppleJuice, "Apple Juice");
        LanguageRegistry.addName(FlenixCities.drinkCola, "Cola");
        LanguageRegistry.addName(FlenixCities.drinkOrangeJuice, "Orange Juice");
        LanguageRegistry.addName(FlenixCities.drinkWaterBottle, "Water Bottle");
        LanguageRegistry.addName(FlenixCities.drinkMilkBottle, "Milk Bottle");
        LanguageRegistry.addName(FlenixCities.drinkEnergyDrink, "Energy Drink");
        LanguageRegistry.addName(FlenixCities.drinkMilkshake, "Milkshake");
        LanguageRegistry.addName(FlenixCities.drinkCoffee, "Coffee");
        LanguageRegistry.addName(FlenixCities.drinkHotChocolate, "Hot Chocolate");
        
        LanguageRegistry.addName(new ItemStack(FlenixCities.atmBlock, 1, 0), "ATM Stone Brick");
        LanguageRegistry.addName(new ItemStack(FlenixCities.atmBlock, 1, 1), "ATM (Ignore)");
        LanguageRegistry.addName(new ItemStack(FlenixCities.atmBlock, 1, 2), "ATM (Ignore)");
        LanguageRegistry.addName(new ItemStack(FlenixCities.atmBlock, 1, 3), "ATM (Ignore)");
        LanguageRegistry.addName(new ItemStack(FlenixCities.atmBlock, 1, 4), "ATM Stone");
        LanguageRegistry.addName(new ItemStack(FlenixCities.atmBlock, 1, 5), "ATM (Ignore)");
        LanguageRegistry.addName(new ItemStack(FlenixCities.atmBlock, 1, 6), "ATM (Ignore)");
        LanguageRegistry.addName(new ItemStack(FlenixCities.atmBlock, 1, 7), "ATM (Ignore)");
        LanguageRegistry.addName(new ItemStack(FlenixCities.atmBlock, 1, 8), "ATM City White");
        LanguageRegistry.addName(new ItemStack(FlenixCities.atmBlock, 1, 9), "ATM (Ignore)");
        LanguageRegistry.addName(new ItemStack(FlenixCities.atmBlock, 1, 10), "ATM (Ignore)");
        LanguageRegistry.addName(new ItemStack(FlenixCities.atmBlock, 1, 11), "ATM (Ignore)");
        LanguageRegistry.addName(new ItemStack(FlenixCities.atmBlock, 1, 12), "ATM City Grey");
        LanguageRegistry.addName(new ItemStack(FlenixCities.atmBlock, 1, 13), "ATM (Ignore)");
        LanguageRegistry.addName(new ItemStack(FlenixCities.atmBlock, 1, 14), "ATM (Ignore)");
        LanguageRegistry.addName(new ItemStack(FlenixCities.atmBlock, 1, 15), "ATM (Ignore)");
        
        LanguageRegistry.addName(new ItemStack(FlenixCities.skyscraperBlocks, 1, 0), "White Skyscraper Block");
        LanguageRegistry.addName(new ItemStack(FlenixCities.skyscraperBlocks, 1, 1), "Light Grey Skyscraper Block");
        LanguageRegistry.addName(new ItemStack(FlenixCities.skyscraperBlocks, 1, 2), "Dark Grey Skyscraper Block");
        LanguageRegistry.addName(new ItemStack(FlenixCities.skyscraperBlocks, 1, 3), "Black Skyscraper Block");
        LanguageRegistry.addName(new ItemStack(FlenixCities.skyscraperBlocks, 1, 4), "");
        LanguageRegistry.addName(new ItemStack(FlenixCities.skyscraperBlocks, 1, 5), "");
        LanguageRegistry.addName(new ItemStack(FlenixCities.skyscraperBlocks, 1, 6), "");
        LanguageRegistry.addName(new ItemStack(FlenixCities.skyscraperBlocks, 1, 7), "");
        LanguageRegistry.addName(new ItemStack(FlenixCities.skyscraperBlocks, 1, 8), "ATM City White");
        LanguageRegistry.addName(new ItemStack(FlenixCities.skyscraperBlocks, 1, 9), "");
        LanguageRegistry.addName(new ItemStack(FlenixCities.skyscraperBlocks, 1, 10), "");
        LanguageRegistry.addName(new ItemStack(FlenixCities.skyscraperBlocks, 1, 11), "");
        LanguageRegistry.addName(new ItemStack(FlenixCities.skyscraperBlocks, 1, 12), "ATM City Grey");
        LanguageRegistry.addName(new ItemStack(FlenixCities.skyscraperBlocks, 1, 13), "");
        LanguageRegistry.addName(new ItemStack(FlenixCities.skyscraperBlocks, 1, 14), "");
        LanguageRegistry.addName(new ItemStack(FlenixCities.skyscraperBlocks, 1, 15), "");
        
        LanguageRegistry.addName(new ItemStack(FlenixCities.streetBlocks, 1, 0), "Simple Road");
        LanguageRegistry.addName(new ItemStack(FlenixCities.streetBlocks, 1, 1), "Sidewalk");
        LanguageRegistry.addName(new ItemStack(FlenixCities.streetBlocks, 1, 2), "Tiled Pavement (Large)");
        LanguageRegistry.addName(new ItemStack(FlenixCities.streetBlocks, 1, 3), "Tiled Pavement (Small)");
        LanguageRegistry.addName(new ItemStack(FlenixCities.streetBlocks, 1, 4), "");
        LanguageRegistry.addName(new ItemStack(FlenixCities.streetBlocks, 1, 5), "");
        LanguageRegistry.addName(new ItemStack(FlenixCities.streetBlocks, 1, 6), "");
        LanguageRegistry.addName(new ItemStack(FlenixCities.streetBlocks, 1, 7), "");
        LanguageRegistry.addName(new ItemStack(FlenixCities.streetBlocks, 1, 8), "");
        LanguageRegistry.addName(new ItemStack(FlenixCities.streetBlocks, 1, 9), "");
        LanguageRegistry.addName(new ItemStack(FlenixCities.streetBlocks, 1, 10), "");
        LanguageRegistry.addName(new ItemStack(FlenixCities.streetBlocks, 1, 11), "");
        LanguageRegistry.addName(new ItemStack(FlenixCities.streetBlocks, 1, 12), "");
        LanguageRegistry.addName(new ItemStack(FlenixCities.streetBlocks, 1, 13), "");
        LanguageRegistry.addName(new ItemStack(FlenixCities.streetBlocks, 1, 14), "");
        LanguageRegistry.addName(new ItemStack(FlenixCities.streetBlocks, 1, 15), "");
        
        LanguageRegistry.addName(new ItemStack(FlenixCities.stainedGlass, 1, 0), "White Stained Glass");
        LanguageRegistry.addName(new ItemStack(FlenixCities.stainedGlass, 1, 1), "Orange Stained Glass");
        LanguageRegistry.addName(new ItemStack(FlenixCities.stainedGlass, 1, 2), "Magenta Stained Glass");
        LanguageRegistry.addName(new ItemStack(FlenixCities.stainedGlass, 1, 3), "Light Blue Stained Glass");
        LanguageRegistry.addName(new ItemStack(FlenixCities.stainedGlass, 1, 4), "Yellow Stained Glass");
        LanguageRegistry.addName(new ItemStack(FlenixCities.stainedGlass, 1, 5), "Lime Stained Glass");
        LanguageRegistry.addName(new ItemStack(FlenixCities.stainedGlass, 1, 6), "Pink Stained Glass");
        LanguageRegistry.addName(new ItemStack(FlenixCities.stainedGlass, 1, 7), "Grey Stained Glass");
        LanguageRegistry.addName(new ItemStack(FlenixCities.stainedGlass, 1, 8), "Light Grey Stained Glass");
        LanguageRegistry.addName(new ItemStack(FlenixCities.stainedGlass, 1, 9), "Cyan Stained Glass");
        LanguageRegistry.addName(new ItemStack(FlenixCities.stainedGlass, 1, 10), "Purple Stained Glass");
        LanguageRegistry.addName(new ItemStack(FlenixCities.stainedGlass, 1, 11), "Blue Stained Glass");
        LanguageRegistry.addName(new ItemStack(FlenixCities.stainedGlass, 1, 12), "Brown Stained Glass");
        LanguageRegistry.addName(new ItemStack(FlenixCities.stainedGlass, 1, 13), "Green Stained Glass");
        LanguageRegistry.addName(new ItemStack(FlenixCities.stainedGlass, 1, 14), "Red Stained Glass");
        LanguageRegistry.addName(new ItemStack(FlenixCities.stainedGlass, 1, 15), "Black Stained Glass");
        
        LanguageRegistry.addName(new ItemStack(FlenixCities.stainedGlassLit, 1, 0), "White Stained Glass (Lit)");
        LanguageRegistry.addName(new ItemStack(FlenixCities.stainedGlassLit, 1, 1), "Orange Stained Glass (Lit)");
        LanguageRegistry.addName(new ItemStack(FlenixCities.stainedGlassLit, 1, 2), "Magenta Stained Glass (Lit)");
        LanguageRegistry.addName(new ItemStack(FlenixCities.stainedGlassLit, 1, 3), "Light Blue Stained Glass (Lit)");
        LanguageRegistry.addName(new ItemStack(FlenixCities.stainedGlassLit, 1, 4), "Yellow Stained Glass (Lit)");
        LanguageRegistry.addName(new ItemStack(FlenixCities.stainedGlassLit, 1, 5), "Lime Stained Glass (Lit)");
        LanguageRegistry.addName(new ItemStack(FlenixCities.stainedGlassLit, 1, 6), "Pink Stained Glass (Lit)");
        LanguageRegistry.addName(new ItemStack(FlenixCities.stainedGlassLit, 1, 7), "Grey Stained Glass (Lit)");
        LanguageRegistry.addName(new ItemStack(FlenixCities.stainedGlassLit, 1, 8), "Light Grey Stained Glass (Lit)");
        LanguageRegistry.addName(new ItemStack(FlenixCities.stainedGlassLit, 1, 9), "Cyan Stained Glass (Lit)");
        LanguageRegistry.addName(new ItemStack(FlenixCities.stainedGlassLit, 1, 10), "Purple Stained Glass (Lit)");
        LanguageRegistry.addName(new ItemStack(FlenixCities.stainedGlassLit, 1, 11), "Blue Stained Glass (Lit)");
        LanguageRegistry.addName(new ItemStack(FlenixCities.stainedGlassLit, 1, 12), "Brown Stained Glass (Lit)");
        LanguageRegistry.addName(new ItemStack(FlenixCities.stainedGlassLit, 1, 13), "Green Stained Glass (Lit)");
        LanguageRegistry.addName(new ItemStack(FlenixCities.stainedGlassLit, 1, 14), "Red Stained Glass (Lit)");
        LanguageRegistry.addName(new ItemStack(FlenixCities.stainedGlassLit, 1, 15), "Black Stained Glass (Lit)");
        
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlass, 1, 0), "Clear White-framed Glass");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlass, 1, 1), "Blue White-framed Glass");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlass, 1, 2), "?");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlass, 1, 3), "?");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlass, 1, 4), "?");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlass, 1, 5), "?");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlass, 1, 6), "?");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlass, 1, 7), "?");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlass, 1, 8), "?");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlass, 1, 9), "?");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlass, 1, 10), "?");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlass, 1, 11), "?");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlass, 1, 12), "Church-Style Glass 1");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlass, 1, 13), "Church-Style Glass 2");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlass, 1, 14), "Church-Style Glass 3");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlass, 1, 15), "Church-Style Glass 4");
        
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlassLit, 1, 0), "Clear White-framed Glass");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlassLit, 1, 1), "Blue White-framed Glass");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlassLit, 1, 2), "?");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlassLit, 1, 3), "?");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlassLit, 1, 4), "?");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlassLit, 1, 5), "?");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlassLit, 1, 6), "?");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlassLit, 1, 7), "?");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlassLit, 1, 8), "?");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlassLit, 1, 9), "?");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlassLit, 1, 10), "?");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlassLit, 1, 11), "?");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlassLit, 1, 12), "Church-Style Glass 1");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlassLit, 1, 13), "Church-Style Glass 2");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlassLit, 1, 14), "Church-Style Glass 3");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlassLit, 1, 15), "Church-Style Glass 4");
        
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolCeilingTile, 1, 0), "White Wool-Topped Ceiling Tile");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolCeilingTile, 1, 1), "Orange Wool-Topped Ceiling Tile");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolCeilingTile, 1, 2), "Magenta Wool-Topped Ceiling Tile");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolCeilingTile, 1, 3), "Light Blue Wool-Topped Ceiling Tile");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolCeilingTile, 1, 4), "Yellow Wool-Topped Ceiling Tile");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolCeilingTile, 1, 5), "Lime Wool-Topped Ceiling Tile");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolCeilingTile, 1, 6), "Pink Wool-Topped Ceiling Tile");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolCeilingTile, 1, 7), "Grey Wool-Topped Ceiling Tile");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolCeilingTile, 1, 8), "Light Grey Wool-Topped Ceiling Tile");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolCeilingTile, 1, 9), "Cyan Wool-Topped Ceiling Tile");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolCeilingTile, 1, 10), "Purple Wool-Topped Ceiling Tile");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolCeilingTile, 1, 11), "Blue Wool-Topped Ceiling Tile");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolCeilingTile, 1, 12), "Brown Wool-Topped Ceiling Tile");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolCeilingTile, 1, 13), "Green Wool-Topped Ceiling Tile");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolCeilingTile, 1, 14), "Red Wool-Topped Ceiling Tile");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolCeilingTile, 1, 15), "Black Wool-Topped Ceiling Tile");
        
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolStone, 1, 0), "White Wool-Topped Stone");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolStone, 1, 1), "Orange Wool-Topped Stone");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolStone, 1, 2), "Magenta Wool-Topped Stone");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolStone, 1, 3), "Light Blue Wool-Topped Stone");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolStone, 1, 4), "Yellow Wool-Topped Stone");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolStone, 1, 5), "Lime Wool-Topped Stone");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolStone, 1, 6), "Pink Wool-Topped Stone");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolStone, 1, 7), "Grey Wool-Topped Stone");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolStone, 1, 8), "Light Grey Wool-Topped Stone");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolStone, 1, 9), "Cyan Wool-Topped Stone");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolStone, 1, 10), "Purple Wool-Topped Stone");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolStone, 1, 11), "Blue Wool-Topped Stone");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolStone, 1, 12), "Brown Wool-Topped Stone");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolStone, 1, 13), "Green Wool-Topped Stone");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolStone, 1, 14), "Red Wool-Topped Stone");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolStone, 1, 15), "Black Wool-Topped Stone");
        
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolWood, 1, 0), "White Wool-Topped Wood");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolWood, 1, 1), "Orange Wool-Topped Wood");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolWood, 1, 2), "Magenta Wool-Topped Wood");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolWood, 1, 3), "Light Blue Wool-Topped Wood");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolWood, 1, 4), "Yellow Wool-Topped Wood");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolWood, 1, 5), "Lime Wool-Topped Wood");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolWood, 1, 6), "Pink Wool-Topped Wood");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolWood, 1, 7), "Grey Wool-Topped Wood");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolWood, 1, 8), "Light Grey Wool-Topped Wood");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolWood, 1, 9), "Cyan Wool-Topped Wood");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolWood, 1, 10), "Purple Wool-Topped Wood");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolWood, 1, 11), "Blue Wool-Topped Wood");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolWood, 1, 12), "Brown Wool-Topped Wood");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolWood, 1, 13), "Green Wool-Topped Wood");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolWood, 1, 14), "Red Wool-Topped Wood");
        LanguageRegistry.addName(new ItemStack(FlenixCities.woolWood, 1, 15), "Black Wool-Topped Wood");
        
        LanguageRegistry.addName(FlenixCities.coin1, "1 " + CityConfig.currencySmall);
        LanguageRegistry.addName(FlenixCities.coin2, "2 " + CityConfig.currencySmallPlural);
        LanguageRegistry.addName(FlenixCities.coin5, "5 " + CityConfig.currencySmallPlural);
        LanguageRegistry.addName(FlenixCities.coin10, "10 " + CityConfig.currencySmallPlural);
        LanguageRegistry.addName(FlenixCities.coin25, "25 " + CityConfig.currencySmallPlural);
        LanguageRegistry.addName(FlenixCities.coin50, "50 " + CityConfig.currencySmallPlural);
        LanguageRegistry.addName(FlenixCities.coin100, "1 " + CityConfig.currencyLarge + " Coin");
        LanguageRegistry.addName(FlenixCities.note100, "1 " + CityConfig.currencyLarge);
        LanguageRegistry.addName(FlenixCities.note500, "5 " + CityConfig.currencyLargePlural);
        LanguageRegistry.addName(FlenixCities.note1000, "10 " + CityConfig.currencyLargePlural);
        LanguageRegistry.addName(FlenixCities.note2000, "20 " + CityConfig.currencyLargePlural);
        LanguageRegistry.addName(FlenixCities.note5000, "50 " + CityConfig.currencyLargePlural);
        LanguageRegistry.addName(FlenixCities.note10000, "100 " + CityConfig.currencyLargePlural);
        LanguageRegistry.addName(FlenixCities.prePaidCard, "Pre-Paid Card");
        LanguageRegistry.addName(FlenixCities.debitCard, "Debit Card");
        
    	
    }
    
    public void addRecipes() {
    	
    }

}
