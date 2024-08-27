package uk.slfhstd.scottyslu.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.List;

public class FloorSignMTG extends HorizontalFacingBlock {

    public static final BooleanProperty ACTIVATED = BooleanProperty.of("activated");

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(ACTIVATED);
        builder.add(Properties.HORIZONTAL_FACING);
    }

    public FloorSignMTG(Settings settings) {
        super(settings);

        // Set the default state of the block to be deactivated.
        setDefaultState(getDefaultState().with(ACTIVATED, false));
    }

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return null;
    }

    @Override
    public void appendTooltip(ItemStack itemStack, BlockView world, List<Text> tooltip, TooltipContext tooltipContext) {


        // for versions since 1.19
        tooltip.add(Text.translatable("block.scottylu.model_swap.tooltip"));
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

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!player.getAbilities().allowModifyWorld) {
            // Skip if the player isn't allowed to modify the world.
            return ActionResult.PASS;
        } else {
            // Get the current value of the "activated" property
            boolean activated = state.get(ACTIVATED);

            // Flip the value of activated and save the new blockstate.
            world.setBlockState(pos, state.with(ACTIVATED, !activated));

            // Play a click sound to emphasise the interaction.
            world.playSound(player, pos, SoundEvents.BLOCK_COMPARATOR_CLICK, SoundCategory.BLOCKS, 1.0F, 1.0F);

            return ActionResult.SUCCESS;
        }
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return super.getPlacementState(ctx).with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing());
    }



}
