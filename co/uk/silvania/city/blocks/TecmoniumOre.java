package co.uk.silvania.city.blocks;

import co.uk.silvania.city.FlenixCities;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class TecmoniumOre extends Block {

	public TecmoniumOre(int id) {
		super(id, Material.rock);
		this.setCreativeTab(FlenixCities.tabCity);
		this.setHardness(1.8F);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon("FlenixCities:TecmoniumOre");
	}
}
