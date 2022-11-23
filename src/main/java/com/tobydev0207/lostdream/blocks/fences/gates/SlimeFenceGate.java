package com.tobydev0207.lostdream.blocks.fences.gates;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.Material;

public class SlimeFenceGate {
  private static final String NAME = "slime_fence_gate";
  private static final Material MATERIAL = Material.WOOD;
  private static final FenceGateBlock SLIME_FENCE_GATE =
      new FenceGateBlock(FabricBlockSettings.of(MATERIAL));

  public static FenceGateBlock getBlock() {
    return SLIME_FENCE_GATE;
  }

  public static String getName() {
    return NAME;
  }
}
