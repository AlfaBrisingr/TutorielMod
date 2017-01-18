package fr.alfabrisingr.tutorial.blocks;

import fr.alfabrisingr.tutorial.ModTutorial;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Océane on 17/01/2017.
 */
public class BlocksRegistry {

    public static final Block LOVE = new BlockLove(Material.rock).setUnlocalizedName("love").setCreativeTab(CreativeTabs.tabBlock).setHardness(5.0F).setResistance(10.0F);

    public static void registerBlocks(){
        GameRegistry.registerBlock(LOVE, "love_block");
    }

    @SideOnly(Side.CLIENT)
    public static void registerBlocksModels(){
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(LOVE),0, new ModelResourceLocation(ModTutorial.MODID + ":love_block","inventory"));
    }
}
