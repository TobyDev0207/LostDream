package com.tobydev0207.lostdream.blocks.saplings;

import com.tobydev0207.lostdream.world.gen.trees.SlimeSaplingGenerator;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.SaplingBlock;

public class SlimeSapling {
  private static final String NAME = "slime_sapling";
  private static final Material MATERIAL = Material.LEAVES;
  private static final SaplingBlock SLIME_SAPLING =
      new SaplingBlock(new SlimeSaplingGenerator(), FabricBlockSettings.copy(Blocks.OAK_SAPLING));

  public static SaplingBlock getBlock() {
    return SLIME_SAPLING;
  }

  public static String getName() {
    return NAME;
  }
}
