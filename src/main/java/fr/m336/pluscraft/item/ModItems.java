package fr.m336.pluscraft.item;

import fr.m336.pluscraft.PlusCraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import static fr.m336.pluscraft.PlusCraft.*;

public class ModItems {

    public static final ToolMaterial REINFORCED_NETHERITE_TOOL_MATERIAL = new ReinforcedNetheriteToolMaterial();
    public static final ToolMaterial OVERLOADED_TOOL_MATERIAL = new OverloadedToolMaterial();
    public static final ToolMaterial DRAGON_TOOL_MATERIAL = new DragonToolMaterial();
    public static final ToolMaterial COSMIC_TOOL_MATERIAL = new CosmicToolMaterial();
    public static final ToolMaterial OBSIDIAN_TOOL_MATERIAL = new ObsidianToolMaterial();

    public static final Item OVERLOADED_DIAMOND = registerItem("overloaded_diamond",
            new Item(new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));

    public static final Item REINFORCED_NETHERITE = registerItem("reinforced_netherite",
            new Item(new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));

    public static final Item OVERLOADED_MATERIAL = registerItem("overloaded_material",
            new Item(new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));

    public static final Item REINFORCED_NETHERITE_SWORD = registerItem("reinforced_netherite_sword",
            new ReinforcedNetheriteSwordItem(REINFORCED_NETHERITE_TOOL_MATERIAL, -1, -2.4F,
                    new FabricItemSettings().fireproof()));

    public static final Item OVERLOADED_SWORD = registerItem("overloaded_sword",
            new OverloadedSwordItem(OVERLOADED_TOOL_MATERIAL, -1, -2.4F,
                    new FabricItemSettings().fireproof()));

    public static final Item DRAGON_SWORD = registerItem("dragon_sword",
            new DragonSwordItem(DRAGON_TOOL_MATERIAL, -1, -2.4F,
                    new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));

    public static final Item REINFORCED_NETHERITE_PICKAXE = registerItem("reinforced_netherite_pickaxe",
            new ReinforcedNetheritePickaxeItem(REINFORCED_NETHERITE_TOOL_MATERIAL, -7, -2.8F,
                    new FabricItemSettings().fireproof()));

    public static final Item REINFORCED_NETHERITE_SHOVEL = registerItem("reinforced_netherite_shovel",
            new ReinforcedNetheriteShovelItem(REINFORCED_NETHERITE_TOOL_MATERIAL, -7, -3.0F,
                    new FabricItemSettings().fireproof()));

    public static final Item OVERLOADED_PICKAXE = registerItem("overloaded_pickaxe",
            new OverloadedPickaxeItem(OVERLOADED_TOOL_MATERIAL, -8, -2.8F,
                    new FabricItemSettings().fireproof()));

    public static final Item OVERLOADED_SHOVEL = registerItem("overloaded_shovel",
            new OverloadedShovelItem(OVERLOADED_TOOL_MATERIAL, -8, -3.0F,
                    new FabricItemSettings().fireproof()));

    public static final Item OVERLOADED_AXE = registerItem("overloaded_axe",
            new OverloadedAxeItem(OVERLOADED_TOOL_MATERIAL, 4, -3.0F,
                    new FabricItemSettings().fireproof()));

    public static final Item REINFORCED_NETHERITE_AXE = registerItem("reinforced_netherite_axe",
            new ReinforcedNetheriteAxeItem(REINFORCED_NETHERITE_TOOL_MATERIAL, 4, -3.0F,
                    new FabricItemSettings().fireproof()));

    public static final Item REINFORCED_NETHERITE_HOE = registerItem("reinforced_netherite_hoe",
            new ReinforcedNetheriteHoeItem(REINFORCED_NETHERITE_TOOL_MATERIAL, -15, 0.0F,
                    new FabricItemSettings().fireproof()));

    public static final Item OVERLOADED_HOE = registerItem("overloaded_hoe",
            new OverloadedHoeItem(OVERLOADED_TOOL_MATERIAL, -20, 0.0F,
                    new FabricItemSettings().fireproof()));

    public static final Item COSMIC_HOE = registerItem("cosmic_hoe",
            new CosmicHoeItem(COSMIC_TOOL_MATERIAL, -21, 0.0F,
                    new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));

    public static final Item NETHERITE_STICK = registerItem("netherite_stick",
            new Item(new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));

    public static final Item REINFORCED_NETHERITE_HELMET = registerItem("reinforced_netherite_helmet",
            new ArmorItem(ReinforcedNetheriteArmorMaterial.REINFORCED_NETHERITE, EquipmentSlot.HEAD,
                    new FabricItemSettings().fireproof()));

    public static final Item REINFORCED_NETHERITE_CHESTPLATE = registerItem("reinforced_netherite_chestplate",
            new ArmorItem(ReinforcedNetheriteArmorMaterial.REINFORCED_NETHERITE, EquipmentSlot.CHEST,
                    new FabricItemSettings().fireproof()));

