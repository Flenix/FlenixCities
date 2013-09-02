package co.uk.silvania.cities.enforcement;

import co.uk.silvania.cities.enforcement.items.*;
import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;

public class FCEn_Items {
	private static EnforcementConfig config;
	
	public static Item weedItem;
	public static Item tobaccoItem;
	public static Item rollingPaper;
	public static Item syringeItem;
	public static Item needleItem;
	public static Item groundPoppy;
	public static Item cigaretteItem;
	public static Item cocaineItem;
	public static Item extacyItem;
	public static Item heroinItem;
	public static Item jointItem;
	
	public static Item smallBulletCasing;
	public static Item medBulletCasing;
	public static Item largeBulletCasing;
	public static Item gunBarrel;
	public static Item gunMagazine;
	public static Item gunTriggerMechanism;
	public static Item gunStock;
	public static Item gunPump;
	public static Item spentShotgunRound;
	
	public static Item assaultRifleAmmo;
	public static Item assaultRifle;
	public static Item batonItem;
	public static Item pistolAmmo;
	public static Item pistolItem;
	public static Item shotgunAmmo;
	public static Item shotgunItem;
	public static Item tazerItem;
	
	public static void init() {
		initDrugs();
		initWeapons();
	}
	
	public static void initDrugs() {
		heroinItem = new HeroinItem(config.heroinItemID).setUnlocalizedName("heroinItem");
		tobaccoItem = new FCEn_MiscItems(config.tobaccoItemID, 64).setUnlocalizedName("tobaccoItem");
		rollingPaper = new FCEn_MiscItems(config.rollingPaperID, 64).setUnlocalizedName("rollingPaper");
		syringeItem = new FCEn_MiscItems(config.syringeItemID, 64).setUnlocalizedName("syringeItem");
		needleItem = new FCEn_MiscItems(config.needleItemID, 64).setUnlocalizedName("needleItem");
		weedItem = new FCEn_MiscItems(config.weedItemID, 64).setUnlocalizedName("weedItem");
		groundPoppy = new FCEn_MiscItems(config.groundPoppyID, 64).setUnlocalizedName("groundPoppy");
		cigaretteItem = new CigaretteItem(config.cigaretteItemID).setUnlocalizedName("cigaretteItem");
		cocaineItem = new CocaineItem(config.cocaineItemID).setUnlocalizedName("cocaineItem");
		extacyItem = new ExtacyItem(config.extacyItemID).setUnlocalizedName("extacyItem");
		jointItem = new JointItem(config.jointItemID).setUnlocalizedName("jointItem");
	}
	
	public static void initWeapons() {
    	smallBulletCasing = new FCEn_MiscItems(config.smallBulletCasingID, 64).setUnlocalizedName("smallBulletCasing");
    	medBulletCasing = new FCEn_MiscItems(config.medBulletCasingID, 64).setUnlocalizedName("medBulletCasing");
    	largeBulletCasing = new FCEn_MiscItems(config.largeBulletCasingID, 64).setUnlocalizedName("largeBulletCasing");
    	gunBarrel = new FCEn_MiscItems(config.gunBarrelID, 1).setUnlocalizedName("gunBarrel");
    	gunMagazine = new FCEn_MiscItems(config.gunMagazineID, 1).setUnlocalizedName("gunMagazine");
    	gunTriggerMechanism = new FCEn_MiscItems(config.gunTriggerMechanismID, 1).setUnlocalizedName("gunTriggerMechanism");
    	gunStock = new FCEn_MiscItems(config.gunStockID, 1).setUnlocalizedName("gunStock");
		gunPump = new FCEn_MiscItems(config.gunPumpID, 1).setUnlocalizedName("gunPump");
		spentShotgunRound = new FCEn_MiscItems(config.spentShotgunRoundID, 64).setUnlocalizedName("spentShotgunRound");
		assaultRifleAmmo = new AssaultRifleAmmoItem(config.assaultRifleAmmoID).setUnlocalizedName("assaultRifleAmmoItem");
		assaultRifle = new AssaultRifleItem(config.assaultRifleID).setUnlocalizedName("assaultRifleItem");
		batonItem = new BatonItem(config.batonItemID, EnumToolMaterial.WOOD).setUnlocalizedName("batonItem");
		pistolAmmo = new PistolAmmoItem(config.pistolAmmoID).setUnlocalizedName("pistolAmmoItem");
		pistolItem = new PistolItem(config.pistolItemID).setUnlocalizedName("pistolItem");
		shotgunAmmo = new ShotgunAmmoItem(config.shotgunAmmoID).setUnlocalizedName("shotgunAmmoItem");
		shotgunItem = new ShotgunItem(config.shotgunItemID).setUnlocalizedName("shotgunItem");
		tazerItem = new TazerItem(config.tazerItemID).setUnlocalizedName("tazerItem");
	}
}
