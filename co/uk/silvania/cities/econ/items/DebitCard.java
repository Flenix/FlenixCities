package co.uk.silvania.cities.econ.items;

import co.uk.silvania.cities.econ.FlenixCities_Econ;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class DebitCard extends Item {

	public DebitCard(int id) {
		super(id);
		this.setMaxStackSize(1);
		this.setCreativeTab(FlenixCities_Econ.tabEcon);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon("flenixcities:DebitCard");
	}
}