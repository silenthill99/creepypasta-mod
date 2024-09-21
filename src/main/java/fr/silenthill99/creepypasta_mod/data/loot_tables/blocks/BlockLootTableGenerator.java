package fr.silenthill99.creepypasta_mod.data.loot_tables.blocks;

import fr.silenthill99.creepypasta_mod.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraftforge.fml.RegistryObject;

import java.util.stream.Collectors;

public class BlockLootTableGenerator extends BlockLootTables {
    @Override
    protected void addTables() {

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries()
                .stream()
                .map(RegistryObject::get)
                .collect(Collectors.toList());
    }
}
