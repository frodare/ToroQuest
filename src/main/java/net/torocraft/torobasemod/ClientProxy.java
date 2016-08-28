package net.torocraft.torobasemod;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.torocraft.torobasemod.entities.render.ToroEntityRenders;
import net.torocraft.torobasemod.item.ToroBaseModItems;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
        ToroEntityRenders.init();
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
        ToroBaseModItems.registerRenders();
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }

}