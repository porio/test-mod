package com.porio.test_mod;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = test_mod.MODID, version = test_mod.VERSION)
public class test_mod
{
    public static final String MODID = "test_mod";
    public static final String VERSION = "1.8-1.0";
    
   
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
		
    }
}
