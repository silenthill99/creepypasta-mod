package fr.silenthill99.creepypasta_mod.init;

import fr.silenthill99.creepypasta_mod.Main;
import fr.silenthill99.creepypasta_mod.init.tile_entities.TestBlockTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntity {
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, Main.MODID);

    public static final RegistryObject<TileEntityType<?>> TEST = TILE_ENTITIES.register("test", () -> TileEntityType.Builder.of(TestBlockTileEntity::new, ModBlocks.TEST_BLOCK.get()).build(null));
}
