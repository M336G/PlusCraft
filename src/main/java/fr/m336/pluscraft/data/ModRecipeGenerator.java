package fr.m336.pluscraft.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import fr.m336.pluscraft.block.ModBlocks;
import fr.m336.pluscraft.item.ModItems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(ModItems.RAW_HYPERMENTIUM), RecipeCategory.MISC, ModItems.HYPERMENTIUM,
                0.7f, 200, "hypermentium");

        offerSmelting(exporter, List.of(ModItems.RAW_IMPERVITE), RecipeCategory.MISC, ModItems.IMPERVITE,
                0.7f, 200, "impervite");

        offerBlasting(exporter, List.of(ModItems.RAW_HYPERMENTIUM), RecipeCategory.MISC, ModItems.HYPERMENTIUM,
                0.7f, 100, "hypermentium");

        offerBlasting(exporter, List.of(ModItems.RAW_IMPERVITE), RecipeCategory.MISC, ModItems.IMPERVITE,
                0.7f, 100, "impervite");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.REINFORCED_NETHERITE, RecipeCategory.DECORATIONS,
                ModBlocks.REINFORCED_NETHERITE_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.OVERLOADED_DIAMOND, RecipeCategory.DECORATIONS,
                ModBlocks.OVERLOADED_DIAMOND_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.HYPERMENTIUM, RecipeCategory.DECORATIONS,
                ModBlocks.HYPERMENTIUM_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.IMPERVITE, RecipeCategory.DECORATIONS,
                ModBlocks.IMPERVITE_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BLAZERITE, RecipeCategory.DECORATIONS,
                ModBlocks.BLAZERITE_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ENDERRACK, RecipeCategory.DECORATIONS,
                ModBlocks.ENDERRACK_BLOCK);
    }

}