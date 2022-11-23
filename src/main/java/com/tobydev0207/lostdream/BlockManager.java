package com.tobydev0207.lostdream;

import com.tobydev0207.lostdream.blocks.*;
import com.tobydev0207.lostdream.blocks.buttons.SlimeButton;
import com.tobydev0207.lostdream.blocks.fences.SlimeFence;
import com.tobydev0207.lostdream.blocks.fences.gates.SlimeFenceGate;
import com.tobydev0207.lostdream.blocks.leaves.SlimeLeaves;
import com.tobydev0207.lostdream.blocks.pressure_plates.SlimePressurePlate;
import com.tobydev0207.lostdream.blocks.saplings.SlimeSapling;
import com.tobydev0207.lostdream.blocks.slabs.SlimeSlabBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockManager {
  private static final LDBlock[] BLOCKS = {
    new LDBlock(SlimePlanks.getBlock(), SlimePlanks.getName()),
    new LDBlock(SlimeLog.getBlock(), SlimeLog.getName()),
    new LDBlock(StrippedSlimeLog.getBlock(), StrippedSlimeLog.getName()),
    new LDBlock(SlimeButton.getBlock(), SlimeButton.getName()),
    new LDBlock(SlimeFence.getBlock(), SlimeFence.getName()),
    new LDBlock(SlimeFenceGate.getBlock(), SlimeFenceGate.getName()),
    new LDBlock(SlimePressurePlate.getBlock(), SlimePressurePlate.getName()),
    new LDBlock(SlimeSlabBlock.getBlock(), SlimeSlabBlock.getName()),
    new LDBlock(SlimeLeaves.getBlock(), SlimeLeaves.getName()),
    new LDBlock(SlimeSapling.getBlock(), SlimeSapling.getName())
  };

  public static void register() {
    for (LDBlock block : BLOCKS) {
      registerBlock(block.getBlock(), block.getName());
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
