package com.mymod.paperMod.item;

import com.mymod.paperMod.PaperMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.awt.print.Paper;


public class ModItems {
    public static final Item hardpaper=registerItem(
            "hardpaper",
            new Item(new Item.Settings())
    );
    public static final Item HARDPAPER_HELMET = registerItem(
            "hardpaper_helmet",
            new ArmorItem(
                    PaperArmorMaterial.HARDPAPER,
                    ArmorItem.Type.HELMET,
                    new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(2))
            )
    );
    public static final Item HARDPAPER_CHESTPLATE = registerItem(
            "hardpaper_chestplate",
            new ArmorItem(
                    PaperArmorMaterial.HARDPAPER,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(3))
            )
    );
    public static final Item HARDPAPER_LEGGINGS = registerItem(
            "hardpaper_leggings",
            new ArmorItem(
                    PaperArmorMaterial.HARDPAPER,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(3))
            )
    );
    public static final Item HARDPAPER_BOOTS = registerItem(
            "hardpaper_boots",
            new ArmorItem(
                    PaperArmorMaterial.HARDPAPER,
                    ArmorItem.Type.BOOTS,
                    new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(2))
            )
    );
    public static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(
                fabricItemGroupEntries -> {
                    fabricItemGroupEntries.add(hardpaper);
                }
        );
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(
                fabricItemGroupEntries -> {
                    fabricItemGroupEntries.add(HARDPAPER_HELMET);
                    fabricItemGroupEntries.add(HARDPAPER_CHESTPLATE);
                    fabricItemGroupEntries.add(HARDPAPER_LEGGINGS);
                    fabricItemGroupEntries.add(HARDPAPER_BOOTS);
                }
        );
    }
    public static <T extends Item> T registerItem(String name,T item) {
        return Registry.register(
                Registries.ITEM,
                Identifier.of(PaperMod.MOD_ID,name),
                item
        );
    }
}