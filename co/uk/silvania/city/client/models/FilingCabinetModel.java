package co.uk.silvania.city.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class FilingCabinetModel extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape4b;
    ModelRenderer Shape4c;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
  
  public FilingCabinetModel()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(0F, 0F, 0F, 10, 16, 1);
      Shape1.setRotationPoint(-5F, 8F, 7F);
      Shape1.setTextureSize(128, 64);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 103, 0);
      Shape2.addBox(0F, 0F, 0F, 1, 16, 12);
      Shape2.setRotationPoint(-6F, 8F, -4F);
      Shape2.setTextureSize(128, 64);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 77, 0);
      Shape3.addBox(0F, 0F, 0F, 1, 16, 12);
      Shape3.setRotationPoint(5F, 8F, -4F);
      Shape3.setTextureSize(128, 64);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 40, 28);
      Shape4.addBox(0F, 0F, 0F, 10, 1, 11);
      Shape4.setRotationPoint(-5F, 8F, -4F);
      Shape4.setTextureSize(128, 64);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape4b = new ModelRenderer(this, 40, 52);
      Shape4b.addBox(0F, 0F, 0F, 10, 1, 11);
      Shape4b.setRotationPoint(-5F, 23F, -4F);
      Shape4b.setTextureSize(128, 64);
      Shape4b.mirror = true;
      setRotation(Shape4b, 0F, 0F, 0F);
      Shape4c = new ModelRenderer(this, 40, 40);
      Shape4c.addBox(0F, 0F, 0F, 10, 1, 11);
      Shape4c.setRotationPoint(-5F, 16F, -4F);
      Shape4c.setTextureSize(128, 64);
      Shape4c.mirror = true;
      setRotation(Shape4c, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 0, 47);
      Shape5.addBox(-5F, 0F, 0F, 10, 7, 10);
      Shape5.setRotationPoint(0F, 9F, -3.5F);
      Shape5.setTextureSize(128, 64);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 0, 31);
      Shape6.addBox(-5F, 0F, 0F, 10, 6, 10);
      Shape6.setRotationPoint(0F, 17F, -3.5F);
      Shape6.setTextureSize(128, 64);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 0, 54);
      Shape7.addBox(-1.5F, 2.5F, -0.4F, 3, 2, 1);
      Shape7.setRotationPoint(0F, 9F, -3.5F);
      Shape7.setTextureSize(128, 64);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
      Shape8 = new ModelRenderer(this, 0, 54);
      Shape8.addBox(-1.5F, 10F, -0.4F, 3, 2, 1);
      Shape8.setRotationPoint(0F, 9F, -3.5F);
      Shape8.setTextureSize(128, 64);
      Shape8.mirror = true;
      setRotation(Shape8, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape4b.render(f5);
    Shape4c.render(f5);
    Shape5.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
    Shape8.render(f5);
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
