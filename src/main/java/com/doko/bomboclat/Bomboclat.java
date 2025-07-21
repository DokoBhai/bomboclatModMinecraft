package com.doko.bomboclat;

import com.doko.bomboclat.block.ModBlocks;
import com.doko.bomboclat.item.ModItemGroups;
import com.doko.bomboclat.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bomboclat implements ModInitializer {
	public static final String MOD_ID = "bomboclat";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info(MOD_ID);
		ModItemGroups.registerItemGroups();


		ModItems.registerItems();
		ModBlocks.registerBlocks();
	}
}