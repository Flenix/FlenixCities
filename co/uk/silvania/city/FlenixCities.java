package co.uk.silvania.city;

import co.uk.silvania.city.blocks.*;
import co.uk.silvania.city.econ.BalCommand;
import co.uk.silvania.city.items.*;
import co.uk.silvania.city.items.econ.DebitCard;
import co.uk.silvania.city.items.econ.ItemCoin1;
import co.uk.silvania.city.items.econ.ItemCoin10;
import co.uk.silvania.city.items.econ.ItemCoin100;
import co.uk.silvania.city.items.econ.ItemCoin2;
import co.uk.silvania.city.items.econ.ItemCoin25;
import co.uk.silvania.city.items.econ.ItemCoin5;
import co.uk.silvania.city.items.econ.ItemCoin50;
import co.uk.silvania.city.items.econ.ItemNote1;
import co.uk.silvania.city.items.econ.ItemNote10;
import co.uk.silvania.city.items.econ.ItemNote100;
import co.uk.silvania.city.items.econ.ItemNote2;
import co.uk.silvania.city.items.econ.ItemNote20;
import co.uk.silvania.city.items.econ.ItemNote5;
import co.uk.silvania.city.items.econ.ItemNote50;
import co.uk.silvania.city.items.econ.PrePaidCard;
import co.uk.silvania.city.tileentities.*;
import co.uk.silvania.city.tileentities.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.Mod.ServerStarting;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid="flenixcities", name="FlenixCities", version="0.1.0")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class FlenixCities { 
	
    @Instance("flenixcities")
    public static FlenixCities instance;
    public static GuiHandler roadsGuiHandler = new GuiHandler();

    @SidedProxy(clientSide="co.uk.silvania.city.client.ClientProxy", serverSide="co.uk.silvania.city.CommonProxy")
    public static CommonProxy proxy;
    
	public static CreativeTabs tabCity = new CreativeTabs("tabCity") {
		public ItemStack getIconItemStack() {
			return new ItemStack(Block.cake, 1, 0);
		}
	};
	
	public static CreativeTabs tabEcon = new CreativeTabs("tabEcon") {
		public ItemStack getIconItemStack() {
			return new ItemStack(FlenixCities.coin100, 1, 0);
		}
	};
			
	public static Block escalator;
	public static Block atmBlock;
	public static Block travellator;
	public static Block fridgeBlock;
	public static Block largeFridgeBlock;
	public static Block floatingShelvesBlock;
	public static Block schoolDeskBlock;
	public static Block toiletBlock;
	
	public static Block rubyOre;
	public static Block silverOre;
	public static Block tecmoniumOre;
	public static Block titaniumOre;
	public static Block skyscraperBlocks;
	public static Block stainedGlass;
	public static Block stainedGlassLit;
	public static Block streetBlocks;
	public static Block styledGlass;
	public static Block styledGlassLit;
	public static Block woolCeilingTile;
	public static Block woolStone;
	public static Block woolWood;
	
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
	public static Item prePaidCard;
	public static Item debitCard;
	
	public static Item heroinItem;
	
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

	//And finally the worldgen
	//public static WorldGen worldGen = new WorldGen();

	@EventHandler
	public void serverStart(FMLServerStartingEvent event) {
		MinecraftServer server = MinecraftServer.getServer();
		ICommandManager command = server.getCommandManager();
		ServerCommandManager serverCommand = ((ServerCommandManager) command);
		serverCommand.registerCommand(new BalCommand());
	}
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	CityConfig config = new CityConfig();
        proxy.registerRenderThings();
    	NetworkRegistry.instance().registerGuiHandler(this, roadsGuiHandler);
    	CityConfig.loadConfig(event); 
    	
    	//Rendered Blocks
    	escalator = new TileEntityEscalatorBlock(config.escalatorID).setUnlocalizedName("escalator");
    	travellator = new TileEntityTravellatorBlock(config.travellatorID).setUnlocalizedName("travellator");
    	atmBlock = new TileEntityATMBlock(config.atmID).setUnlocalizedName("atmBlock");
    	fridgeBlock = new FridgeBlock(config.fridgeID).setUnlocalizedName("fridgeBlock");
    	largeFridgeBlock = new LargeFridgeBlock(config.largeFridgeID).setUnlocalizedName("largeFridgeBlock");
    	schoolDeskBlock = new SchoolDeskBlock(config.schoolDeskID).setUnlocalizedName("schoolDeskBlock");
    	floatingShelvesBlock = new FloatingShelvesBlock(config.floatingShelvesID).setUnlocalizedName("floatingShelvesBlock");
    	toiletBlock = new ToiletBlock(config.toiletID).setUnlocalizedName("toiletBlock");
    	
    	//Adult Mode Stuff
    	if (CityConfig.isAdultMode == true) {
    		heroinItem = new HeroinItem(config.heroinItemID).setUnlocalizedName("heroinItem");
    	}
    	
    	//General Blocks
    	rubyOre = new RubyOre(config.rubyOreID).setUnlocalizedName("rubyOre");
    	silverOre = new SilverOre(config.silverOreID).setUnlocalizedName("silverOre");
    	tecmoniumOre = new TecmoniumOre(config.tecmoniumOreID).setUnlocalizedName("tecmoniumOre");
    	titaniumOre = new TitaniumOre(config.titaniumOreID).setUnlocalizedName("titaniumOre");
    	skyscraperBlocks = new SkyscraperBlocks(config.skyscraperBlocksID).setUnlocalizedName("skyscraperBlocks");
    	stainedGlass = new StainedGlass(config.stainedGlassID).setUnlocalizedName("stainedGlass");
    	stainedGlassLit = new StainedGlassLit(config.stainedGlassLitID).setUnlocalizedName("stainedGlassLit");
    	streetBlocks = new StreetBlocks(config.streetBlocksID).setUnlocalizedName("streetBlocks");
    	styledGlass = new StyledGlass(config.styledGlassID).setUnlocalizedName("styledGlass");
    	styledGlassLit = new StyledGlassLit(config.styledGlassLitID).setUnlocalizedName("styledGlassLit");
    	woolCeilingTile = new WoolCeilingTile(config.woolCeilingTileID).setUnlocalizedName("woolCeilingTile");
    	woolStone = new WoolStone(config.woolStoneID).setUnlocalizedName("woolStone");
    	woolWood = new WoolWood(config.woolWoodID).setUnlocalizedName("woolWood");
    	
    	//Economy Items
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
    	prePaidCard = new PrePaidCard(config.prePaidCardID).setUnlocalizedName("prePaidCard");
    	debitCard = new DebitCard(config.debitCardID).setUnlocalizedName("debitCard");    
    	
    	//Food/Drinks:
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
               
    @EventHandler
    public void Init(FMLInitializationEvent event) {        
        proxy.registerBlocks();
        proxy.addNames();    
    	
    	/*@ServerStarting
    	public void serverLoad(FMLServerStartingEvent event) {
    		event.registerServerCommand(new BalCommand());
    	}*/
            
            GameRegistry.registerTileEntity(TileEntityEscalatorEntity.class, "tileEntityEscalator");
            GameRegistry.registerTileEntity(TileEntityATMEntity.class, "tileEntityATM");
            GameRegistry.registerTileEntity(TileEntityTravellatorEntity.class, "tileEntityTravellator");
            GameRegistry.registerTileEntity(TileEntityFridge.class, "tileEntityFridge");
            GameRegistry.registerTileEntity(TileEntityFridgeLarge.class, "tileEntityFridgeLarge");
            GameRegistry.registerTileEntity(TileEntitySchoolDesk.class, "tileEntitySchoolDesk");
            GameRegistry.registerTileEntity(TileEntityFloatingShelves.class, "tileEntityFloatingShelves");
            GameRegistry.registerTileEntity(TileEntityToilet.class, "tileEntityToilet");
            
            //LiquidContainerRegistry.registerLiquid(new LiquidContainerData(new LiquidStack(FlenixCities.roadsTarStill, LiquidContainerRegistry.BUCKET_VOLUME), new ItemStack(FlenixCities.tarBucketItem), new ItemStack(Item.bucketEmpty)));
            LanguageRegistry.instance().addStringLocalization("itemGroup.tabCity", "en_US", "Cities: Blocks");
            LanguageRegistry.instance().addStringLocalization("itemGroup.tabEcon", "en_US", "Cities: Economy");
        }


    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	// Stub Method
    }
};