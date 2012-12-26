package com.elvenwater.malkierian.CityForgers.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "MCF", name = "CityForgers", version = "0.0.1")
@NetworkMod(channels = "MCF", clientSideRequired = false, serverSideRequired = false,
packetHandler = PacketHandler.class)
public class CityForgers
{
	// The instance of your mod that Forge uses.
	@Instance("PlasmaCraft")
	public static CityForgers instance;
	
//	private GuiHandler guiHandler = new GuiHandler();
	
	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide="com.elvenwater.malkierian.Plasmacraft.client.ClientProxy", serverSide="com.elvenwater.malkierian.Plasmacraft.common.CommonProxy")
	public static CommonProxy proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{
		instance = this;
	}
	
	@Init
	public void load(FMLInitializationEvent event)
	{
		
	}

	@PostInit
	public void postInit(FMLPostInitializationEvent event)
	{
		// Stub Method
	}
}
