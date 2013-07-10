package co.uk.silvania.city.tileentities.containers;

import java.text.DecimalFormat;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.ResourceLocation;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

import co.uk.silvania.city.tileentities.TileEntityATMEntity;
import co.uk.silvania.city.tileentities.blocks.TileEntityATMBlock;

public class GuiATM extends GuiContainer {
	
	//DecimalFormat decim = new DecimalFormat("0.00");
	
    private static final ResourceLocation texture = new ResourceLocation("flenixcities", "/textures/gui/atm.png");

        public GuiATM (InventoryPlayer inventoryPlayer, TileEntityATMEntity tileEntity, World world, int x, int y, int z) {
        	super(new ContainerATM(inventoryPlayer, tileEntity));
        }
        
        protected int xSize = 176;
        protected int ySize = 198;
        
        @Override
        protected void drawGuiContainerForegroundLayer(int param1, int param2) {
        	fontRenderer.drawString("ATM", 8, -8, 4210752);
        	fontRenderer.drawString("Balance", 8, 9, 4210752);
        	fontRenderer.drawString("Safe", 132, -11, 4210752);
        	fontRenderer.drawString("Deposit", 124, -3, 4210752);
        	fontRenderer.drawString("Withdraw", 8, 29, 4210752);
        	fontRenderer.drawString("Deposit", 42, 68, 4210752);
        	fontRenderer.drawString("$" + TileEntityATMBlock.playerBalance, 58, 9, 1237000);
        	fontRenderer.drawString("345.67", 58, 29, 1237000);
        	fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, ySize - 111, 4210752);
        }

        @Override
        protected void drawGuiContainerBackgroundLayer(float par1, int par2,
                        int par3) {
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                this.mc.func_110434_K().func_110577_a(texture);
                int x = (width - xSize) / 2;
                int y = (height - ySize) / 2;
                this.drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
        }
}