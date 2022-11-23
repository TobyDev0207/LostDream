package com.tobydev0207.lostdream.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class StrippedSlimeLog {
  private static final String NAME = "stripped_slime_log";
  private static final Material MATERIAL = Material.WOOD;
  private static final Block STRIPPED_SLIME_LOG = new Block(FabricBlockSettings.of(MATERIAL));

  public static Block getBlock() {
    return STRIPPED_SLIME_LOG;
  }

  public static String getName() {
    return NAME;
  }
}
