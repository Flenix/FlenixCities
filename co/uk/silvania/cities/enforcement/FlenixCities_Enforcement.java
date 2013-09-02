package co.uk.silvania.cities.enforcement;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
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


@Mod(modid=FlenixCities_Enforcement.modid, name="Enforcement", version="0.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class FlenixCities_Enforcement { 
	
	public static final String modid = "fc_enforcement";
	
    @Instance(FlenixCities_Enforcement.modid)
    public static FlenixCities_Enforcement instance;
    public static GuiHandler cityGuiHandler = new GuiHandler();

    @SidedProxy(clientSide="co.uk.silvania.cities.enforcement.client.ClientProxy", serverSide="co.uk.silvania.enforcement.CommonProxy")
    public static CommonProxy proxy;
    
	public static CreativeTabs tabEnforcement = new CreativeTabs("tabEnforcement") {
		public ItemStack getIconItemStack() {
			return new ItemStack(FCEn_Items.cigaretteItem, 1, 0);
		}
	};
    
	@EventHandler
	public void serverStart(FMLServerStartingEvent event) {
		MinecraftServer server = MinecraftServer.getServer();
	}
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	EnforcementConfig config = new EnforcementConfig();
        proxy.registerRenderThings();
        proxy.registerRenderers();
    	NetworkRegistry.instance().registerGuiHandler(this, cityGuiHandler);
    	EnforcementConfig.loadConfig(event); 
    	FCEn_Blocks.init();
    	FCEn_Items.init();
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