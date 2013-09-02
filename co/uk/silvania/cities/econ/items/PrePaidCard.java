package co.uk.silvania.cities.econ.items;

import co.uk.silvania.cities.econ.FlenixCities_Econ;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class PrePaidCard extends Item {

	public PrePaidCard(int id) {
		super(id);
		this.setMaxStackSize(1);
		this.setCreativeTab(FlenixCities_Econ.tabEcon);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon("flenixcities:PrePaidCard");
	}
}
