package co.uk.silvania.city.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class CityFoods extends ItemFood {

	public CityFoods(int id, int heal, float sat, boolean wolf) {
		super(id, heal, sat, wolf);
		this.setCreativeTab(CreativeTabs.tabFood);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("FlenixCities:" + (this.getUnlocalizedName().substring(5)));
	}
}