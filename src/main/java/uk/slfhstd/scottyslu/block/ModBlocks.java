package uk.slfhstd.scottyslu.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.Model;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import uk.slfhstd.scottyslu.ScottysLondonUnderground;
import uk.slfhstd.scottyslu.block.custom.CustomBlock;
import uk.slfhstd.scottyslu.block.custom.CustomBlockOpp;
import uk.slfhstd.scottyslu.block.custom.CustomPole;
import uk.slfhstd.scottyslu.block.custom.CustomSign;

public class ModBlocks {

    public static final Block TICKET_MACHINE = registerBlock("ticket_machine",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block COLOUR_TUBE = registerBlock("colour_tube",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block COLOUR_DLR = registerBlock("colour_dlr",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block COLOUR_LIZZIE = registerBlock("colour_lizzie",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block COLOUR_BUS = registerBlock("colour_bus",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block COLOUR_OVERGROUND = registerBlock("colour_overground",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block COLOUR_CABLECAR = registerBlock("colour_cablecar",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block COLOUR_RIVER = registerBlock("colour_river",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block COLOUR_TRAM = registerBlock("colour_tram",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block LINE_COLOUR_BAKERLOO = registerBlock("line_colour_bakerloo",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block LINE_COLOUR_CENTRAL = registerBlock("line_colour_central",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block LINE_COLOUR_CIRCLE = registerBlock("line_colour_circle",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block LINE_COLOUR_DISTRICT = registerBlock("line_colour_district",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block LINE_COLOUR_HAMCITY = registerBlock("line_colour_hamcity",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block LINE_COLOUR_JUBILEE = registerBlock("line_colour_jubilee",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block LINE_COLOUR_METRO = registerBlock("line_colour_metro",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block LINE_COLOUR_NORTHERN = registerBlock("line_colour_northern",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block LINE_COLOUR_PICCADILLY = registerBlock("line_colour_piccadilly",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block LINE_COLOUR_VICTORIA = registerBlock("line_colour_victoria",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block LINE_COLOUR_WATERCITY = registerBlock("line_colour_watercity",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block HELPPOINT_EVEN = registerBlock("helppoint_even",
            new CustomBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).nonOpaque()));

    public static final Block HELPPOINT_ODD = registerBlock("helppoint_odd",
            new CustomBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).nonOpaque()));

    public static final Block SIGN_EXIT_EVEN = registerBlock("sign_exit_even",
            new CustomBlockOpp(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque().luminance(7)));

    public static final Block SIGN_EXIT_ODD = registerBlock("sign_exit_odd",
            new CustomBlockOpp(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque().luminance(8)));

    public static final Block CCTV_FC = registerBlock("cctv_fc",
            new CustomSign(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    public static final Block CCTV_AA = registerBlock("cctv_aa",
            new CustomSign(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    public static final Block SIGN_SEEITSAYITSORTED = registerBlock("sign_seeitsayitsorted",
            new CustomSign(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    public static final Block SIGN_NOENTRY = registerBlock("sign_noentry",
            new CustomSign(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    public static final Block SIGN_NOENTRY_ODD = registerBlock("sign_noentry_odd",
            new CustomSign(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    public static final Block SIGN_ROUNDEL_EVEN = registerBlock("sign_roundel_even",
            new CustomSign(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    public static final Block SIGN_ROUNDEL_ODD = registerBlock("sign_roundel_odd",
            new CustomSign(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    public static final Block SIGN_CCTV_SMALL = registerBlock("sign_cctv_small",
            new CustomSign(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    public static final Block SIGN_BEWARE_TRAINS = registerBlock("sign_beware_trains",
            new CustomSign(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    public static final Block SIGN_PLATFORM_1 = registerBlock("sign_platform_1",
            new CustomSign(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    public static final Block SIGN_PLATFORM_2 = registerBlock("sign_platform_2",
            new CustomSign(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    public static final Block SIGN_PLATFORM_3 = registerBlock("sign_platform_3",
            new CustomSign(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    public static final Block SIGN_PLATFORM_4 = registerBlock("sign_platform_4",
            new CustomSign(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    public static final Block STATION_POLE = registerBlock("station_pole",
            new CustomPole(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).nonOpaque()));

    public static final Block SIGN_POLE_BEWARE_TRAINS = registerBlock("sign_pole_beware_trains",
            new CustomPole(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).nonOpaque()));

    public static final Block SIGN_POLE_PLATFORM_1 = registerBlock("sign_pole_platform_1",
            new CustomPole(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).nonOpaque()));

    public static final Block SIGN_POLE_PLATFORM_1_DOUBLE = registerBlock("sign_pole_platform_1_double",
            new CustomPole(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).nonOpaque()));

    public static final Block SIGN_POLE_PLATFORM_2 = registerBlock("sign_pole_platform_2",
            new CustomPole(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).nonOpaque()));

    public static final Block SIGN_POLE_PLATFORM_2_DOUBLE = registerBlock("sign_pole_platform_2_double",
            new CustomPole(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).nonOpaque()));


    public static final Block SIGN_POLE_PLATFORM_3 = registerBlock("sign_pole_platform_3",
            new CustomPole(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).nonOpaque()));

    public static final Block SIGN_POLE_PLATFORM_3_DOUBLE = registerBlock("sign_pole_platform_3_double",
            new CustomPole(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).nonOpaque()));

    public static final Block SIGN_POLE_PLATFORM_4 = registerBlock("sign_pole_platform_4",
            new CustomPole(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).nonOpaque()));

    public static final Block SIGN_POLE_PLATFORM_4_DOUBLE = registerBlock("sign_pole_platform_4_double",
            new CustomPole(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).nonOpaque()));

    public static final Block SIGN_POLE_CCTV_SMALL = registerBlock("sign_pole_cctv_small",
            new CustomPole(FabricBlockSettings.copyOf(Blocks.OAK_FENCE).nonOpaque()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(ScottysLondonUnderground.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(ScottysLondonUnderground.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        ScottysLondonUnderground.LOGGER.info("Registering Scotty's Blocks");
    }
}
