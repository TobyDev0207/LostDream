package com.tobydev0207.lostdream.blocks.pressure_plates;

import com.tobydev0207.lostdream.blocks.LDBlock;
import com.tobydev0207.lostdream.blocks.LDPressurePlateBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.block.PressurePlateBlock;

public class SlimePressurePlate extends LDPressurePlateBlock {

    private static final String NAME = "slime_pressure_plate";
    private static final PressurePlateBlock.ActivationRule TYPE = PressurePlateBlock.ActivationRule.EVERYTHING;
    private static final FabricBlockSettings SETTINGS = FabricBlockSettings.of(Material.WOOD);

    public PressurePlateBlock getBlock() {
        return new PressurePlateBlock(TYPE, SETTINGS);
    }

    public String getName() {
        return NAME;
    }
}
