package co.uk.silvania.cities.enforcement.items;

import co.uk.silvania.cities.enforcement.FlenixCities_Enforcement;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class FCEn_MiscItems extends Item {

	public FCEn_MiscItems(int id, int stack) {
		super(id);
		//this.setCreativeTab(FlenixCities_Core.tabItems);
		this.maxStackSize = stack;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(FlenixCities_Enforcement.modid + (this.getUnlocalizedName().substring(5)));
	}
}