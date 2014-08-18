/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2014
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 02/03/2013 12:55:55 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models.Engine;

import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import Reika.RotaryCraft.Base.RotaryModelBase;

import java.util.ArrayList;

import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;


public class ModelMicroTurbine extends RotaryModelBase
{
	//fields
	LODModelPart Shape2;
	LODModelPart Shape1;
	LODModelPart Shape1a;
	LODModelPart Shape1b;
	LODModelPart Shape1c;
	LODModelPart Shape1d;
	LODModelPart Shape1e;
	LODModelPart Shape1f;
	LODModelPart Shape1g;
	LODModelPart Shape1h;
	LODModelPart Shape3;
	LODModelPart Shape3a;
	LODModelPart Shape3b;
	LODModelPart Shape4;
	LODModelPart Shape4a;
	LODModelPart Shape5;
	LODModelPart Shape5a;
	LODModelPart Shape5b;
	LODModelPart Shape5c;
	LODModelPart Shape5d;
	LODModelPart Shape5e;
	LODModelPart Shape5f;
	LODModelPart Shape5g;
	LODModelPart Shape5h;
	LODModelPart Shape5i;
	LODModelPart Shape5j;
	LODModelPart Shape5k;
	LODModelPart Shape6;
	LODModelPart Shape6a;
	LODModelPart Shape6b;
	LODModelPart Shape6c;
	LODModelPart Shape7;
	LODModelPart Shape6d;
	LODModelPart Shape6e;
	LODModelPart Shape6f;
	LODModelPart Shape7a;
	LODModelPart Shape6g;
	LODModelPart Shape6h;
	LODModelPart Shape3c;
	LODModelPart Shape8;
	LODModelPart Shape9a;
	LODModelPart Shape9b;
	LODModelPart Shape9c;
	LODModelPart Shape9d;
	LODModelPart Shape10;
	LODModelPart Shape10a;
	LODModelPart Shape10b;
	LODModelPart Shape10c;
	LODModelPart Shape10d;
	LODModelPart Shape11;
	LODModelPart Shape9e;
	LODModelPart Shape9f;
	LODModelPart Shape9g;
	LODModelPart Shape9h;
	LODModelPart Shape9h1;
	LODModelPart Shape9h2;
	LODModelPart Shape8a4;
	LODModelPart Shape8a1b;
	LODModelPart Shape8a1;
	LODModelPart Shape8a3;
	LODModelPart Shape8a2;
	LODModelPart Shape8a1b1;
	LODModelPart Shape8a1b2;
	LODModelPart Shape8a1b3;

