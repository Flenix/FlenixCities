package co.uk.silvania.city.client;

import co.uk.silvania.city.CommonProxy;
import co.uk.silvania.city.tileentities.*;
import co.uk.silvania.city.tileentities.renderers.*;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {
        
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
}