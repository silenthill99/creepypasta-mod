package fr.silenthill99.creepypasta_mod.data.models;

import fr.silenthill99.creepypasta_mod.Main;
import fr.silenthill99.creepypasta_mod.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockStateGenerator extends BlockStateProvider {

    public BlockStateGenerator(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Main.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.TEST_BLOCK.get());
    }

    @Override
    public void simpleBlock(Block block) {
        super.simpleBlock(block);
        simpleBlockItem(block, cubeAll(block));
    }
}
