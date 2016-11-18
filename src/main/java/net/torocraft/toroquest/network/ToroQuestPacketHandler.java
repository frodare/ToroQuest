package net.torocraft.toroquest.network;

import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;
import net.torocraft.toroquest.ToroQuest;
import net.torocraft.toroquest.network.message.MessagePlayerCivilizationSetInCiv;
import net.torocraft.toroquest.network.message.MessageRequestPlayerCivilizationSync;
import net.torocraft.toroquest.network.message.MessageSetPlayerReputation;

public class ToroQuestPacketHandler {

	public static int messageId = 15;

	public static SimpleNetworkWrapper INSTANCE = null;

	public ToroQuestPacketHandler() {
	}

	public static int nextId() {
		return messageId++;
	}

	public static void init() {
		INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(ToroQuest.MODID);

		INSTANCE.registerMessage(MessageRequestPlayerCivilizationSync.Handler.class, MessageRequestPlayerCivilizationSync.class, 3, Side.SERVER);

		INSTANCE.registerMessage(MessageSetPlayerReputation.Handler.class, MessageSetPlayerReputation.class, 2, Side.CLIENT);

		INSTANCE.registerMessage(MessagePlayerCivilizationSetInCiv.Handler.class, MessagePlayerCivilizationSetInCiv.class, 1, Side.CLIENT);



	}
}