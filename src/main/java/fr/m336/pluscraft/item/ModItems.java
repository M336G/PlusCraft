package fr.m336.pluscraft.item;

import fr.m336.pluscraft.PlusCraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;

import java.util.List;

public class ModItems {

    public static final ToolMaterial REINFORCED_NETHERITE_TOOL_MATERIAL = new ReinforcedNetheriteToolMaterial();
    public static final ToolMaterial OVERLOADED_TOOL_MATERIAL = new OverloadedToolMaterial();
    public static final ToolMaterial DRAGON_TOOL_MATERIAL = new DragonToolMaterial();
    public static final ToolMaterial COSMIC_TOOL_MATERIAL = new CosmicToolMaterial();
    public static final ToolMaterial OBSIDIAN_TOOL_MATERIAL = new ObsidianToolMaterial();
    public static final ToolMaterial HYPERMENTIUM_TOOL_MATERIAL = new HypermentiumToolMaterial();
    public static final ToolMaterial IMPERVITE_TOOL_MATERIAL = new ImperviteToolMaterial();
    public static final ToolMaterial TERBINTH_TOOL_MATERIAL = new TerbinthToolMaterial();

    public static final Item OVERLOADED_DIAMOND = registerItem("overloaded_diamond",
            new Item(new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));

    public static final Item REINFORCED_NETHERITE = registerItem("reinforced_netherite",
            new Item(new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));

    public static final Item OVERLOADED_MATERIAL = registerItem("overloaded_material",
            new Item(new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));

    public static final Item REINFORCED_NETHERITE_SWORD = registerItem("reinforced_netherite_sword",
            new SwordItem(REINFORCED_NETHERITE_TOOL_MATERIAL, -1, -2.4F,
                    new FabricItemSettings().fireproof()));

    public static final Item OVERLOADED_SWORD = registerItem("overloaded_sword",
            new SwordItem(OVERLOADED_TOOL_MATERIAL, -1, -2.4F,
                    new FabricItemSettings().fireproof()));

    public static final Item DRAGON_SWORD = registerItem("dragon_sword",
            new SwordItem(DRAGON_TOOL_MATERIAL, 4, -2.4F,
                    new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));

    public static final Item REINFORCED_NETHERITE_PICKAXE = registerItem("reinforced_netherite_pickaxe",
            new PickaxeItem(REINFORCED_NETHERITE_TOOL_MATERIAL, -7, -2.8F,
                    new FabricItemSettings().fireproof()));

    public static final Item REINFORCED_NETHERITE_SHOVEL = registerItem("reinforced_netherite_shovel",
            new ShovelItem(REINFORCED_NETHERITE_TOOL_MATERIAL, -7, -3.0F,
                    new FabricItemSettings().fireproof()));

    public static final Item OVERLOADED_PICKAXE = registerItem("overloaded_pickaxe",
            new PickaxeItem(OVERLOADED_TOOL_MATERIAL, -8, -2.8F,
                    new FabricItemSettings().fireproof()));

    public static final Item OVERLOADED_SHOVEL = registerItem("overloaded_shovel",
            new ShovelItem(OVERLOADED_TOOL_MATERIAL, -8, -3.0F,
                    new FabricItemSettings().fireproof()));

    public static final Item OVERLOADED_AXE = registerItem("overloaded_axe",
            new AxeItem(OVERLOADED_TOOL_MATERIAL, 4, -3.0F,
                    new FabricItemSettings().fireproof()));

    public static final Item REINFORCED_NETHERITE_AXE = registerItem("reinforced_netherite_axe",
            new AxeItem(REINFORCED_NETHERITE_TOOL_MATERIAL, 4, -3.0F,
                    new FabricItemSettings().fireproof()));

    public static final Item REINFORCED_NETHERITE_HOE = registerItem("reinforced_netherite_hoe",
            new HoeItem(REINFORCED_NETHERITE_TOOL_MATERIAL, -15, 0.0F,
                    new FabricItemSettings().fireproof()));

