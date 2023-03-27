package fr.m336.pluscraft.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import java.util.List;
import net.minecraft.item.Item;

public class HypermentiumItem extends Item {
    public HypermentiumItem(Item.Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.pluscraft.hypermentium.tooltip").formatted(Formatting.BLUE));
    }
}