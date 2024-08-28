package uk.slfhstd.scottyslu.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class CeilingSignMC extends CustomModelChange {

    public CeilingSignMC(Settings settings) {
        super(settings);
    }


    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext ctx) {
        Direction dir = state.get(FACING);
        return switch (dir) {
            case NORTH, SOUTH -> VoxelShapes.cuboid(0, 0, 0.375, 1, 0.9375, 0.625);
            case EAST, WEST -> VoxelShapes.cuboid(0.375, 0, 0, 0.625, 0.9375, 1);
            default -> VoxelShapes.fullCube();
        };
    }



}
