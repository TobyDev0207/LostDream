package com.tobydev0207.lostdream.blocks.buttons;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.block.WoodenButtonBlock;

public class SlimeButton {

  private static final String NAME = "slime_button";
  private static final Material MATERIAL = Material.WOOD;
  private static final WoodenButtonBlock SLIME_BUTTON =
      new WoodenButtonBlock(FabricBlockSettings.of(MATERIAL));

  public static WoodenButtonBlock getBlock() {
    return SLIME_BUTTON;
  }

  public static String getName() {
    return NAME;
  }
}
