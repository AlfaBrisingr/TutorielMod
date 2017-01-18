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
public class ItemsRegistry {

    /**
     * Création d'un Item
     */
    public static final Item LOVE = new ItemLove().setUnlocalizedName("loveitem").setCreativeTab(CreativeTabs.tabMisc);

    /**
     * Fonction qui enregistre tous les items
     */
    public static void registerItems()
    {
        GameRegistry.registerItem(LOVE, "love_item");
    }


    /**
     * Fonction qui enregistre tous les items pour le Client, pour le mod Créatif
     */
    @SideOnly(Side.CLIENT)
    public static void registerItemsModels()
    {
        ModelLoader.setCustomModelResourceLocation(LOVE, 0, new ModelResourceLocation(ModTutorial.MODID + ":love_item", "inventory"));
    }
}
