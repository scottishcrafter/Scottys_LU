package uk.slfhstd.scottyslu.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import uk.slfhstd.scottyslu.ScottysLondonUnderground;
import uk.slfhstd.scottyslu.block.ModBlocks;

public class ModItemGroup {
    public static final ItemGroup SCOTTY_LU = Registry.register(Registries.ITEM_GROUP, new Identifier(ScottysLondonUnderground.MOD_ID, "scotty"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.scotty"))
                    .icon(() -> new ItemStack(ModItems.OYSTER)).entries((displayContext, entries) -> {
                        entries.add(ModItems.OYSTER);
                        entries.add(ModBlocks.HELPPOINT_EVEN);
                        entries.add(ModBlocks.STATION_POLE);
                        entries.add(ModBlocks.SIGN_EXIT_EVEN);
                        entries.add(ModBlocks.STATION_BIN);
                        //entries.add(ModBlocks.TICKET_MACHINE);

                    }).build());

    public static final ItemGroup SCOTTY_LU_COLOURS = Registry.register(Registries.ITEM_GROUP, new Identifier(ScottysLondonUnderground.MOD_ID, "scotty_colours"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.scotty_colours"))
                    .icon(() -> new ItemStack(ModBlocks.COLOUR_TUBE)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.COLOUR_TUBE);
                        entries.add(ModBlocks.COLOUR_DLR);
                        entries.add(ModBlocks.COLOUR_LIZZIE);
                        entries.add(ModBlocks.COLOUR_BUS);
                        entries.add(ModBlocks.COLOUR_OVERGROUND);
                        entries.add(ModBlocks.COLOUR_CABLECAR);
                        entries.add(ModBlocks.COLOUR_RIVER);
                        entries.add(ModBlocks.COLOUR_TRAM);

                    }).build());
    public static final ItemGroup SCOTTY_LU_LINE_COLOURS = Registry.register(Registries.ITEM_GROUP, new Identifier(ScottysLondonUnderground.MOD_ID, "scotty_line_colours"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.scotty_line_colours"))
                    .icon(() -> new ItemStack(ModBlocks.LINE_COLOUR_BAKERLOO)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.LINE_COLOUR_BAKERLOO);
                        entries.add(ModBlocks.LINE_COLOUR_CENTRAL);
                        entries.add(ModBlocks.LINE_COLOUR_CIRCLE);
                        entries.add(ModBlocks.LINE_COLOUR_DISTRICT);
                        entries.add(ModBlocks.LINE_COLOUR_HAMCITY);
                        entries.add(ModBlocks.LINE_COLOUR_JUBILEE);
                        entries.add(ModBlocks.LINE_COLOUR_METRO);
                        entries.add(ModBlocks.LINE_COLOUR_NORTHERN);
                        entries.add(ModBlocks.LINE_COLOUR_PICCADILLY);
                        entries.add(ModBlocks.LINE_COLOUR_VICTORIA);
                        entries.add(ModBlocks.LINE_COLOUR_WATERCITY);

                    }).build());

    public static final ItemGroup SCOTTY_LU_SIGNS = Registry.register(Registries.ITEM_GROUP, new Identifier(ScottysLondonUnderground.MOD_ID, "scotty_signs"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.scotty_signs"))
                    .icon(() -> new ItemStack(ModBlocks.SIGN_CCTV_SMALL)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.CCTV_AA);
                        entries.add(ModBlocks.CCTV_FC);
                        entries.add(ModBlocks.SIGN_SEEITSAYITSORTED);
                        entries.add(ModBlocks.SIGN_NOENTRY);
                        entries.add(ModBlocks.SIGN_CCTV_SMALL);
                        entries.add(ModBlocks.SIGN_BEWARE_TRAINS);
                        entries.add(ModBlocks.SIGN_PLATFORM_1);
                        entries.add(ModBlocks.SIGN_PLATFORM_2);
                        entries.add(ModBlocks.SIGN_PLATFORM_3);
                        entries.add(ModBlocks.SIGN_PLATFORM_4);
                        entries.add(ModBlocks.SIGN_ROUNDEL_EVEN);
                    }).build());

    public static final ItemGroup SCOTTY_LU_SIGNS_POLES = Registry.register(Registries.ITEM_GROUP, new Identifier(ScottysLondonUnderground.MOD_ID, "scotty_signs_poles"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.scotty_signs_poles"))
                    .icon(() -> new ItemStack(ModBlocks.SIGN_POLE_PLATFORM_1)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.SIGN_POLE_BEWARE_TRAINS);
                        entries.add(ModBlocks.SIGN_POLE_CCTV_SMALL);
                        entries.add(ModBlocks.SIGN_POLE_PLATFORM_1);
                        entries.add(ModBlocks.SIGN_POLE_PLATFORM_2);
                        entries.add(ModBlocks.SIGN_POLE_PLATFORM_3);
                        entries.add(ModBlocks.SIGN_POLE_PLATFORM_4);

                    }).build());
    public static void registerItemGroups() {
        ScottysLondonUnderground.LOGGER.info("Registering Tabs for" +ScottysLondonUnderground.MOD_ID);
    }
}
