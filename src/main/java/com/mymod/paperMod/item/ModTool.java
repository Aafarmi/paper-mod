package com.mymod.paperMod.item;

import com.mymod.paperMod.PaperMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.awt.print.Paper;

public class ModTool {
    public static final Item paper_pickaxe =
            registerItem(
                    "paper_pickaxe",
                      new PickaxeItem(
                              new PaperMaterial(),
                              new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(new PaperMaterial(), 1, -2.8f)
                              )
                      )
            );

    public static final Item paper_sword =
            registerItem(
                    "paper_sword",
                    new SwordItem(
                            new PaperMaterial(),
                            new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(new PaperMaterial(),3,-2.4F))
                    )
            );
    public static final Item paper_axe =
            registerItem(
                    "paper_axe",
                    new AxeItem(
                            new PaperMaterial(),
                            new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(new PaperMaterial(), 5.0F, -3.0F))
                    )
            );
    public static final Item paper_shovel =
            registerItem(
                    "paper_shovel",
                    new ShovelItem(
                            new PaperMaterial(),
                            new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(new PaperMaterial(), 1.5F, -3.0F))
                    )
            );
    public static final Item paper_hoe =
            registerItem(
                    "paper_hoe",
                    new HoeItem(
                            new PaperMaterial(),
                            new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(new PaperMaterial(), -3.0F, 0.0F))
                    )
            );
    private static <T extends Item> T registerItem(String name, T item) {
        return Registry.register(
                Registries.ITEM,
                Identifier.of(PaperMod.MOD_ID,name),
                item
        );
    }
    public static void registerModTools() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(
                fabricItemGroupEntries -> {
                    fabricItemGroupEntries.add(paper_pickaxe);
                    fabricItemGroupEntries.add(paper_axe);
                    fabricItemGroupEntries.add(paper_sword);
                    fabricItemGroupEntries.add(paper_shovel);
                    fabricItemGroupEntries.add(paper_hoe);
                }
        );
    }
}
