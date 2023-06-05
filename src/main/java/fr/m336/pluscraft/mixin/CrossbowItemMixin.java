package fr.m336.pluscraft.mixin;

import fr.m336.pluscraft.item.ModItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.*;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(CrossbowItem.class)
public class CrossbowItemMixin {
	@Inject(method = "createArrow", at = @At("RETURN"), locals = LocalCapture.CAPTURE_FAILSOFT, cancellable = true)
	private static void createArrowMixin(World world, LivingEntity entity, ItemStack crossbow, ItemStack arrow, CallbackInfoReturnable<PersistentProjectileEntity> info, ArrowItem arrowItem, PersistentProjectileEntity persistentProjectileEntity) {
		if (crossbow.getItem() == ModItems.OBSIDIAN_CROSSBOW) {
			persistentProjectileEntity.setDamage(persistentProjectileEntity.getDamage() * 5.0F);
			info.setReturnValue(persistentProjectileEntity);
		}
		if (crossbow.getItem() == ModItems.BLAZERITE_CROSSBOW) {
			persistentProjectileEntity.setDamage(persistentProjectileEntity.getDamage() * 6.0F);
			info.setReturnValue(persistentProjectileEntity);
		}
		if (crossbow.getItem() == ModItems.ENDERRACK_CROSSBOW) {
			persistentProjectileEntity.setDamage(persistentProjectileEntity.getDamage() * 6.5F);
			info.setReturnValue(persistentProjectileEntity);
		}
		if (crossbow.getItem() == ModItems.REINFORCED_NETHERITE_CROSSBOW) {
			persistentProjectileEntity.setDamage(persistentProjectileEntity.getDamage() * 7.5F);
			info.setReturnValue(persistentProjectileEntity);
		}
		if (crossbow.getItem() == ModItems.OVERLOADED_CROSSBOW) {
			persistentProjectileEntity.setDamage(persistentProjectileEntity.getDamage() * 10.0F);
			info.setReturnValue(persistentProjectileEntity);
		}
		if (crossbow.getItem() == ModItems.HYPERMENTIUM_CROSSBOW) {
			persistentProjectileEntity.setDamage(persistentProjectileEntity.getDamage() * 12.5F);
			info.setReturnValue(persistentProjectileEntity);
		}
		if (crossbow.getItem() == ModItems.IMPERVITE_CROSSBOW) {
			persistentProjectileEntity.setDamage(persistentProjectileEntity.getDamage() * 15.0F);
			info.setReturnValue(persistentProjectileEntity);
		}
		if (crossbow.getItem() == ModItems.TERBINTH_CROSSBOW) {
			persistentProjectileEntity.setDamage(persistentProjectileEntity.getDamage() * 20.0F);
			info.setReturnValue(persistentProjectileEntity);
		}
	}
}