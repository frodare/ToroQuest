package net.torocraft.toroquest;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.torocraft.toroquest.block.ToroQuestBlocks;
import net.torocraft.toroquest.civilization.CivilizationGeneratorHandlers;
import net.torocraft.toroquest.civilization.CivilizationHandlers;
import net.torocraft.toroquest.civilization.player.PlayerCivilizationCapabilityImpl;
import net.torocraft.toroquest.entities.ToroQuestEntities;
import net.torocraft.toroquest.generation.WorldGenPlacer;
import net.torocraft.toroquest.generation.village.VillageHandlerBarracks;
import net.torocraft.toroquest.generation.village.VillageHandlerGuardTower;
import net.torocraft.toroquest.generation.village.VillageHandlerKeep;
import net.torocraft.toroquest.generation.village.VillageHandlerShop;
import net.torocraft.toroquest.generation.village.VillageHandlerTrophy;
import net.torocraft.toroquest.item.ToroQuestItems;
import net.torocraft.toroquest.network.ToroQuestPacketHandler;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		MinecraftForge.EVENT_BUS.register(new CivilizationGeneratorHandlers());
		MinecraftForge.EVENT_BUS.register(new EventHandlers());
		MinecraftForge.EVENT_BUS.register(new CivilizationHandlers());
		VillageHandlerKeep.init();
		VillageHandlerTrophy.init();
		VillageHandlerShop.init();
		VillageHandlerGuardTower.init();
		VillageHandlerBarracks.init();
		ToroQuestPacketHandler.init();
	}

	public void init(FMLInitializationEvent e) {
		PlayerCivilizationCapabilityImpl.register();
		ToroQuestItems.init();
		ToroQuestBlocks.init();
		int seedOffset = 1;
		WorldGenPlacer.init();
		ToroQuestEntities.init();
	}

	public void postInit(FMLPostInitializationEvent e) {

	}
}
