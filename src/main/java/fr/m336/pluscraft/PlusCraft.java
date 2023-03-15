package fr.m336.pluscraft;

import fr.m336.pluscraft.block.ModBlocks;
import fr.m336.pluscraft.item.ModItemGroup;
import fr.m336.pluscraft.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlusCraft implements ModInitializer {
	public static final String MOD_ID = "pluscraft";
	public static final Logger LOGGER = LoggerFactory.getLogger("pluscraft");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}