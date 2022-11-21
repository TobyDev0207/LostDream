package com.tobydev0207.lostdream.blocks.fences.gates;

import com.tobydev0207.lostdream.blocks.LDFenceGateBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.Material;

public class SlimeFenceGate extends LDFenceGateBlock {
    private static final String NAME = "slime_fence_gate";
    private static final Material MATERIAL = Material.WOOD;

    public FenceGateBlock getBlock() {
        return new FenceGateBlock(FabricBlockSettings.of(MATERIAL));
    }

    public String getName() {
        return NAME;
    }
}
