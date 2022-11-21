package com.tobydev0207.lostdream.dimensions;

import com.tobydev0207.lostdream.Vars;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;

public class LDDimension {
  private static final RegistryKey<World> DIMENSION_KEY =
      RegistryKey.of(Registry.WORLD_KEY, new Identifier(Vars.MOD_ID, "lost_dream"));

  public static void register() {
    RegistryKey.of(Registry.DIMENSION_TYPE_KEY, getKey().getValue());
  }

  public static RegistryKey<World> getKey() {
    return DIMENSION_KEY;
  }
}
