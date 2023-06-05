package fr.m336.pluscraft.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class HypermentiumToolMaterial implements ToolMaterial {
    private static final int DURABILITY = 32768;
    private static final float MINING_SPEED_MULTIPLIER = 60.0F;
    private static final float ATTACK_DAMAGE = 35.0F;
    private static final int MINING_LEVEL = 9;
    private static final int ENCHANTABILITY = 15;
    private static final Ingredient REPAIR_INGREDIENT = Ingredient.ofItems(ModItems.HYPERMENTIUM);

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