package net.blay09.mods.craftingtweaks;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.blay09.mods.craftingtweaks.net.MessageHello;
import net.blay09.mods.craftingtweaks.net.NetworkHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.common.MinecraftForge;

public class CommonProxy {

    public void init(FMLInitializationEvent event) {
    }

    public void postInit(FMLPostInitializationEvent event) {
    }

    public void receivedHello(EntityPlayer entityPlayer) {
        NetworkHandler.instance.sendTo(new MessageHello(NetworkHandler.PROTOCOL_VERSION), (EntityPlayerMP) entityPlayer);
    }

}
