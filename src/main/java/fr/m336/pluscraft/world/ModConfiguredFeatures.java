package fr.m336.pluscraft.world;

import fr.m336.pluscraft.PlusCraft;
import fr.m336.pluscraft.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_HYPERMENTIUM_ORE_KEY = registerKey("deepslate_hypermentium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_IMPERVITE_ORE_KEY = registerKey("deepslate_impervite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TERBINTH_CRYSTAL_KEY = registerKey("terbinth_crystal");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLAZERITE_ORE_KEY = registerKey("blazerite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ENDERRACK_ORE_KEY = registerKey("enderrack_ore");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        // RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplaceables = new BlockMatchRuleTest(Blocks.NETHERRACK);
        RuleTest enderReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> overworldDeepslateHypermentiumOres =
                List.of(OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_HYPERMENTIUM_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldDeepslateImperviteOres =
                List.of(OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_IMPERVITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldTerbinthCrystals =
                List.of(OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.TERBINTH_CRYSTAL.getDefaultState()));

        List<OreFeatureConfig.Target> netherBlazeriteOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.BLAZERITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> enderEnderrackOres =
                List.of(OreFeatureConfig.createTarget(enderReplaceables, ModBlocks.ENDERRACK_ORE.getDefaultState()));

        register(context, DEEPSLATE_HYPERMENTIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldDeepslateHypermentiumOres, 8));
        register(context, DEEPSLATE_IMPERVITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldDeepslateImperviteOres, 6));
        register(context, TERBINTH_CRYSTAL_KEY, Feature.ORE, new OreFeatureConfig(overworldTerbinthCrystals, 4));
        register(context, BLAZERITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherBlazeriteOres, 8));
        register(context, ENDERRACK_ORE_KEY, Feature.ORE, new OreFeatureConfig(enderEnderrackOres, 8));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(PlusCraft.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}