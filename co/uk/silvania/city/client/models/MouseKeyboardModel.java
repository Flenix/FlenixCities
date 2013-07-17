package co.uk.silvania.city.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import net.minecraft.entity.Entity;

public class MouseKeyboardModel extends ModelBase
{
  //fields
    ModelRenderer Shape16;
    ModelRenderer Shape17;
    ModelRenderer Shape18;
  
  public MouseKeyboardModel()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Shape16 = new ModelRenderer(this, 0, 37);
      Shape16.addBox(0F, 0F, 0F, 8, 1, 3);
      Shape16.setRotationPoint(-7F, 23.6F, -7F);
      Shape16.setTextureSize(64, 64);
      Shape16.mirror = true;
      setRotation(Shape16, 0.0872665F, -0.181349F, 0F);
      Shape17 = new ModelRenderer(this, 28, 15);
      Shape17.addBox(0F, 0F, 0F, 6, 1, 4);
      Shape17.setRotationPoint(1F, 23.8F, -5F);
      Shape17.setTextureSize(64, 64);
      Shape17.mirror = true;
      setRotation(Shape17, 0F, 0.2602503F, 0F);
      Shape18 = new ModelRenderer(this, 12, 55);
      Shape18.addBox(0F, 0F, 0F, 2, 1, 3);
      Shape18.setRotationPoint(3F, 22.9F, -5F);
      Shape18.setTextureSize(64, 64);
      Shape18.mirror = true;
      setRotation(Shape18, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape16.render(f5);
    Shape17.render(f5);
    Shape18.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
