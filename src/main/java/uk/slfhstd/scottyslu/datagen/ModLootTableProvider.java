package uk.slfhstd.scottyslu.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLootTableProvider;
import uk.slfhstd.scottyslu.block.ModBlocks;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.HELPPOINT_EVEN);
        addDrop(ModBlocks.STATION_BIN);
        addDrop(ModBlocks.SIGN_ROUNDEL_EVEN);


    }
}