    public static final Item REINFORCED_NETHERITE_LEGGINGS = registerItem("reinforced_netherite_leggings",
            new ArmorItem(ReinforcedNetheriteArmorMaterial.REINFORCED_NETHERITE, EquipmentSlot.LEGS,
                    new FabricItemSettings().fireproof()));

    public static final Item REINFORCED_NETHERITE_BOOTS = registerItem("reinforced_netherite_boots",
            new ArmorItem(ReinforcedNetheriteArmorMaterial.REINFORCED_NETHERITE, EquipmentSlot.FEET,
                    new FabricItemSettings().fireproof()));

    public static final Item OBSIDIAN_STICK = registerItem("obsidian_stick",
            new Item(new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));

    public static final Item OBSIDIAN_SWORD = registerItem("obsidian_sword",
            new ObsidianSwordItem(OBSIDIAN_TOOL_MATERIAL, -1, -2.4F,
                    new FabricItemSettings().fireproof()));

    public static final Item OBSIDIAN_PICKAXE = registerItem("obsidian_pickaxe",
            new ObsidianPickaxeItem(OBSIDIAN_TOOL_MATERIAL, -4, -2.8F,
                    new FabricItemSettings().fireproof()));

    public static final Item OBSIDIAN_AXE = registerItem("obsidian_axe",
            new ObsidianAxeItem(OBSIDIAN_TOOL_MATERIAL, 4, -3.0F,
                    new FabricItemSettings().fireproof()));

    public static final Item OBSIDIAN_SHOVEL = registerItem("obsidian_shovel",
            new ObsidianShovelItem(OBSIDIAN_TOOL_MATERIAL, -4, -3.0F,
                    new FabricItemSettings().fireproof()));

    public static final Item OBSIDIAN_HOE = registerItem("obsidian_hoe",
            new ObsidianHoeItem(OBSIDIAN_TOOL_MATERIAL, -10, 0.0F,
                    new FabricItemSettings().fireproof()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM,new Identifier(PlusCraft.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {

        addToItemGroup(ModItemGroup.PLUSCRAFT, OVERLOADED_DIAMOND);
        addToItemGroup(ModItemGroup.PLUSCRAFT, REINFORCED_NETHERITE);
        addToItemGroup(ModItemGroup.PLUSCRAFT, OVERLOADED_MATERIAL);
        addToItemGroup(ModItemGroup.PLUSCRAFT, OBSIDIAN_STICK);
        addToItemGroup(ModItemGroup.PLUSCRAFT, NETHERITE_STICK);
        addToItemGroup(ModItemGroup.PLUSCRAFT, OBSIDIAN_SWORD);
        addToItemGroup(ModItemGroup.PLUSCRAFT, OBSIDIAN_PICKAXE);
        addToItemGroup(ModItemGroup.PLUSCRAFT, OBSIDIAN_AXE);
        addToItemGroup(ModItemGroup.PLUSCRAFT, OBSIDIAN_SHOVEL);
        addToItemGroup(ModItemGroup.PLUSCRAFT, OBSIDIAN_HOE);
        addToItemGroup(ModItemGroup.PLUSCRAFT, REINFORCED_NETHERITE_SWORD);
        addToItemGroup(ModItemGroup.PLUSCRAFT, OVERLOADED_SWORD);
        addToItemGroup(ModItemGroup.PLUSCRAFT, REINFORCED_NETHERITE_PICKAXE);
        addToItemGroup(ModItemGroup.PLUSCRAFT, OVERLOADED_PICKAXE);
        addToItemGroup(ModItemGroup.PLUSCRAFT, REINFORCED_NETHERITE_AXE);
        addToItemGroup(ModItemGroup.PLUSCRAFT, OVERLOADED_AXE);
        addToItemGroup(ModItemGroup.PLUSCRAFT, REINFORCED_NETHERITE_SHOVEL);
        addToItemGroup(ModItemGroup.PLUSCRAFT, OVERLOADED_SHOVEL);
        addToItemGroup(ModItemGroup.PLUSCRAFT, REINFORCED_NETHERITE_HOE);
        addToItemGroup(ModItemGroup.PLUSCRAFT, OVERLOADED_HOE);
        addToItemGroup(ModItemGroup.PLUSCRAFT, DRAGON_SWORD);
        addToItemGroup(ModItemGroup.PLUSCRAFT, COSMIC_HOE);
        addToItemGroup(ModItemGroup.PLUSCRAFT, REINFORCED_NETHERITE_HELMET);
        addToItemGroup(ModItemGroup.PLUSCRAFT, REINFORCED_NETHERITE_CHESTPLATE);
        addToItemGroup(ModItemGroup.PLUSCRAFT, REINFORCED_NETHERITE_LEGGINGS);
        addToItemGroup(ModItemGroup.PLUSCRAFT, REINFORCED_NETHERITE_BOOTS);

    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        PlusCraft.LOGGER.info("Registering Mod Items for " + PlusCraft.MOD_ID);

        addItemsToItemGroup();
    }
}
