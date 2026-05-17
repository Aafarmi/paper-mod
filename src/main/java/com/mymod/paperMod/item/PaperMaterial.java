package com.mymod.paperMod.item;

import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

public class PaperMaterial implements ToolMaterial {
    @Override
    public int getDurability() { return 2; }
    @Override
    public float getMiningSpeedMultiplier() {  return 8.0f; }
    @Override
    public float getAttackDamage() { return 3.0f; }
    @Override
    public TagKey<Block> getInverseTag() {

        return BlockTags.INCORRECT_FOR_DIAMOND_TOOL;
    }
    @Override
    public int getEnchantability() { return 20; }
    @Override
    public Ingredient getRepairIngredient() { return Ingredient.ofItems(Items.PAPER); }
}
