package com.tobydev0207.lostdream.blocks.leaves;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.Material;

public class SlimeLeaves {
  private static final String NAME = "slime_leaves";
  private static final Material MATERIAL = Material.LEAVES;
  private static final LeavesBlock SLIME_LEAVES = new LeavesBlock(FabricBlockSettings.of(MATERIAL));

  public static LeavesBlock getBlock() {
    return SLIME_LEAVES;
  }

  public static String getName() {
    return NAME;
  }
}
