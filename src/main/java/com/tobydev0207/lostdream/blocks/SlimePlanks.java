package com.tobydev0207.lostdream.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class SlimePlanks {
  private static final String NAME = "slime_planks";
  private static final Material MATERIAL = Material.WOOD;
  private static final Block SLIME_PLANKS = new Block(FabricBlockSettings.of(MATERIAL));

  public static Block getBlock() {
    return SLIME_PLANKS;
  }

  public static String getName() {
    return NAME;
  }
}
