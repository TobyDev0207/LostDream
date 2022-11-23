package com.tobydev0207.lostdream;

import com.tobydev0207.lostdream.blocks.SlimeLog;
import com.tobydev0207.lostdream.blocks.leaves.SlimeLeaves;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

public class Vars {
  public static final String MOD_ID = "lostdream";
  public static final ItemGroup LOST_DREAM =
      FabricItemGroupBuilder.build(
          new Identifier(MOD_ID, "lost_dream_group"), () -> new ItemStack(SlimeLog.getBlock()));

  public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> SLIME_TREE =
      ConfiguredFeatures.register(
          "slime_tree",
          Feature.TREE,
          new TreeFeatureConfig.Builder(
                  BlockStateProvider.of(SlimeLog.getBlock()),
                  new StraightTrunkPlacer(5, 6, 3),
                  BlockStateProvider.of(SlimeLeaves.getBlock()),
                  new BlobFoliagePlacer(
                      ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                  new TwoLayersFeatureSize(1, 0, 2))
              .build());
}
