package co.uk.silvania.city.blocks;

import co.uk.silvania.city.FlenixCities;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TitaniumOre extends Block {

	public TitaniumOre(int id) {
		super(id, Material.rock);
		this.setCreativeTab(FlenixCities.tabCity);
		this.setHardness(1.8F);
	}
}
