package fr.m336.pluscraft.world;

import fr.m336.pluscraft.PlusCraft;
import fr.m336.pluscraft.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_HYPERMENTIUM_ORE_KEY = registerKey("deepslate_hypermentium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_IMPERVITE_ORE_KEY = registerKey("deepslate_impervite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TERBINTH_CRYSTAL_KEY = registerKey("terbinth_crystal");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        // RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldDeepslateHypermentiumOres =
                List.of(OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_HYPERMENTIUM_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldDeepslateImperviteOres =
                List.of(OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_IMPERVITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldTerbinthCrystals =
                List.of(OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.TERBINTH_CRYSTAL.getDefaultState()));

        register(context, DEEPSLATE_HYPERMENTIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldDeepslateHypermentiumOres, 12));
        register(context, DEEPSLATE_IMPERVITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldDeepslateImperviteOres, 12));
        register(context, TERBINTH_CRYSTAL_KEY, Feature.ORE, new OreFeatureConfig(overworldTerbinthCrystals, 12));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(PlusCraft.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}