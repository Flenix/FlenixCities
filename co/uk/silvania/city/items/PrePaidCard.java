package co.uk.silvania.city.items;

import co.uk.silvania.city.FlenixCities;
import net.minecraft.item.Item;

public class PrePaidCard extends Item {

	public PrePaidCard(int id) {
		super(id);
		this.setMaxStackSize(1);
		this.setCreativeTab(FlenixCities.tabEcon);
	}
}
