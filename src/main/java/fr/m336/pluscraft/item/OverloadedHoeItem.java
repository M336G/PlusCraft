package fr.m336.pluscraft.item;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class OverloadedHoeItem extends HoeItem {

    public OverloadedHoeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}