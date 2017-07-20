package bexhion.bloodthirst.common;

import bexhion.bloodthirst.common.core.proxy.CommonProxy;
import bexhion.bloodthirst.common.reference.RefMain;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.*;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RefMain.MOD_ID, name = RefMain.NAME, version = RefMain.VERSION, dependencies = RefMain.DEPENDENCIES)
public class BloodThirst {

    @SidedProxy(serverSide = RefMain.PROXY_COMMON, clientSide = RefMain.PROXY_CLIENT)
    public static CommonProxy proxy;

    @Instance(RefMain.MOD_ID)
    public static BloodThirst instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event){
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }
}