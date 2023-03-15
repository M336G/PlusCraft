package fr.m336.pluscraft.item;

import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class OverloadedShovelItem extends ShovelItem {

    public OverloadedShovelItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}