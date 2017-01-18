package fr.alfabrisingr.tutorial.client;

import fr.alfabrisingr.tutorial.blocks.BlocksRegistry;
import fr.alfabrisingr.tutorial.items.ItemsRegistry;
import fr.alfabrisingr.tutorial.CommonProxy;

import java.io.File;

/**
 * Classe secondaire pour Initialisation du coté Client, nom recommandé "ClientProxy"
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(File configfile) {
        super.preInit(configfile);
        BlocksRegistry.registerBlocksModels();
        ItemsRegistry.registerItemsModels();
    }

    @Override
    public void init() {
        super.init();
    }
}
