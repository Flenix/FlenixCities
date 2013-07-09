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
        }        
}