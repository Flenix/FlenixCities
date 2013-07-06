package co.uk.silvania.city.econ;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;

import co.uk.silvania.city.CityConfig;
import cpw.mods.fml.common.Mod.ServerStarting;
import cpw.mods.fml.common.event.FMLServerStartingEvent;


public class PayCommand extends CommandBase {
	
	@Override
	public String getCommandName() {
		return "pay";
	}
	
	@Override
	public void processCommand(ICommandSender icommandsender, String[] astring) {
		
	}

	@Override
	public String getCommandUsage(ICommandSender icommandsender) {
		if (icommandsender instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer)icommandsender;
			player.addChatMessage("You have payed" + "[amount]" + "to" + "[player]");
		}
		return null;
	}
	
	
}