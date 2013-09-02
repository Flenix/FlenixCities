package co.uk.silvania.cities.core;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CityConfig {
	
    private String value;
	
	public static int escalatorID;
	public static int travellatorID;
	public static int schoolDeskID;
	public static int toiletID;
	public static int keyboardBlockID;
	public static int laptopBlockID;
	public static int monitorSmallID;
	public static int monitorStandingLargeID;
	public static int monitorWallLargeID;
	public static int mouseBlockID;
	public static int mouseKeyboardBlockID;
	public static int serverRackID;
	public static int pcBlockID;
	public static int filingCabinetID;
	public static int floorBlocksID;
	
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
	public static int copperOreID;
	public static int tinOreID;
	public static int crystalOreID;
	public static int plasticBlockID;
	public static int computerTowerID;
	
	public static int verticalPoster1ID;
	public static int verticalPoster2ID;
	public static int verticalPoster3ID;
	public static int verticalPoster4ID;
	public static int horizontalPoster1ID;
	public static int horizontalPoster2ID;
	public static int horizontalPoster3ID;
	public static int horizontalPoster4ID;
	
	public static int plasticItemID;
	public static int smallPCBID;
	public static int largePCBID;
	public static int smallFossilID;
	public static int largeFossilID;
	public static int ancientSlabID;
	public static int crushedCanID;
	public static int crushedPlasticBottleID;
	public static int chocolateWrapperID;
	public static int emptyCrispPacketID;
	public static int wastePackagingID;
	public static int rubyItemID;
	public static int titaniumIngotID;
	public static int tecmoniumIngotID;
	public static int silverIngotID;
	public static int copperIngotID;
	public static int tinIngotID;
	public static int trainTicketID;
	public static int theatreTicketID;
	public static int alligatorLeatherID;
	public static int baseballBatID;
	public static int baseballItemID;
	public static int americanFootballID;
	public static int tennisBallID;
	public static int soccerBallID;
	public static int tennisRacquetID;
	public static int myPhoneBlackID;
	public static int myPhoneWhiteID;
	public static int myPhoneSuperBlackID;
	public static int myPhoneSuperWhiteID;
	
	public static boolean isAdultMode;
	public static boolean generateCopper;
	public static boolean generateTin;
	public static boolean generateSilver;
	public static boolean generateTitanium;
	public static boolean generateRuby;
	
	
	public static void loadConfig(FMLPreInitializationEvent event) {
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		
		config.load();
		
		escalatorID = config.getBlock("Escalator", 1400).getInt();
		travellatorID = config.getBlock("Travellator", 1401).getInt();
		schoolDeskID = config.getBlock("School Desk", 1420).getInt();
		toiletID = config.getBlock("Toilet", 1419).getInt();
		keyboardBlockID = config.getBlock("Keyboard", 1427).getInt();
		laptopBlockID = config.getBlock("Laptop", 1428).getInt();
		monitorSmallID = config.getBlock("Monitor (Small)", 1429).getInt();
		monitorStandingLargeID = config.getBlock("Monitor (Large)", 1430).getInt();
		monitorWallLargeID = config.getBlock("Monitor (Large, Wall)", 1431).getInt();
		mouseBlockID = config.getBlock("Mouse", 1432).getInt();
		mouseKeyboardBlockID = config.getBlock("Mouse/Keyboard", 1433).getInt();
		serverRackID = config.getBlock("Server Rack", 1434).getInt();
		pcBlockID = config.getBlock("Personal Computer", 1435).getInt();
		filingCabinetID = config.getBlock("Filing Cabinet", 1436).getInt();
		
		rubyOreID = config.getBlock("Ruby Ore", 1403).getInt();
		silverOreID = config.getBlock("Silver Ore", 1404).getInt();
		tecmoniumOreID = config.getBlock("Tecmonium Ore", 1405).getInt();
		titaniumOreID = config.getBlock("Titanium Ore", 1406).getInt();
		skyscraperBlocksID = config.getBlock("Skyscraper Blocks", 1421).getInt();
		stainedGlassID = config.getBlock("Stained Glass", 1416).getInt();
		stainedGlassLitID = config.getBlock("Stained Glass Lit", 1417).getInt();
		streetBlocksID = config.getBlock("Street Blocks", 1422).getInt();
		styledGlassID = config.getBlock("Styled Glass", 1411).getInt();
		styledGlassLitID = config.getBlock("Styled Glass Lit", 1412).getInt();
		woolCeilingTileID = config.getBlock("Wool Ceiling Tile", 1413).getInt();
		woolStoneID = config.getBlock("Wool Stone", 1414).getInt();
		woolWoodID = config.getBlock("Wool Wood", 1415).getInt();
		copperOreID = config.getBlock("Copper Ore", 1407).getInt();
		tinOreID = config.getBlock("Tin Ore", 1408).getInt();
		crystalOreID = config.getBlock("Crystal Ore", 1409).getInt();
		plasticBlockID = config.getBlock("Plastic Block", 1424).getInt();
		computerTowerID = config.getBlock("Computer Tower", 1425).getInt();
		floorBlocksID = config.getBlock("Floor Blocks", 1440).getInt();
		
		verticalPoster1ID = config.getBlock("Vertical Poster 1", 1441).getInt();
		verticalPoster2ID = config.getBlock("Vertical Poster 2", 1442).getInt();
		verticalPoster3ID = config.getBlock("Vertical Poster 3", 1443).getInt();
		verticalPoster4ID = config.getBlock("Vertical Poster 4", 1444).getInt();
		horizontalPoster1ID = config.getBlock("Horizontal Poster 1", 1445).getInt();
		horizontalPoster2ID = config.getBlock("Horizontal Poster 2", 1446).getInt();
		horizontalPoster3ID = config.getBlock("Horizontal Poster 3", 1447).getInt();
		horizontalPoster4ID = config.getBlock("Horizontal Poster 4", 1448).getInt();
				
		plasticItemID = config.getItem("Plastic", 18058).getInt();
		smallPCBID = config.getItem("Small PCB", 18059).getInt();
		largePCBID = config.getItem("Large PCB", 18060).getInt();
		smallFossilID = config.getItem("Small Fossil", 18062).getInt();
		largeFossilID = config.getItem("Large Fossil", 18063).getInt();
		ancientSlabID = config.getItem("Ancient Slab", 18068).getInt();
		crushedCanID = config.getItem("Crushed Can", 18069).getInt();
		crushedPlasticBottleID = config.getItem("Crushed Plastic Bottle", 18070).getInt();
		chocolateWrapperID = config.getItem("Chocolate Wrapper", 18071).getInt();
		emptyCrispPacketID = config.getItem("Empty Crisp Packet", 18072).getInt();
		wastePackagingID = config.getItem("Waste Packaging", 18073).getInt();
		rubyItemID = config.getItem("Ruby Item", 18074).getInt();
		titaniumIngotID = config.getItem("Titanium Ingot", 18075).getInt();
		tecmoniumIngotID = config.getItem("Tecmonium Ingot", 18076).getInt();
		silverIngotID = config.getItem("Silver Ingot", 18077).getInt();
		copperIngotID = config.getItem("Copper Ingot", 18078).getInt();
		tinIngotID = config.getItem("Tin Ingot", 18079).getInt();
		trainTicketID = config.getItem("Train Ticket", 18080).getInt();
		theatreTicketID = config.getItem("Theatre Ticket", 18081).getInt();
		alligatorLeatherID = config.getItem("Alligator Leather", 18082).getInt();
		baseballBatID = config.getItem("Baseball Bat", 18083).getInt();
		baseballItemID = config.getItem("Baseball", 18084).getInt();
		americanFootballID = config.getItem("American Football", 18085).getInt();
		tennisBallID = config.getItem("Tennis Ball", 18086).getInt();
		soccerBallID = config.getItem("Soccer Ball", 18087).getInt();
		tennisRacquetID = config.getItem("Tennis Racquet", 18088).getInt();
		myPhoneBlackID = config.getItem("myPhone Black", 18089).getInt();
		myPhoneWhiteID = config.getItem("myPhone White", 18090).getInt();
		myPhoneSuperBlackID = config.getItem("myPhone Super Black", 18091).getInt();
		myPhoneSuperWhiteID = config.getItem("myPhone Super White", 18092).getInt();
			
		isAdultMode = config.get(Configuration.CATEGORY_GENERAL, "isAdultMode", false).getBoolean(false);
		generateCopper = config.get(Configuration.CATEGORY_GENERAL, "generateCopper", true).getBoolean(true);
		generateTin = config.get(Configuration.CATEGORY_GENERAL, "generateTin", true).getBoolean(true);
		generateTitanium = config.get(Configuration.CATEGORY_GENERAL, "generateTitanium", true).getBoolean(true);
		generateSilver = config.get(Configuration.CATEGORY_GENERAL, "generateSilver", true).getBoolean(true);
		generateRuby = config.get(Configuration.CATEGORY_GENERAL, "generateRuby", true).getBoolean(true);		
		config.save();
	}

}
