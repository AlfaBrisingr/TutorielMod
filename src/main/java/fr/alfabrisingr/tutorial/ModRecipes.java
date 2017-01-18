package fr.alfabrisingr.tutorial;

import fr.alfabrisingr.tutorial.items.ItemsRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

    public static void registerRecipes(){
        GameRegistry.addRecipe(new ItemStack(ItemsRegistry.helmetlove), new Object[]{"XXX", "X X", 'X', ItemsRegistry.LOVE});
        GameRegistry.addRecipe(new ItemStack(ItemsRegistry.bootslove), new Object[]{"X X", "X X", 'X', ItemsRegistry.LOVE});
        GameRegistry.addRecipe(new ItemStack(ItemsRegistry.chestPlatelove), new Object[]{"X X", "XXX", "XXX", 'X', ItemsRegistry.LOVE});
        GameRegistry.addRecipe(new ItemStack(ItemsRegistry.leggingslove), new Object[]{"XXX", "X X", "X X", 'X', ItemsRegistry.LOVE});
    }
}
