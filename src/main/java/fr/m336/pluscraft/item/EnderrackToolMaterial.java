package fr.m336.pluscraft.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.MinecartItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class EnderrackToolMaterial implements ToolMaterial {
    private static final int DURABILITY = 3500;
    private static final float MINING_SPEED_MULTIPLIER = 44.0F;
    private static final float ATTACK_DAMAGE = 14.0F;
    private static final int MINING_LEVEL = 6;
    private static final int ENCHANTABILITY = 15;
    private static final Ingredient REPAIR_INGREDIENT = Ingredient.ofItems(ModItems.ENDERRACK);

    @Override
    public int getDurability() {
        return DURABILITY;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return MINING_SPEED_MULTIPLIER;
    }

    @Override
    public float getAttackDamage() {
        return ATTACK_DAMAGE;
    }

    @Override
    public int getMiningLevel() {
        return MINING_LEVEL;
    }

    @Override
    public int getEnchantability() {
        return ENCHANTABILITY;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return REPAIR_INGREDIENT;
    }
}