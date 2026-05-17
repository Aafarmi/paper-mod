package com.mymod.paperMod.item;

import com.mymod.paperMod.PaperMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;


public class ModFood {
    public static final Item ENCHANTED_NETHERITE_APPLE = register(
            "enchanted_netherite_apple",
            new Item(new Item.Settings().rarity(Rarity.EPIC).food(ModFoodComponents.ENCHANTED_NETHERITE_APPLE).component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true))
    );
    public static final Item ENCHANTED_DIAMOND_APPLE = register(
            "enchanted_diamond_apple",
            new Item(new Item.Settings().rarity(Rarity.EPIC).food(ModFoodComponents.ENCHANTED_DIAMOND_APPLE).component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true))
    );
    public static final Item HARDPAPER_APPLE = register(
            "hardpaper_apple",
            new Item(new Item.Settings().rarity(Rarity.RARE).food(ModFoodComponents.HARDPAPER_APPLE)));
    public static final Item COPPER_APPLE = register(
            "copper_apple",
            new Item(new Item.Settings().rarity(Rarity.RARE).food(ModFoodComponents.COPPER_APPLE)));
    public static final Item IRON_APPLE = register(
            "iron_apple",
            new Item(new Item.Settings().rarity(Rarity.RARE).food(ModFoodComponents.IRON_APPLE)));
    public static final Item DIAMOND_APPLE = register(
            "diamond_apple",
            new Item(new Item.Settings().rarity(Rarity.RARE).food(ModFoodComponents.DIAMOND_APPLE)));
    public static final Item NETHERITE_APPLE = register(
            "netherite_apple",
            new Item(new Item.Settings().rarity(Rarity.RARE).food(ModFoodComponents.NETHERITE_APPLE)));

    public static void registerModFoods(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(
                fabricItemGroupEntries -> {
                    fabricItemGroupEntries.add(HARDPAPER_APPLE);
                    fabricItemGroupEntries.add(COPPER_APPLE);
                    fabricItemGroupEntries.add(IRON_APPLE);
                    fabricItemGroupEntries.add(DIAMOND_APPLE);
                    fabricItemGroupEntries.add(NETHERITE_APPLE);
                    fabricItemGroupEntries.add(ENCHANTED_NETHERITE_APPLE);
                    fabricItemGroupEntries.add(ENCHANTED_DIAMOND_APPLE);
                }
        );
    }

    private static <T extends Item> T register(String id, T item) {
        return Registry.register(
                Registries.ITEM,
                Identifier.of(PaperMod.MOD_ID,id),
                item
        );
    }
}
