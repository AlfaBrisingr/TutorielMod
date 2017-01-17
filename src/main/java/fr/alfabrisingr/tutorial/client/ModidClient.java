package fr.alfabrisingr.tutorial.client;

import fr.alfabrisingr.tutorial.item.TutorialItem;
import fr.alfabrisingr.tutorial.ModidCommon;

import java.io.File;

/**
 * Classe secondaire pour Initialisation du coté Client, nom recommandé "ClientProxy"
 */
public class ModidClient extends ModidCommon {

    @Override
    public void preInit(File configfile) {
        super.preInit(configfile);
        TutorialItem.registerItemsModels();
    }

    @Override
    public void init() {
        super.init();
    }
}
