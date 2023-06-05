package fr.m336.pluscraft.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import fr.m336.pluscraft.block.ModBlocks;
import fr.m336.pluscraft.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.REINFORCED_NETHERITE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OVERLOADED_DIAMOND_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_HYPERMENTIUM_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_IMPERVITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TERBINTH_CRYSTAL);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.HYPERMENTIUM_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.IMPERVITE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLAZERITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ENDERRACK_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLAZERITE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ENDERRACK_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_HYPERMENTIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_IMPERVITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TERBINTH_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLAZERITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDERRACK, Models.GENERATED);
    }
}