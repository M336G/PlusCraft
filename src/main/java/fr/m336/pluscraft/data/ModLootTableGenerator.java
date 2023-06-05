package fr.m336.pluscraft.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import fr.m336.pluscraft.block.ModBlocks;
import fr.m336.pluscraft.item.ModItems;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.REINFORCED_NETHERITE_BLOCK);
        addDrop(ModBlocks.OVERLOADED_DIAMOND_BLOCK);
        addDrop(ModBlocks.HYPERMENTIUM_BLOCK);
        addDrop(ModBlocks.IMPERVITE_BLOCK);
        addDrop(ModBlocks.BLAZERITE_BLOCK);
        addDrop(ModBlocks.ENDERRACK_BLOCK);

        addDrop(ModBlocks.DEEPSLATE_HYPERMENTIUM_ORE, oreDrops(ModBlocks.DEEPSLATE_HYPERMENTIUM_ORE, ModItems.RAW_HYPERMENTIUM));
        addDrop(ModBlocks.DEEPSLATE_IMPERVITE_ORE, oreDrops(ModBlocks.DEEPSLATE_IMPERVITE_ORE, ModItems.RAW_IMPERVITE));
        addDrop(ModBlocks.TERBINTH_CRYSTAL, oreDrops(ModBlocks.TERBINTH_CRYSTAL, ModItems.TERBINTH_SHARD));
        addDrop(ModBlocks.BLAZERITE_ORE, oreDrops(ModBlocks.BLAZERITE_ORE, ModItems.BLAZERITE));
        addDrop(ModBlocks.ENDERRACK_ORE, oreDrops(ModBlocks.ENDERRACK_ORE, ModItems.ENDERRACK));
    }
}