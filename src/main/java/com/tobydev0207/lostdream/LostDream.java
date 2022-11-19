package com.tobydev0207.lostdream;

import com.tobydev0207.lostdream.dimensions.LDDimension;
import com.tobydev0207.lostdream.portals.LDPortal;
import net.fabricmc.api.ModInitializer;
import software.bernie.geckolib3.GeckoLib;

public class LostDream implements ModInitializer {
    @Override
    public void onInitialize() {
        GeckoLib.initialize();

        LDDimension.register();
        LDPortal.register();

        BlockManager.register();
    }
}
