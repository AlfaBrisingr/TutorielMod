package fr.alfabrisingr.tutorial;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

/**
 * Classe Principale pour la création du mod. Définition du mod
 */
@Mod(modid = ModTutorial.MODID, name = ModTutorial.NAME, version = ModTutorial.VERSION)
public class ModTutorial {
    public static final String MODID = "tutorial";
    public static final String NAME = "Mod Tutoriel";
    public static final String VERSION = "1.0";

    @Instance(ModTutorial.MODID)
    public static ModTutorial instance;

    @SidedProxy(clientSide = "fr.alfabrisingr.tutorial.client.ModidClient", serverSide = "fr.alfabrisingr.tutorial.server.ModidServer")
    public static ModidCommon proxy;

    public static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        logger = event.getModLog();
        proxy.preInit(event.getSuggestedConfigurationFile());
    }

    @EventHandler
    public void init(FMLInitializationEvent event){
        proxy.init();
    }
}
