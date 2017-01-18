package fr.alfabrisingr.tutorial;

import fr.alfabrisingr.tutorial.blocks.BlocksRegistry;
import fr.alfabrisingr.tutorial.items.ItemsRegistry;

import java.io.File;

/**
 * Classe Principale pour Initialisation nom recommandé "CommonProxy"
 */
public class CommonProxy {

    public void preInit(File configfile){
        BlocksRegistry.registerBlocks();
        ItemsRegistry.registerItems();
        ModRecipes.registerRecipes();
    }

    public void init(){

    }
}