	public ModelMicroTurbine()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape2 = new LODModelPart(this, 0, 0);
		Shape2.addBox(0F, 0F, 0F, 16, 1, 16);
		Shape2.setRotationPoint(-8F, 23F, -8F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape1 = new LODModelPart(this, 64, 0);
		Shape1.addBox(-4F, -4F, 0F, 8, 8, 11);
		Shape1.setRotationPoint(0F, 16F, -5F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0.3490659F);
		Shape1a = new LODModelPart(this, 64, 0);
		Shape1a.addBox(-4F, -4F, 0F, 8, 8, 11);
		Shape1a.setRotationPoint(0F, 16F, -5F);
		Shape1a.setTextureSize(128, 128);
		Shape1a.mirror = true;
		this.setRotation(Shape1a, 0F, 0F, 0.6981317F);
		Shape1b = new LODModelPart(this, 64, 0);
		Shape1b.addBox(-4F, -4F, 0F, 8, 8, 11);
		Shape1b.setRotationPoint(0F, 16F, -5F);
		Shape1b.setTextureSize(128, 128);
		Shape1b.mirror = true;
		this.setRotation(Shape1b, 0F, 0F, 1.047198F);
		Shape1c = new LODModelPart(this, 64, 0);
		Shape1c.addBox(-4F, -4F, 0F, 8, 8, 11);
		Shape1c.setRotationPoint(0F, 16F, -5F);
		Shape1c.setTextureSize(128, 128);
		Shape1c.mirror = true;
		this.setRotation(Shape1c, 0F, 0F, 1.396263F);
		Shape1d = new LODModelPart(this, 64, 0);
		Shape1d.addBox(-4F, -4F, 0F, 8, 8, 11);
		Shape1d.setRotationPoint(0F, 16F, -5F);
		Shape1d.setTextureSize(128, 128);
		Shape1d.mirror = true;
		this.setRotation(Shape1d, 0F, 0F, 2.094395F);
		Shape1e = new LODModelPart(this, 64, 0);
		Shape1e.addBox(-4F, -4F, 0F, 8, 8, 11);
		Shape1e.setRotationPoint(0F, 16F, -5F);
		Shape1e.setTextureSize(128, 128);
		Shape1e.mirror = true;
		this.setRotation(Shape1e, 0F, 0F, 1.745329F);
		Shape1f = new LODModelPart(this, 64, 0);
		Shape1f.addBox(-4F, -4F, 0F, 8, 8, 11);
		Shape1f.setRotationPoint(0F, 16F, -5F);
		Shape1f.setTextureSize(128, 128);
		Shape1f.mirror = true;
		this.setRotation(Shape1f, 0F, 0F, 2.443461F);
		Shape1g = new LODModelPart(this, 64, 0);
		Shape1g.addBox(-4F, -4F, 0F, 8, 8, 11);
		Shape1g.setRotationPoint(0F, 16F, -5F);
		Shape1g.setTextureSize(128, 128);
		Shape1g.mirror = true;
		this.setRotation(Shape1g, 0F, 0F, 2.792527F);
		Shape1h = new LODModelPart(this, 64, 0);
		Shape1h.addBox(-4F, -4F, 0F, 8, 8, 11);
		Shape1h.setRotationPoint(0F, 16F, -5F);
		Shape1h.setTextureSize(128, 128);
		Shape1h.mirror = true;
		this.setRotation(Shape1h, 0F, 0F, 0F);
		Shape3 = new LODModelPart(this, 102, 0);
		Shape3.addBox(-2F, -2F, 0F, 4, 4, 3);
		Shape3.setRotationPoint(0F, 16F, -8F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0.3926991F);
		Shape3a = new LODModelPart(this, 102, 0);
		Shape3a.addBox(-2F, -2F, 0F, 4, 4, 3);
		Shape3a.setRotationPoint(0F, 16F, -8F);
		Shape3a.setTextureSize(128, 128);
		Shape3a.mirror = true;
		this.setRotation(Shape3a, 0F, 0F, 0.7853982F);
		Shape3b = new LODModelPart(this, 102, 0);
		Shape3b.addBox(-2F, -2F, 0F, 4, 4, 3);
		Shape3b.setRotationPoint(0F, 16F, -8F);
		Shape3b.setTextureSize(128, 128);
		Shape3b.mirror = true;
		this.setRotation(Shape3b, 0F, 0F, 0F);
		Shape4 = new LODModelPart(this, 102, 8);
		Shape4.addBox(-1F, -1F, 0F, 2, 2, 5);
		Shape4.setRotationPoint(0F, 16F, -8.5F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, 0F, 0.7853982F);
		Shape4a = new LODModelPart(this, 102, 8);
		Shape4a.addBox(-1F, -1F, 0F, 2, 2, 5);
		Shape4a.setRotationPoint(0F, 16F, -8.5F);
		Shape4a.setTextureSize(128, 128);
		Shape4a.mirror = true;
		this.setRotation(Shape4a, 0F, 0F, 0F);
		Shape5 = new LODModelPart(this, 118, 10);
		Shape5.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape5.setRotationPoint(-0.5F, 20F, -6F);
		Shape5.setTextureSize(128, 128);
		Shape5.mirror = true;
		this.setRotation(Shape5, 0F, 0F, 0F);
		Shape5a = new LODModelPart(this, 118, 0);
		Shape5a.addBox(0F, 0F, 0F, 1, 1, 3);
		Shape5a.setRotationPoint(-0.5F, 18F, -7.9F);
		Shape5a.setTextureSize(128, 128);
		Shape5a.mirror = true;
		this.setRotation(Shape5a, 0F, 0F, 0F);
		Shape5b = new LODModelPart(this, 118, 5);
		Shape5b.addBox(0F, 0F, 0F, 1, 1, 2);
		Shape5b.setRotationPoint(-0.5F, 19F, -7F);
		Shape5b.setTextureSize(128, 128);
		Shape5b.mirror = true;
		this.setRotation(Shape5b, 0F, 0F, 0F);
		Shape5c = new LODModelPart(this, 118, 10);
		Shape5c.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape5c.setRotationPoint(4F, 15.5F, -6F);
		Shape5c.setTextureSize(128, 128);
		Shape5c.mirror = true;
		this.setRotation(Shape5c, 0F, 0F, 0F);
		Shape5d = new LODModelPart(this, 118, 5);
		Shape5d.addBox(0F, 0F, 0F, 1, 1, 2);
		Shape5d.setRotationPoint(-0.5F, 12F, -7F);
		Shape5d.setTextureSize(128, 128);
		Shape5d.mirror = true;
		this.setRotation(Shape5d, 0F, 0F, 0F);
		Shape5e = new LODModelPart(this, 118, 10);
		Shape5e.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape5e.setRotationPoint(-0.5F, 11F, -6F);
		Shape5e.setTextureSize(128, 128);
		Shape5e.mirror = true;
		this.setRotation(Shape5e, 0F, 0F, 0F);
		Shape5f = new LODModelPart(this, 118, 0);
		Shape5f.addBox(0F, 0F, 0F, 1, 1, 3);
		Shape5f.setRotationPoint(-0.5F, 13F, -7.9F);
		Shape5f.setTextureSize(128, 128);
		Shape5f.mirror = true;
		this.setRotation(Shape5f, 0F, 0F, 0F);
		Shape5g = new LODModelPart(this, 118, 0);
		Shape5g.addBox(0F, 0F, 0F, 1, 1, 3);
		Shape5g.setRotationPoint(2F, 15.5F, -7.9F);
		Shape5g.setTextureSize(128, 128);
		Shape5g.mirror = true;
		this.setRotation(Shape5g, 0F, 0F, 0F);
		Shape5h = new LODModelPart(this, 118, 5);
		Shape5h.addBox(0F, 0F, 0F, 1, 1, 2);
		Shape5h.setRotationPoint(3F, 15.5F, -7F);
		Shape5h.setTextureSize(128, 128);
		Shape5h.mirror = true;
		this.setRotation(Shape5h, 0F, 0F, 0F);
		Shape5i = new LODModelPart(this, 118, 0);
		Shape5i.addBox(0F, 0F, 0F, 1, 1, 3);
		Shape5i.setRotationPoint(-3F, 15.5F, -7.9F);
		Shape5i.setTextureSize(128, 128);
		Shape5i.mirror = true;
		this.setRotation(Shape5i, 0F, 0F, 0F);
		Shape5j = new LODModelPart(this, 118, 5);
		Shape5j.addBox(0F, 0F, 0F, 1, 1, 2);
		Shape5j.setRotationPoint(-4F, 15.5F, -7F);
		Shape5j.setTextureSize(128, 128);
		Shape5j.mirror = true;
		this.setRotation(Shape5j, 0F, 0F, 0F);
		Shape5k = new LODModelPart(this, 118, 10);
		Shape5k.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape5k.setRotationPoint(-5F, 15.5F, -6F);
		Shape5k.setTextureSize(128, 128);
		Shape5k.mirror = true;
		this.setRotation(Shape5k, 0F, 0F, 0F);
		Shape6 = new LODModelPart(this, 0, 18);
		Shape6.addBox(0F, 0F, 0F, 12, 1, 1);
		Shape6.setRotationPoint(-6F, 22F, 5F);
		Shape6.setTextureSize(128, 128);
		Shape6.mirror = true;
		this.setRotation(Shape6, 0F, 0F, 0F);
		Shape6a = new LODModelPart(this, 0, 18);
		Shape6a.addBox(0F, 0F, 0F, 12, 1, 1);
		Shape6a.setRotationPoint(-6F, 22F, 0F);
		Shape6a.setTextureSize(128, 128);
		Shape6a.mirror = true;
		this.setRotation(Shape6a, 0F, 0F, 0F);
		Shape6b = new LODModelPart(this, 28, 18);
		Shape6b.addBox(0F, 0F, 0F, 4, 1, 1);
		Shape6b.setRotationPoint(-7F, 22F, 4.9F);
		Shape6b.setTextureSize(128, 128);
		Shape6b.mirror = true;
		this.setRotation(Shape6b, 0F, 0F, -0.7853982F);
		Shape6c = new LODModelPart(this, 28, 18);
		Shape6c.addBox(-4F, 0F, 0F, 4, 1, 1);
		Shape6c.setRotationPoint(7F, 22F, 4.9F);
		Shape6c.setTextureSize(128, 128);
		Shape6c.mirror = true;
		this.setRotation(Shape6c, 0F, 0F, 0.7853982F);
		Shape7 = new LODModelPart(this, 0, 21);
		Shape7.addBox(0F, 0F, 0F, 1, 1, 11);
		Shape7.setRotationPoint(6F, 22F, -5F);
		Shape7.setTextureSize(128, 128);
		Shape7.mirror = true;
		this.setRotation(Shape7, 0F, 0F, 0F);
		Shape6d = new LODModelPart(this, 28, 18);
		Shape6d.addBox(0F, 0F, 0F, 4, 1, 1);
		Shape6d.setRotationPoint(-7F, 22F, -4.9F);
		Shape6d.setTextureSize(128, 128);
		Shape6d.mirror = true;
		this.setRotation(Shape6d, 0F, 0F, -0.7853982F);
		Shape6e = new LODModelPart(this, 28, 18);
		Shape6e.addBox(0F, 0F, 0F, 4, 1, 1);
		Shape6e.setRotationPoint(-7F, 22F, 0F);
		Shape6e.setTextureSize(128, 128);
		Shape6e.mirror = true;
		this.setRotation(Shape6e, 0F, 0F, -0.7853982F);
		Shape6f = new LODModelPart(this, 0, 18);
		Shape6f.addBox(0F, 0F, 0F, 12, 1, 1);
		Shape6f.setRotationPoint(-6F, 22F, -5F);
		Shape6f.setTextureSize(128, 128);
		Shape6f.mirror = true;
		this.setRotation(Shape6f, 0F, 0F, 0F);
		Shape7a = new LODModelPart(this, 0, 21);
		Shape7a.addBox(0F, 0F, 0F, 1, 1, 11);
		Shape7a.setRotationPoint(-7F, 22F, -5F);
		Shape7a.setTextureSize(128, 128);
		Shape7a.mirror = true;
		this.setRotation(Shape7a, 0F, 0F, 0F);
		Shape6g = new LODModelPart(this, 28, 18);
		Shape6g.addBox(-4F, 0F, 0F, 4, 1, 1);
		Shape6g.setRotationPoint(7F, 22F, 0F);
		Shape6g.setTextureSize(128, 128);
		Shape6g.mirror = true;
		this.setRotation(Shape6g, 0F, 0F, 0.7853982F);
		Shape6h = new LODModelPart(this, 28, 18);
		Shape6h.addBox(-4F, 0F, 0F, 4, 1, 1);
		Shape6h.setRotationPoint(7F, 22F, -4.9F);
		Shape6h.setTextureSize(128, 128);
		Shape6h.mirror = true;
		this.setRotation(Shape6h, 0F, 0F, 0.7853982F);
		Shape3c = new LODModelPart(this, 102, 0);
		Shape3c.addBox(-2F, -2F, 0F, 4, 4, 3);
		Shape3c.setRotationPoint(0F, 16F, -8F);
		Shape3c.setTextureSize(128, 128);
		Shape3c.mirror = true;
		this.setRotation(Shape3c, 0F, 0F, -0.3926991F);
		Shape8 = new LODModelPart(this, 102, 23);
		Shape8.addBox(0F, 0F, 0F, 5, 2, 1);
		Shape8.setRotationPoint(-2.5F, 18.5F, -5.2F);
		Shape8.setTextureSize(128, 128);
		Shape8.mirror = true;
		this.setRotation(Shape8, 0F, 0F, 0F);
		Shape9a = new LODModelPart(this, 39, 18);
		Shape9a.addBox(0F, 0F, 0F, 4, 1, 2);
		Shape9a.setRotationPoint(-2F, 18F, 5.5F);
		Shape9a.setTextureSize(128, 128);
		Shape9a.mirror = true;
		this.setRotation(Shape9a, 0F, 0F, 0F);
		Shape9b = new LODModelPart(this, 118, 14);
		Shape9b.addBox(0F, 0F, 0F, 1, 5, 2);
		Shape9b.setRotationPoint(-3F, 13.5F, 5.5F);
		Shape9b.setTextureSize(128, 128);
		Shape9b.mirror = true;
		this.setRotation(Shape9b, 0F, 0F, 0F);
		Shape9c = new LODModelPart(this, 39, 18);
		Shape9c.addBox(0F, 0F, 0F, 4, 1, 2);
		Shape9c.setRotationPoint(-2F, 13F, 5.5F);
		Shape9c.setTextureSize(128, 128);
		Shape9c.mirror = true;
		this.setRotation(Shape9c, 0F, 0F, 0F);
		Shape9d = new LODModelPart(this, 0, 34);
		Shape9d.addBox(0F, 0F, 0F, 1, 5, 1);
		Shape9d.setRotationPoint(-4F, 13.5F, 5.5F);
		Shape9d.setTextureSize(128, 128);
		Shape9d.mirror = true;
		this.setRotation(Shape9d, 0F, 0F, 0F);
		Shape10 = new LODModelPart(this, 46, 22);
		Shape10.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape10.setRotationPoint(0F, 16F, 6F);
		Shape10.setTextureSize(128, 128);
		Shape10.mirror = true;
		this.setRotation(Shape10, 0F, 0F, 0F);
		Shape10a = new LODModelPart(this, 54, 18);
		Shape10a.addBox(0F, 0F, 0F, 1, 1, 2);
		Shape10a.setRotationPoint(-0.5F, 15.5F, 5.3F);
		Shape10a.setTextureSize(128, 128);
		Shape10a.mirror = true;
		this.setRotation(Shape10a, 0F, 0F, 0F);
		Shape10b = new LODModelPart(this, 38, 23);
		Shape10b.addBox(0F, 0F, 0F, 2, 1, 1);
		Shape10b.setRotationPoint(0F, 15F, 6F);
		Shape10b.setTextureSize(128, 128);
		Shape10b.mirror = true;
		this.setRotation(Shape10b, 0F, 0F, 0F);
		Shape10c = new LODModelPart(this, 46, 22);
		Shape10c.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape10c.setRotationPoint(-1F, 14F, 6F);
		Shape10c.setTextureSize(128, 128);
		Shape10c.mirror = true;
		this.setRotation(Shape10c, 0F, 0F, 0F);
		Shape10d = new LODModelPart(this, 38, 23);
		Shape10d.addBox(0F, 0F, 0F, 2, 1, 1);
		Shape10d.setRotationPoint(-2F, 16F, 6F);
		Shape10d.setTextureSize(128, 128);
		Shape10d.mirror = true;
		this.setRotation(Shape10d, 0F, 0F, 0F);
		Shape11 = new LODModelPart(this, 26, 21);
		Shape11.addBox(0F, 0F, 0F, 4, 4, 1);
		Shape11.setRotationPoint(-2F, 14F, 5.1F);
		Shape11.setTextureSize(128, 128);
		Shape11.mirror = true;
		this.setRotation(Shape11, 0F, 0F, 0F);
		Shape9e = new LODModelPart(this, 118, 14);
		Shape9e.addBox(0F, 0F, 0F, 1, 5, 2);
		Shape9e.setRotationPoint(2F, 13.5F, 5.5F);
		Shape9e.setTextureSize(128, 128);
		Shape9e.mirror = true;
		this.setRotation(Shape9e, 0F, 0F, 0F);
		Shape9f = new LODModelPart(this, 6, 34);
		Shape9f.addBox(0F, 0F, 0F, 6, 1, 1);
		Shape9f.setRotationPoint(-3F, 18.5F, 5.5F);
		Shape9f.setTextureSize(128, 128);
		Shape9f.mirror = true;
		this.setRotation(Shape9f, 0F, 0F, 0F);
		Shape9g = new LODModelPart(this, 0, 34);
		Shape9g.addBox(0F, 0F, 0F, 1, 5, 1);
		Shape9g.setRotationPoint(3F, 13.5F, 5.5F);
		Shape9g.setTextureSize(128, 128);
		Shape9g.mirror = true;
		this.setRotation(Shape9g, 0F, 0F, 0F);
		Shape9h = new LODModelPart(this, 26, 28);
		Shape9h.addBox(0F, 0F, 0F, 4, 1, 1);
		Shape9h.setRotationPoint(-2F, 19.5F, 5.5F);
		Shape9h.setTextureSize(128, 128);
		Shape9h.mirror = true;
		this.setRotation(Shape9h, 0F, 0F, 0F);
		Shape9h1 = new LODModelPart(this, 6, 34);
		Shape9h1.addBox(0F, 0F, 0F, 6, 1, 1);
		Shape9h1.setRotationPoint(-3F, 12.5F, 5.5F);
		Shape9h1.setTextureSize(128, 128);
		Shape9h1.mirror = true;
		this.setRotation(Shape9h1, 0F, 0F, 0F);
		Shape9h2 = new LODModelPart(this, 26, 28);
		Shape9h2.addBox(0F, 0F, 0F, 4, 1, 1);
		Shape9h2.setRotationPoint(-2F, 11.5F, 5.5F);
		Shape9h2.setTextureSize(128, 128);
		Shape9h2.mirror = true;
		this.setRotation(Shape9h2, 0F, 0F, 0F);
		Shape8a4 = new LODModelPart(this, 102, 15);
		Shape8a4.addBox(0F, 0F, 0F, 6, 6, 1);
		Shape8a4.setRotationPoint(-3F, 13F, -5.5F);
		Shape8a4.setTextureSize(128, 128);
		Shape8a4.mirror = true;
		this.setRotation(Shape8a4, 0F, 0F, 0F);
		Shape8a1b = new LODModelPart(this, 102, 35);
		Shape8a1b.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape8a1b.setRotationPoint(-3.5F, 18.5F, -5.1F);
		Shape8a1b.setTextureSize(128, 128);
		Shape8a1b.mirror = true;
		this.setRotation(Shape8a1b, 0F, 0F, 0F);
		Shape8a1 = new LODModelPart(this, 102, 23);
		Shape8a1.addBox(0F, 0F, 0F, 5, 2, 1);
		Shape8a1.setRotationPoint(-2.5F, 11.5F, -5.2F);
		Shape8a1.setTextureSize(128, 128);
		Shape8a1.mirror = true;
		this.setRotation(Shape8a1, 0F, 0F, 0F);
		Shape8a3 = new LODModelPart(this, 102, 27);
		Shape8a3.addBox(0F, 0F, 0F, 2, 5, 1);
		Shape8a3.setRotationPoint(-4.5F, 13.5F, -5.2F);
		Shape8a3.setTextureSize(128, 128);
		Shape8a3.mirror = true;
		this.setRotation(Shape8a3, 0F, 0F, 0F);
		Shape8a2 = new LODModelPart(this, 102, 27);
		Shape8a2.addBox(0F, 0F, 0F, 2, 5, 1);
		Shape8a2.setRotationPoint(2.5F, 13.5F, -5.2F);
		Shape8a2.setTextureSize(128, 128);
		Shape8a2.mirror = true;
		this.setRotation(Shape8a2, 0F, 0F, 0F);
		Shape8a1b1 = new LODModelPart(this, 102, 35);
		Shape8a1b1.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape8a1b1.setRotationPoint(2.5F, 12.5F, -5.1F);
		Shape8a1b1.setTextureSize(128, 128);
		Shape8a1b1.mirror = true;
		this.setRotation(Shape8a1b1, 0F, 0F, 0F);
		Shape8a1b2 = new LODModelPart(this, 102, 35);
		Shape8a1b2.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape8a1b2.setRotationPoint(2.5F, 18.5F, -5.1F);
		Shape8a1b2.setTextureSize(128, 128);
		Shape8a1b2.mirror = true;
		this.setRotation(Shape8a1b2, 0F, 0F, 0F);
		Shape8a1b3 = new LODModelPart(this, 102, 35);
		Shape8a1b3.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape8a1b3.setRotationPoint(-3.5F, 12.5F, -5.1F);
		Shape8a1b3.setTextureSize(128, 128);
		Shape8a1b3.mirror = true;
		this.setRotation(Shape8a1b3, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li, float phi, float theta)
	{
		Shape2.render(te, f5);
		Shape1.render(te, f5);
		Shape1a.render(te, f5);
		Shape1b.render(te, f5);
		Shape1c.render(te, f5);
		Shape1d.render(te, f5);
		Shape1e.render(te, f5);
		Shape1f.render(te, f5);
		Shape1g.render(te, f5);
		Shape1h.render(te, f5);
		Shape3.render(te, f5);
		Shape3a.render(te, f5);
		Shape3b.render(te, f5);

		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(phi, 0, 0, 1);
		GL11.glTranslated(0, -1, 0);
		Shape4.render(te, f5);
		Shape4a.render(te, f5);
		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(-phi, 0, 0, 1);
		GL11.glTranslated(0, -1, 0);

		Shape5.render(te, f5);
		Shape5a.render(te, f5);
		Shape5b.render(te, f5);
		Shape5c.render(te, f5);
		Shape5d.render(te, f5);
		Shape5e.render(te, f5);
		Shape5f.render(te, f5);
		Shape5g.render(te, f5);
		Shape5h.render(te, f5);
		Shape5i.render(te, f5);
		Shape5j.render(te, f5);
		Shape5k.render(te, f5);
		Shape6.render(te, f5);
		Shape6a.render(te, f5);
		Shape6b.render(te, f5);
		Shape6c.render(te, f5);
		Shape7.render(te, f5);
		Shape6d.render(te, f5);
		Shape6e.render(te, f5);
		Shape6f.render(te, f5);
		Shape7a.render(te, f5);
		Shape6g.render(te, f5);
		Shape6h.render(te, f5);
		Shape3c.render(te, f5);
		Shape8.render(te, f5);
		Shape9a.render(te, f5);
		Shape9b.render(te, f5);
		Shape9c.render(te, f5);
		Shape9d.render(te, f5);

		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(phi*2, 0, 0, 1);
		GL11.glTranslated(0, -1, 0);
		Shape10.render(te, f5);
		Shape10a.render(te, f5);
		Shape10b.render(te, f5);
		Shape10c.render(te, f5);
		Shape10d.render(te, f5);
		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(-phi*2, 0, 0, 1);
		GL11.glTranslated(0, -1, 0);

		Shape11.render(te, f5);
		Shape9e.render(te, f5);
		Shape9f.render(te, f5);
		Shape9g.render(te, f5);
		Shape9h.render(te, f5);
		Shape9h1.render(te, f5);
		Shape9h2.render(te, f5);
		Shape8a4.render(te, f5);
		Shape8a1b.render(te, f5);
		Shape8a1.render(te, f5);
		Shape8a3.render(te, f5);
		Shape8a2.render(te, f5);
		Shape8a1b1.render(te, f5);
		Shape8a1b2.render(te, f5);
		Shape8a1b3.render(te, f5);
	}
}
