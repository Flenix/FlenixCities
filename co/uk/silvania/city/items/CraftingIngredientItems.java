package co.uk.silvania.city.items;

import co.uk.silvania.city.FlenixCities;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class CraftingIngredientItems extends Item {

	public CraftingIngredientItems(int id, int stack) {
		super(id);
		this.setCreativeTab(FlenixCities.tabItems);
		this.maxStackSize = stack;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("FlenixCities:" + (this.getUnlocalizedName().substring(5)));
	}
}