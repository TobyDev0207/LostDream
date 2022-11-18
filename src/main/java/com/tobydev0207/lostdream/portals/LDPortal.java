package com.tobydev0207.lostdream.portals;

import com.tobydev0207.lostdream.dimensions.LDDimension;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;

public class LDPortal {
    public static void register() {
        CustomPortalBuilder.beginPortal()
                .frameBlock(Blocks.SLIME_BLOCK)
                .lightWithItem(Items.EMERALD)
                .destDimID(LDDimension.getKey().getValue())
                .tintColor(20,60,86)
                .onlyLightInOverworld()
                .registerPortal();
    }
}