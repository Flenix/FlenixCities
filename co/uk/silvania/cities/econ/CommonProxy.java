package co.uk.silvania.cities.econ;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import co.uk.silvania.cities.econ.blocks.ItemATMBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class CommonProxy {
	
    public void registerRenderThings() {
    }
    
    public void registerRenderers() {
    }
    
    public void registerBlocks() {
        GameRegistry.registerBlock(FCE_Blocks.atmBlock, ItemATMBlock.class, "FlenixCities" + (FCE_Blocks.atmBlock.getUnlocalizedName().substring(5)));
        GameRegistry.registerBlock(FCE_Blocks.floatingShelvesBlock, "floatingShelvesBlock");

        GameRegistry.registerItem(FCE_Items.coin1, "coin1");
        GameRegistry.registerItem(FCE_Items.coin2, "coin2");
        GameRegistry.registerItem(FCE_Items.coin5, "coin5");
        GameRegistry.registerItem(FCE_Items.coin10, "coin10");
        GameRegistry.registerItem(FCE_Items.coin25, "coin25");
        GameRegistry.registerItem(FCE_Items.coin50, "coin50");
        GameRegistry.registerItem(FCE_Items.coin100, "coin100");
        GameRegistry.registerItem(FCE_Items.note100, "note100");
        GameRegistry.registerItem(FCE_Items.note500, "note500");
        GameRegistry.registerItem(FCE_Items.note1000, "note1000");
        GameRegistry.registerItem(FCE_Items.note2000, "note2000");
        GameRegistry.registerItem(FCE_Items.note5000, "note5000");
        GameRegistry.registerItem(FCE_Items.note10000, "note10000");
        GameRegistry.registerItem(FCE_Items.debitCard, "debitCard");

    	GameRegistry.registerItem(FCE_Items.ringItem, "ringItem");
    	GameRegistry.registerItem(FCE_Items.diamondRing, "diamondRing");
    	GameRegistry.registerItem(FCE_Items.necklaceItem, "necklaceItem");
    	GameRegistry.registerItem(FCE_Items.rubyNecklace, "rubyNecklace");
    }
    
    public void addNames() {
        LanguageRegistry.addName(FCE_Blocks.floatingShelvesBlock, "Floating Shelves");
        LanguageRegistry.addName(new ItemStack(FCE_Blocks.atmBlock, 1, 0), "ATM Stone");
        LanguageRegistry.addName(new ItemStack(FCE_Blocks.atmBlock, 1, 4), "ATM Stone Brick");
        LanguageRegistry.addName(new ItemStack(FCE_Blocks.atmBlock, 1, 8), "ATM City White");
        LanguageRegistry.addName(new ItemStack(FCE_Blocks.atmBlock, 1, 12), "ATM City Grey");
        
    	LanguageRegistry.addName(FCE_Items.ringItem, "Ring");
    	LanguageRegistry.addName(FCE_Items.diamondRing, "Diamond Ring");
    	LanguageRegistry.addName(FCE_Items.necklaceItem, "Necklace");
    	LanguageRegistry.addName(FCE_Items.rubyNecklace, "Ruby Necklace");

        LanguageRegistry.addName(FCE_Items.coin1, "1 " + EconConfig.currencySmall);
        LanguageRegistry.addName(FCE_Items.coin2, "2 " + EconConfig.currencySmallPlural);
        LanguageRegistry.addName(FCE_Items.coin5, "5 " + EconConfig.currencySmallPlural);
        LanguageRegistry.addName(FCE_Items.coin10, "10 " + EconConfig.currencySmallPlural);
        LanguageRegistry.addName(FCE_Items.coin25, "25 " + EconConfig.currencySmallPlural);
        LanguageRegistry.addName(FCE_Items.coin50, "50 " + EconConfig.currencySmallPlural);
        LanguageRegistry.addName(FCE_Items.coin100, "1 " + EconConfig.currencyLarge + " Coin");
        LanguageRegistry.addName(FCE_Items.note100, "1 " + EconConfig.currencyLarge);
        LanguageRegistry.addName(FCE_Items.note500, "5 " + EconConfig.currencyLargePlural);
        LanguageRegistry.addName(FCE_Items.note1000, "10 " + EconConfig.currencyLargePlural);
        LanguageRegistry.addName(FCE_Items.note2000, "20 " + EconConfig.currencyLargePlural);
        LanguageRegistry.addName(FCE_Items.note5000, "50 " + EconConfig.currencyLargePlural);
        LanguageRegistry.addName(FCE_Items.note10000, "100 " + EconConfig.currencyLargePlural);
        LanguageRegistry.addName(FCE_Items.debitCard, "Debit Card");
    }
    
    public void addRecipes() {
    	
    }

}
