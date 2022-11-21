package com.tobydev0207.lostdream;

import com.tobydev0207.lostdream.blocks.*;
import com.tobydev0207.lostdream.blocks.buttons.SlimeButton;
import com.tobydev0207.lostdream.blocks.pressure_plates.SlimePressurePlate;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockManager {

  private static final LDBlock[] BLOCKS = {
    new SlimeLog(), new StrippedSlimeLog(), new SlimePlanks()
  };
  private static final LDPressurePlateBlock[] PRESSURE_PLATE_BLOCKS = {new SlimePressurePlate()};

  private static final LDWoodenButtonBlock[] WOODEN_BUTTON_BLOCKS = {new SlimeButton()};

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
  }

  private static void registerBlock(Block block, String name) {
    Registry.register(Registry.BLOCK, new Identifier(Vars.MOD_ID, name), block);
    Registry.register(
        Registry.ITEM,
        new Identifier(Vars.MOD_ID, name),
        new BlockItem(block, new FabricItemSettings().group(Vars.LOST_DREAM)));
  }
}
