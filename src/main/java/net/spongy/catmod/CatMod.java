package net.spongy.catmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.spongy.catmod.block.ModBlocks;
import net.spongy.catmod.block.ModFlammableBlockRegistry;
import net.spongy.catmod.data.ModWorldGenerator;
import net.spongy.catmod.item.ModItemGroup;
import net.spongy.catmod.item.ModItems;
import net.spongy.catmod.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CatMod implements ModInitializer {
	public static final String MOD_ID = "catmod";
	public static final Logger LOGGER = LoggerFactory.getLogger("cat-mod");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModWorldGeneration.generateModWorldGen();

		ModFlammableBlockRegistry.registerFlammableBlocks();
		StrippableBlockRegistry.register(ModBlocks.RED_MAPLE_LOG, ModBlocks.STRIPPED_RED_MAPLE_LOG);
		StrippableBlockRegistry.register(ModBlocks.RED_MAPLE_WOOD, ModBlocks.STRIPPED_RED_MAPLE_WOOD);
	}
}