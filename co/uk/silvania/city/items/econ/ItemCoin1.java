package co.uk.silvania.city.items.econ;

import co.uk.silvania.city.FlenixCities;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;

public class ItemCoin1 extends ItemCoin {

	public ItemCoin1(int id) {
		super(id);
		this.setMaxStackSize(50);
		this.setCreativeTab(FlenixCities.tabEcon);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon("flenixcities:Coin1");
	}

    @Override
    public double getMoneyValue() {
        return 0.01;
    }
}
