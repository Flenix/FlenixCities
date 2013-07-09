package co.uk.silvania.city.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class SchoolDeskModel extends ModelBase
{
  //fields
    ModelRenderer Leg1;
    ModelRenderer Leg2;
    ModelRenderer Leg3;
    ModelRenderer Leg4;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape11;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
  
  public SchoolDeskModel()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Leg1 = new ModelRenderer(this, 60, 19);
      Leg1.addBox(0F, 0F, 0F, 1, 12, 1);
      Leg1.setRotationPoint(7F, 12F, -3F);
      Leg1.setTextureSize(64, 64);
      Leg1.mirror = true;
      setRotation(Leg1, 0F, 0F, 0F);
      Leg2 = new ModelRenderer(this, 60, 19);
      Leg2.addBox(0F, 0F, 0F, 1, 12, 1);
      Leg2.setRotationPoint(-8F, 12F, 7F);
      Leg2.setTextureSize(64, 64);
      Leg2.mirror = true;
      setRotation(Leg2, 0F, 0F, 0F);
      Leg3 = new ModelRenderer(this, 60, 19);
      Leg3.addBox(0F, 0F, 0F, 1, 12, 1);
      Leg3.setRotationPoint(7F, 12F, 7F);
      Leg3.setTextureSize(64, 64);
      Leg3.mirror = true;
      setRotation(Leg3, 0F, 0F, 0F);
      Leg4 = new ModelRenderer(this, 60, 19);
      Leg4.addBox(0F, 0F, 0F, 1, 12, 1);
      Leg4.setRotationPoint(-8F, 12F, -3F);
      Leg4.setTextureSize(64, 64);
      Leg4.mirror = true;
      setRotation(Leg4, 0F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(0F, 0F, 0F, 16, 1, 11);
      Shape1.setRotationPoint(-8F, 11F, -3F);
      Shape1.setTextureSize(64, 64);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 18, 32);
      Shape2.addBox(0F, 0F, 0F, 16, 2, 1);
      Shape2.setRotationPoint(-8F, 9F, 7F);
      Shape2.setTextureSize(64, 64);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 42, 2);
      Shape3.addBox(0F, 0F, 0F, 1, 2, 10);
      Shape3.setRotationPoint(-8F, 9F, -3F);
      Shape3.setTextureSize(64, 64);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 42, 2);
      Shape4.addBox(0F, 0F, 0F, 1, 2, 10);
      Shape4.setRotationPoint(7F, 9F, -3F);
      Shape4.setTextureSize(64, 64);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 0, 12);
      Shape5.addBox(0F, 0F, 0F, 14, 1, 10);
      Shape5.setRotationPoint(-7F, 9F, -3F);
      Shape5.setTextureSize(64, 64);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 18, 23);
      Shape6.addBox(0F, 0F, 0F, 8, 1, 8);
      Shape6.setRotationPoint(-4F, 16F, -8F);
      Shape6.setTextureSize(64, 64);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 0, 23);
      Shape7.addBox(-4F, -12F, 0F, 8, 13, 1);
      Shape7.setRotationPoint(0F, 16F, -8.5F);
      Shape7.setTextureSize(64, 64);
      Shape7.mirror = true;
      setRotation(Shape7, 0.3490659F, 0F, 0F);
      Shape8 = new ModelRenderer(this, 56, 23);
      Shape8.addBox(-0.5F, 0F, -0.5F, 1, 8, 1);
      Shape8.setRotationPoint(-3.5F, 16F, -0.5F);
      Shape8.setTextureSize(64, 64);
      Shape8.mirror = true;
      setRotation(Shape8, 0.0872665F, 0F, 0.0872665F);
      Shape11 = new ModelRenderer(this, 56, 23);
      Shape11.addBox(-0.5F, 0F, -0.5F, 1, 8, 1);
      Shape11.setRotationPoint(3.5F, 16F, -0.5F);
      Shape11.setTextureSize(64, 64);
      Shape11.mirror = true;
      setRotation(Shape11, 0.0872665F, 0F, -0.0872665F);
      Shape9 = new ModelRenderer(this, 56, 23);
      Shape9.addBox(0F, 0F, 0F, 1, 8, 1);
      Shape9.setRotationPoint(-4F, 16F, -8F);
      Shape9.setTextureSize(64, 64);
      Shape9.mirror = true;
      setRotation(Shape9, -0.0872665F, 0F, 0.0872665F);
      Shape10 = new ModelRenderer(this, 56, 23);
      Shape10.addBox(0F, 0F, 0F, 1, 8, 1);
      Shape10.setRotationPoint(3F, 16F, -8F);
      Shape10.setTextureSize(64, 64);
      Shape10.mirror = true;
      setRotation(Shape10, -0.0872665F, 0F, -0.0872665F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Leg1.render(f5);
    Leg2.render(f5);
    Leg3.render(f5);
    Leg4.render(f5);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
    Shape8.render(f5);
    Shape11.render(f5);
    Shape9.render(f5);
    Shape10.render(f5);
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
