package uk.slfhstd.scottyslu.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class FloorSignMC extends CustomModelChange {


    public FloorSignMC(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext ctx) {
        Direction dir = state.get(FACING);
        return switch (dir) {
            case NORTH -> VoxelShapes.cuboid(0.0625, 0, 0.0625, 0.9375, 0.06875, 0.9375);
            case SOUTH -> VoxelShapes.cuboid(0.0625, 0, 0.0625, 0.9375, 0.06875, 0.9375);
            case EAST -> VoxelShapes.cuboid(0.0625, 0, 0.0625, 0.9375, 0.06875, 0.9375);
            case WEST -> VoxelShapes.cuboid(0.0625, 0, 0.0625, 0.9375, 0.06875, 0.9375);
            default -> VoxelShapes.fullCube();
        };
    }
}
