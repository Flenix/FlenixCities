package co.uk.silvania.cities;

import co.uk.silvania.cities.econ.blocks.ContainerATM;
import co.uk.silvania.cities.econ.blocks.ContainerFloatingShelves;
import co.uk.silvania.cities.econ.blocks.GuiATM;
import co.uk.silvania.cities.econ.blocks.GuiFloatingShelves;
import co.uk.silvania.cities.econ.blocks.TileEntityATMEntity;
import co.uk.silvania.cities.econ.blocks.TileEntityFloatingShelves;
import co.uk.silvania.cities.food.blocks.ContainerFridge;
import co.uk.silvania.cities.food.blocks.ContainerFridgeLarge;
import co.uk.silvania.cities.food.blocks.ContainerVendingMachine;
import co.uk.silvania.cities.food.blocks.GuiFridge;
import co.uk.silvania.cities.food.blocks.GuiFridgeLarge;
import co.uk.silvania.cities.food.blocks.GuiVendingMachine;
import co.uk.silvania.cities.food.blocks.TileEntityFridge;
import co.uk.silvania.cities.food.blocks.TileEntityFridgeLarge;
import co.uk.silvania.cities.food.blocks.TileEntityVendingMachine;
import co.uk.silvania.city.tileentities.*;
import co.uk.silvania.city.tileentities.containers.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
 

		public GuiHandler() {
		}
        @Override
        public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
        	switch(id) {
        	case 0: {
                TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                if(tileEntity instanceof TileEntityATMEntity) {
                        return new ContainerATM(player.inventory, (TileEntityATMEntity) tileEntity);
                }	
        	}
        	case 1: {
                TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                if(tileEntity instanceof TileEntityFridge) {
                        return new ContainerFridge(player.inventory, (TileEntityFridge) tileEntity);
                }	
        	}
        	case 2: {
                TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                if(tileEntity instanceof TileEntityFridgeLarge) {
                        return new ContainerFridgeLarge(player.inventory, (TileEntityFridgeLarge) tileEntity);
                }	
        	}
        	case 3: {
                TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                if(tileEntity instanceof TileEntityFloatingShelves) {
                        return new ContainerFloatingShelves(player.inventory, (TileEntityFloatingShelves) tileEntity);
                }	
        	}
        	case 4: {
                TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                if(tileEntity instanceof TileEntitySchoolDesk) {
                        return new ContainerSchoolDesk(player.inventory, (TileEntitySchoolDesk) tileEntity);
                }	
        	}
        	case 5: {
                TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                if(tileEntity instanceof TileEntityVendingMachine) {
                        return new ContainerVendingMachine(player.inventory, (TileEntityVendingMachine) tileEntity);
                }	
        	}
        	case 6: {
                TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                if(tileEntity instanceof TileEntityFilingCabinet) {
                        return new ContainerFilingCabinet(player.inventory, (TileEntityFilingCabinet) tileEntity);
                }	
        	}
        }
			return null;	
    }

        @Override
        public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
        	switch(id) {
        	case 0: {
                TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                if(tileEntity instanceof TileEntityATMEntity) {
                        return new GuiATM(player.inventory, (TileEntityATMEntity) tileEntity, world, x, y, z);
                }	
        	}        	
        	case 1: {
                TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                if(tileEntity instanceof TileEntityFridge) {
                        return new GuiFridge(player.inventory, (TileEntityFridge) tileEntity, world, x, y, z);
                }	
        	}
        	case 2: {
                TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                if(tileEntity instanceof TileEntityFridgeLarge) {
                        return new GuiFridgeLarge(player.inventory, (TileEntityFridgeLarge) tileEntity, world, x, y, z);
                }	
        	}
        	case 3: {
                TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                if(tileEntity instanceof TileEntityFloatingShelves) {
                        return new GuiFloatingShelves(player.inventory, (TileEntityFloatingShelves) tileEntity, world, x, y, z);
                }	
        	}
        	case 4: {
                TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                if(tileEntity instanceof TileEntitySchoolDesk) {
                        return new GuiSchoolDesk(player.inventory, (TileEntitySchoolDesk) tileEntity, world, x, y, z);
                }	
        	}
        	case 5: {
                TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                if(tileEntity instanceof TileEntityVendingMachine) {
                        return new GuiVendingMachine(player.inventory, (TileEntityVendingMachine) tileEntity, world, x, y, z);
                }	
        	}
        	case 6: {
                TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
                if(tileEntity instanceof TileEntityFilingCabinet) {
                        return new GuiFilingCabinet(player.inventory, (TileEntityFilingCabinet) tileEntity, world, x, y, z);
                }	
        	}
        }
			return null;
    }
}