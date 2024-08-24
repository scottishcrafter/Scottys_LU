package uk.slfhstd.scottyslu;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import uk.slfhstd.scottyslu.block.ModBlocks;

public class ScottysLondonUndergroundClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SIGN_NOENTRY, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SIGN_CCTV_SMALL, RenderLayer.getTranslucent());

    }
}
