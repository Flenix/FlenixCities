package co.uk.silvania.city;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class CommonProxy {
	
    public void registerRenderThings() {
    }
    
    public void registerBlocks() {
        GameRegistry.registerBlock(FlenixCities.escalator, "escalator");
        GameRegistry.registerBlock(FlenixCities.atmBlock, "atmBlock");
        GameRegistry.registerBlock(FlenixCities.travellator, "travellator");
        
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
    }
    
    public void addNames() {
        LanguageRegistry.addName(FlenixCities.escalator, "Escalator");
        LanguageRegistry.addName(FlenixCities.travellator, "Travellator");
        LanguageRegistry.addName(FlenixCities.atmBlock, "ATM");
        
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
