package com.tobydev0207.lostdream;

import com.tobydev0207.lostdream.blocks.LDBlock;
import com.tobydev0207.lostdream.blocks.SlimeLog;
import com.tobydev0207.lostdream.blocks.StrippedSlimeLog;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockManager {

    private static final LDBlock[] BLOCKS = {new SlimeLog(), new StrippedSlimeLog()};

    public static void register() {
        for (LDBlock block : BLOCKS) {
            registerBlock(block.getBlock(), block.getName());
        }
    }

    private static void registerBlock(Block block, String name) {
        Registry.register(Registry.BLOCK, new Identifier(Vars.MOD_ID, name), block);
        Registry.register(Registry.ITEM, new Identifier(Vars.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(Vars.LOST_DREAM)));
    }
}
