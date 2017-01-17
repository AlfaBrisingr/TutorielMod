package fr.alfabrisingr.tutorial.client;

import fr.alfabrisingr.tutorial.blocks.TutorialBlocks;
import fr.alfabrisingr.tutorial.items.TutorialItems;
import fr.alfabrisingr.tutorial.CommonProxy;

import java.io.File;

/**
 * Classe secondaire pour Initialisation du coté Client, nom recommandé "ClientProxy"
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(File configfile) {
        super.preInit(configfile);
        TutorialBlocks.registerBlocksModels();
        TutorialItems.registerItemsModels();
    }

    @Override
    public void init() {
        super.init();
    }
}
