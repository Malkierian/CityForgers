package com.elvenwater.malkierian.CityForgers.client;

import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;

import com.elvenwater.malkierian.Plasmacraft.common.CommonProxy;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerRenderers()
	{
		
	}
	
	@Override
	public boolean getEntityInstanceOf(Entity entity)
	{
		return entity instanceof EntityPlayerSP;
	}
	
	@Override
	public void registerTextureFX()
	{
		
	}
	
	private void registerLiquidFX(int stillIndex, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12)
	{
		
	}
}
