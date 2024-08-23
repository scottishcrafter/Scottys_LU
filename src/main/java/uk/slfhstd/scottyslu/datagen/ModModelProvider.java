package uk.slfhstd.scottyslu.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import uk.slfhstd.scottyslu.block.ModBlocks;
import uk.slfhstd.scottyslu.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerGeneric(ModBlocks.HELPPOINT_EVEN);
        blockStateModelGenerator.registerGeneric(ModBlocks.HELPPOINT_ODD);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.OYSTER, Models.GENERATED);

    }
}
