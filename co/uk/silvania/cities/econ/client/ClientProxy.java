package co.uk.silvania.cities.econ.client;

import co.uk.silvania.cities.econ.CommonProxy;
import co.uk.silvania.cities.econ.blocks.TileEntityATMEntity;
import co.uk.silvania.cities.econ.blocks.TileEntityATMRenderer;
import co.uk.silvania.cities.econ.blocks.TileEntityFloatingShelves;
import co.uk.silvania.cities.econ.blocks.TileEntityFloatingShelvesRenderer;
import co.uk.silvania.city.client.tessrender.PosterRender;
import co.uk.silvania.city.tileentities.*;
import co.uk.silvania.city.tileentities.renderers.*;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
	
    @Override
    public void registerRenderThings() {
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityATMEntity.class, new TileEntityATMRenderer());
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFloatingShelves.class, new TileEntityFloatingShelvesRenderer());
    }        
}