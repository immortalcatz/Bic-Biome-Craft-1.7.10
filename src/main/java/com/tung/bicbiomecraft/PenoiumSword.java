package com.tung.bicbiomecraft;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class PenoiumSword extends ItemSword{

	public PenoiumSword(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		// TODO Auto-generated constructor stub
	}

	//Damage to entity.
	public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
	{
		par1ItemStack.damageItem(1, par3EntityLivingBase);
		par2EntityLivingBase.addPotionEffect(new PotionEffect(Potion.poison.id, 100, 60));
		return true;
	}
	
}
