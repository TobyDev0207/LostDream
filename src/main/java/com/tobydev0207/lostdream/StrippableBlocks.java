package com.tobydev0207.lostdream;

import com.tobydev0207.lostdream.blocks.LDBlock;
import com.tobydev0207.lostdream.blocks.SlimeLog;
import com.tobydev0207.lostdream.blocks.StrippedSlimeLog;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.Block;

public class StrippableBlocks {

    public static void register() {
        StrippableBlockRegistry.register(SlimeLog.getBlock(), StrippedSlimeLog.getBlock());
    }
}
