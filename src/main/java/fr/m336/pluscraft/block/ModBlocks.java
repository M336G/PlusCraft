package fr.m336.pluscraft.block;

import fr.m336.pluscraft.PlusCraft;
import fr.m336.pluscraft.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block REINFORCED_NETHERITE_BLOCK = registerBlock("reinforced_netherite_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F).requiresTool().sounds(BlockSoundGroup.NETHERITE)), ModItemGroup.PLUSCRAFT);

        public static final Block OVERLOADED_DIAMOND_BLOCK = registerBlock("overloaded_diamond_block",
                new Block(FabricBlockSettings.of(Material.METAL).strength(6.0F).requiresTool().sounds(BlockSoundGroup.METAL)), ModItemGroup.PLUSCRAFT);

    public static final Block DEEPSLATE_HYPERMENTIUM_ORE = registerBlock("deepslate_hypermentium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0F).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)), ModItemGroup.PLUSCRAFT);

    public static final Block DEEPSLATE_IMPERVITE_ORE = registerBlock("deepslate_impervite_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0F).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)), ModItemGroup.PLUSCRAFT);

    public static final Block TERBINTH_CRYSTAL = registerBlock("terbinth_crystal",
            new Block(FabricBlockSettings.of(Material.AMETHYST).strength(6.0F).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)), ModItemGroup.PLUSCRAFT);

    public static final Block HYPERMENTIUM_BLOCK = registerBlock("hypermentium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6.0F).requiresTool().sounds(BlockSoundGroup.METAL)), ModItemGroup.PLUSCRAFT);

    public static final Block IMPERVITE_BLOCK = registerBlock("impervite_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6.0F).requiresTool().sounds(BlockSoundGroup.METAL)), ModItemGroup.PLUSCRAFT);

    public static final Block BLAZERITE_ORE = registerBlock("blazerite_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0F).requiresTool().sounds(BlockSoundGroup.NETHERRACK)), ModItemGroup.PLUSCRAFT);

    public static final Block ENDERRACK_ORE = registerBlock("enderrack_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0F).requiresTool().sounds(BlockSoundGroup.STONE)), ModItemGroup.PLUSCRAFT);

    public static final Block BLAZERITE_BLOCK = registerBlock("blazerite_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6.0F).requiresTool().sounds(BlockSoundGroup.METAL)), ModItemGroup.PLUSCRAFT);

    public static final Block ENDERRACK_BLOCK = registerBlock("enderrack_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6.0F).requiresTool().sounds(BlockSoundGroup.METAL)), ModItemGroup.PLUSCRAFT);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(PlusCraft.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(PlusCraft.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks() {
        PlusCraft.LOGGER.info("Registering ModBlocks for " + PlusCraft.MOD_ID);
    }
}
