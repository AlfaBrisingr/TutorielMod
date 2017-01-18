package fr.alfabrisingr.tutorial.items;

import fr.alfabrisingr.tutorial.ModTutorial;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.item.ItemArmor.ArmorMaterial;

/**
 * Classe Principale pour les items. Création des items ici
 */
public class ItemsRegistry {

    /**
     * Création d'un Item
     */
    public static final Item LOVE = new ItemLove().setUnlocalizedName("loveitem").setCreativeTab(CreativeTabs.tabMisc);

    public static ArmorMaterial armorLove = EnumHelper.addArmorMaterial("armorLove","textures/items/love_item.png",25,new int[]{4,6,5,4},20);

    public static final Item helmetlove = new ItemArmor(armorLove, 0).setUnlocalizedName("helmet_love").setCreativeTab(CreativeTabs.tabCombat);
    public static final Item chestPlatelove = new ItemArmor(armorLove, 1).setUnlocalizedName("chestplate_love").setCreativeTab(CreativeTabs.tabCombat);
    public static final Item leggingslove = new ItemArmor(armorLove, 2).setUnlocalizedName("leggins_love").setCreativeTab(CreativeTabs.tabCombat);
    public static final Item bootslove = new ItemArmor(armorLove, 3).setUnlocalizedName("boots_love").setCreativeTab(CreativeTabs.tabCombat);
    /**
     * Fonction qui enregistre tous les items
     */
    public static void registerItems()
    {
        GameRegistry.registerItem(LOVE, "love_item");
        GameRegistry.registerItem(helmetlove, "helmet_love");
        GameRegistry.registerItem(chestPlatelove, "chestplate_love");
        GameRegistry.registerItem(leggingslove, "leggins_love");
        GameRegistry.registerItem(bootslove, "boots_love");
    }


    /**
     * Fonction qui enregistre tous les items pour le Client, pour le mod Créatif
     */
    @SideOnly(Side.CLIENT)
    public static void registerItemsModels()
    {
        ModelLoader.setCustomModelResourceLocation(LOVE, 0, new ModelResourceLocation(ModTutorial.MODID + ":love_item", "inventory"));
        ModelLoader.setCustomModelResourceLocation(helmetlove, 0, new ModelResourceLocation(ModTutorial.MODID + ":helmet_love", "inventory"));
        ModelLoader.setCustomModelResourceLocation(chestPlatelove, 0, new ModelResourceLocation(ModTutorial.MODID + ":chestplate_love", "inventory"));
        ModelLoader.setCustomModelResourceLocation(leggingslove, 0, new ModelResourceLocation(ModTutorial.MODID + ":leggings_love", "inventory"));
        ModelLoader.setCustomModelResourceLocation(bootslove, 0, new ModelResourceLocation(ModTutorial.MODID + ":boots_love", "inventory"));
    }
}
