package uk.slfhstd.scottyslu.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import uk.slfhstd.scottyslu.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.HELPPOINT_EVEN)
                .add(ModBlocks.HELPPOINT_ODD)
                .add(ModBlocks.COLOUR_TUBE)
                .add(ModBlocks.COLOUR_DLR)
                .add(ModBlocks.COLOUR_LIZZIE)
                .add(ModBlocks.COLOUR_BUS)
                .add(ModBlocks.COLOUR_OVERGROUND)
                .add(ModBlocks.COLOUR_CABLECAR)
                .add(ModBlocks.COLOUR_RIVER)
                .add(ModBlocks.COLOUR_TRAM);




    }
}
