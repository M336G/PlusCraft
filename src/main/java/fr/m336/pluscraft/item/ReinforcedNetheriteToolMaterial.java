package fr.m336.pluscraft.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ReinforcedNetheriteToolMaterial implements ToolMaterial {
    private static final int DURABILITY = 4096;
    private static final float MINING_SPEED_MULTIPLIER = 45.0F;
    private static final float ATTACK_DAMAGE = 15.0F;
    private static final int MINING_LEVEL = 7;
    private static final int ENCHANTABILITY = 15;
    private static final Ingredient REPAIR_INGREDIENT = Ingredient.ofItems(ModItems.REINFORCED_NETHERITE);

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