package com.tobydev0207.lostdream;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class Vars {
    public static final String MOD_ID = "lostdream";
    public static final ItemGroup LOST_DREAM = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "lost_dream_group"), () -> new ItemStack(Items.SLIME_BLOCK));
}
