package uk.slfhstd.scottyslu;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.slfhstd.scottyslu.item.ModItems;

public class ScottysLondonUnderground implements ModInitializer {
	public static final String MOD_ID = "scottylu";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		LOGGER.info("Hello from Scottys London Underground");
	}
}