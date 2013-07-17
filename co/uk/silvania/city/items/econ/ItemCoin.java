package co.uk.silvania.city.items.econ;

import co.uk.silvania.city.FlenixCities;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public abstract class ItemCoin extends Item {

    public double moneyValue;

    public ItemCoin(int id) {
        super(id);
        this.setMaxStackSize(50);
        this.setCreativeTab(FlenixCities.tabEcon);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public abstract void registerIcons(IconRegister iconRegister);

    public abstract double getMoneyValue();

}
