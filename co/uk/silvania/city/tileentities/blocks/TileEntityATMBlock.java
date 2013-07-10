package co.uk.silvania.city.tileentities.blocks;

import java.util.List;

import co.uk.silvania.city.FlenixCities;
import co.uk.silvania.city.NBTConfig;
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
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class TileEntityATMBlock extends BlockContainer {	
	
	public static double playerBalance = 0;

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
	
	//Huge thanks to "maxpowa" in helping me get this working!!
	//Temporary Economy deposit system. Eventually this will happen inside the GUI, you will place in money and it'll get sucked into the bank,
	//and the bank will pay you. For now, this is fine, and the code will be effectively the same anyway.
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float j, float k, float l) {
        if (!world.isRemote) {
            if (player.getHeldItem() != null) {
                if (player.getHeldItem().getItem() == FlenixCities.debitCard) {
                    double balance = 0;
                    NBTTagCompound nbt = NBTConfig.getTagCompoundInFile(NBTConfig.getWorldConfig(world));
                    if (nbt.hasKey(player.username)) {
                        NBTTagCompound playernbt = nbt.getCompoundTag(player.username);
                        if (playernbt.hasKey("Balance")) 
                            balance = playernbt.getDouble("Balance");
                    }
                    player.addChatMessage("Your Balance is: " + balance);
                    player.openGui(FlenixCities.instance, 0, world, x, y, z);
                }
            }
        if (player.getHeldItem() != null) {
            if (player.getHeldItem().getItem() == FlenixCities.note1000) {
                double currentBalance = 0;
                NBTTagCompound nbt = NBTConfig.getTagCompoundInFile(NBTConfig.getWorldConfig(world));
                if (nbt.hasKey(player.username)) {
                    NBTTagCompound playernbt = nbt.getCompoundTag(player.username);
                    if (playernbt.hasKey("Balance"))
                        currentBalance = playernbt.getDouble("Balance");
                    double modifiedBalance = currentBalance + ItemNote10.moneyValue;
                    playernbt.setDouble("Balance", modifiedBalance);
                    nbt.setCompoundTag(player.username, playernbt);
                } else {
                    NBTTagCompound playernbt = new NBTTagCompound();
                    if (playernbt.hasKey("Balance"))
                        currentBalance = playernbt.getDouble("Balance");
                    double modifiedBalance = currentBalance + ItemNote10.moneyValue;
                    playernbt.setDouble("Balance", modifiedBalance);
                    nbt.setCompoundTag(player.username, playernbt);
                }
                NBTTagCompound playernbt = nbt.getCompoundTag(player.username);
            player.addChatMessage(ItemNote10.moneyValue + " Deposited! Your balance is now " + playernbt.getDouble("Balance"));
            double playerBalance = playernbt.getDouble("Balance");
            NBTConfig.saveConfig(nbt, NBTConfig.getWorldConfig(world));
            }
        }
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
	private Icon[] icons;

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		icons = new Icon[4];

		for(int i = 0; i < icons.length; i++) {
			icons[i] = iconRegister.registerIcon("FlenixCities:" + (this.getUnlocalizedName().substring(5)) + i);
		}
	}

	@SideOnly(Side.CLIENT)
	public Icon getIcon(int par1, int par2) {
		return icons[par2];
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs creativeTabs, List list) {
        list.add(new ItemStack(par1, 1, 0));
        list.add(new ItemStack(par1, 1, 4));
        list.add(new ItemStack(par1, 1, 8));
        list.add(new ItemStack(par1, 1, 12));
	}
}