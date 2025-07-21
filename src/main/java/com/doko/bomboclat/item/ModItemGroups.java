package com.doko.bomboclat.item;

import com.doko.bomboclat.Bomboclat;
import net.fabricmc.fabric.api.networking.v1.S2CPlayChannelEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registry;

public class ModItemGroups {

    public static final ItemGroup BOMBOCLAT_ITEM_GROUP = Registry.register()

    public static void registerItemGroups() {
        Bomboclat.LOGGER.info("Registering ItemGroups" + Bomboclat.MOD_ID);
    }
}
