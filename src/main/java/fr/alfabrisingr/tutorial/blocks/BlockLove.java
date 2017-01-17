package fr.alfabrisingr.tutorial.blocks;

import fr.alfabrisingr.tutorial.items.TutorialItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Océane on 17/01/2017.
 */
public class BlockLove extends Block{

    public BlockLove(Material materialIn) {
        super(materialIn);
        this.setHarvestLevel("pickaxe",0);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return TutorialItems.TUTORIAL;
    }
}
