package fr.m336.pluscraft.util;

import fr.m336.pluscraft.PlusCraft;
import fr.m336.pluscraft.item.ModItems;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ModModelPredicateProvider {
    public static void registerModModels() {
        registerBow(ModItems.OBSIDIAN_BOW);
        registerBow(ModItems.BLAZERITE_BOW);
        registerBow(ModItems.ENDERRACK_BOW);
        registerBow(ModItems.REINFORCED_NETHERITE_BOW);
        registerBow(ModItems.OVERLOADED_BOW);
        registerBow(ModItems.HYPERMENTIUM_BOW);
        registerBow(ModItems.IMPERVITE_BOW);
        registerBow(ModItems.TERBINTH_BOW);

        registerCrossbow(ModItems.OBSIDIAN_CROSSBOW);
        registerCrossbow(ModItems.BLAZERITE_CROSSBOW);
        registerCrossbow(ModItems.ENDERRACK_CROSSBOW);
        registerCrossbow(ModItems.REINFORCED_NETHERITE_CROSSBOW);
        registerCrossbow(ModItems.OVERLOADED_CROSSBOW);
        registerCrossbow(ModItems.HYPERMENTIUM_CROSSBOW);
        registerCrossbow(ModItems.IMPERVITE_CROSSBOW);
        registerCrossbow(ModItems.TERBINTH_CROSSBOW);
    }

    private static void registerBow(Item bow) {
        PlusCraft.LOGGER.info("Registering modded bows textures for " + PlusCraft.MOD_ID);
        ModelPredicateProviderRegistry.register(bow, new Identifier("pull"),
                (stack, world, entity, seed) -> {
                    if (entity == null) {
                        return 0.0f;
                    }
                    if (entity.getActiveItem() != stack) {
                        return 0.0f;
                    }
                    return (float)(stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0f;
                });

        ModelPredicateProviderRegistry.register(bow, new Identifier("pulling"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem()

                        && entity.getActiveItem() == stack ? 1.0f : 0.0f);
    }
    private static void registerCrossbow(Item crossbow) {
        PlusCraft.LOGGER.info("Registering modded crossbows textures for " + PlusCraft.MOD_ID);
        ModelPredicateProviderRegistry.register(crossbow, new Identifier("pull"), (stack, world, entity, seed) -> {
            if (entity == null) {
                return 0.0f;
            }
            if (CrossbowItem.isCharged(stack)) {
                return 0.0f;
            }
            return (float)(stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / (float)CrossbowItem.getPullTime(stack);
        });
        ModelPredicateProviderRegistry.register(crossbow, new Identifier("pulling"), (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack && !CrossbowItem.isCharged(stack) ? 1.0f : 0.0f);
        ModelPredicateProviderRegistry.register(crossbow, new Identifier("charged"), (stack, world, entity, seed) -> entity != null && CrossbowItem.isCharged(stack) ? 1.0f : 0.0f);
        ModelPredicateProviderRegistry.register(crossbow, new Identifier("firework"), (stack, world, entity, seed) -> entity != null && CrossbowItem.isCharged(stack) && CrossbowItem.hasProjectile(stack, Items.FIREWORK_ROCKET) ? 1.0f : 0.0f);
    }
}