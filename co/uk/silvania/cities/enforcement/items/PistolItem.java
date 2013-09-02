package co.uk.silvania.cities.enforcement.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import co.uk.silvania.cities.enforcement.FlenixCities_Enforcement;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PistolItem extends Item {

	public PistolItem(int id) {
		super(id);
		this.setMaxStackSize(1);
		this.setCreativeTab(FlenixCities_Enforcement.tabEnforcement);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(FlenixCities_Enforcement.modid + (this.getUnlocalizedName().substring(5)));
	}
}
