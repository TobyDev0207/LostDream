package com.tobydev0207.lostdream;

import com.tobydev0207.lostdream.blocks.*;
import com.tobydev0207.lostdream.blocks.buttons.SlimeButton;
import com.tobydev0207.lostdream.blocks.fences.SlimeFence;
import com.tobydev0207.lostdream.blocks.fences.gates.SlimeFenceGate;
import com.tobydev0207.lostdream.blocks.pressure_plates.SlimePressurePlate;
import com.tobydev0207.lostdream.blocks.slabs.SlimeSlabBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockManager {
  public static final SlimeLog SLIME_LOG = new SlimeLog();
  public static final StrippedSlimeLog STRIPPED_SLIME_LOG = new StrippedSlimeLog();
  public static final SlimePlanks SLIME_PLANKS = new SlimePlanks();
  public static final SlimePressurePlate SLIME_PRESSURE_PLATE = new SlimePressurePlate();
  public static final SlimeButton SLIME_BUTTON = new SlimeButton();
  public static final SlimeFence SLIME_FENCE = new SlimeFence();
  public static final SlimeFenceGate SLIME_FENCE_GATE = new SlimeFenceGate();
  public static final SlimeSlabBlock SLIME_SLAB_BLOCK = new SlimeSlabBlock();

  private static final LDBlock[] BLOCKS = {SLIME_LOG, STRIPPED_SLIME_LOG, SLIME_PLANKS};
  private static final LDPressurePlateBlock[] PRESSURE_PLATE_BLOCKS = {SLIME_PRESSURE_PLATE};

  private static final LDWoodenButtonBlock[] WOODEN_BUTTON_BLOCKS = {SLIME_BUTTON};

  private static final LDFenceBlock[] FENCES = {SLIME_FENCE};

  private static final LDFenceGateBlock[] FENCE_GATES = {SLIME_FENCE_GATE};

  private static final LDSlabBlock[] SLABS = {SLIME_SLAB_BLOCK};

  public static void register() {
    for (LDBlock block : BLOCKS) {
      registerBlock(block.getBlock(), block.getName());
    }

    for (LDPressurePlateBlock block : PRESSURE_PLATE_BLOCKS) {
      registerBlock(block.getBlock(), block.getName());
    }

    for (LDWoodenButtonBlock button : WOODEN_BUTTON_BLOCKS) {
      registerBlock(button.getBlock(), button.getName());
    }

    for (LDFenceBlock fence : FENCES) {
      registerBlock(fence.getBlock(), fence.getName());
    }

    for (LDFenceGateBlock gate : FENCE_GATES) {
      registerBlock(gate.getBlock(), gate.getName());
    }

    for (LDSlabBlock slab : SLABS) {
      registerBlock(slab.getBlock(), slab.getName());
    }
  }

  private static void registerBlock(Block block, String name) {
    Registry.register(Registry.BLOCK, new Identifier(Vars.MOD_ID, name), block);
    Registry.register(
        Registry.ITEM,
        new Identifier(Vars.MOD_ID, name),
        new BlockItem(block, new FabricItemSettings().group(Vars.LOST_DREAM)));
  }
}
