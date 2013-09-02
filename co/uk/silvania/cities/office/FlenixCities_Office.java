package co.uk.silvania.cities.office;

import net.minecraft.server.MinecraftServer;
import co.uk.silvania.cities.GuiHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;


@Mod(modid=FlenixCities_Office.modid, name="Office", version="0.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class FlenixCities_Office { 
	
	public static final String modid = "fc_office";
	
    @Instance(FlenixCities_Office.modid)
    public static FlenixCities_Office instance;
    public static GuiHandler cityGuiHandler = new GuiHandler();

    @SidedProxy(clientSide="co.uk.silvania.cities.office.client.ClientProxy", serverSide="co.uk.silvania.office.CommonProxy")
    public static CommonProxy proxy;
    
	@EventHandler
	public void serverStart(FMLServerStartingEvent event) {
		MinecraftServer server = MinecraftServer.getServer();
	}
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	OfficeConfig config = new OfficeConfig();
        proxy.registerRenderThings();
        proxy.registerRenderers();
    	NetworkRegistry.instance().registerGuiHandler(this, cityGuiHandler);
    	OfficeConfig.loadConfig(event); 
    	FCO_Blocks.init();
    	FCO_Items.init();
    }
               
    @EventHandler
    public void Init(FMLInitializationEvent event) {        
        proxy.registerBlocks();
        proxy.addNames();
    }


    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
};