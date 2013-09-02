package co.uk.silvania.cities.home;

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


@Mod(modid=FlenixCities_Home.modid, name="Home", version="0.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class FlenixCities_Home { 
	
	public static final String modid = "fc_home";
	
    @Instance(FlenixCities_Home.modid)
    public static FlenixCities_Home instance;
    public static GuiHandler cityGuiHandler = new GuiHandler();

    @SidedProxy(clientSide="co.uk.silvania.cities.home.client.ClientProxy", serverSide="co.uk.silvania.home.CommonProxy")
    public static CommonProxy proxy;
    
	@EventHandler
	public void serverStart(FMLServerStartingEvent event) {
		MinecraftServer server = MinecraftServer.getServer();
	}
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	HomeConfig config = new HomeConfig();
        proxy.registerRenderThings();
        proxy.registerRenderers();
    	NetworkRegistry.instance().registerGuiHandler(this, cityGuiHandler);
    	HomeConfig.loadConfig(event); 
    	FCH_Blocks.init();
    	FCH_Items.init();
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