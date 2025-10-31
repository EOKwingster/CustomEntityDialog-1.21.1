package com.eokwingster.customentitydialog;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

@Mod(CustomEntityDialog.MODID)
public class CustomEntityDialog {
    public static final String MODID = "customentitydialog";
    public static final Logger LOGGER = LogUtils.getLogger();

    public CustomEntityDialog(IEventBus modEventBus, ModContainer modContainer) {
    }
}
