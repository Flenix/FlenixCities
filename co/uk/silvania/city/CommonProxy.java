package co.uk.silvania.city;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import co.uk.silvania.city.blocks.ComputerTowerBlock;
import co.uk.silvania.city.blocks.CopperOre;
import co.uk.silvania.city.blocks.CrystalOre;
import co.uk.silvania.city.blocks.PlasticBlocks;
import co.uk.silvania.city.blocks.TinOre;
import co.uk.silvania.city.items.*;
import co.uk.silvania.city.items.itemblocks.*;
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
        GameRegistry.registerBlock(FlenixCities.keyboardBlock, "keyboardBlock");
        GameRegistry.registerBlock(FlenixCities.laptopBlock, "laptopBlock");
        GameRegistry.registerBlock(FlenixCities.monitorSmall, "monitorSmall");
        GameRegistry.registerBlock(FlenixCities.monitorStandingLarge, "monitorStandingLarge");
        GameRegistry.registerBlock(FlenixCities.monitorWallLarge, "monitorWallLarge");
        GameRegistry.registerBlock(FlenixCities.pcBlock, "pcBlock");
        GameRegistry.registerBlock(FlenixCities.serverRack, "serverRack");
        GameRegistry.registerBlock(FlenixCities.mouseBlock, "mouseBlock");
        GameRegistry.registerBlock(FlenixCities.mouseKeyboardBlock, "mouseKeyboardBlock");
        GameRegistry.registerBlock(FlenixCities.vendingMachine, ItemVendingMachineBlock.class, "FlenixCities" + (FlenixCities.vendingMachine.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(FlenixCities.filingCabinet, "filingCabinet");
        
        GameRegistry.registerBlock(FlenixCities.skyscraperBlocks, ItemSkyscraperBlocks.class, "FlenixCities" + (FlenixCities.skyscraperBlocks.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(FlenixCities.stainedGlass, ItemStainedGlass.class, "FlenixCities" + (FlenixCities.stainedGlass.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(FlenixCities.stainedGlassLit, ItemStainedGlassLit.class, "FlenixCities" + (FlenixCities.stainedGlassLit.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(FlenixCities.streetBlocks, ItemStreetBlocks.class, "FlenixCities" + (FlenixCities.streetBlocks.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(FlenixCities.styledGlass, ItemStyledGlass.class, "FlenixCities" + (FlenixCities.styledGlass.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(FlenixCities.styledGlassWhite, ItemStyledGlassLit.class, "FlenixCities" + (FlenixCities.styledGlassWhite.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(FlenixCities.woolCeilingTile, ItemWoolCeilingTile.class, "FlenixCities" + (FlenixCities.woolCeilingTile.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(FlenixCities.woolStone, ItemWoolStone.class, "FlenixCities" + (FlenixCities.woolStone.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(FlenixCities.woolWood, ItemWoolStone.class, "FlenixCities" + (FlenixCities.woolWood.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(FlenixCities.plasticBlock, ItemPlasticBlocks.class, "FlenixCities" + (FlenixCities.plasticBlock.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(FlenixCities.floorBlocks, ItemFloorBlocks.class, "FlenixCities" + (FlenixCities.floorBlocks.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(FlenixCities.copperOre, "copperOre");
       	GameRegistry.registerBlock(FlenixCities.tinOre, "tinOre");
       	GameRegistry.registerBlock(FlenixCities.crystalOre, "crystalOre");
       	GameRegistry.registerBlock(FlenixCities.rubyOre, "rubyOre");
       	GameRegistry.registerBlock(FlenixCities.silverOre, "silverOre");
       	GameRegistry.registerBlock(FlenixCities.tecmoniumOre, "tecmoniumOre");
       	GameRegistry.registerBlock(FlenixCities.titaniumOre, "titaniumOre");
       	GameRegistry.registerBlock(FlenixCities.computerTower,"computerTower");
        
        GameRegistry.registerItem(FlenixCities.coin1, "coin1");
        GameRegistry.registerItem(FlenixCities.coin2, "coin2");
        GameRegistry.registerItem(FlenixCities.coin5, "coin5");
        GameRegistry.registerItem(FlenixCities.coin10, "coin10");
        GameRegistry.registerItem(FlenixCities.coin25, "coin25");
        GameRegistry.registerItem(FlenixCities.coin50, "coin50");
        GameRegistry.registerItem(FlenixCities.coin100, "coin100");
        GameRegistry.registerItem(FlenixCities.note100, "note100");
        GameRegistry.registerItem(FlenixCities.note500, "note500");
        GameRegistry.registerItem(FlenixCities.note1000, "note1000");
        GameRegistry.registerItem(FlenixCities.note2000, "note2000");
        GameRegistry.registerItem(FlenixCities.note5000, "note5000");
        GameRegistry.registerItem(FlenixCities.note10000, "note10000");
        GameRegistry.registerItem(FlenixCities.prePaidCard, "prePaidCard");
        GameRegistry.registerItem(FlenixCities.debitCard, "debitCard");
        GameRegistry.registerItem(FlenixCities.atmItem, "atmItem");
        
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
        
    	GameRegistry.registerItem(FlenixCities.smallBulletCasing, "smallBulletCasing");
    	GameRegistry.registerItem(FlenixCities.medBulletCasing, "medBulletCasing");
    	GameRegistry.registerItem(FlenixCities.largeBulletCasing, "largeBulletCasing");
    	GameRegistry.registerItem(FlenixCities.gunBarrel, "gunBarrel");
    	GameRegistry.registerItem(FlenixCities.gunMagazine, "gunMagazine");
    	GameRegistry.registerItem(FlenixCities.gunTriggerMechanism, "gunTriggerMechanism");
    	GameRegistry.registerItem(FlenixCities.gunStock, "gunStock");
    	GameRegistry.registerItem(FlenixCities.gunPump, "gunPump");
    	GameRegistry.registerItem(FlenixCities.groundPoppy, "groundPoppy");
    	GameRegistry.registerItem(FlenixCities.plasticItem, "plasticItem");
    	GameRegistry.registerItem(FlenixCities.smallPCB, "smallPCB");
    	GameRegistry.registerItem(FlenixCities.largePCB, "largePCB");
    	GameRegistry.registerItem(FlenixCities.spentShotgunRound, "spentShotgunRound");
    	GameRegistry.registerItem(FlenixCities.smallFossil, "smallFossil");
    	GameRegistry.registerItem(FlenixCities.largeFossil, "largeFossil");
    	GameRegistry.registerItem(FlenixCities.ringItem, "ringItem");
    	GameRegistry.registerItem(FlenixCities.diamondRing, "diamondRing");
    	GameRegistry.registerItem(FlenixCities.necklaceItem, "necklaceItem");
    	GameRegistry.registerItem(FlenixCities.rubyNecklace, "rubyNecklace");
    	GameRegistry.registerItem(FlenixCities.ancientSlab, "ancientSlab");
    	GameRegistry.registerItem(FlenixCities.crushedCan, "crushedCan");
    	GameRegistry.registerItem(FlenixCities.crushedPlasticBottle, "crushedPlasticBottle");
    	GameRegistry.registerItem(FlenixCities.chocolateWrapper, "chocolateWrapper");
    	GameRegistry.registerItem(FlenixCities.emptyCrispPacket, "emptyCrispPacket");
    	GameRegistry.registerItem(FlenixCities.wastePackaging, "wastePackaging");
    	GameRegistry.registerItem(FlenixCities.rubyItem, "rubyItem");
    	GameRegistry.registerItem(FlenixCities.titaniumIngot, "titaniumIngot");
    	GameRegistry.registerItem(FlenixCities.tecmoniumIngot, "tecmoniumIngot");
    	GameRegistry.registerItem(FlenixCities.silverIngot, "silverIngot");
    	GameRegistry.registerItem(FlenixCities.copperIngot, "copperIngot");
    	GameRegistry.registerItem(FlenixCities.tinIngot, "tinIngot");
    	GameRegistry.registerItem(FlenixCities.trainTicket, "trainTicket");
    	GameRegistry.registerItem(FlenixCities.theatreTicket, "theatreTicket");
    	GameRegistry.registerItem(FlenixCities.alligatorLeather, "alligatorLeather");
    	GameRegistry.registerItem(FlenixCities.baseballBat, "baseballBat");
    	GameRegistry.registerItem(FlenixCities.baseballItem, "baseballItem");
    	GameRegistry.registerItem(FlenixCities.americanFootball, "americanFootball");
    	GameRegistry.registerItem(FlenixCities.tennisBall, "tennisBall");
    	GameRegistry.registerItem(FlenixCities.soccerBall, "soccerBall");
    	GameRegistry.registerItem(FlenixCities.tennisRacquet, "tennisRacquet");
        
    }
    
    public void addNames() {
        LanguageRegistry.addName(FlenixCities.escalator, "Escalator");
        LanguageRegistry.addName(FlenixCities.travellator, "Travellator");
        LanguageRegistry.addName(FlenixCities.fridgeBlock, "Fridge");
        LanguageRegistry.addName(FlenixCities.largeFridgeBlock, "Large Fridge");
        LanguageRegistry.addName(FlenixCities.schoolDeskBlock, "School Desk");
        LanguageRegistry.addName(FlenixCities.floatingShelvesBlock, "Floating Shelves");
        LanguageRegistry.addName(FlenixCities.toiletBlock, "Toilet");
        LanguageRegistry.addName(FlenixCities.keyboardBlock, "Keyboard");
        LanguageRegistry.addName(FlenixCities.laptopBlock, "Laptop");
        LanguageRegistry.addName(FlenixCities.monitorSmall, "Monitor, Small");
        LanguageRegistry.addName(FlenixCities.monitorStandingLarge, "Monitor, Large");
        LanguageRegistry.addName(FlenixCities.monitorWallLarge, "Monitor, Wall-Mounted");
        LanguageRegistry.addName(FlenixCities.mouseBlock, "Mouse");
        LanguageRegistry.addName(FlenixCities.serverRack, "Server Rack");
        LanguageRegistry.addName(FlenixCities.pcBlock, "Personal Computer");
        LanguageRegistry.addName(FlenixCities.filingCabinet, "Filing Cabinet");
        
        if (CityConfig.isAdultMode == true) {
        	LanguageRegistry.addName(FlenixCities.heroinItem, "Heroin");
        	LanguageRegistry.addName(FlenixCities.tobaccoItem, "Tobacco");
        	LanguageRegistry.addName(FlenixCities.rollingPaper, "Rolling Papers");
        	LanguageRegistry.addName(FlenixCities.syringeItem, "Syringe");
        	LanguageRegistry.addName(FlenixCities.needleItem, "Needle");
        	LanguageRegistry.addName(FlenixCities.weedItem, "Weed (Fresh)");
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
        LanguageRegistry.addName(FlenixCities.copperOre, "Copper Ore");
        LanguageRegistry.addName(FlenixCities.tinOre, "Tin Ore");
        LanguageRegistry.addName(FlenixCities.rubyOre, "Ruby Ore");
        LanguageRegistry.addName(FlenixCities.tecmoniumOre, "Tecmonium Ore");
        LanguageRegistry.addName(FlenixCities.crystalOre, "Crystal Ore");
        LanguageRegistry.addName(FlenixCities.titaniumOre, "Titanium Ore");
        LanguageRegistry.addName(FlenixCities.silverOre, "Silver Ore");
        
    	LanguageRegistry.addName(FlenixCities.smallBulletCasing, "Small Bullet Casing");
    	LanguageRegistry.addName(FlenixCities.medBulletCasing, "Medium Bullet Casing");
    	LanguageRegistry.addName(FlenixCities.largeBulletCasing, "Large Bullet Casing");
    	LanguageRegistry.addName(FlenixCities.gunBarrel, "Gun Barrel");
    	LanguageRegistry.addName(FlenixCities.gunMagazine, "Gun Magazine");
    	LanguageRegistry.addName(FlenixCities.gunTriggerMechanism, "Gun Trigger Mechanism");
    	LanguageRegistry.addName(FlenixCities.gunStock, "Gun Stock");
    	LanguageRegistry.addName(FlenixCities.gunPump, "Gun Pump");
    	LanguageRegistry.addName(FlenixCities.groundPoppy, "Ground Poppy");
    	LanguageRegistry.addName(FlenixCities.plasticItem, "Plastic");
    	LanguageRegistry.addName(FlenixCities.smallPCB, "Small PCB");
    	LanguageRegistry.addName(FlenixCities.largePCB, "Large PCB");
    	LanguageRegistry.addName(FlenixCities.spentShotgunRound, "Shotgun Shell (Used)");
    	LanguageRegistry.addName(FlenixCities.smallFossil, "Small Fossil");
    	LanguageRegistry.addName(FlenixCities.largeFossil, "Large Fossil");
    	LanguageRegistry.addName(FlenixCities.ringItem, "Ring");
    	LanguageRegistry.addName(FlenixCities.diamondRing, "Diamond Ring");
    	LanguageRegistry.addName(FlenixCities.necklaceItem, "Necklace");
    	LanguageRegistry.addName(FlenixCities.rubyNecklace, "Ruby Necklace");
    	LanguageRegistry.addName(FlenixCities.ancientSlab, "Ancient Slab");
    	LanguageRegistry.addName(FlenixCities.crushedCan, "Crushed Can");
    	LanguageRegistry.addName(FlenixCities.crushedPlasticBottle, "Crushed Plastic Bottle");
    	LanguageRegistry.addName(FlenixCities.chocolateWrapper, "Chocolate Wrapper");
    	LanguageRegistry.addName(FlenixCities.emptyCrispPacket, "Emtpy Crisp Packet");
    	LanguageRegistry.addName(FlenixCities.wastePackaging, "Waste Packaging");
    	LanguageRegistry.addName(FlenixCities.rubyItem, "Ruby");
    	LanguageRegistry.addName(FlenixCities.titaniumIngot, "Titanium Ingot");
    	LanguageRegistry.addName(FlenixCities.tecmoniumIngot, "Tecmonium Ore");
    	LanguageRegistry.addName(FlenixCities.silverIngot, "Silver Ingot");
    	LanguageRegistry.addName(FlenixCities.copperIngot, "Copper Ingot");
    	LanguageRegistry.addName(FlenixCities.tinIngot, "Tin Ingot");
    	LanguageRegistry.addName(FlenixCities.trainTicket, "Train Ticket");
    	LanguageRegistry.addName(FlenixCities.theatreTicket, "Theatre Ticket");
    	LanguageRegistry.addName(FlenixCities.alligatorLeather, "Alligator Leather");
    	LanguageRegistry.addName(FlenixCities.baseballBat, "Baseball Bat");
    	LanguageRegistry.addName(FlenixCities.baseballItem, "Baseball Item");
    	LanguageRegistry.addName(FlenixCities.americanFootball, "American Football");
    	LanguageRegistry.addName(FlenixCities.tennisBall, "Tennis Ball");
    	LanguageRegistry.addName(FlenixCities.soccerBall, "Soccer Ball");
    	LanguageRegistry.addName(FlenixCities.tennisRacquet, "Tennis Racquet");
        
        LanguageRegistry.addName(new ItemStack(FlenixCities.vendingMachine, 1, 0), "Vending Machine");
        LanguageRegistry.addName(new ItemStack(FlenixCities.vendingMachine, 1, 4), "Vending Machine");
        LanguageRegistry.addName(new ItemStack(FlenixCities.vendingMachine, 1, 8), "Vending Machine");
        LanguageRegistry.addName(new ItemStack(FlenixCities.vendingMachine, 1, 12), "Vending Machine");
        
        LanguageRegistry.addName(new ItemStack(FlenixCities.atmBlock, 1, 0), "ATM Stone");
        LanguageRegistry.addName(new ItemStack(FlenixCities.atmBlock, 1, 4), "ATM Stone Brick");
        LanguageRegistry.addName(new ItemStack(FlenixCities.atmBlock, 1, 8), "ATM City White");
        LanguageRegistry.addName(new ItemStack(FlenixCities.atmBlock, 1, 12), "ATM City Grey");
        
        LanguageRegistry.addName(new ItemStack(FlenixCities.skyscraperBlocks, 1, 0), "White Skyscraper Block");
        LanguageRegistry.addName(new ItemStack(FlenixCities.skyscraperBlocks, 1, 1), "Light Grey Skyscraper Block");
        LanguageRegistry.addName(new ItemStack(FlenixCities.skyscraperBlocks, 1, 2), "Dark Grey Skyscraper Block");
        LanguageRegistry.addName(new ItemStack(FlenixCities.skyscraperBlocks, 1, 3), "Black Skyscraper Block");
        LanguageRegistry.addName(new ItemStack(FlenixCities.skyscraperBlocks, 1, 4), "White Skyscraper Block (Framed)");
        LanguageRegistry.addName(new ItemStack(FlenixCities.skyscraperBlocks, 1, 5), "Light Grey Skyscraper Block (Framed)");
        LanguageRegistry.addName(new ItemStack(FlenixCities.skyscraperBlocks, 1, 6), "Dark Grey Skyscraper Block (Framed)");
        LanguageRegistry.addName(new ItemStack(FlenixCities.skyscraperBlocks, 1, 7), "Black Skyscraper Block (Framed)");
        LanguageRegistry.addName(new ItemStack(FlenixCities.skyscraperBlocks, 1, 8), "Suggest!");
        LanguageRegistry.addName(new ItemStack(FlenixCities.skyscraperBlocks, 1, 9), "Suggest!");
        LanguageRegistry.addName(new ItemStack(FlenixCities.skyscraperBlocks, 1, 10), "Suggest!");
        LanguageRegistry.addName(new ItemStack(FlenixCities.skyscraperBlocks, 1, 11), "Suggest!");
        LanguageRegistry.addName(new ItemStack(FlenixCities.skyscraperBlocks, 1, 12), "Suggest!");
        LanguageRegistry.addName(new ItemStack(FlenixCities.skyscraperBlocks, 1, 13), "Suggest!");
        LanguageRegistry.addName(new ItemStack(FlenixCities.skyscraperBlocks, 1, 14), "Suggest!");
        LanguageRegistry.addName(new ItemStack(FlenixCities.skyscraperBlocks, 1, 15), "Suggest!");
        
        LanguageRegistry.addName(new ItemStack(FlenixCities.streetBlocks, 1, 0), "Simple Road");
        LanguageRegistry.addName(new ItemStack(FlenixCities.streetBlocks, 1, 1), "Grey Brick");
        LanguageRegistry.addName(new ItemStack(FlenixCities.streetBlocks, 1, 2), "Grey Brick, Small");
        LanguageRegistry.addName(new ItemStack(FlenixCities.streetBlocks, 1, 3), "Grey Brick, Pattern 1");
        LanguageRegistry.addName(new ItemStack(FlenixCities.streetBlocks, 1, 4), "Grey Brick, Pattern 2");
        LanguageRegistry.addName(new ItemStack(FlenixCities.streetBlocks, 1, 5), "Grey Brick, Pattern 3");
        LanguageRegistry.addName(new ItemStack(FlenixCities.streetBlocks, 1, 6), "Grey Brick, Pattern 4");
        LanguageRegistry.addName(new ItemStack(FlenixCities.streetBlocks, 1, 7), "Grey Brick, Tile (Large)");
        LanguageRegistry.addName(new ItemStack(FlenixCities.streetBlocks, 1, 8), "Grey Brick, Tile (Small)");
        LanguageRegistry.addName(new ItemStack(FlenixCities.streetBlocks, 1, 9), "Brown Brick");
        LanguageRegistry.addName(new ItemStack(FlenixCities.streetBlocks, 1, 10), "Brown Brick, Pattern 1");
        LanguageRegistry.addName(new ItemStack(FlenixCities.streetBlocks, 1, 11), "Brown Brick, Pattern 2");
        LanguageRegistry.addName(new ItemStack(FlenixCities.streetBlocks, 1, 12), "Brown Brick, Pattern 3");
        LanguageRegistry.addName(new ItemStack(FlenixCities.streetBlocks, 1, 13), "Brown Brick, Pattern 4");
        LanguageRegistry.addName(new ItemStack(FlenixCities.streetBlocks, 1, 14), "Sidewalk 1");
        LanguageRegistry.addName(new ItemStack(FlenixCities.streetBlocks, 1, 15), "Sidewalk 2");
        
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
        
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlass, 1, 0), "Blue White-framed Glass");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlass, 1, 1), "Blue Horizontal Forked Glass");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlass, 1, 2), "Blue Vertical Forked Glass");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlass, 1, 3), "Blue Framed Aligned Cross");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlass, 1, 4), "Blue Aligned Cross");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlass, 1, 5), "Blue Framed Horizontal Line");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlass, 1, 6), "Blue Horizontal Line");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlass, 1, 7), "Blue Framed Vertical Line");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlass, 1, 8), "blue Vertical Line");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlass, 1, 9), "Blue Small Squares");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlass, 1, 10), "Blue Cross");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlass, 1, 11), "Blue Supercross");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlass, 1, 12), "Suggest!");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlass, 1, 13), "Suggest!");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlass, 1, 14), "Suggest!");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlass, 1, 15), "Suggest!");
        
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlassWhite, 1, 0), "Clear White-framed Glass");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlassWhite, 1, 1), "Clear Horizontal Forked Glass");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlassWhite, 1, 2), "Clear Vertical Forked Glass");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlassWhite, 1, 3), "Clear Framed Aligned Cross");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlassWhite, 1, 4), "Clear Aligned Cross");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlassWhite, 1, 5), "Clear Framed Horizontal Line");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlassWhite, 1, 6), "Clear Horizontal Line");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlassWhite, 1, 7), "Clear Framed Vertical Line");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlassWhite, 1, 8), "Clear Vertical Line");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlassWhite, 1, 9), "Clear Small Squares");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlassWhite, 1, 10), "Clear Cross");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlassWhite, 1, 11), "Clear Supercross");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlassWhite, 1, 12), "Suggest!");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlassWhite, 1, 13), "Suggest!");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlassWhite, 1, 14), "Suggest!");
        LanguageRegistry.addName(new ItemStack(FlenixCities.styledGlassWhite, 1, 15), "Suggest!");
        
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
        
        LanguageRegistry.addName(new ItemStack(FlenixCities.plasticBlock, 1, 0), "White Plastic Block");
        LanguageRegistry.addName(new ItemStack(FlenixCities.plasticBlock, 1, 1), "Orange Plastic Block");
        LanguageRegistry.addName(new ItemStack(FlenixCities.plasticBlock, 1, 2), "Magenta Plastic Block");
        LanguageRegistry.addName(new ItemStack(FlenixCities.plasticBlock, 1, 3), "Light Blue Plastic Block");
        LanguageRegistry.addName(new ItemStack(FlenixCities.plasticBlock, 1, 4), "Yellow Plastic Block");
        LanguageRegistry.addName(new ItemStack(FlenixCities.plasticBlock, 1, 5), "Lime Plastic Block");
        LanguageRegistry.addName(new ItemStack(FlenixCities.plasticBlock, 1, 6), "Pink Plastic Block");
        LanguageRegistry.addName(new ItemStack(FlenixCities.plasticBlock, 1, 7), "Grey Plastic Block");
        LanguageRegistry.addName(new ItemStack(FlenixCities.plasticBlock, 1, 8), "Light Grey Plastic Block");
        LanguageRegistry.addName(new ItemStack(FlenixCities.plasticBlock, 1, 9), "Cyan Plastic Block");
        LanguageRegistry.addName(new ItemStack(FlenixCities.plasticBlock, 1, 10), "Purple Plastic Block");
        LanguageRegistry.addName(new ItemStack(FlenixCities.plasticBlock, 1, 11), "Blue Plastic Block");
        LanguageRegistry.addName(new ItemStack(FlenixCities.plasticBlock, 1, 12), "Brown Plastic Block");
        LanguageRegistry.addName(new ItemStack(FlenixCities.plasticBlock, 1, 13), "Green Plastic Block");
        LanguageRegistry.addName(new ItemStack(FlenixCities.plasticBlock, 1, 14), "Red Plastic Block");
        LanguageRegistry.addName(new ItemStack(FlenixCities.plasticBlock, 1, 15), "Black Plastic Block");
        
        LanguageRegistry.addName(new ItemStack(FlenixCities.floorBlocks, 1, 0), "Bathroom Tiles");
        LanguageRegistry.addName(new ItemStack(FlenixCities.floorBlocks, 1, 1), "Kitchen Tiles");
        LanguageRegistry.addName(new ItemStack(FlenixCities.floorBlocks, 1, 2), "Generic Tiles 1");
        LanguageRegistry.addName(new ItemStack(FlenixCities.floorBlocks, 1, 3), "Generic Tiles 2");
        LanguageRegistry.addName(new ItemStack(FlenixCities.floorBlocks, 1, 4), "Wood Laminate");
        LanguageRegistry.addName(new ItemStack(FlenixCities.floorBlocks, 1, 5), "");
        LanguageRegistry.addName(new ItemStack(FlenixCities.floorBlocks, 1, 6), "");
        LanguageRegistry.addName(new ItemStack(FlenixCities.floorBlocks, 1, 7), "");
        LanguageRegistry.addName(new ItemStack(FlenixCities.floorBlocks, 1, 8), "");
        LanguageRegistry.addName(new ItemStack(FlenixCities.floorBlocks, 1, 9), "");
        LanguageRegistry.addName(new ItemStack(FlenixCities.floorBlocks, 1, 10), "");
        LanguageRegistry.addName(new ItemStack(FlenixCities.floorBlocks, 1, 11), "");
        LanguageRegistry.addName(new ItemStack(FlenixCities.floorBlocks, 1, 12), "");
        LanguageRegistry.addName(new ItemStack(FlenixCities.floorBlocks, 1, 13), "");
        LanguageRegistry.addName(new ItemStack(FlenixCities.floorBlocks, 1, 14), "");
        LanguageRegistry.addName(new ItemStack(FlenixCities.floorBlocks, 1, 15), "");
        
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
        LanguageRegistry.addName(FlenixCities.atmItem, "ATM (Item)");
        
    	
    }
    
    public void addRecipes() {
    	
    }

}
