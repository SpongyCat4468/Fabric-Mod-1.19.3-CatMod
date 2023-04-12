package net.spongy.catmod;

import net.fabricmc.api.ModInitializer;

import net.spongy.catmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CatMod implements ModInitializer {
	public static final String MOD_ID = "catmod";
	public static final Logger LOGGER = LoggerFactory.getLogger("cat-mod");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

	}
}