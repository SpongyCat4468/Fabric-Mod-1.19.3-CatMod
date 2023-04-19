package net.spongy.catmod.registries;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.spongy.catmod.CatMod;
import net.spongy.catmod.block.ModBlocks;

public class ModRegistries {
    public static void registerModFuels() {
        System.out.println("Now registering modfuels for " + CatMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

         registry.add(ModBlocks.RED_MAPLE_LOG, 300);
         registry.add(ModBlocks.RED_MAPLE_PLANKS, 300);
         registry.add(ModBlocks.RED_MAPLE_WOOD, 300);
         registry.add(ModBlocks.STRIPPED_RED_MAPLE_LOG, 300);
         registry.add(ModBlocks.STRIPPED_RED_MAPLE_WOOD, 300);
         registry.add(ModBlocks.RED_MAPLE_SLAB, 300);
         registry.add(ModBlocks.RED_MAPLE_STAIRS, 300);
         registry.add(ModBlocks.RED_MAPLE_SAPLING, 10);

    }
}
