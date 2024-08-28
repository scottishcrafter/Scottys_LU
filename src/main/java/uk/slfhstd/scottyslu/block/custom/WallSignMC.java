package uk.slfhstd.scottyslu.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class WallSignMC extends CustomModelChange {

    public WallSignMC(Settings settings) {
        super(settings);
    }


    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext ctx) {
        Direction dir = state.get(FACING);
        return switch (dir) {
            case NORTH -> VoxelShapes.cuboid(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.1f);
            case SOUTH -> VoxelShapes.cuboid(0.0f, 0.0f, 0.9f, 1.0f, 1.0f, 1.0f);
            case EAST -> VoxelShapes.cuboid(0.9f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
            case WEST -> VoxelShapes.cuboid(0.0f, 0.0f, 0.0f, 0.1f, 1.0f, 1.0f);
            default -> VoxelShapes.fullCube();
        };
    }



}
