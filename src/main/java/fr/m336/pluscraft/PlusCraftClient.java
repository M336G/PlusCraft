package fr.m336.pluscraft;

import fr.m336.pluscraft.util.ModModelPredicateProvider;
import net.fabricmc.api.ClientModInitializer;

public class PlusCraftClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModModelPredicateProvider.registerModModels();
    }
}
