package co.uk.silvania.city.tileentities.containers;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.ResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

import co.uk.silvania.city.tileentities.TileEntityATMEntity;
import co.uk.silvania.city.tileentities.TileEntityFridge;

public class GuiFridge extends GuiContainer {
	
    private static final ResourceLocation texture = new ResourceLocation("flenixcities", "/textures/gui/fridgegui.png");

        public GuiFridge (InventoryPlayer inventoryPlayer, TileEntityFridge tileEntity, World world, int x, int y, int z) {
                                super(new ContainerFridge(inventoryPlayer, tileEntity));
        }
        
        /** The X size of the inventory window in pixels. */
        protected int xSize = 176;

        /** The Y size of the inventory window in pixels. */
        protected int ySize = 182;

        protected void drawGuiContainerForegroundLayer(int param1, int param2, EntityPlayer player) {
        	NBTTagCompound nbt = player.getEntityData();
        	fontRenderer.drawString("Fridge", 8, 0, 4210752);
        	fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, ySize - 103, 4210752);
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