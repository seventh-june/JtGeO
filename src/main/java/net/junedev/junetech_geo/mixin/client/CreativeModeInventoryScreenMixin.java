package net.junedev.junetech_geo.mixin.client;

import net.junedev.junetech_geo.block.BlockWithTooltip;
import net.junedev.junetech_geo.item.ItemWithTooltip;
import net.minecraft.client.gui.screens.inventory.CreativeModeInventoryScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

/**
 * Adds the tooltip above the list of tabs containing the item/block if specified
 * @see BlockWithTooltip
 * @see ItemWithTooltip
 */
@Mixin(CreativeModeInventoryScreen.class)
public class CreativeModeInventoryScreenMixin {
    @Inject(method = "getTooltipFromContainerItem(Lnet/minecraft/world/item/ItemStack;)Ljava/util/List;", at = @At(value = "RETURN", ordinal = 1))
    public void addTooltip(ItemStack pStack, CallbackInfoReturnable<List<Component>> cir) {
        if (pStack.getItem() instanceof BlockItem blockItem && blockItem.getBlock() instanceof BlockWithTooltip blockWithTooltip && blockWithTooltip.displaysBelowName()) {
            Component component = blockWithTooltip.getTooltip();
            cir.getReturnValue().removeIf(c -> c.equals(component));
            cir.getReturnValue().add(1, component);
        } else if (pStack.getItem() instanceof ItemWithTooltip itemWithTooltip && itemWithTooltip.displaysBelowName()) {
            Component component = itemWithTooltip.getTooltip();
            cir.getReturnValue().removeIf(c -> c.equals(component));
            cir.getReturnValue().add(1, component);
        }
    }
}
