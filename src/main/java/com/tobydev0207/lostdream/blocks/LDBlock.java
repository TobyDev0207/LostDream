package com.tobydev0207.lostdream.blocks;

import net.minecraft.block.Block;

public class LDBlock {
  private final Block block;
  private final String name;

  public LDBlock(Block block, String name) {
    this.block = block;
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public Block getBlock() {
    return this.block;
  }
}
