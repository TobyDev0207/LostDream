package com.tobydev0207.lostdream.blocks.fences;

import com.tobydev0207.lostdream.blocks.LDFenceBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.Material;

public class SlimeFence extends LDFenceBlock {
  private static final String NAME = "slime_fence";
  private static final Material MATERIAL = Material.WOOD;

  public FenceBlock getBlock() {
    return new FenceBlock(FabricBlockSettings.of(MATERIAL));
  }

  public String getName() {
    return NAME;
  }
}
