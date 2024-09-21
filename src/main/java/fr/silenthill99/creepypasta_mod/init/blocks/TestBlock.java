package fr.silenthill99.creepypasta_mod.init.blocks;

import fr.silenthill99.creepypasta_mod.init.tile_entities.TestBlockTileEntity;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.awt.*;
import java.util.List;
import java.util.UUID;

@SuppressWarnings({"NullableProblems", "deprecation"})
public class TestBlock extends Block {
    public TestBlock() {
        super(Properties.of(Material.STONE).noDrops());
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new TestBlockTileEntity();
    }

    @Override
    public ActionResultType use(BlockState pState, World pLevel, BlockPos pPos, PlayerEntity pPlayer, Hand pHand, BlockRayTraceResult pHit) {
        pPlayer.sendMessage(ITextComponent.nullToEmpty("Message de test !"), UUID.randomUUID());
        return ActionResultType.SUCCESS;
    }
}
