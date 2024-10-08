package uk.slfhstd.scottyslu.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;


public class CustomBlockTall extends HorizontalFacingBlock {
    public static final MapCodec<CustomBlockTall> CODEC = Block.createCodec(CustomBlockTall::new);
    public CustomBlockTall(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
    }

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return null;
    }


    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(Properties.HORIZONTAL_FACING);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext ctx) {
        Direction dir = state.get(FACING);
        return switch (dir) {
            case NORTH -> VoxelShapes.cuboid(0f, 0f, 0f, 1f, 1.875f, 1f);
            case SOUTH -> VoxelShapes.cuboid(0f, 0f, 0f, 1f, 1.875f, 1f);
            case EAST -> VoxelShapes.cuboid(0f, 0f, 0f, 1f, 1.875f, 1f);
            case WEST -> VoxelShapes.cuboid(0f, 0f, 0f, 1f, 1.875f, 1f);
            default -> VoxelShapes.fullCube();
        };
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return super.getPlacementState(ctx).with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    




}



