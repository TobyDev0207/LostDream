package com.tobydev0207.lostdream.blocks.slabs;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;

public class SlimeSlabBlock {
  private static final String NAME = "slime_slab";

  private static final Material MATERIAL = Material.WOOD;
  public static final SlabBlock SLIME_SLAB_BLOCK = new SlabBlock(FabricBlockSettings.of(MATERIAL));

  public static SlabBlock getBlock() {
    return SLIME_SLAB_BLOCK;
  }

  public static String getName() {
    return NAME;
  }
}
