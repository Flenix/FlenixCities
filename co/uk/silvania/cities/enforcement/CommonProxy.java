package co.uk.silvania.cities.enforcement;

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
     	GameRegistry.registerItem(FCEn_Items.heroinItem, "heroinItem");
    	GameRegistry.registerItem(FCEn_Items.groundPoppy, "groundPoppy");
    	
    	GameRegistry.registerItem(FCEn_Items.smallBulletCasing, "smallBulletCasing");
    	GameRegistry.registerItem(FCEn_Items.medBulletCasing, "medBulletCasing");
    	GameRegistry.registerItem(FCEn_Items.largeBulletCasing, "largeBulletCasing");
    	GameRegistry.registerItem(FCEn_Items.gunBarrel, "gunBarrel");
    	GameRegistry.registerItem(FCEn_Items.gunMagazine, "gunMagazine");
    	GameRegistry.registerItem(FCEn_Items.gunTriggerMechanism, "gunTriggerMechanism");
    	GameRegistry.registerItem(FCEn_Items.gunStock, "gunStock");
    	GameRegistry.registerItem(FCEn_Items.gunPump, "gunPump");    	
    	GameRegistry.registerItem(FCEn_Items.spentShotgunRound, "spentShotgunRound");
    }
    
    public void addNames() {
    	LanguageRegistry.addName(FCEn_Items.heroinItem, "Heroin");
    	LanguageRegistry.addName(FCEn_Items.tobaccoItem, "Tobacco");
    	LanguageRegistry.addName(FCEn_Items.rollingPaper, "Rolling Papers");
    	LanguageRegistry.addName(FCEn_Items.syringeItem, "Syringe");
    	LanguageRegistry.addName(FCEn_Items.needleItem, "Needle");
    	LanguageRegistry.addName(FCEn_Items.weedItem, "Weed (Fresh)");
    	
    	LanguageRegistry.addName(FCEn_Items.smallBulletCasing, "Small Bullet Casing");
    	LanguageRegistry.addName(FCEn_Items.medBulletCasing, "Medium Bullet Casing");
    	LanguageRegistry.addName(FCEn_Items.largeBulletCasing, "Large Bullet Casing");
    	LanguageRegistry.addName(FCEn_Items.gunBarrel, "Gun Barrel");
    	LanguageRegistry.addName(FCEn_Items.gunMagazine, "Gun Magazine");
    	LanguageRegistry.addName(FCEn_Items.gunTriggerMechanism, "Gun Trigger Mechanism");
    	LanguageRegistry.addName(FCEn_Items.gunStock, "Gun Stock");
    	LanguageRegistry.addName(FCEn_Items.gunPump, "Gun Pump");
    	LanguageRegistry.addName(FCEn_Items.groundPoppy, "Ground Poppy");
    	LanguageRegistry.addName(FCEn_Items.spentShotgunRound, "Shotgun Shell (Used)");
    	
    }
    
    public void addRecipes() {
    	
    }

}
