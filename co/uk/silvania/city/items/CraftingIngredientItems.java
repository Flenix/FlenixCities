package co.uk.silvania.city.items;

import co.uk.silvania.city.FlenixCities;
import net.minecraft.item.Item;

public class CraftingIngredientItems extends Item {

	public CraftingIngredientItems(int id, int stack) {
		super(id);
		this.setCreativeTab(FlenixCities.tabItems);
		this.maxStackSize = stack;
	}
}