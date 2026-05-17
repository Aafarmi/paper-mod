package com.mymod.paperMod;

import com.mymod.paperMod.item.ModFood;
import com.mymod.paperMod.item.ModItems;
import com.mymod.paperMod.item.ModTool;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class PaperMod implements ModInitializer {
    public static final String MOD_ID = "papermod";
    @Override
    public void onInitialize() {
        ModTool.registerModTools();
        ModItems.registerModItems();
        ModFood.registerModFoods();
    }
}

