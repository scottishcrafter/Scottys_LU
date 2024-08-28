package uk.slfhstd.scottyslu.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import uk.slfhstd.scottyslu.ScottysLondonUnderground;

public class ModItems {

    public static final Item OYSTER = registerItem("oyster", new OysterCard(new FabricItemSettings()));

    private static void addItemsToIngredientTab(FabricItemGroupEntries entries) {
        entries.add(OYSTER);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ScottysLondonUnderground.MOD_ID, name), item);
    }
    public static void registerModItems() {
        ScottysLondonUnderground.LOGGER.info("Registering Items for " + ScottysLondonUnderground.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(ModItems::addItemsToIngredientTab);
    }
}
