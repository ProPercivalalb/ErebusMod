package erebus.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelVelvetWorm extends ModelBase {
	// fields
	ModelRenderer Head1;
	ModelRenderer Head2;
	ModelRenderer BodA1;
	ModelRenderer RLA1;
	ModelRenderer LLA1;
	ModelRenderer BodB1;
	ModelRenderer RLB1;
	ModelRenderer LLB1;
	ModelRenderer BodC1;
	ModelRenderer RLC1;
	ModelRenderer LLC1;
	ModelRenderer BodD1;
	ModelRenderer RLD1;
	ModelRenderer LLD1;
	ModelRenderer BodE1;
	ModelRenderer RLE1;
	ModelRenderer LLE1;
	ModelRenderer BodF1;
	ModelRenderer RAnt;
	ModelRenderer LAnt;

	public ModelVelvetWorm() {
		textureWidth = 64;
		textureHeight = 32;

		Head1 = new ModelRenderer(this, 23, 19);
		Head1.addBox(-2.5F, -1.5F, -5F, 5, 3, 5);
		Head1.setRotationPoint(0F, 21F, -10F);
		Head1.setTextureSize(64, 32);
		Head1.mirror = true;
		setRotation(Head1, 0F, 0F, 0F);
		Head2 = new ModelRenderer(this, 26, 12);
		Head2.addBox(-1.5F, -0.5F, -7F, 3, 2, 2);
		Head2.setRotationPoint(0F, 21F, -10F);
		Head2.setTextureSize(64, 32);
		Head2.mirror = true;
		setRotation(Head2, 0F, 0F, 0F);
		BodA1 = new ModelRenderer(this, 40, 0);
		BodA1.addBox(-3F, -2.5F, -3F, 6, 4, 5);
		BodA1.setRotationPoint(0F, 21F, -7F);
		BodA1.setTextureSize(64, 32);
		BodA1.mirror = true;
		setRotation(BodA1, 0F, 0F, 0F);
		RLA1 = new ModelRenderer(this, 0, 0);
		RLA1.addBox(-1F, -1F, -1F, 4, 2, 2);
		RLA1.setRotationPoint(-5F, 21.5F, -7F);
		RLA1.setTextureSize(64, 32);
		RLA1.mirror = true;
		setRotation(RLA1, 0F, 3.141593F, -0.4363323F);
		LLA1 = new ModelRenderer(this, 0, 0);
		LLA1.addBox(-1F, -1F, -1F, 4, 2, 2);
		LLA1.setRotationPoint(3F, 21.5F, -7F);
		LLA1.setTextureSize(64, 32);
		LLA1.mirror = true;
		setRotation(LLA1, 0F, 0F, 0.4363323F);
		BodB1 = new ModelRenderer(this, 0, 7);
		BodB1.addBox(-3F, -3.5F, -3F, 6, 5, 5);
		BodB1.setRotationPoint(0F, 21F, -2F);
		BodB1.setTextureSize(64, 32);
		BodB1.mirror = true;
		setRotation(BodB1, 0F, 0F, 0F);
		RLB1 = new ModelRenderer(this, 0, 0);
		RLB1.addBox(-1F, -1F, -1F, 4, 2, 2);
		RLB1.setRotationPoint(-5F, 21.5F, -2F);
		RLB1.setTextureSize(64, 32);
		RLB1.mirror = true;
		setRotation(RLB1, 0F, 3.141593F, -0.4363323F);
		LLB1 = new ModelRenderer(this, 0, 0);
		LLB1.addBox(-1F, -1F, -1F, 4, 2, 2);
		LLB1.setRotationPoint(3F, 21.5F, -2F);
		LLB1.setTextureSize(64, 32);
		LLB1.mirror = true;
		setRotation(LLB1, 0F, 0F, 0.4363323F);
		BodC1 = new ModelRenderer(this, 0, 7);
		BodC1.addBox(-3F, -3.5F, -3F, 6, 5, 5);
		BodC1.setRotationPoint(0F, 21F, 3F);
		BodC1.setTextureSize(64, 32);
		BodC1.mirror = true;
		setRotation(BodC1, 0F, 0F, 0F);
		RLC1 = new ModelRenderer(this, 0, 0);
		RLC1.addBox(-1F, -1F, -1F, 4, 2, 2);
		RLC1.setRotationPoint(-5F, 21.5F, 3F);
		RLC1.setTextureSize(64, 32);
		RLC1.mirror = true;
		setRotation(RLC1, 0F, 3.141593F, -0.4363323F);
		LLC1 = new ModelRenderer(this, 0, 0);
		LLC1.addBox(-1F, -1F, -1F, 4, 2, 2);
		LLC1.setRotationPoint(3F, 21.5F, 3F);
		LLC1.setTextureSize(64, 32);
		LLC1.mirror = true;
		setRotation(LLC1, 0F, 0F, 0.4363323F);
		BodD1 = new ModelRenderer(this, 40, 0);
		BodD1.addBox(-3F, -2.5F, -3F, 6, 4, 5);
		BodD1.setRotationPoint(0F, 21F, 8F);
		BodD1.setTextureSize(64, 32);
		BodD1.mirror = true;
		setRotation(BodD1, 0F, 0F, 0F);
		RLD1 = new ModelRenderer(this, 0, 0);
		RLD1.addBox(-1F, -1F, -1F, 4, 2, 2);
		RLD1.setRotationPoint(-5F, 21.5F, 8F);
		RLD1.setTextureSize(64, 32);
		RLD1.mirror = true;
		setRotation(RLD1, 0F, 3.141593F, -0.4363323F);
		LLD1 = new ModelRenderer(this, 0, 0);
		LLD1.addBox(-1F, -1F, -1F, 4, 2, 2);
		LLD1.setRotationPoint(3F, 21.5F, 8F);
		LLD1.setTextureSize(64, 32);
		LLD1.mirror = true;
		setRotation(LLD1, 0F, 0F, 0.4363323F);
		BodE1 = new ModelRenderer(this, 40, 10);
		BodE1.addBox(-3F, -1.5F, -3F, 6, 3, 5);
		BodE1.setRotationPoint(0F, 21F, 13F);
		BodE1.setTextureSize(64, 32);
		BodE1.mirror = true;
		setRotation(BodE1, 0F, 0F, 0F);
		RLE1 = new ModelRenderer(this, 0, 0);
		RLE1.addBox(-1F, -1F, -1F, 4, 2, 2);
		RLE1.setRotationPoint(-5F, 21.5F, 13F);
		RLE1.setTextureSize(64, 32);
		RLE1.mirror = true;
		setRotation(RLE1, 0F, 3.141593F, -0.4363323F);
		LLE1 = new ModelRenderer(this, 0, 0);
		LLE1.addBox(-1F, -1F, -1F, 4, 2, 2);
		LLE1.setRotationPoint(3F, 21.5F, 13F);
		LLE1.setTextureSize(64, 32);
		LLE1.mirror = true;
		setRotation(LLE1, 0F, 0F, 0.4363323F);
		BodF1 = new ModelRenderer(this, 0, 20);
		BodF1.addBox(-2F, -0.5F, -3F, 4, 2, 5);
		BodF1.setRotationPoint(0F, 21F, 18F);
		BodF1.setTextureSize(64, 32);
		BodF1.mirror = true;
		setRotation(BodF1, 0F, 0F, 0F);
		RAnt = new ModelRenderer(this, 23, 0);
		RAnt.addBox(-1.5F, -1F, -12F, 1, 1, 7);
		RAnt.setRotationPoint(0F, 21F, -10F);
		RAnt.setTextureSize(64, 32);
		RAnt.mirror = true;
		setRotation(RAnt, 0F, 0.1745329F, 0F);
		LAnt = new ModelRenderer(this, 23, 0);
		LAnt.addBox(0.5F, -1F, -12F, 1, 1, 7);
		LAnt.setRotationPoint(0F, 21F, -10F);
		LAnt.setTextureSize(64, 32);
		LAnt.mirror = true;
		setRotation(LAnt, 0F, -0.1745329F, 0F);
	}

	@Override
	public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7) {
		super.render(par1Entity, par2, par3, par4, par5, par6, par7);
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		Head1.render(par7);
		Head2.render(par7);
		BodA1.render(par7);
		RLA1.render(par7);
		LLA1.render(par7);
		BodB1.render(par7);
		RLB1.render(par7);
		LLB1.render(par7);
		BodC1.render(par7);
		RLC1.render(par7);
		LLC1.render(par7);
		BodD1.render(par7);
		RLD1.render(par7);
		LLD1.render(par7);
		BodE1.render(par7);
		RLE1.render(par7);
		LLE1.render(par7);
		BodF1.render(par7);
		RAnt.render(par7);
		LAnt.render(par7);

	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {

		float ba = MathHelper.cos(par1 * 1.0F) * 1.0F * par2;
		float bb = MathHelper.cos(par1 + 1.0F * 1.0F) * 2.0F * par2;
		float bc = MathHelper.cos(par1 + 2.0F * 1.0F) * 2.6F * par2;
		float bd = MathHelper.cos(par1 + 3.0F * 1.0F) * 2.0F * par2;
		float be = MathHelper.cos(par1 + 4.0F * 1.0F) * 1.0F * par2;
		float bf = MathHelper.cos(par1 + 5.0F * 1.0F) * 0.35F * par2;

		Head1.rotationPointX = bf;
		Head2.rotationPointX = bf;
		RAnt.rotationPointX = bf;
		LAnt.rotationPointX = bf;

		BodA1.rotationPointY = ba + 20F;

		BodB1.rotationPointY = bb + 20F;

		BodC1.rotationPointY = bc + 20F;

		BodD1.rotationPointY = bd + 20F;

		BodE1.rotationPointY = be + 20F;

		BodF1.rotationPointY = bf + 20F;

		RLA1.rotationPointY = ba + 21.5F;
		LLA1.rotationPointY = ba + 21F;

		RLB1.rotationPointY = bb + 21.5F;
		LLB1.rotationPointY = bb + 21F;

		RLC1.rotationPointY = bc + 21.5F;
		LLC1.rotationPointY = bc + 21F;

		RLD1.rotationPointY = bd + 21.5F;
		LLD1.rotationPointY = bd + 21F;

		RLE1.rotationPointY = be + 21.5F;
		LLE1.rotationPointY = be + 21F;

		RLA1.rotateAngleY = -MathHelper.cos(par1 * 1.0F) * 1.0F * par2;
		LLA1.rotateAngleY = MathHelper.cos(par1 * 1.0F) * 1.0F * par2;

		RLB1.rotateAngleY = MathHelper.cos(par1 * 1.0F) * 1.0F * par2;
		LLB1.rotateAngleY = -MathHelper.cos(par1 * 1.0F) * 1.0F * par2;

		RLC1.rotateAngleY = -MathHelper.cos(par1 * 1.0F) * 1.0F * par2;
		LLC1.rotateAngleY = MathHelper.cos(par1 * 1.0F) * 1.0F * par2;

		RLD1.rotateAngleY = MathHelper.cos(par1 * 1.0F) * 1.0F * par2;
		LLD1.rotateAngleY = -MathHelper.cos(par1 * 1.0F) * 1.0F * par2;

		RLE1.rotateAngleY = -MathHelper.cos(par1 * 1.0F) * 1.0F * par2;
		LLE1.rotateAngleY = MathHelper.cos(par1 * 1.0F) * 1.0F * par2;

		Head1.rotateAngleY = par4 / (180F / (float) Math.PI);
		Head2.rotateAngleY = par4 / (180F / (float) Math.PI);
		RAnt.rotateAngleY = par4 / (180F / (float) Math.PI) + 0.175F;
		LAnt.rotateAngleY = par4 / (180F / (float) Math.PI) - 0.175F;

		Head1.rotateAngleX = par5 / (180F / (float) Math.PI);
		Head2.rotateAngleX = par5 / (180F / (float) Math.PI);
		RAnt.rotateAngleX = par5 / (180F / (float) Math.PI);
		LAnt.rotateAngleX = par5 / (180F / (float) Math.PI);
	}
}
