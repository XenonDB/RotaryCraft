/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2014
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 07/03/2013 12:52:56 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models;

import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import Reika.RotaryCraft.Base.RotaryModelBase;

import java.util.ArrayList;

import net.minecraft.tileentity.TileEntity;

public class ModelSprinkler extends RotaryModelBase
{
	//fields
	LODModelPart Shape1;
	LODModelPart Shape2;
	LODModelPart Shape1g;
	LODModelPart Shape3;
	LODModelPart Shape3f;
	LODModelPart Shape3e;
	LODModelPart Shape3d;
	LODModelPart Shape1c;
	LODModelPart Shape1b;
	LODModelPart Shape2a;

	public ModelSprinkler()
	{
		textureWidth = 128;
		textureHeight = 32;

		Shape1 = new LODModelPart(this, 87, 0);
		Shape1.addBox(0F, 0F, 0F, 1, 1, 4);
		Shape1.setRotationPoint(2F, 16F, -2F);
		Shape1.setTextureSize(128, 32);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new LODModelPart(this, 25, 0);
		Shape2.addBox(0F, 0F, 0F, 5, 2, 5);
		Shape2.setRotationPoint(-2.5F, 9F, -2.5F);
		Shape2.setTextureSize(128, 32);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape1g = new LODModelPart(this, 0, 0);
		Shape1g.addBox(0F, 0F, 0F, 6, 1, 6);
		Shape1g.setRotationPoint(-3F, 8F, -3F);
		Shape1g.setTextureSize(128, 32);
		Shape1g.mirror = true;
		this.setRotation(Shape1g, 0F, 0F, 0F);
		Shape3 = new LODModelPart(this, 99, 0);
		Shape3.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape3.setRotationPoint(1F, 15F, -2F);
		Shape3.setTextureSize(128, 32);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0F);
		Shape3f = new LODModelPart(this, 99, 0);
		Shape3f.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape3f.setRotationPoint(1F, 15F, 1F);
		Shape3f.setTextureSize(128, 32);
		Shape3f.mirror = true;
		this.setRotation(Shape3f, 0F, 0F, 0F);
		Shape3e = new LODModelPart(this, 99, 0);
		Shape3e.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape3e.setRotationPoint(-2F, 15F, -2F);
		Shape3e.setTextureSize(128, 32);
		Shape3e.mirror = true;
		this.setRotation(Shape3e, 0F, 0F, 0F);
		Shape3d = new LODModelPart(this, 99, 0);
		Shape3d.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape3d.setRotationPoint(-2F, 15F, 1F);
		Shape3d.setTextureSize(128, 32);
		Shape3d.mirror = true;
		this.setRotation(Shape3d, 0F, 0F, 0F);
		Shape1c = new LODModelPart(this, 65, 0);
		Shape1c.addBox(0F, 0F, 0F, 4, 1, 6);
		Shape1c.setRotationPoint(-2F, 16F, -3F);
		Shape1c.setTextureSize(128, 32);
		Shape1c.mirror = true;
		this.setRotation(Shape1c, 0F, 0F, 0F);
		Shape1b = new LODModelPart(this, 87, 0);
		Shape1b.addBox(0F, 0F, 0F, 1, 1, 4);
		Shape1b.setRotationPoint(-3F, 16F, -2F);
		Shape1b.setTextureSize(128, 32);
		Shape1b.mirror = true;
		this.setRotation(Shape1b, 0F, 0F, 0F);
		Shape2a = new LODModelPart(this, 47, 0);
		Shape2a.addBox(0F, 0F, 0F, 4, 4, 4);
		Shape2a.setRotationPoint(-2F, 11F, -2F);
		Shape2a.setTextureSize(128, 32);
		Shape2a.mirror = true;
		this.setRotation(Shape2a, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li, float phi, float theta)
	{
		Shape1.render(te, f5);
		Shape2.render(te, f5);
		Shape1g.render(te, f5);
		Shape3.render(te, f5);
		Shape3f.render(te, f5);
		Shape3e.render(te, f5);
		Shape3d.render(te, f5);
		Shape1c.render(te, f5);
		Shape1b.render(te, f5);
		Shape2a.render(te, f5);
	}

}
