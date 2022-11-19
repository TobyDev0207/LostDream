package com.tobydev0207.lostdream.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class StrippedSlimeLog extends LDBlock {

    private final Material MATERIALS = Material.WOOD;
    private final String NAME = "stripped_slime_log";

    public Block getBlock() {
        return new Block(FabricBlockSettings.of(MATERIALS));
    }

    public String getName() {
        return NAME;
    }

}
