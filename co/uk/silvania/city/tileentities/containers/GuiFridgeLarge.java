package co.uk.silvania.city.tileentities.containers;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

import co.uk.silvania.city.tileentities.TileEntityATMEntity;
import co.uk.silvania.city.tileentities.TileEntityFridgeLarge;

public class GuiFridgeLarge extends GuiContainer {
	
    private static final ResourceLocation texture = new ResourceLocation("flenixcities", "/textures/gui/fridgelargegui.png");

        public GuiFridgeLarge (InventoryPlayer inventoryPlayer, TileEntityFridgeLarge tileEntity, World world, int x, int y, int z) {
                                super(new ContainerFridgeLarge(inventoryPlayer, tileEntity));
        }
        
        /** The X size of the inventory window in pixels. */
        protected int xSize = 176;

        /** The Y size of the inventory window in pixels. */
        protected int ySize = 218;

        @Override
        protected void drawGuiContainerForegroundLayer(int param1, int param2) {
        	fontRenderer.drawString("Large Glass Fridge", 8, -21, 4210752);
        	fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, 99, 4210752);
        }

        @Override
        protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                this.mc.func_110434_K().func_110577_a(texture);
                int x = (width - xSize) / 2;
                int y = (height - ySize) / 2;
                this.drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
        }
}