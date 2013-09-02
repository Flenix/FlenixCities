package co.uk.silvania.cities.core;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import co.uk.silvania.cities.core.blocks.CopperOre;
import co.uk.silvania.cities.core.blocks.CrystalOre;
import co.uk.silvania.cities.core.blocks.PlasticBlocks;
import co.uk.silvania.cities.core.blocks.TinOre;
import co.uk.silvania.cities.core.items.ItemFloorBlocks;
import co.uk.silvania.cities.core.items.ItemPlasticBlocks;
import co.uk.silvania.cities.core.items.ItemSkyscraperBlocks;
import co.uk.silvania.cities.core.items.ItemStainedGlass;
import co.uk.silvania.cities.core.items.ItemStainedGlassLit;
import co.uk.silvania.cities.core.items.ItemStreetBlocks;
import co.uk.silvania.cities.core.items.ItemStyledGlass;
import co.uk.silvania.cities.core.items.ItemStyledGlassLit;
import co.uk.silvania.cities.core.items.ItemWoolCeilingTile;
import co.uk.silvania.cities.core.items.ItemWoolStone;
import co.uk.silvania.cities.enforcement.FCEn_Items;
import co.uk.silvania.city.blocks.ComputerTowerBlock;
import co.uk.silvania.city.items.*;
import co.uk.silvania.city.items.itemblocks.*;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class CommonProxy {
	
    public void registerRenderThings() {
    }
    
    public void registerRenderers() {
    }
    
    public void registerBlocks() {
        GameRegistry.registerBlock(FlenixCities_Core.escalator, "escalator");
        GameRegistry.registerBlock(FlenixCities_Core.travellator, "travellator");
        GameRegistry.registerBlock(FlenixCities_Core.schoolDeskBlock, "schoolDeskBlock");
        GameRegistry.registerBlock(FlenixCities_Core.toiletBlock, "toiletBlock");
        GameRegistry.registerBlock(FlenixCities_Core.keyboardBlock, "keyboardBlock");
        GameRegistry.registerBlock(FlenixCities_Core.laptopBlock, "laptopBlock");
        GameRegistry.registerBlock(FlenixCities_Core.monitorSmall, "monitorSmall");
        GameRegistry.registerBlock(FlenixCities_Core.monitorStandingLarge, "monitorStandingLarge");
        GameRegistry.registerBlock(FlenixCities_Core.monitorWallLarge, "monitorWallLarge");
        GameRegistry.registerBlock(FlenixCities_Core.pcBlock, "pcBlock");
        GameRegistry.registerBlock(FlenixCities_Core.serverRack, "serverRack");
        GameRegistry.registerBlock(FlenixCities_Core.mouseBlock, "mouseBlock");
        GameRegistry.registerBlock(FlenixCities_Core.mouseKeyboardBlock, "mouseKeyboardBlock");
        GameRegistry.registerBlock(FlenixCities_Core.filingCabinet, "filingCabinet");
        
        GameRegistry.registerBlock(CoreBlocks.skyscraperBlocks, ItemSkyscraperBlocks.class, "FlenixCities" + (CoreBlocks.skyscraperBlocks.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(CoreBlocks.stainedGlass, ItemStainedGlass.class, "FlenixCities" + (CoreBlocks.stainedGlass.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(CoreBlocks.stainedGlassLit, ItemStainedGlassLit.class, "FlenixCities" + (CoreBlocks.stainedGlassLit.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(CoreBlocks.streetBlocks, ItemStreetBlocks.class, "FlenixCities" + (CoreBlocks.streetBlocks.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(CoreBlocks.styledGlass, ItemStyledGlass.class, "FlenixCities" + (CoreBlocks.styledGlass.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(CoreBlocks.styledGlassWhite, ItemStyledGlassLit.class, "FlenixCities" + (CoreBlocks.styledGlassWhite.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(CoreBlocks.woolCeilingTile, ItemWoolCeilingTile.class, "FlenixCities" + (CoreBlocks.woolCeilingTile.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(CoreBlocks.woolStone, ItemWoolStone.class, "FlenixCities" + (CoreBlocks.woolStone.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(CoreBlocks.woolWood, ItemWoolStone.class, "FlenixCities" + (CoreBlocks.woolWood.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(CoreBlocks.plasticBlock, ItemPlasticBlocks.class, "FlenixCities" + (CoreBlocks.plasticBlock.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(CoreBlocks.floorBlocks, ItemFloorBlocks.class, "FlenixCities" + (CoreBlocks.floorBlocks.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(CoreBlocks.copperOre, "copperOre");
       	GameRegistry.registerBlock(CoreBlocks.tinOre, "tinOre");
       	GameRegistry.registerBlock(CoreBlocks.crystalOre, "crystalOre");
       	GameRegistry.registerBlock(CoreBlocks.rubyOre, "rubyOre");
       	GameRegistry.registerBlock(CoreBlocks.silverOre, "silverOre");
       	GameRegistry.registerBlock(CoreBlocks.tecmoniumOre, "tecmoniumOre");
       	GameRegistry.registerBlock(CoreBlocks.titaniumOre, "titaniumOre");
       	GameRegistry.registerBlock(FlenixCities_Core.computerTower,"computerTower");
       	
       	//GameRegistry.registerBlock(FlenixCities.verticalPoster1, ItemBlockPosterVertical.class, "FlenixCities" + (FlenixCities.verticalPoster1.getUnlocalizedName().substring(5)));
       	//GameRegistry.registerBlock(FlenixCities.verticalPoster2, ItemBlockPosterVertical.class, "FlenixCities" + (FlenixCities.verticalPoster2.getUnlocalizedName().substring(5)));
       	//GameRegistry.registerBlock(FlenixCities.verticalPoster3, ItemBlockPosterVertical.class, "FlenixCities" + (FlenixCities.verticalPoster3.getUnlocalizedName().substring(5)));
       	//GameRegistry.registerBlock(FlenixCities.verticalPoster4, ItemBlockPosterVertical.class, "FlenixCities" + (FlenixCities.verticalPoster4.getUnlocalizedName().substring(5)));
        
    	GameRegistry.registerItem(CoreItems.plasticItem, "plasticItem");
    	GameRegistry.registerItem(CoreItems.smallPCB, "smallPCB");
    	GameRegistry.registerItem(CoreItems.largePCB, "largePCB");
    	GameRegistry.registerItem(FlenixCities_Core.smallFossil, "smallFossil");
    	GameRegistry.registerItem(FlenixCities_Core.largeFossil, "largeFossil");
    	GameRegistry.registerItem(FlenixCities_Core.ancientSlab, "ancientSlab");
    	GameRegistry.registerItem(FlenixCities_Core.crushedCan, "crushedCan");
    	GameRegistry.registerItem(FlenixCities_Core.crushedPlasticBottle, "crushedPlasticBottle");
    	GameRegistry.registerItem(FlenixCities_Core.chocolateWrapper, "chocolateWrapper");
    	GameRegistry.registerItem(FlenixCities_Core.emptyCrispPacket, "emptyCrispPacket");
    	GameRegistry.registerItem(FlenixCities_Core.wastePackaging, "wastePackaging");
    	GameRegistry.registerItem(CoreItems.rubyItem, "rubyItem");
    	GameRegistry.registerItem(CoreItems.titaniumIngot, "titaniumIngot");
    	GameRegistry.registerItem(CoreItems.tecmoniumIngot, "tecmoniumIngot");
    	GameRegistry.registerItem(CoreItems.silverIngot, "silverIngot");
    	GameRegistry.registerItem(CoreItems.copperIngot, "copperIngot");
    	GameRegistry.registerItem(CoreItems.tinIngot, "tinIngot");
    	GameRegistry.registerItem(FlenixCities_Core.trainTicket, "trainTicket");
    	GameRegistry.registerItem(FlenixCities_Core.theatreTicket, "theatreTicket");
    	GameRegistry.registerItem(FlenixCities_Core.alligatorLeather, "alligatorLeather");
    	GameRegistry.registerItem(FlenixCities_Core.baseballBat, "baseballBat");
    	GameRegistry.registerItem(FlenixCities_Core.baseballItem, "baseballItem");
    	GameRegistry.registerItem(FlenixCities_Core.americanFootball, "americanFootball");
    	GameRegistry.registerItem(FlenixCities_Core.tennisBall, "tennisBall");
    	GameRegistry.registerItem(FlenixCities_Core.soccerBall, "soccerBall");
    	GameRegistry.registerItem(FlenixCities_Core.tennisRacquet, "tennisRacquet");
    	GameRegistry.registerItem(FlenixCities_Core.myPhoneBlack, "myPhoneBlack");
    	GameRegistry.registerItem(FlenixCities_Core.myPhoneWhite, "myPhoneWhite");
    	GameRegistry.registerItem(FlenixCities_Core.myPhoneSuperBlack, "myPhoneSuperBlack");
    	GameRegistry.registerItem(FlenixCities_Core.myPhoneSuperWhite, "myPhoneSuperWhite");
        
    }
    
    public void addNames() {
        LanguageRegistry.addName(FlenixCities_Core.escalator, "Escalator");
        LanguageRegistry.addName(FlenixCities_Core.travellator, "Travellator");
        LanguageRegistry.addName(FlenixCities_Core.schoolDeskBlock, "School Desk");
        LanguageRegistry.addName(FlenixCities_Core.toiletBlock, "Toilet");
        LanguageRegistry.addName(FlenixCities_Core.keyboardBlock, "Keyboard");
        LanguageRegistry.addName(FlenixCities_Core.laptopBlock, "Laptop");
        LanguageRegistry.addName(FlenixCities_Core.monitorSmall, "Monitor, Small");
        LanguageRegistry.addName(FlenixCities_Core.monitorStandingLarge, "Monitor, Large");
        LanguageRegistry.addName(FlenixCities_Core.monitorWallLarge, "Monitor, Wall-Mounted");
        LanguageRegistry.addName(FlenixCities_Core.mouseBlock, "Mouse");
        LanguageRegistry.addName(FlenixCities_Core.serverRack, "Server Rack");
        LanguageRegistry.addName(FlenixCities_Core.pcBlock, "Personal Computer");
        LanguageRegistry.addName(FlenixCities_Core.filingCabinet, "Filing Cabinet");
        
        LanguageRegistry.addName(CoreBlocks.copperOre, "Copper Ore");
        LanguageRegistry.addName(CoreBlocks.tinOre, "Tin Ore");
        LanguageRegistry.addName(CoreBlocks.rubyOre, "Ruby Ore");
        LanguageRegistry.addName(CoreBlocks.tecmoniumOre, "Tecmonium Ore");
        LanguageRegistry.addName(CoreBlocks.crystalOre, "Crystal Ore");
        LanguageRegistry.addName(CoreBlocks.titaniumOre, "Titanium Ore");
        LanguageRegistry.addName(CoreBlocks.silverOre, "Silver Ore");
        
    	LanguageRegistry.addName(FlenixCities_Core.smallFossil, "Small Fossil");
    	LanguageRegistry.addName(FlenixCities_Core.largeFossil, "Large Fossil");
    	LanguageRegistry.addName(FlenixCities_Core.ancientSlab, "Ancient Slab");
    	LanguageRegistry.addName(FlenixCities_Core.crushedCan, "Crushed Can");
    	LanguageRegistry.addName(FlenixCities_Core.crushedPlasticBottle, "Crushed Plastic Bottle");
    	LanguageRegistry.addName(FlenixCities_Core.chocolateWrapper, "Chocolate Wrapper");
    	LanguageRegistry.addName(FlenixCities_Core.emptyCrispPacket, "Emtpy Crisp Packet");
    	LanguageRegistry.addName(FlenixCities_Core.wastePackaging, "Waste Packaging");
    	LanguageRegistry.addName(CoreItems.rubyItem, "Ruby");
    	LanguageRegistry.addName(CoreItems.titaniumIngot, "Titanium Ingot");
    	LanguageRegistry.addName(CoreItems.tecmoniumIngot, "Tecmonium Ore");
    	LanguageRegistry.addName(CoreItems.silverIngot, "Silver Ingot");
    	LanguageRegistry.addName(CoreItems.copperIngot, "Copper Ingot");
    	LanguageRegistry.addName(CoreItems.tinIngot, "Tin Ingot");
    	LanguageRegistry.addName(CoreItems.plasticItem, "Plastic");
    	LanguageRegistry.addName(CoreItems.smallPCB, "Small PCB");
    	LanguageRegistry.addName(CoreItems.largePCB, "Large PCB");
    	
    	LanguageRegistry.addName(FlenixCities_Core.trainTicket, "Train Ticket");
    	LanguageRegistry.addName(FlenixCities_Core.theatreTicket, "Theatre Ticket");
    	LanguageRegistry.addName(FlenixCities_Core.alligatorLeather, "Alligator Leather");
    	LanguageRegistry.addName(FlenixCities_Core.baseballBat, "Baseball Bat");
    	LanguageRegistry.addName(FlenixCities_Core.baseballItem, "Baseball Item");
    	LanguageRegistry.addName(FlenixCities_Core.americanFootball, "American Football");
    	LanguageRegistry.addName(FlenixCities_Core.tennisBall, "Tennis Ball");
    	LanguageRegistry.addName(FlenixCities_Core.soccerBall, "Soccer Ball");
    	LanguageRegistry.addName(FlenixCities_Core.tennisRacquet, "Tennis Racquet");
    	LanguageRegistry.addName(FlenixCities_Core.myPhoneBlack, "myPhone");
    	LanguageRegistry.addName(FlenixCities_Core.myPhoneWhite, "myPhone");
    	LanguageRegistry.addName(FlenixCities_Core.myPhoneSuperBlack, "myPhone Super");
    	LanguageRegistry.addName(FlenixCities_Core.myPhoneSuperWhite, "myPhone Super");
        
        
        LanguageRegistry.addName(new ItemStack(CoreBlocks.skyscraperBlocks, 1, 0), "White Skyscraper Block");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.skyscraperBlocks, 1, 1), "Light Grey Skyscraper Block");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.skyscraperBlocks, 1, 2), "Dark Grey Skyscraper Block");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.skyscraperBlocks, 1, 3), "Black Skyscraper Block");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.skyscraperBlocks, 1, 4), "White Skyscraper Block (Framed)");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.skyscraperBlocks, 1, 5), "Light Grey Skyscraper Block (Framed)");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.skyscraperBlocks, 1, 6), "Dark Grey Skyscraper Block (Framed)");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.skyscraperBlocks, 1, 7), "Black Skyscraper Block (Framed)");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.skyscraperBlocks, 1, 8), "White Skyscraper Block (Framed)");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.skyscraperBlocks, 1, 9), "Light Grey Skyscraper Block (Framed)");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.skyscraperBlocks, 1, 10), "Dark Grey Skyscraper Block (Framed)");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.skyscraperBlocks, 1, 11), "Black Skyscraper Block (Framed)");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.skyscraperBlocks, 1, 12), "White Skyscraper Block (Framed)");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.skyscraperBlocks, 1, 13), "Light Grey Skyscraper Block (Framed)");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.skyscraperBlocks, 1, 14), "Dark Grey Skyscraper Block (Framed)");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.skyscraperBlocks, 1, 15), "Black Skyscraper Block (Framed)");
        
        LanguageRegistry.addName(new ItemStack(CoreBlocks.streetBlocks, 1, 0), "Simple Road");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.streetBlocks, 1, 1), "Grey Brick");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.streetBlocks, 1, 2), "Grey Brick, Small");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.streetBlocks, 1, 3), "Grey Brick, Pattern 1");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.streetBlocks, 1, 4), "Grey Brick, Pattern 2");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.streetBlocks, 1, 5), "Grey Brick, Pattern 3");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.streetBlocks, 1, 6), "Grey Brick, Pattern 4");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.streetBlocks, 1, 7), "Grey Brick, Tile (Large)");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.streetBlocks, 1, 8), "Grey Brick, Tile (Small)");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.streetBlocks, 1, 9), "Brown Brick");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.streetBlocks, 1, 10), "Brown Brick, Pattern 1");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.streetBlocks, 1, 11), "Brown Brick, Pattern 2");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.streetBlocks, 1, 12), "Brown Brick, Pattern 3");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.streetBlocks, 1, 13), "Brown Brick, Pattern 4");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.streetBlocks, 1, 14), "Sidewalk 1");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.streetBlocks, 1, 15), "Sidewalk 2");
        
        LanguageRegistry.addName(new ItemStack(CoreBlocks.stainedGlass, 1, 0), "White Stained Glass");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.stainedGlass, 1, 1), "Orange Stained Glass");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.stainedGlass, 1, 2), "Magenta Stained Glass");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.stainedGlass, 1, 3), "Light Blue Stained Glass");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.stainedGlass, 1, 4), "Yellow Stained Glass");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.stainedGlass, 1, 5), "Lime Stained Glass");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.stainedGlass, 1, 6), "Pink Stained Glass");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.stainedGlass, 1, 7), "Grey Stained Glass");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.stainedGlass, 1, 8), "Light Grey Stained Glass");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.stainedGlass, 1, 9), "Cyan Stained Glass");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.stainedGlass, 1, 10), "Purple Stained Glass");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.stainedGlass, 1, 11), "Blue Stained Glass");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.stainedGlass, 1, 12), "Brown Stained Glass");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.stainedGlass, 1, 13), "Green Stained Glass");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.stainedGlass, 1, 14), "Red Stained Glass");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.stainedGlass, 1, 15), "Black Stained Glass");
        
        LanguageRegistry.addName(new ItemStack(CoreBlocks.stainedGlassLit, 1, 0), "White Stained Glass (Lit)");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.stainedGlassLit, 1, 1), "Orange Stained Glass (Lit)");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.stainedGlassLit, 1, 2), "Magenta Stained Glass (Lit)");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.stainedGlassLit, 1, 3), "Light Blue Stained Glass (Lit)");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.stainedGlassLit, 1, 4), "Yellow Stained Glass (Lit)");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.stainedGlassLit, 1, 5), "Lime Stained Glass (Lit)");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.stainedGlassLit, 1, 6), "Pink Stained Glass (Lit)");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.stainedGlassLit, 1, 7), "Grey Stained Glass (Lit)");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.stainedGlassLit, 1, 8), "Light Grey Stained Glass (Lit)");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.stainedGlassLit, 1, 9), "Cyan Stained Glass (Lit)");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.stainedGlassLit, 1, 10), "Purple Stained Glass (Lit)");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.stainedGlassLit, 1, 11), "Blue Stained Glass (Lit)");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.stainedGlassLit, 1, 12), "Brown Stained Glass (Lit)");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.stainedGlassLit, 1, 13), "Green Stained Glass (Lit)");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.stainedGlassLit, 1, 14), "Red Stained Glass (Lit)");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.stainedGlassLit, 1, 15), "Black Stained Glass (Lit)");
        
        LanguageRegistry.addName(new ItemStack(CoreBlocks.styledGlass, 1, 0), "Blue White-framed Glass");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.styledGlass, 1, 1), "Blue Horizontal Forked Glass");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.styledGlass, 1, 2), "Blue Vertical Forked Glass");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.styledGlass, 1, 3), "Blue Framed Aligned Cross");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.styledGlass, 1, 4), "Blue Aligned Cross");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.styledGlass, 1, 5), "Blue Framed Horizontal Line");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.styledGlass, 1, 6), "Blue Horizontal Line");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.styledGlass, 1, 7), "Blue Framed Vertical Line");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.styledGlass, 1, 8), "blue Vertical Line");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.styledGlass, 1, 9), "Blue Small Squares");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.styledGlass, 1, 10), "Blue Cross");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.styledGlass, 1, 11), "Blue Supercross");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.styledGlass, 1, 12), "Suggest!");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.styledGlass, 1, 13), "Suggest!");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.styledGlass, 1, 14), "Suggest!");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.styledGlass, 1, 15), "Suggest!");
        
        LanguageRegistry.addName(new ItemStack(CoreBlocks.styledGlassWhite, 1, 0), "Clear White-framed Glass");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.styledGlassWhite, 1, 1), "Clear Horizontal Forked Glass");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.styledGlassWhite, 1, 2), "Clear Vertical Forked Glass");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.styledGlassWhite, 1, 3), "Clear Framed Aligned Cross");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.styledGlassWhite, 1, 4), "Clear Aligned Cross");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.styledGlassWhite, 1, 5), "Clear Framed Horizontal Line");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.styledGlassWhite, 1, 6), "Clear Horizontal Line");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.styledGlassWhite, 1, 7), "Clear Framed Vertical Line");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.styledGlassWhite, 1, 8), "Clear Vertical Line");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.styledGlassWhite, 1, 9), "Clear Small Squares");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.styledGlassWhite, 1, 10), "Clear Cross");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.styledGlassWhite, 1, 11), "Clear Supercross");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.styledGlassWhite, 1, 12), "Suggest!");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.styledGlassWhite, 1, 13), "Suggest!");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.styledGlassWhite, 1, 14), "Suggest!");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.styledGlassWhite, 1, 15), "Suggest!");
        
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolCeilingTile, 1, 0), "White Wool-Topped Ceiling Tile");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolCeilingTile, 1, 1), "Orange Wool-Topped Ceiling Tile");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolCeilingTile, 1, 2), "Magenta Wool-Topped Ceiling Tile");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolCeilingTile, 1, 3), "Light Blue Wool-Topped Ceiling Tile");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolCeilingTile, 1, 4), "Yellow Wool-Topped Ceiling Tile");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolCeilingTile, 1, 5), "Lime Wool-Topped Ceiling Tile");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolCeilingTile, 1, 6), "Pink Wool-Topped Ceiling Tile");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolCeilingTile, 1, 7), "Grey Wool-Topped Ceiling Tile");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolCeilingTile, 1, 8), "Light Grey Wool-Topped Ceiling Tile");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolCeilingTile, 1, 9), "Cyan Wool-Topped Ceiling Tile");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolCeilingTile, 1, 10), "Purple Wool-Topped Ceiling Tile");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolCeilingTile, 1, 11), "Blue Wool-Topped Ceiling Tile");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolCeilingTile, 1, 12), "Brown Wool-Topped Ceiling Tile");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolCeilingTile, 1, 13), "Green Wool-Topped Ceiling Tile");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolCeilingTile, 1, 14), "Red Wool-Topped Ceiling Tile");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolCeilingTile, 1, 15), "Black Wool-Topped Ceiling Tile");
        
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolStone, 1, 0), "White Wool-Topped Stone");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolStone, 1, 1), "Orange Wool-Topped Stone");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolStone, 1, 2), "Magenta Wool-Topped Stone");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolStone, 1, 3), "Light Blue Wool-Topped Stone");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolStone, 1, 4), "Yellow Wool-Topped Stone");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolStone, 1, 5), "Lime Wool-Topped Stone");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolStone, 1, 6), "Pink Wool-Topped Stone");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolStone, 1, 7), "Grey Wool-Topped Stone");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolStone, 1, 8), "Light Grey Wool-Topped Stone");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolStone, 1, 9), "Cyan Wool-Topped Stone");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolStone, 1, 10), "Purple Wool-Topped Stone");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolStone, 1, 11), "Blue Wool-Topped Stone");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolStone, 1, 12), "Brown Wool-Topped Stone");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolStone, 1, 13), "Green Wool-Topped Stone");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolStone, 1, 14), "Red Wool-Topped Stone");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolStone, 1, 15), "Black Wool-Topped Stone");
        
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolWood, 1, 0), "White Wool-Topped Wood");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolWood, 1, 1), "Orange Wool-Topped Wood");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolWood, 1, 2), "Magenta Wool-Topped Wood");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolWood, 1, 3), "Light Blue Wool-Topped Wood");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolWood, 1, 4), "Yellow Wool-Topped Wood");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolWood, 1, 5), "Lime Wool-Topped Wood");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolWood, 1, 6), "Pink Wool-Topped Wood");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolWood, 1, 7), "Grey Wool-Topped Wood");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolWood, 1, 8), "Light Grey Wool-Topped Wood");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolWood, 1, 9), "Cyan Wool-Topped Wood");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolWood, 1, 10), "Purple Wool-Topped Wood");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolWood, 1, 11), "Blue Wool-Topped Wood");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolWood, 1, 12), "Brown Wool-Topped Wood");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolWood, 1, 13), "Green Wool-Topped Wood");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolWood, 1, 14), "Red Wool-Topped Wood");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.woolWood, 1, 15), "Black Wool-Topped Wood");
        
        LanguageRegistry.addName(new ItemStack(CoreBlocks.plasticBlock, 1, 0), "White Plastic Block");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.plasticBlock, 1, 1), "Orange Plastic Block");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.plasticBlock, 1, 2), "Magenta Plastic Block");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.plasticBlock, 1, 3), "Light Blue Plastic Block");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.plasticBlock, 1, 4), "Yellow Plastic Block");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.plasticBlock, 1, 5), "Lime Plastic Block");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.plasticBlock, 1, 6), "Pink Plastic Block");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.plasticBlock, 1, 7), "Grey Plastic Block");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.plasticBlock, 1, 8), "Light Grey Plastic Block");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.plasticBlock, 1, 9), "Cyan Plastic Block");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.plasticBlock, 1, 10), "Purple Plastic Block");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.plasticBlock, 1, 11), "Blue Plastic Block");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.plasticBlock, 1, 12), "Brown Plastic Block");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.plasticBlock, 1, 13), "Green Plastic Block");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.plasticBlock, 1, 14), "Red Plastic Block");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.plasticBlock, 1, 15), "Black Plastic Block");
        
        LanguageRegistry.addName(new ItemStack(CoreBlocks.floorBlocks, 1, 0), "Bathroom Tiles");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.floorBlocks, 1, 1), "Kitchen Tiles");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.floorBlocks, 1, 2), "Generic Tiles 1");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.floorBlocks, 1, 3), "Generic Tiles 2");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.floorBlocks, 1, 4), "Oak Wood Laminate");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.floorBlocks, 1, 5), "Spruce Wood Laminate");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.floorBlocks, 1, 6), "Birch Wood Laminate");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.floorBlocks, 1, 7), "Jungle Wood Laminate");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.floorBlocks, 1, 8), "");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.floorBlocks, 1, 9), "");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.floorBlocks, 1, 10), "");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.floorBlocks, 1, 11), "");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.floorBlocks, 1, 12), "");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.floorBlocks, 1, 13), "");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.floorBlocks, 1, 14), "");
        LanguageRegistry.addName(new ItemStack(CoreBlocks.floorBlocks, 1, 15), "");
        
        /*LanguageRegistry.addName(new ItemStack(FlenixCities.verticalPoster1, 1, 0), "Silvania VA");
        LanguageRegistry.addName(new ItemStack(FlenixCities.verticalPoster1, 1, 4), "Remula");
        LanguageRegistry.addName(new ItemStack(FlenixCities.verticalPoster1, 1, 8), "9");
        LanguageRegistry.addName(new ItemStack(FlenixCities.verticalPoster1, 1, 12), "13");
        
        LanguageRegistry.addName(new ItemStack(FlenixCities.verticalPoster2, 1, 0), "17");
        LanguageRegistry.addName(new ItemStack(FlenixCities.verticalPoster2, 1, 4), "21");
        LanguageRegistry.addName(new ItemStack(FlenixCities.verticalPoster2, 1, 8), "25");
        LanguageRegistry.addName(new ItemStack(FlenixCities.verticalPoster2, 1, 12), "29");
        
        LanguageRegistry.addName(new ItemStack(FlenixCities.verticalPoster3, 1, 0), "DoanVPS Poster");
        LanguageRegistry.addName(new ItemStack(FlenixCities.verticalPoster3, 1, 4), "Ad Slot 2");
        LanguageRegistry.addName(new ItemStack(FlenixCities.verticalPoster3, 1, 8), "Ad Slot 3");
        LanguageRegistry.addName(new ItemStack(FlenixCities.verticalPoster3, 1, 12), "Ad Slot 4");
        
        LanguageRegistry.addName(new ItemStack(FlenixCities.verticalPoster4, 1, 0), "Ad Slot 5");
        LanguageRegistry.addName(new ItemStack(FlenixCities.verticalPoster4, 1, 4), "Ad Slot 6");
        LanguageRegistry.addName(new ItemStack(FlenixCities.verticalPoster4, 1, 8), "Ad Slot 7");
        LanguageRegistry.addName(new ItemStack(FlenixCities.verticalPoster4, 1, 12), "Ad Slot 8");*/
    }
    
    public void addRecipes() {
    	
    }

}
