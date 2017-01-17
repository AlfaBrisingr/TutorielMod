package fr.alfabrisingr.tutorial.items;

import fr.alfabrisingr.tutorial.ModTutorial;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Classe Principale pour les items. Création des items ici
 */
public class TutorialItems {

    /**
     * Création d'un Item
     */
    public static final Item TUTORIAL = new ItemTutorial().setUnlocalizedName("champi").setCreativeTab(CreativeTabs.tabMisc);

    /**
     * Fonction qui enregistre tous les items
     */
    public static void registerItems()
    {
        GameRegistry.registerItem(TUTORIAL, "tutorial_item");
    }


    /**
     * Fonction qui enregistre tous les items pour le Client, pour le mod Créatif
     */
    @SideOnly(Side.CLIENT)
    public static void registerItemsModels()
    {
        ModelLoader.setCustomModelResourceLocation(TUTORIAL, 0, new ModelResourceLocation(ModTutorial.MODID + ":tutorial_item", "inventory"));
    }
}
