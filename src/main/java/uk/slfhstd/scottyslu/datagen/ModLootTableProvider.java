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
        addDrop(ModBlocks.FLOOR_SIGN_PLATFORM_1);
        addDrop(ModBlocks.FLOOR_SIGN_PLATFORM_2);
        addDrop(ModBlocks.FLOOR_SIGN_PLATFORM_3);
        addDrop(ModBlocks.FLOOR_SIGN_PLATFORM_4);
        addDrop(ModBlocks.FLOOR_SIGN_MTG);
        addDrop(ModBlocks.FLOOR_SIGN_BYL);
        addDrop(ModBlocks.COLOUR_TUBE);
        addDrop(ModBlocks.COLOUR_DLR);
        addDrop(ModBlocks.COLOUR_LIZZIE);
        addDrop(ModBlocks.COLOUR_BUS);
        addDrop(ModBlocks.COLOUR_OVERGROUND);
        addDrop(ModBlocks.COLOUR_CABLECAR);
        addDrop(ModBlocks.COLOUR_RIVER);
        addDrop(ModBlocks.COLOUR_TRAM);
        addDrop(ModBlocks.LINE_COLOUR_BAKERLOO);
        addDrop(ModBlocks.LINE_COLOUR_CENTRAL);
        addDrop(ModBlocks.LINE_COLOUR_CIRCLE);
        addDrop(ModBlocks.LINE_COLOUR_DISTRICT);
        addDrop(ModBlocks.LINE_COLOUR_HAMCITY);
        addDrop(ModBlocks.LINE_COLOUR_JUBILEE);
        addDrop(ModBlocks.LINE_COLOUR_METRO);
        addDrop(ModBlocks.LINE_COLOUR_NORTHERN);
        addDrop(ModBlocks.LINE_COLOUR_PICCADILLY);
        addDrop(ModBlocks.LINE_COLOUR_VICTORIA);
        addDrop(ModBlocks.LINE_COLOUR_WATERCITY);
        addDrop(ModBlocks.HELPPOINT_EVEN);
        addDrop(ModBlocks.CCTV_AA);
        addDrop(ModBlocks.CCTV_FC);
        addDrop(ModBlocks.SIGN_SEEITSAYITSORTED);
        addDrop(ModBlocks.SIGN_NOENTRY);
        addDrop(ModBlocks.SIGN_ROUNDEL_EVEN);
        addDrop(ModBlocks.SIGN_CCTV_SMALL);
        addDrop(ModBlocks.SIGN_BEWARE_TRAINS);
        addDrop(ModBlocks.SIGN_PLATFORM_1);
        addDrop(ModBlocks.SIGN_PLATFORM_2);
        addDrop(ModBlocks.SIGN_PLATFORM_3);
        addDrop(ModBlocks.SIGN_PLATFORM_4);
        addDrop(ModBlocks.STATION_POLE);
        addDrop(ModBlocks.SIGN_POLE_BEWARE_TRAINS);
        addDrop(ModBlocks.SIGN_POLE_PLATFORM_1);
        addDrop(ModBlocks.SIGN_POLE_PLATFORM_2);
        addDrop(ModBlocks.SIGN_POLE_PLATFORM_3);
        addDrop(ModBlocks.SIGN_POLE_PLATFORM_4);
        addDrop(ModBlocks.SIGN_POLE_CCTV_SMALL);
        addDrop(ModBlocks.STATION_BIN);
        addDrop(ModBlocks.CCTV_WALL);
        addDrop(ModBlocks.CCTV_CEILING);



    }
}
