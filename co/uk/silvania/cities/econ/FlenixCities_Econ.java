package co.uk.silvania.cities.econ;

import co.uk.silvania.cities.GuiHandler;
import co.uk.silvania.cities.WorldGen;
import co.uk.silvania.cities.econ.blocks.TileEntityATMEntity;
import co.uk.silvania.cities.econ.blocks.TileEntityFloatingShelves;
import co.uk.silvania.cities.econ.items.*;
import net.minecraft.block.Block;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.Mod.ServerStarting;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid=FlenixCities_Econ.modid, name="Economy", version="0.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class FlenixCities_Econ { 
	
	public static final String modid = "fc_econ";
	
    @Instance(FlenixCities_Econ.modid)
    public static FlenixCities_Econ instance;
    public static GuiHandler roadsGuiHandler = new GuiHandler();

    @SidedProxy(clientSide="co.uk.silvania.cities.econ.client.ClientProxy", serverSide="co.uk.silvania.cities.econ.CommonProxy")
    public static CommonProxy proxy;
    
	public static CreativeTabs tabEcon = new CreativeTabs("tabEcon") {
		public ItemStack getIconItemStack() {
			return new ItemStack(FCE_Blocks.atmBlock, 1, 0);
		}
	};

	@EventHandler
	public void serverStart(FMLServerStartingEvent event) {
		MinecraftServer server = MinecraftServer.getServer();
	}
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	EconConfig config = new EconConfig();
        proxy.registerRenderThings();
        proxy.registerRenderers();
    	NetworkRegistry.instance().registerGuiHandler(this, roadsGuiHandler);
    	EconConfig.loadConfig(event); 
    	FCE_Blocks.init();
    	FCE_Items.init();
    }
               
    @EventHandler
    public void Init(FMLInitializationEvent event) {        
        proxy.registerBlocks();
        proxy.addNames();
        GameRegistry.registerTileEntity(TileEntityATMEntity.class, "tileEntityATM");
        GameRegistry.registerTileEntity(TileEntityFloatingShelves.class, "tileEntityFloatingShelves");
        
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabEcon", "en_US", "Cities: Economy");
    }


    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
};