package fr.alfabrisingr.tutorial;

import fr.alfabrisingr.tutorial.item.TutorialItem;

import java.io.File;

/**
 * Classe Principale pour Initialisation nom recommandé "CommonProxy"
 */
public class ModidCommon {

    public void preInit(File configfile){
        TutorialItem.registerItems();
    }

    public void init(){

    }
}
