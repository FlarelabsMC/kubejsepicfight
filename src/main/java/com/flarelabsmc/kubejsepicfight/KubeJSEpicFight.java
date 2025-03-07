package com.flarelabsmc.kubejsepicfight;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod(KubeJSEpicFight.MODID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class KubeJSEpicFight {
    public static final String MODID = "kubejsepicfight";
    public static final Logger LOGGER = LogUtils.getLogger();

    public KubeJSEpicFight() {}
}
