package co.uk.silvania.cities.core;

import co.uk.silvania.cities.GuiHandler;
import co.uk.silvania.cities.WorldGen;
import co.uk.silvania.cities.core.items.CraftingIngredientItems;
import co.uk.silvania.city.blocks.*;
import co.uk.silvania.city.items.*;
import co.uk.silvania.city.tileentities.*;
import co.uk.silvania.city.tileentities.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.oredict.OreDictionary;
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

@Mod(modid=FlenixCities_Core.modid, name="FlenixCities", version="0.2")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class FlenixCities_Core { 
	
	public static final String modid = "flenixcities";
	
    @Instance(FlenixCities_Core.modid)
    public static FlenixCities_Core instance;
    public static GuiHandler cityGuiHandler = new GuiHandler();

    @SidedProxy(clientSide="co.uk.silvania.cities.core.client.ClientProxy", serverSide="co.uk.silvania.cities.core.CommonProxy")
    public static CommonProxy proxy;
    
	public static CreativeTabs tabCity = new CreativeTabs("tabCity") {
		public ItemStack getIconItemStack() {
			return new ItemStack(CoreBlocks.skyscraperBlocks, 1, 0);
		}
	};
			
	public static Block escalator;
	public static Block travellator;
	public static Block schoolDeskBlock;
	public static Block toiletBlock;
	public static Block keyboardBlock;
	public static Block laptopBlock;
	public static Block monitorSmall;
	public static Block monitorStandingLarge;
	public static Block monitorWallLarge;
	public static Block mouseBlock;
	public static Block mouseKeyboardBlock;
	public static Block serverRack;
	public static Block pcBlock;
	public static Block filingCabinet;
	public static Block computerTower;
	
	//public static Block verticalPoster1;
	//public static Block verticalPoster2;
	//public static Block verticalPoster3;
	//public static Block verticalPoster4;
	
	//public static Block horizontalPoster1;
	//public static Block horizontalPoster2;
	//public static Block horizontalPoster3;
	//public static Block horizontalPoster4;
	
	public static Item smallFossil;
	public static Item largeFossil;
	public static Item ancientSlab;
	public static Item crushedCan;
	public static Item crushedPlasticBottle;
	public static Item chocolateWrapper;
	public static Item emptyCrispPacket;
	public static Item wastePackaging;
	public static Item trainTicket;
	public static Item theatreTicket;
	public static Item alligatorLeather;
	public static Item baseballBat;
	public static Item baseballItem;
	public static Item americanFootball;
	public static Item tennisBall;
	public static Item soccerBall;
	public static Item tennisRacquet;
	public static Item myPhoneBlack;
	public static Item myPhoneWhite;
	public static Item myPhoneSuperBlack;
	public static Item myPhoneSuperWhite;
	
	public static WorldGen worldGen = new WorldGen();

	//And finally the worldgen
	//public static WorldGen worldGen = new WorldGen();

	@EventHandler
	public void serverStart(FMLServerStartingEvent event) {
		MinecraftServer server = MinecraftServer.getServer();
	}
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	CityConfig config = new CityConfig();
        proxy.registerRenderThings();
        proxy.registerRenderers();
    	NetworkRegistry.instance().registerGuiHandler(this, cityGuiHandler);
    	CityConfig.loadConfig(event); 
        CoreBlocks.init();
        CoreItems.init();
    	
    	//Rendered Blocks
    	escalator = new TileEntityEscalatorBlock(config.escalatorID).setUnlocalizedName("escalator");
    	travellator = new TileEntityTravellatorBlock(config.travellatorID).setUnlocalizedName("travellator");
    	schoolDeskBlock = new SchoolDeskBlock(config.schoolDeskID).setUnlocalizedName("schoolDeskBlock");
    	toiletBlock = new ToiletBlock(config.toiletID).setUnlocalizedName("toiletBlock");    	
    	keyboardBlock = new KeyboardBlock(config.keyboardBlockID).setUnlocalizedName("keyboardBlock");
    	laptopBlock = new LaptopBlock(config.laptopBlockID).setUnlocalizedName("laptopBlock");
    	monitorSmall = new MonitorSmallBlock(config.monitorSmallID).setUnlocalizedName("monitorSmall");
    	monitorStandingLarge = new MonitorStandingLargeBlock(config.monitorStandingLargeID).setUnlocalizedName("monitorStandingLarge");
    	monitorWallLarge = new MonitorWallLarge(config.monitorWallLargeID).setUnlocalizedName("monitorWallLarge");
    	mouseBlock = new MouseBlock(config.mouseBlockID).setUnlocalizedName("mouseBlock");
    	mouseKeyboardBlock = new MouseKeyboardBlock(config.mouseKeyboardBlockID).setUnlocalizedName("mouseKeyboardBlock");
    	serverRack = new ServerRackBlock(config.serverRackID).setUnlocalizedName("serverRack");
    	pcBlock = new PCBlock(config.pcBlockID).setUnlocalizedName("pcBlock");
    	
    	
    	//General Blocks
    	computerTower = new ComputerTowerBlock(config.computerTowerID).setUnlocalizedName("computerTower");
    	filingCabinet = new FilingCabinetBlock(config.filingCabinetID).setUnlocalizedName("filingCabinet");
    	
    	//Posters TODO fix
    	//verticalPoster1 = new BlockPosterVertical1(config.verticalPoster1ID).setUnlocalizedName("verticalPoster1");
    	//verticalPoster2 = new BlockPosterVertical2(config.verticalPoster2ID).setUnlocalizedName("verticalPoster2");
    	//verticalPoster3 = new BlockPosterVertical3(config.verticalPoster3ID).setUnlocalizedName("verticalPoster3");
    	//verticalPoster4 = new BlockPosterVertical4(config.verticalPoster4ID).setUnlocalizedName("verticalPoster4");
    	//horizontalPoster1 = new BlockPosterHorizontal(config.horizontalPoster1ID).setUnlocalizedName("horizontalPoster");
    	//horizontalPoster2 = new BlockPosterHorizontal(config.horizontalPoster2ID).setUnlocalizedName("horizontalPoster");
    	//horizontalPoster3 = new BlockPosterHorizontal(config.horizontalPoster3ID).setUnlocalizedName("horizontalPoster");
    	//horizontalPoster4 = new BlockPosterHorizontal(config.horizontalPoster4ID).setUnlocalizedName("horizontalPoster");
    	
    	//Generic Items
		smallFossil = new CraftingIngredientItems(config.smallFossilID, 16).setUnlocalizedName("smallFossil");
		largeFossil = new CraftingIngredientItems(config.largeFossilID, 4).setUnlocalizedName("largeFossil");
		ancientSlab = new CraftingIngredientItems(config.ancientSlabID, 1).setUnlocalizedName("ancientSlab");
		crushedCan = new CraftingIngredientItems(config.crushedCanID, 64).setUnlocalizedName("crushedCan");
		crushedPlasticBottle = new CraftingIngredientItems(config.crushedPlasticBottleID, 64).setUnlocalizedName("crushedPlasticBottle");
		chocolateWrapper = new CraftingIngredientItems(config.chocolateWrapperID, 64).setUnlocalizedName("chocolateWrapper");
		emptyCrispPacket = new CraftingIngredientItems(config.emptyCrispPacketID, 64).setUnlocalizedName("emptyCrispPacket");
		wastePackaging = new CraftingIngredientItems(config.wastePackagingID, 64).setUnlocalizedName("wastePackaging");
		trainTicket = new CraftingIngredientItems(config.trainTicketID, 64).setUnlocalizedName("trainTicket");
		theatreTicket = new CraftingIngredientItems(config.theatreTicketID, 64).setUnlocalizedName("theatreTicket");
		alligatorLeather = new CraftingIngredientItems(config.alligatorLeatherID, 64).setUnlocalizedName("alligatorLeather");
		baseballBat = new CraftingIngredientItems(config.baseballBatID, 1).setUnlocalizedName("baseballBat");
		baseballItem = new CraftingIngredientItems(config.baseballItemID, 64).setUnlocalizedName("baseballItem");
		americanFootball = new CraftingIngredientItems(config.americanFootballID, 64).setUnlocalizedName("americanFootball");
		tennisBall = new CraftingIngredientItems(config.tennisBallID, 64).setUnlocalizedName("tennisBall");
		soccerBall = new CraftingIngredientItems(config.soccerBallID, 64).setUnlocalizedName("soccerBall");
		tennisRacquet = new CraftingIngredientItems(config.tennisRacquetID, 64).setUnlocalizedName("tennisRacquet");
		myPhoneBlack = new CraftingIngredientItems(config.myPhoneBlackID, 1).setUnlocalizedName("myPhoneBlack");
		myPhoneWhite = new CraftingIngredientItems(config.myPhoneWhiteID, 1).setUnlocalizedName("myPhoneWhite");
		myPhoneSuperBlack = new CraftingIngredientItems(config.myPhoneSuperBlackID, 1).setUnlocalizedName("myPhoneSuperBlack");
		myPhoneSuperWhite = new CraftingIngredientItems(config.myPhoneSuperWhiteID, 1).setUnlocalizedName("myPhoneSuperWhite");
    }
               
    @EventHandler
    public void Init(FMLInitializationEvent event) {
        proxy.registerBlocks();
        proxy.addNames();
            
        GameRegistry.registerTileEntity(TileEntityEscalatorEntity.class, "tileEntityEscalator");
        GameRegistry.registerTileEntity(TileEntityFilingCabinet.class, "tileEntityFilingCabinet");
        GameRegistry.registerTileEntity(TileEntityKeyboard.class, "tileEntityKeyboard");
        GameRegistry.registerTileEntity(TileEntityLaptop.class, "tileEntityLaptop");
        GameRegistry.registerTileEntity(TileEntityMonitorSmall.class, "tileEntityMonitorSmall");
        GameRegistry.registerTileEntity(TileEntityMonitorStandingLarge.class, "tileEntityMonitorStandingLarge");
        GameRegistry.registerTileEntity(TileEntityMonitorWallLarge.class, "tileEntityMonitorWallLarge");
        GameRegistry.registerTileEntity(TileEntityMouse.class, "tileEntityMouse");
        GameRegistry.registerTileEntity(TileEntityMouseKeyboard.class, "tileEntityMouseKeyboard");
        GameRegistry.registerTileEntity(TileEntityPC.class, "tileEntityPC");
        GameRegistry.registerTileEntity(TileEntitySchoolDesk.class, "tileEntitySchoolDesk");
        GameRegistry.registerTileEntity(TileEntityServerRack.class, "tileEntityServerRack");
        GameRegistry.registerTileEntity(TileEntityToilet.class, "tileEntityToilet");
        GameRegistry.registerTileEntity(TileEntityTravellatorEntity.class, "tileEntityTravellator");
            
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabCity", "en_US", "Cities: Blocks");
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabItems", "en_US", "Cities: Items");
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabPosters", "en_US", "Cities: Posters");
        
        GameRegistry.registerWorldGenerator(new WorldGen());
        
        OreDictionary.registerOre("oreCopper", new ItemStack(CoreBlocks.copperOre));
        OreDictionary.registerOre("oreTin", new ItemStack(CoreBlocks.tinOre));
        OreDictionary.registerOre("oreSilver", new ItemStack(CoreBlocks.silverOre));
        OreDictionary.registerOre("oreTitanium", new ItemStack(CoreBlocks.titaniumOre));
        OreDictionary.registerOre("oreRuby", new ItemStack(CoreBlocks.rubyOre));
        OreDictionary.registerOre("oreTecmonium", new ItemStack(CoreBlocks.tecmoniumOre));
        OreDictionary.registerOre("oreCrystal", new ItemStack(CoreBlocks.crystalOre));
    }


    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	int posterRenderID = RenderingRegistry.getNextAvailableRenderId();
    	// Stub Method
    }
};