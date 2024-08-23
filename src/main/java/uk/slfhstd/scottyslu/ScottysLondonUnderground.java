package uk.slfhstd.scottyslu;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.slfhstd.scottyslu.block.ModBlocks;
import uk.slfhstd.scottyslu.item.ModItemGroup;
import uk.slfhstd.scottyslu.item.ModItems;

public class ScottysLondonUnderground implements ModInitializer {
	public static final String MOD_ID = "scottylu";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		LOGGER.info("Hello from Scottys London Underground");
	}
}