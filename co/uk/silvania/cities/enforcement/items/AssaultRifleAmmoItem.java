package co.uk.silvania.cities.enforcement.items;

import co.uk.silvania.cities.enforcement.FlenixCities_Enforcement;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class AssaultRifleAmmoItem extends Item {

	public AssaultRifleAmmoItem(int par1) {
		super(par1);
		this.setMaxStackSize(1);
		this.setCreativeTab(FlenixCities_Enforcement.tabEnforcement);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(FlenixCities_Enforcement.modid + (this.getUnlocalizedName().substring(5)));
	}
}
