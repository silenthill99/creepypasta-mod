package fr.silenthill99.creepypasta_mod.init.tile_entities;

import fr.silenthill99.creepypasta_mod.init.ModTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class TestBlockTileEntity extends TileEntity {
    public TestBlockTileEntity() {
        super(ModTileEntity.TEST.get());
    }
}
