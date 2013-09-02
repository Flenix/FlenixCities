package co.uk.silvania.cities.core.blocks;

import co.uk.silvania.cities.core.FlenixCities_Core;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class CrystalOre extends Block {

	public CrystalOre(int id) {
		super(id, Material.rock);
		this.setCreativeTab(FlenixCities_Core.tabCity);
		this.setHardness(1.8F);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon("FlenixCities:CrystalOre");
	}
}
