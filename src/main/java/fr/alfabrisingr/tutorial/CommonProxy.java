package fr.alfabrisingr.tutorial;

import fr.alfabrisingr.tutorial.blocks.TutorialBlocks;
import fr.alfabrisingr.tutorial.items.TutorialItems;

import java.io.File;

/**
 * Classe Principale pour Initialisation nom recommandé "CommonProxy"
 */
public class CommonProxy {

    public void preInit(File configfile){
        TutorialBlocks.registerBlocks();
        TutorialItems.registerItems();
    }

    public void init(){

    }
}
