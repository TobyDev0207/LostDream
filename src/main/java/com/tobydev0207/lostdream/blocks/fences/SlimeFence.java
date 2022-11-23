package com.tobydev0207.lostdream.blocks.fences;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.Material;

public class SlimeFence {
  private static final String NAME = "slime_fence";
  private static final Material MATERIAL = Material.WOOD;
  private static final FenceBlock SLIME_FENCE = new FenceBlock(FabricBlockSettings.of(MATERIAL));

  public static FenceBlock getBlock() {
    return SLIME_FENCE;
  }

  public static String getName() {
    return NAME;
  }
}
