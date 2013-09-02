package co.uk.silvania.cities.nightlife;

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


@Mod(modid=FlenixCities_Nightlife.modid, name="Nightlife", version="0.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class FlenixCities_Nightlife { 
	
	public static final String modid = "fc_nightlife";
	
    @Instance(FlenixCities_Nightlife.modid)
    public static FlenixCities_Nightlife instance;
    public static GuiHandler cityGuiHandler = new GuiHandler();

    @SidedProxy(clientSide="co.uk.silvania.cities.nightlife.client.ClientProxy", serverSide="co.uk.silvania.nightlife.CommonProxy")
    public static CommonProxy proxy;
    
	@EventHandler
	public void serverStart(FMLServerStartingEvent event) {
		MinecraftServer server = MinecraftServer.getServer();
	}
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	NightlifeConfig config = new NightlifeConfig();
        proxy.registerRenderThings();
        proxy.registerRenderers();
    	NetworkRegistry.instance().registerGuiHandler(this, cityGuiHandler);
    	NightlifeConfig.loadConfig(event); 
    	FCNL_Blocks.init();
    	FCNL_Items.init();
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