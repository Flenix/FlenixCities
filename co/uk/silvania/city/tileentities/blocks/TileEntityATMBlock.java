package co.uk.silvania.city.tileentities.blocks;

import java.util.List;

import co.uk.silvania.city.FlenixCities;
import co.uk.silvania.city.items.econ.ItemNote10;
import co.uk.silvania.city.tileentities.TileEntityATMEntity;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class TileEntityATMBlock extends BlockContainer {	

	public TileEntityATMBlock(int id) {
		super(id, Material.iron);
		this.setHardness(1.0F);
		this.setCreativeTab(FlenixCities.tabEcon);
		this.setLightOpacity(0);
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileEntityATMEntity();
	}
	
	@Override
	public int getRenderType() {
		return -1;
	}
	
	
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float j, float k, float l) {
        TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
        NBTTagCompound nbt = player.getEntityData().getCompoundTag(EntityPlayer.PERSISTED_NBT_TAG);
        if (player.getHeldItem() != null) {
            if (player.getHeldItem().getItem() == FlenixCities.debitCard) {
                int balance = 0;
                if (nbt.hasKey("Balance"))
                    balance = nbt.getInteger("Balance");
                player.addChatMessage("Your Balance is: " + balance);
                player.openGui(FlenixCities.instance, 0, world, x, y, z);
            }
        }
        if (player.getHeldItem() != null) {
            if (player.getHeldItem().getItem() == FlenixCities.note1000) {
                int currentBalance = 0;
                if (nbt.hasKey("Balance"))
                    currentBalance = nbt.getInteger("Balance");
                int modifiedBalance = currentBalance + ItemNote10.moneyValue;
                nbt.setInteger("Balance", modifiedBalance);
                player.writeToNBT(nbt);
            }    
            player.addChatMessage(ItemNote10.moneyValue + " Deposited! Your balance is now " + nbt.getInteger("Balance"));
        }
        return true;
    }
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	
	public boolean renderAsNormalBlock() {
		return false;
	}
	
	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityliving, ItemStack itemStack)
	{
	    int blockSet = world.getBlockMetadata(x, y, z) / 4;
	    int direction = MathHelper.floor_double((entityliving.rotationYaw * 4F) / 360F + 0.5D) & 3;
	    int newMeta = (blockSet * 4) + direction;
	    world.setBlockMetadataWithNotify(x, y, z, newMeta, 0);
	}
    
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs creativeTabs, List list) {
		for (int var4 = 0; var4 < 16; ++var4) {
			list.add(new ItemStack(par1, 1, 0));
		}
	}
}