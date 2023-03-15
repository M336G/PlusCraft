package fr.m336.pluscraft.item;

import fr.m336.pluscraft.PlusCraft;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup PLUSCRAFT;

    public static void registerItemGroups() {
        PLUSCRAFT = FabricItemGroup.builder(new Identifier(PlusCraft.MOD_ID, "pluscraft"))
                .displayName(Text.translatable("itemgroup.pluscraft"))
                .icon(() -> new ItemStack(ModItems.REINFORCED_NETHERITE)).build();
    }
}
