package co.uk.silvania.city.econ;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;

import co.uk.silvania.city.CityConfig;


public class BalCommand implements ICommand {
	
	private List aliases;
	public BalCommand() {
		
		this.aliases = new ArrayList();
		this.aliases.add("bal");
		this.aliases.add("balance");
		this.aliases.add("money");
	}
	
	@Override
	public String getCommandName() {
		return "balance";
	}
	
	@Override
	public String getCommandUsage(ICommandSender icommandsender) {
		return "balance";
	}
	
	@Override
	public List getCommandAliases() {
		return this.aliases;
	}
	
	/*@Override
	public void processCommand(ICommandSender icommandsender, String[] astring) {
		icommandsender.("Your Balance is:" + astring[0] + CityConfig.currencyLarge);
	}*/
	
	@Override
	public boolean canCommandSenderUseCommand(ICommandSender icommandsender) {
		return true;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List addTabCompletionOptions(ICommandSender icommandsender,
			String[] astring) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isUsernameIndex(String[] astring, int i) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void processCommand(ICommandSender icommandsender, String[] astring) {
		// TODO Auto-generated method stub
		
	}
}
