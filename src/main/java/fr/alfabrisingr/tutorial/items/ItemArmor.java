package fr.alfabrisingr.tutorial.items;


import fr.alfabrisingr.tutorial.ModTutorial;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

public class ItemArmor extends net.minecraft.item.ItemArmor {

    public ItemArmor(ArmorMaterial material, int armorType) {
        super(material, 0, armorType);
        //Item pour réparer l'armure
        material.customCraftingMaterial = ItemsRegistry.LOVE;
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == ItemsRegistry.leggingslove)
        {
            return ModTutorial.MODID + ":textures/armors/love_layer_2.png";
        }
        return ModTutorial.MODID + ":textures/armors/love_layer_1.png";
    }

    public boolean getIsRepairable(ItemStack input, ItemStack repair)
    {
        if(repair.getItem() == ItemsRegistry.LOVE)
        {
            return true;
        }
        return false;
    }
}