    public static final Item OVERLOADED_HOE = registerItem("overloaded_hoe",
            new HoeItem(OVERLOADED_TOOL_MATERIAL, -20, 0.0F,
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
            new SwordItem(OBSIDIAN_TOOL_MATERIAL, -1, -2.4F,
                    new FabricItemSettings().fireproof()));

    public static final Item OBSIDIAN_PICKAXE = registerItem("obsidian_pickaxe",
            new PickaxeItem(OBSIDIAN_TOOL_MATERIAL, -4, -2.8F,
                    new FabricItemSettings().fireproof()));

    public static final Item OBSIDIAN_AXE = registerItem("obsidian_axe",
            new AxeItem(OBSIDIAN_TOOL_MATERIAL, 4, -3.0F,
                    new FabricItemSettings().fireproof()));

    public static final Item OBSIDIAN_SHOVEL = registerItem("obsidian_shovel",
            new ShovelItem(OBSIDIAN_TOOL_MATERIAL, -4, -3.0F,
                    new FabricItemSettings().fireproof()));

    public static final Item OBSIDIAN_HOE = registerItem("obsidian_hoe",
            new HoeItem(OBSIDIAN_TOOL_MATERIAL, -10, 0.0F,
                    new FabricItemSettings().fireproof()));

    public static final Item OBSIDIAN_HELMET = registerItem("obsidian_helmet",
            new ArmorItem(ObsidianArmorMaterial.OBSIDIAN, EquipmentSlot.HEAD,
                    new FabricItemSettings().fireproof()));

    public static final Item OBSIDIAN_CHESTPLATE = registerItem("obsidian_chestplate",
            new ArmorItem(ObsidianArmorMaterial.OBSIDIAN, EquipmentSlot.CHEST,
                    new FabricItemSettings().fireproof()));

    public static final Item OBSIDIAN_LEGGINGS = registerItem("obsidian_leggings",
            new ArmorItem(ObsidianArmorMaterial.OBSIDIAN, EquipmentSlot.LEGS,
                    new FabricItemSettings().fireproof()));

    public static final Item OBSIDIAN_BOOTS = registerItem("obsidian_boots",
            new ArmorItem(ObsidianArmorMaterial.OBSIDIAN, EquipmentSlot.FEET,
                    new FabricItemSettings().fireproof()));

    public static final Item TERBINTH_SHARD = registerItem("terbinth_shard",
            new TerbinthShardItem(new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));

    public static final Item HYPERMENTIUM = registerItem("hypermentium",
            new HypermentiumItem(new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));

    public static final Item IMPERVITE = registerItem("impervite",
            new ImperviteItem(new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));

    public static final Item RAW_IMPERVITE = registerItem("raw_impervite",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item RAW_HYPERMENTIUM = registerItem("raw_hypermentium",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item HYPERMENTIUM_PICKAXE = registerItem("hypermentium_pickaxe",
            new PickaxeItem(HYPERMENTIUM_TOOL_MATERIAL, -16, -2.8F,
                    new FabricItemSettings().fireproof()));

    public static final Item IMPERVITE_PICKAXE = registerItem("impervite_pickaxe",
            new PickaxeItem(IMPERVITE_TOOL_MATERIAL, -16, -2.8F,
                    new FabricItemSettings().fireproof()));

    public static final Item TERBINTH_PICKAXE = registerItem("terbinth_pickaxe",
            new PickaxeItem(TERBINTH_TOOL_MATERIAL, -16, -2.8F,
                    new FabricItemSettings().fireproof()));

    public static final Item ENDER_STAR = registerItem("ender_star",
            new Item(new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));

    public static final Item SUSPICIOUS_SWORD = registerItem("suspicious_sword",
            new SuspiciousSwordItem(DRAGON_TOOL_MATERIAL, 9, -2.4F,
                    new FabricItemSettings().fireproof().rarity(Rarity.EPIC)));

    public static final Item IMPERVITE_SWORD = registerItem("impervite_sword",
            new SwordItem(IMPERVITE_TOOL_MATERIAL, -1, -2.4F,
                    new FabricItemSettings().fireproof()));

    public static final Item IMPERVITE_SHOVEL = registerItem("impervite_shovel",
            new ShovelItem(IMPERVITE_TOOL_MATERIAL, -21, -3.0F,
                    new FabricItemSettings().fireproof()));

    public static final Item IMPERVITE_HOE = registerItem("impervite_hoe",
            new HoeItem(IMPERVITE_TOOL_MATERIAL, -31, 0.0F,
                    new FabricItemSettings().fireproof()));

    public static final Item IMPERVITE_AXE = registerItem("impervite_axe",
            new AxeItem(IMPERVITE_TOOL_MATERIAL, 4, -3.0F,
                    new FabricItemSettings().fireproof()));

    public static final Item IMPERVITE_HELMET = registerItem("impervite_helmet",
            new ArmorItem(ImperviteArmorMaterial.IMPERVITE, EquipmentSlot.HEAD,
                    new FabricItemSettings().fireproof()));

    public static final Item IMPERVITE_CHESTPLATE = registerItem("impervite_chestplate",
            new ArmorItem(ImperviteArmorMaterial.IMPERVITE, EquipmentSlot.CHEST,
                    new FabricItemSettings().fireproof()));

    public static final Item IMPERVITE_LEGGINGS = registerItem("impervite_leggings",
            new ArmorItem(ImperviteArmorMaterial.IMPERVITE, EquipmentSlot.LEGS,
                    new FabricItemSettings().fireproof()));

    public static final Item IMPERVITE_BOOTS = registerItem("impervite_boots",
            new ArmorItem(ImperviteArmorMaterial.IMPERVITE, EquipmentSlot.FEET,
                    new FabricItemSettings().fireproof()));

    public static final Item HYPERMENTIUM_HELMET = registerItem("hypermentium_helmet",
            new ArmorItem(HypermentiumArmorMaterial.HYPERMENTIUM, EquipmentSlot.HEAD,
                    new FabricItemSettings().fireproof()));

    public static final Item HYPERMENTIUM_CHESTPLATE = registerItem("hypermentium_chestplate",
            new ArmorItem(HypermentiumArmorMaterial.HYPERMENTIUM, EquipmentSlot.CHEST,
                    new FabricItemSettings().fireproof()));

    public static final Item HYPERMENTIUM_LEGGINGS = registerItem("hypermentium_leggings",
            new ArmorItem(HypermentiumArmorMaterial.HYPERMENTIUM, EquipmentSlot.LEGS,
                    new FabricItemSettings().fireproof()));

    public static final Item HYPERMENTIUM_BOOTS = registerItem("hypermentium_boots",
            new ArmorItem(HypermentiumArmorMaterial.HYPERMENTIUM, EquipmentSlot.FEET,
                    new FabricItemSettings().fireproof()));

    public static final Item TERBINTH_HELMET = registerItem("terbinth_helmet",
            new ArmorItem(TerbinthArmorMaterial.TERBINTH, EquipmentSlot.HEAD,
                    new FabricItemSettings().fireproof()));

    public static final Item TERBINTH_CHESTPLATE = registerItem("terbinth_chestplate",
            new ArmorItem(TerbinthArmorMaterial.TERBINTH, EquipmentSlot.CHEST,
                    new FabricItemSettings().fireproof()));

    public static final Item TERBINTH_LEGGINGS = registerItem("terbinth_leggings",
            new ArmorItem(TerbinthArmorMaterial.TERBINTH, EquipmentSlot.LEGS,
                    new FabricItemSettings().fireproof()));

    public static final Item TERBINTH_BOOTS = registerItem("terbinth_boots",
            new ArmorItem(TerbinthArmorMaterial.TERBINTH, EquipmentSlot.FEET,
                    new FabricItemSettings().fireproof()));
    
    public static final Item HYPERMENTIUM_SWORD = registerItem("hypermentium_sword",
            new SwordItem(HYPERMENTIUM_TOOL_MATERIAL, -1, -2.4F,
                    new FabricItemSettings().fireproof()));

    public static final Item HYPERMENTIUM_SHOVEL = registerItem("hypermentium_shovel",
            new ShovelItem(HYPERMENTIUM_TOOL_MATERIAL, -21, -3.0F,
                    new FabricItemSettings().fireproof()));

    public static final Item HYPERMENTIUM_HOE = registerItem("hypermentium_hoe",
            new HoeItem(HYPERMENTIUM_TOOL_MATERIAL, -31, 0.0F,
                    new FabricItemSettings().fireproof()));

    public static final Item HYPERMENTIUM_AXE = registerItem("hypermentium_axe",
            new AxeItem(HYPERMENTIUM_TOOL_MATERIAL, 4, -3.0F,
                    new FabricItemSettings().fireproof()));

    public static final Item TERBINTH_SWORD = registerItem("terbinth_sword",
            new SwordItem(TERBINTH_TOOL_MATERIAL, 4, -2.4F,
                    new FabricItemSettings().fireproof()));

    public static final Item TERBINTH_SHOVEL = registerItem("terbinth_shovel",
            new ShovelItem(TERBINTH_TOOL_MATERIAL, -21, -3.0F,
                    new FabricItemSettings().fireproof()));

    public static final Item TERBINTH_MINIHOE = registerItem("terbinth_minihoe",
            new HoeItem(TERBINTH_TOOL_MATERIAL, -31, 0.0F,
                    new FabricItemSettings().fireproof()));

    public static final Item TERBINTH_AXE = registerItem("terbinth_axe",
            new AxeItem(TERBINTH_TOOL_MATERIAL, 9, -3.0F,
                    new FabricItemSettings().fireproof()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM,new Identifier(PlusCraft.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {

        addToItemGroup(ModItemGroup.PLUSCRAFT, OVERLOADED_DIAMOND);
        addToItemGroup(ModItemGroup.PLUSCRAFT, REINFORCED_NETHERITE);
        addToItemGroup(ModItemGroup.PLUSCRAFT, OVERLOADED_MATERIAL);
        addToItemGroup(ModItemGroup.PLUSCRAFT, RAW_HYPERMENTIUM);
        addToItemGroup(ModItemGroup.PLUSCRAFT, RAW_IMPERVITE);
        addToItemGroup(ModItemGroup.PLUSCRAFT, HYPERMENTIUM);
        addToItemGroup(ModItemGroup.PLUSCRAFT, IMPERVITE);
        addToItemGroup(ModItemGroup.PLUSCRAFT, TERBINTH_SHARD);
        addToItemGroup(ModItemGroup.PLUSCRAFT, ENDER_STAR);
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
        addToItemGroup(ModItemGroup.PLUSCRAFT, HYPERMENTIUM_SWORD);
        addToItemGroup(ModItemGroup.PLUSCRAFT, HYPERMENTIUM_PICKAXE);
        addToItemGroup(ModItemGroup.PLUSCRAFT, HYPERMENTIUM_AXE);
        addToItemGroup(ModItemGroup.PLUSCRAFT, HYPERMENTIUM_SHOVEL);
        addToItemGroup(ModItemGroup.PLUSCRAFT, HYPERMENTIUM_HOE);
        addToItemGroup(ModItemGroup.PLUSCRAFT, IMPERVITE_SWORD);
        addToItemGroup(ModItemGroup.PLUSCRAFT, IMPERVITE_PICKAXE);
        addToItemGroup(ModItemGroup.PLUSCRAFT, IMPERVITE_AXE);
        addToItemGroup(ModItemGroup.PLUSCRAFT, IMPERVITE_SHOVEL);
        addToItemGroup(ModItemGroup.PLUSCRAFT, IMPERVITE_HOE);
        addToItemGroup(ModItemGroup.PLUSCRAFT, TERBINTH_SWORD);
        addToItemGroup(ModItemGroup.PLUSCRAFT, TERBINTH_PICKAXE);
        addToItemGroup(ModItemGroup.PLUSCRAFT, TERBINTH_AXE);
        addToItemGroup(ModItemGroup.PLUSCRAFT, TERBINTH_SHOVEL);
        addToItemGroup(ModItemGroup.PLUSCRAFT, TERBINTH_MINIHOE);
        addToItemGroup(ModItemGroup.PLUSCRAFT, DRAGON_SWORD);
        addToItemGroup(ModItemGroup.PLUSCRAFT, COSMIC_HOE);
        addToItemGroup(ModItemGroup.PLUSCRAFT, OBSIDIAN_HELMET);
        addToItemGroup(ModItemGroup.PLUSCRAFT, OBSIDIAN_CHESTPLATE);
        addToItemGroup(ModItemGroup.PLUSCRAFT, OBSIDIAN_LEGGINGS);
        addToItemGroup(ModItemGroup.PLUSCRAFT, OBSIDIAN_BOOTS);
        addToItemGroup(ModItemGroup.PLUSCRAFT, REINFORCED_NETHERITE_HELMET);
        addToItemGroup(ModItemGroup.PLUSCRAFT, REINFORCED_NETHERITE_CHESTPLATE);
        addToItemGroup(ModItemGroup.PLUSCRAFT, REINFORCED_NETHERITE_LEGGINGS);
        addToItemGroup(ModItemGroup.PLUSCRAFT, REINFORCED_NETHERITE_BOOTS);
        addToItemGroup(ModItemGroup.PLUSCRAFT, HYPERMENTIUM_HELMET);
        addToItemGroup(ModItemGroup.PLUSCRAFT, HYPERMENTIUM_CHESTPLATE);
        addToItemGroup(ModItemGroup.PLUSCRAFT, HYPERMENTIUM_LEGGINGS);
        addToItemGroup(ModItemGroup.PLUSCRAFT, HYPERMENTIUM_BOOTS);
        addToItemGroup(ModItemGroup.PLUSCRAFT, IMPERVITE_HELMET);
        addToItemGroup(ModItemGroup.PLUSCRAFT, IMPERVITE_CHESTPLATE);
        addToItemGroup(ModItemGroup.PLUSCRAFT, IMPERVITE_LEGGINGS);
        addToItemGroup(ModItemGroup.PLUSCRAFT, IMPERVITE_BOOTS);
        addToItemGroup(ModItemGroup.PLUSCRAFT, TERBINTH_HELMET);
        addToItemGroup(ModItemGroup.PLUSCRAFT, TERBINTH_CHESTPLATE);
        addToItemGroup(ModItemGroup.PLUSCRAFT, TERBINTH_LEGGINGS);
        addToItemGroup(ModItemGroup.PLUSCRAFT, TERBINTH_BOOTS);

    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        PlusCraft.LOGGER.info("Registering Mod Items for " + PlusCraft.MOD_ID);

        addItemsToItemGroup();
    }
}
