package co.uk.silvania.cities.core.client;

import co.uk.silvania.cities.core.CommonProxy;
import co.uk.silvania.cities.econ.blocks.TileEntityATMEntity;
import co.uk.silvania.cities.econ.blocks.TileEntityATMRenderer;
import co.uk.silvania.cities.econ.blocks.TileEntityFloatingShelves;
import co.uk.silvania.cities.econ.blocks.TileEntityFloatingShelvesRenderer;
import co.uk.silvania.cities.food.blocks.TileEntityFridge;
import co.uk.silvania.cities.food.blocks.TileEntityFridgeLarge;
import co.uk.silvania.cities.food.blocks.TileEntityFridgeRenderer;
import co.uk.silvania.cities.food.blocks.TileEntityLargeFridgeRenderer;
import co.uk.silvania.cities.food.blocks.TileEntityVendingMachine;
import co.uk.silvania.cities.food.blocks.TileEntityVendingMachineRenderer;
import co.uk.silvania.city.client.tessrender.PosterRender;
import co.uk.silvania.city.tileentities.*;
import co.uk.silvania.city.tileentities.renderers.*;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
	
	public static int PosterRenderID;
        
    @Override
    public void registerRenderThings() {
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityEscalatorEntity.class, new TileEntityEscalatorRenderer());
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTravellatorEntity.class, new TileEntityTravellatorRenderer());
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityATMEntity.class, new TileEntityATMRenderer());
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFridge.class, new TileEntityFridgeRenderer());
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFridgeLarge.class, new TileEntityLargeFridgeRenderer());
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFloatingShelves.class, new TileEntityFloatingShelvesRenderer());
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySchoolDesk.class, new TileEntitySchoolDeskRenderer());
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityToilet.class, new TileEntityToiletRenderer());
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityKeyboard.class, new TileEntityKeyboardRenderer());
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLaptop.class, new TileEntityLaptopRenderer());
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMonitorSmall.class, new TileEntityMonitorSmallRenderer());
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMonitorStandingLarge.class, new TileEntityMonitorStandingLargeRenderer());
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMonitorWallLarge.class, new TileEntityMonitorWallLargeRenderer());
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMouse.class, new TileEntityMouseRenderer());
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMouseKeyboard.class, new TileEntityMouseKeyboardRenderer());
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPC.class, new TileEntityPCRenderer());
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityServerRack.class, new TileEntityServerRackRenderer());
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityVendingMachine.class, new TileEntityVendingMachineRenderer());
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFilingCabinet.class, new TileEntityFilingCabinetRenderer());
    }        
    
    /*@Override
    public void registerRenderers() {
    	PosterRenderID = RenderingRegistry.getNextAvailableRenderId();
    	RenderingRegistry.registerBlockHandler(PosterRenderID, new PosterRender());
    }*/
}