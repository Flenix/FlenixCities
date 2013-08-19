/*package co.uk.silvania.city.common;

import co.uk.silvania.city.FlenixCities;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public enum EnumCityTools {
    PLASTIC(0, 59, 2.0F, 0.0F, 15),
    CERAMIC(1, 131, 4.0F, 1.0F, 5),

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiencyOnProperMaterial;
    private final float damageVsEntity;
    private final int enchantability;
    public Item customCraftingMaterial = null;

    private EnumCityTools(int par3, int par4, float par5, float par6, int par7) {
        //this.harvestLevel = par3;
        this.maxUses = par4;
        this.efficiencyOnProperMaterial = par5;
        this.damageVsEntity = par6;
        this.enchantability = par7;
    }

    public int getMaxUses() {
        return this.maxUses;
    }

    public float getEfficiencyOnProperMaterial() {
        return this.efficiencyOnProperMaterial;
    }

    public float getDamageVsEntity() {
        return this.damageVsEntity;
    }

    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public int getToolCraftingMaterial() {
        switch (this) {
            case PLASTIC:    return FlenixCities.plasticItem.itemID;
            case CERAMIC:   return Block.cobblestone.blockID;
            default:      return (customCraftingMaterial == null ? 0 : customCraftingMaterial.itemID);
        }
    }
}*/
