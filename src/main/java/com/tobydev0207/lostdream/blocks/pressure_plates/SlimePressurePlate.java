package com.tobydev0207.lostdream.blocks.pressure_plates;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.block.PressurePlateBlock;

public class SlimePressurePlate {

  private static final String NAME = "slime_pressure_plate";
  private static final Material MATERIAL = Material.WOOD;
  private static final PressurePlateBlock.ActivationRule TYPE =
      PressurePlateBlock.ActivationRule.EVERYTHING;
  private static final FabricBlockSettings SETTINGS = FabricBlockSettings.of(MATERIAL);
  private static final PressurePlateBlock SLIME_PRESSURE_PLATE =
      new PressurePlateBlock(TYPE, SETTINGS);

  public static PressurePlateBlock getBlock() {
    return SLIME_PRESSURE_PLATE;
  }

  public static String getName() {
    return NAME;
  }
}
