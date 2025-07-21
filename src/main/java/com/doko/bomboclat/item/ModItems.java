package com.doko.bomboclat.item;

import com.doko.bomboclat.Bomboclat;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item Bomb = registerItem("bomb", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Bomboclat.MOD_ID,"bomb")))));
    public static final Item Bomb_raw = registerItem("bomb_raw", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Bomboclat.MOD_ID,"bomb_raw")))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Bomboclat.MOD_ID, name ), item);
    }

    public static void registerItems() {
        Bomboclat.LOGGER.info("Registering ModItems For " + Bomboclat.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(enteries -> {;
            enteries.add(Bomb);
            enteries.add(Bomb_raw);
        });
    }
}
