package co.uk.silvania.cities.enforcement;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class EnforcementConfig {
	
	public static int weedItemID;
	public static int groundPoppyID;
	public static int tobaccoItemID;
	public static int rollingPaperID;
	public static int syringeItemID;
	public static int needleItemID;
	public static int cigaretteItemID;
	public static int cocaineItemID;
	public static int extacyItemID;
	public static int heroinItemID;
	public static int jointItemID;
		
	public static int smallBulletCasingID;
	public static int medBulletCasingID;
	public static int largeBulletCasingID;
	public static int gunBarrelID;
	public static int gunMagazineID;
	public static int gunTriggerMechanismID;
	public static int gunStockID;
	public static int gunPumpID;
	public static int spentShotgunRoundID;
	
	public static int assaultRifleAmmoID;
	public static int assaultRifleID;
	public static int batonItemID;
	public static int pistolAmmoID;
	public static int pistolItemID;
	public static int shotgunAmmoID;
	public static int shotgunItemID;
	public static int tazerItemID;
	
	public static void loadConfig(FMLPreInitializationEvent event) {
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		
		config.load();
		smallBulletCasingID = config.getItem("Small Bullet Casing", 18050).getInt();
		medBulletCasingID = config.getItem("Med Bullet Casing", 18051).getInt();
		largeBulletCasingID = config.getItem("Large Bullet Casing", 18052).getInt();
		gunBarrelID = config.getItem("Gun Barrel", 18053).getInt();
		gunMagazineID = config.getItem("Gun Mag", 18054).getInt();
		gunTriggerMechanismID = config.getItem("Gun Trigger Mech", 18055).getInt();
		gunStockID = config.getItem("Gun Stock", 18056).getInt();
		gunPumpID = config.getItem("Gun Pump", 18057).getInt();
		spentShotgunRoundID = config.getItem("Empty Shotgun Shell", 18061).getInt();
		
		assaultRifleAmmoID = config.getItem("Assault Rifle Ammo", 18075).getInt();
		assaultRifleID = config.getItem("Assault Rifle", 18076).getInt();
		batonItemID = config.getItem("Baton", 18077).getInt();
		pistolAmmoID = config.getItem("Pistol Ammo", 18078).getInt();
		pistolItemID = config.getItem("Pistol", 18079).getInt();
		shotgunAmmoID = config.getItem("Shotgun Ammo", 18080).getInt();
		shotgunItemID = config.getItem("Shotgun", 18081).getInt();
		tazerItemID = config.getItem("Tazer", 18082).getInt();
		
		heroinItemID = config.getItem("Heroin", 18100).getInt();
		weedItemID = config.getItem("Weed", 18101).getInt();
		groundPoppyID = config.getItem("Ground Poppy", 18102).getInt();
		tobaccoItemID = config.getItem("Tobacco", 18103).getInt();
		rollingPaperID = config.getItem("Rolling Paper", 18104).getInt();
		syringeItemID = config.getItem("Syringe", 18105).getInt();
		needleItemID = config.getItem("Needle", 18106).getInt();
		cigaretteItemID = config.getItem("Cigarette", 18107).getInt();
		cocaineItemID = config.getItem("Cocaine", 18108).getInt();
		extacyItemID = config.getItem("Extacy", 18109).getInt();
		jointItemID = config.getItem("Joint", 18110).getInt();
		config.save();
	}
}
