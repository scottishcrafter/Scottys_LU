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
                        entries.add(ModBlocks.HELPPOINT_ODD)

                    }).build());

    public static void registerItemGroups() {
        ScottysLondonUnderground.LOGGER.info("Registering Tabs for" +ScottysLondonUnderground.MOD_ID);
    }
}
