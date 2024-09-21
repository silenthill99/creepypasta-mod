package fr.silenthill99.creepypasta_mod.init;

import fr.silenthill99.creepypasta_mod.Main;
import fr.silenthill99.creepypasta_mod.init.blocks.JeffTheKiller;
import fr.silenthill99.creepypasta_mod.init.blocks.TestBlock;
import fr.silenthill99.creepypasta_mod.utils.ModItemGroups;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MODID);

    public static final RegistryObject<Block> TEST_BLOCK = createBlock("test_block", TestBlock::new);

    private static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier) {
        RegistryObject<Block> blocks = BLOCKS.register(name, supplier);
        ModItems.ITEMS.register(name, () -> new BlockItem(blocks.get(), new Item.Properties().tab(ModItemGroups.Creepypastas)));
        return blocks;
    }

}
