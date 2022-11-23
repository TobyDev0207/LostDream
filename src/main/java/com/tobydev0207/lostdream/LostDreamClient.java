package com.tobydev0207.lostdream;

import com.tobydev0207.lostdream.blocks.leaves.SlimeLeaves;
import com.tobydev0207.lostdream.blocks.saplings.SlimeSapling;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class LostDreamClient implements ClientModInitializer {
  public void onInitializeClient() {
    BlockRenderLayerMap.INSTANCE.putBlock(SlimeSapling.getBlock(), RenderLayer.getCutout());
    BlockRenderLayerMap.INSTANCE.putBlock(SlimeLeaves.getBlock(), RenderLayer.getCutout());
  }
}
