package co.uk.silvania.city.econ;

import java.util.HashMap;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public final class Balance {
	
	public static HashMap map = new HashMap();
	public static int Balance = 0;
	
	public static void saveBalanceForPlayer(EntityPlayer player, World world) {
		NBTTagCompound nbt = player.getEntityData();
		nbt.setInteger("Balance", Balance);
	}
	
	public int getBalanceForPlayer(EntityPlayer player) {
		NBTTagCompound nbt = player.getEntityData();
		return nbt.getInteger("Balance");
	}
	
	

}
