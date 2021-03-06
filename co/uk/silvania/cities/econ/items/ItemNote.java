package co.uk.silvania.cities.econ.items;

import co.uk.silvania.cities.econ.FlenixCities_Econ;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public abstract class ItemNote extends Item {

    public ItemNote(int id) {
        super(id);
        this.setMaxStackSize(50);
        this.setCreativeTab(FlenixCities_Econ.tabEcon);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public abstract void registerIcons(IconRegister iconRegister);

    public abstract double getMoneyValue();

}