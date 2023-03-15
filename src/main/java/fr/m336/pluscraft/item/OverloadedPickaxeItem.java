package fr.m336.pluscraft.item;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class OverloadedPickaxeItem extends PickaxeItem {

    public OverloadedPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}