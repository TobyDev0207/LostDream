package com.tobydev0207.lostdream.blocks.buttons;

import com.tobydev0207.lostdream.blocks.LDWoodenButtonBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.block.WoodenButtonBlock;

public class SlimeButton extends LDWoodenButtonBlock {

  private static final String NAME = "slime_button";

  @Override
  public WoodenButtonBlock getBlock() {
    return new WoodenButtonBlock(FabricBlockSettings.of(Material.WOOD));
  }

  @Override
  public String getName() {
    return NAME;
  }
}
