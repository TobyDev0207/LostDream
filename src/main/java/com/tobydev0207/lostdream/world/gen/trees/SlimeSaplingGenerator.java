package com.tobydev0207.lostdream.world.gen.trees;

import com.tobydev0207.lostdream.Vars;
import java.util.Random;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class SlimeSaplingGenerator extends SaplingGenerator {

  protected RegistryEntry<? extends ConfiguredFeature<?, ?>> getTreeFeature(
      Random random, boolean bees) {
    return Vars.SLIME_TREE;
  }
}
