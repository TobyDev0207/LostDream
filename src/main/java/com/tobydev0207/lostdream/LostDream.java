package com.tobydev0207.lostdream;

import com.tobydev0207.lostdream.dimensions.LDDimension;
import com.tobydev0207.lostdream.portals.LDPortal;
import net.fabricmc.api.ModInitializer;

public class LostDream implements ModInitializer {
    @Override
    public void onInitialize() {
        // Register dimensions
        LDDimension.register();

        // Register portals
        LDPortal.register();
    }
}
