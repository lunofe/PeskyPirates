package org.chimute.peskypirates;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.io.File;

@Mod("peskypirates")
public class PeskyPirates {

    public PeskyPirates() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {
        String workingDirectory = System.getProperty("user.dir");
        File file = new File(workingDirectory + "/TLauncherAdditional.json");
        if (file.exists()) {
            throw new RuntimeException("Buy a legitimate copy of Minecraft!");
        }
    }
}
