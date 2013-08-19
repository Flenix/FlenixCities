package co.uk.silvania.city.tileentities.containers;

import java.text.DecimalFormat;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

import co.uk.silvania.city.tileentities.TileEntityATMEntity;
import co.uk.silvania.city.tileentities.blocks.TileEntityATMBlock;

public class GuiATM extends GuiContainer {
	
	//DecimalFormat decim = new DecimalFormat("0.00");
	
    private static final ResourceLocation texture = new ResourceLocation("flenixcities", "textures/gui/atm.png");

    public GuiATM (InventoryPlayer inventoryPlayer, TileEntityATMEntity tileEntity, World world, int x, int y, int z) {
    	super(new ContainerATM(inventoryPlayer, tileEntity));
    }
    
    protected int xSize = 232;
    protected int ySize = 242;
    
    /*@Override
    public void initGui() {
    	super.initGui();
    	buttonList.add(new GuiButton(1, 200, 166, 24, 16, "7"));
    	buttonList.add(new GuiButton(2, 200, 190, 24, 16, "4"));
    	buttonList.add(new GuiButton(3, 200, 214, 24, 16, "1"));
    }*/
    
    /*public void actionPerformed(GuiButton guibutton) {
    	switch(guibutton.id) {
    	case 1:
    		i += 1;
    		break;
    	}
    }*/
    
    @Override
    protected void drawGuiContainerForegroundLayer(int param1, int param2) {
    	fontRenderer.drawString("ATM", -21, -30, 0x404040);
    	fontRenderer.drawString("Welcome!", 68, -2, 0x007F0E);
    	fontRenderer.drawString("Please enter your pin.", 32, 8, 0x007F0E);
    	//fontRenderer.drawString("null"/* + TileEntityATMBlock.playerBalance*/, 58, 9, 1237000);
    	//fontRenderer.drawString("null", 58, 29, 1237000);
    	fontRenderer.drawString("_", 74, 48, 0x007F0E);
    	fontRenderer.drawString("_", 80, 48, 0x007F0E);
    	fontRenderer.drawString("_", 86, 48, 0x007F0E);
    	fontRenderer.drawString("_", 92, 48, 0x007F0E);
    	
    	
    	//fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, ySize - 111, 4210752);
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