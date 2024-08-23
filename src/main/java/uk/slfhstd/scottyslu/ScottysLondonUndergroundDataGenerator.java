package uk.slfhstd.scottyslu;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import uk.slfhstd.scottyslu.datagen.ModBlockTagProvider;
import uk.slfhstd.scottyslu.datagen.ModItemTagProvider;
import uk.slfhstd.scottyslu.datagen.ModModelProvider;

public class ScottysLondonUndergroundDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModModelProvider::new);


	}
}
