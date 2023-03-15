package fr.m336.pluscraft.item;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class OverloadedAxeItem extends AxeItem {
    public OverloadedAxeItem(ToolMaterial toolMaterial, float attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
}