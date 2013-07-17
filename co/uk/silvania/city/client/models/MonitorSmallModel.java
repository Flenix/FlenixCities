package co.uk.silvania.city.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import net.minecraft.entity.Entity;

public class MonitorSmallModel extends ModelBase
{
  //fields
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
    ModelRenderer Shape12;
    ModelRenderer Shape13;
    ModelRenderer Shape14;
    ModelRenderer Shape15;
  
  public MonitorSmallModel()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Shape7 = new ModelRenderer(this, 0, 43);
      Shape7.addBox(0F, 0F, 0F, 8, 1, 5);
      Shape7.setRotationPoint(-4F, 23F, 1.3F);
      Shape7.setTextureSize(64, 64);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
      Shape8 = new ModelRenderer(this, 44, 0);
      Shape8.addBox(0F, 0F, 0F, 2, 7, 1);
      Shape8.setRotationPoint(-1F, 16F, 4.3F);
      Shape8.setTextureSize(64, 64);
      Shape8.mirror = true;
      setRotation(Shape8, 0F, 0F, 0F);
      Shape9 = new ModelRenderer(this, 46, 57);
      Shape9.addBox(0F, 0F, 0F, 8, 6, 1);
      Shape9.setRotationPoint(-4F, 14F, 1.3F);
      Shape9.setTextureSize(64, 64);
      Shape9.mirror = true;
      setRotation(Shape9, 0F, 0F, 0F);
      Shape10 = new ModelRenderer(this, 0, 52);
      Shape10.addBox(0F, 0F, 0F, 10, 1, 2);
      Shape10.setRotationPoint(-5F, 20F, 1F);
      Shape10.setTextureSize(64, 64);
      Shape10.mirror = true;
      setRotation(Shape10, 0F, 0F, 0F);
      Shape11 = new ModelRenderer(this, 0, 49);
      Shape11.addBox(0F, 0F, 0F, 10, 1, 2);
      Shape11.setRotationPoint(-5F, 13F, 1F);
      Shape11.setTextureSize(64, 64);
      Shape11.mirror = true;
      setRotation(Shape11, 0F, 0F, 0F);
      Shape12 = new ModelRenderer(this, 0, 55);
      Shape12.addBox(0F, 0F, 0F, 1, 6, 2);
      Shape12.setRotationPoint(-5F, 14F, 1F);
      Shape12.setTextureSize(64, 64);
      Shape12.mirror = true;
      setRotation(Shape12, 0F, 0F, 0F);
      Shape13 = new ModelRenderer(this, 6, 55);
      Shape13.addBox(0F, 0F, 0F, 1, 6, 2);
      Shape13.setRotationPoint(4F, 14F, 1F);
      Shape13.setTextureSize(64, 64);
      Shape13.mirror = true;
      setRotation(Shape13, 0F, 0F, 0F);
      Shape14 = new ModelRenderer(this, 44, 37);
      Shape14.addBox(0F, 0F, 0F, 8, 6, 2);
      Shape14.setRotationPoint(-4F, 14F, 2F);
      Shape14.setTextureSize(64, 64);
      Shape14.mirror = true;
      setRotation(Shape14, 0F, 0F, 0F);
      Shape15 = new ModelRenderer(this, 50, 0);
      Shape15.addBox(0F, 0F, 0F, 3, 3, 1);
      Shape15.setRotationPoint(-1.5F, 15.5F, 3.3F);
      Shape15.setTextureSize(64, 64);
      Shape15.mirror = true;
      setRotation(Shape15, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape7.render(f5);
    Shape8.render(f5);
    Shape9.render(f5);
    Shape10.render(f5);
    Shape11.render(f5);
    Shape12.render(f5);
    Shape13.render(f5);
    Shape14.render(f5);
    Shape15.render(f5);
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
