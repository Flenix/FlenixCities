package co.uk.silvania.city.items.itemblocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemSkyscraperBlocks extends ItemBlock {

	public ItemSkyscraperBlocks(int par1) {
		super(par1);
		this.setHasSubtypes(true);
	}

	public String getUnlocalizedName(ItemStack itemstack) {

		String name = "";
		switch(itemstack.getItemDamage()) {
			case 0: {
				name = "0";
				break;
			}
			case 4: {
				name = "4";
				break;
			}
			case 8: {
				name = "8";
				break;
			}
			case 12: {
				name = "12";
				break;
			}
			default: name = "broken";
		}
		return getUnlocalizedName() + "." + name;
	}

	public int getMetadata(int par1) {
		return par1;
	}

}