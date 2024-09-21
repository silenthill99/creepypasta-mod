package fr.silenthill99.creepypasta_mod.init.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;

import javax.annotation.Nullable;
import java.util.stream.Stream;

public class JeffTheKiller extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public static final VoxelShape SHAPE_N = Stream.of(
            Block.box(4.000416666666666, 23.5, 4.000416666666666, 12.000416666666666, 31.5, 12.000416666666666),
            Block.box(4.000416666666666, 11.5, 6.000416666666666, 12.000416666666666, 23.5, 10.000416666666666),
            Block.box(12.000416666666666, 11.5, 6.000416666666666, 16.000416666666666, 23.5, 10.000416666666666),
            Block.box(0.0004166666666662877, 11.5, 6.000416666666666, 4.000416666666666, 23.5, 10.000416666666666),
            Block.box(8.000416666666666, -0.5, 6.000416666666666, 12.000416666666666, 11.5, 10.000416666666666),
            Block.box(4.000416666666666, -0.5, 6.000416666666666, 8.000416666666666, 11.5, 10.000416666666666),
            Block.box(3.5004166666666663, 23, 3.5004166666666663, 12.500416666666666, 32, 12.500416666666666),
            Block.box(4.000416666666666, 11.02, 5.500416666666666, 12.000416666666666, 24.03, 10.500416666666666),
            Block.box(11.500416666666666, 11, 5.500416666666666, 16.490416666666665, 24, 10.500416666666666),
            Block.box(-0.4995833333333337, 11, 5.500416666666666, 4.500416666666666, 24, 10.500416666666666),
            Block.box(7.500416666666666, -1, 5.500416666666666, 12.500416666666666, 12, 10.500416666666666),
            Block.box(3.5004166666666663, -1, 5.500416666666666, 8.500416666666666, 12, 10.500416666666666)
    ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();

    public static final VoxelShape SHAPE_S = Stream.of(
            Block.box(3.9995833333333337, 23.5, 3.9995833333333337, 11.999583333333334, 31.5, 11.999583333333334),
            Block.box(3.9995833333333337, 11.5, 5.999583333333334, 11.999583333333334, 23.5, 9.999583333333334),
            Block.box(-0.0004166666666662877, 11.5, 5.999583333333334, 3.9995833333333337, 23.5, 9.999583333333334),
            Block.box(11.999583333333334, 11.5, 5.999583333333334, 15.999583333333334, 23.5, 9.999583333333334),
            Block.box(3.9995833333333337, -0.5, 5.999583333333334, 7.999583333333334, 11.5, 9.999583333333334),
            Block.box(7.999583333333334, -0.5, 5.999583333333334, 11.999583333333334, 11.5, 9.999583333333334),
            Block.box(3.4995833333333337, 23, 3.4995833333333337, 12.499583333333334, 32, 12.499583333333334),
            Block.box(3.9995833333333337, 11.02, 5.499583333333334, 11.999583333333334, 24.03, 10.499583333333334),
            Block.box(-0.4904166666666647, 11, 5.499583333333334, 4.499583333333334, 24, 10.499583333333334),
            Block.box(11.499583333333334, 11, 5.499583333333334, 16.499583333333334, 24, 10.499583333333334),
            Block.box(3.4995833333333337, -1, 5.499583333333334, 8.499583333333334, 12, 10.499583333333334),
            Block.box(7.499583333333334, -1, 5.499583333333334, 12.499583333333334, 12, 10.499583333333334)
    ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();

    public static final VoxelShape SHAPE_E = Stream.of(
            Block.box(3.9995833333333337, 23.5, 4.000416666666666, 11.999583333333334, 31.5, 12.000416666666666),
            Block.box(5.999583333333334, 11.5, 4.000416666666666, 9.999583333333334, 23.5, 12.000416666666666),
            Block.box(5.999583333333334, 11.5, 12.000416666666666, 9.999583333333334, 23.5, 16.000416666666666),
            Block.box(5.999583333333334, 11.5, 0.0004166666666662877, 9.999583333333334, 23.5, 4.000416666666666),
            Block.box(5.999583333333334, -0.5, 8.000416666666666, 9.999583333333334, 11.5, 12.000416666666666),
            Block.box(5.999583333333334, -0.5, 4.000416666666666, 9.999583333333334, 11.5, 8.000416666666666),
            Block.box(3.4995833333333337, 23, 3.5004166666666663, 12.499583333333334, 32, 12.500416666666666),
            Block.box(5.499583333333334, 11.02, 4.000416666666666, 10.499583333333334, 24.03, 12.000416666666666),
            Block.box(5.499583333333334, 11, 11.500416666666666, 10.499583333333334, 24, 16.490416666666665),
            Block.box(5.499583333333334, 11, -0.4995833333333337, 10.499583333333334, 24, 4.500416666666666),
            Block.box(5.499583333333334, -1, 7.500416666666666, 10.499583333333334, 12, 12.500416666666666),
            Block.box(5.499583333333334, -1, 3.5004166666666663, 10.499583333333334, 12, 8.500416666666666)
    ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();

    public static final VoxelShape SHAPE_O = Stream.of(
            Block.box(4.000416666666666, 23.5, 3.9995833333333337, 12.000416666666666, 31.5, 11.999583333333334),
            Block.box(6.000416666666666, 11.5, 3.9995833333333337, 10.000416666666666, 23.5, 11.999583333333334),
            Block.box(6.000416666666666, 11.5, -0.0004166666666662877, 10.000416666666666, 23.5, 3.9995833333333337),
            Block.box(6.000416666666666, 11.5, 11.999583333333334, 10.000416666666666, 23.5, 15.999583333333334),
            Block.box(6.000416666666666, -0.5, 3.9995833333333337, 10.000416666666666, 11.5, 7.999583333333334),
            Block.box(6.000416666666666, -0.5, 7.999583333333334, 10.000416666666666, 11.5, 11.999583333333334),
            Block.box(3.5004166666666663, 23, 3.4995833333333337, 12.500416666666666, 32, 12.499583333333334),
            Block.box(5.500416666666666, 11.02, 3.9995833333333337, 10.500416666666666, 24.03, 11.999583333333334),
            Block.box(5.500416666666666, 11, -0.4904166666666647, 10.500416666666666, 24, 4.499583333333334),
            Block.box(5.500416666666666, 11, 11.499583333333334, 10.500416666666666, 24, 16.499583333333334),
            Block.box(5.500416666666666, -1, 3.4995833333333337, 10.500416666666666, 12, 8.499583333333334),
            Block.box(5.500416666666666, -1, 7.499583333333334, 10.500416666666666, 12, 12.499583333333334)
    ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();

    @SuppressWarnings({"NullableProblems", "deprecation"})
    public VoxelShape getShape(BlockState state, IBlockReader worldIn_, BlockPos pos, ISelectionContext context) {
        switch (state.getValue(FACING)) {
            case EAST:
                return SHAPE_E;
            case SOUTH:
                return SHAPE_S;
            case WEST:
                return SHAPE_O;
            default:
                return SHAPE_N;
        }
    }

    public JeffTheKiller() {
        super(Properties.of(Material.STONE));

        this.registerDefaultState(this.getStateDefinition().any().setValue(FACING, Direction.NORTH));
    }

    @SuppressWarnings("deprecation")
    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
    }

    @Override
    public BlockState rotate(BlockState state, IWorld world, BlockPos pos, Rotation direction) {
        return state.setValue(FACING, direction.rotate(state.getValue(FACING)));
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(FACING);
    }
}
