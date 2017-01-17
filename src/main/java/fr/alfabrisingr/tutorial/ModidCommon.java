package fr.alfabrisingr.tutorial;

import fr.alfabrisingr.tutorial.item.TutorialItem;

import java.io.File;

public class ModidCommon {

    public void preInit(File configfile){
        TutorialItem.registerItems();
    }

    public void init(){

    }
}
