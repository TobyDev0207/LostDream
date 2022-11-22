package com.tobydev0207.lostdream.blocks.slabs;

import com.tobydev0207.lostdream.blocks.LDSlabBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;

public class SlimeSlabBlock extends LDSlabBlock {

  private static final Material MATERIAL = Material.WOOD;
  private static final String NAME = "slime_slab";

  public SlabBlock getBlock() {
    return new SlabBlock(FabricBlockSettings.of(MATERIAL));
  }

  public String getName() {
    return NAME;
  }
}
