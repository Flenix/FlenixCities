package co.uk.silvania.cities.natural;

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


@Mod(modid=FlenixCities_Natural.modid, name="Natural", version="0.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class FlenixCities_Natural { 
	
	public static final String modid = "fc_natural";
	
    @Instance(FlenixCities_Natural.modid)
    public static FlenixCities_Natural instance;
    public static GuiHandler cityGuiHandler = new GuiHandler();

    @SidedProxy(clientSide="co.uk.silvania.cities.natural.client.ClientProxy", serverSide="co.uk.silvania.natural.CommonProxy")
    public static CommonProxy proxy;
    
	@EventHandler
	public void serverStart(FMLServerStartingEvent event) {
		MinecraftServer server = MinecraftServer.getServer();
	}
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	NaturalConfig config = new NaturalConfig();
        proxy.registerRenderThings();
        proxy.registerRenderers();
    	NetworkRegistry.instance().registerGuiHandler(this, cityGuiHandler);
    	NaturalConfig.loadConfig(event); 
    	FCN_Blocks.init();
    	FCN_Items.init();
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