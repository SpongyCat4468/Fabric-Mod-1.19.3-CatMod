package net.spongy.catmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.spongy.catmod.CatMod;

public class ModItemGroup {

    public static ItemGroup CITRINE;

    public static void registerItemGroups() {
        CITRINE = FabricItemGroup.builder(new Identifier(CatMod.MOD_ID, "citrine"))
                .displayName(Text.literal("Cat Mod Item"))
                .icon(() -> new ItemStack(ModItems.CITRINE)).build();
    }
}
