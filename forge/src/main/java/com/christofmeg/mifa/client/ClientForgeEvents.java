package com.christofmeg.mifa.client;

import com.buuz135.industrial.item.addon.EfficiencyAddonItem;
import com.buuz135.industrial.item.addon.ProcessingAddonItem;
import com.buuz135.industrial.item.addon.SpeedAddonItem;
import com.buuz135.industrial.module.ModuleCore;
import com.christofmeg.mifa.common.item.ModSpeedAddonItem;
import com.christofmeg.mifa.CommonConstants;
import com.christofmeg.mifa.common.item.ModEfficiencyAddonItem;
import com.christofmeg.mifa.common.item.ModProcessingAddonItem;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(value = Dist.CLIENT, modid = CommonConstants.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ClientForgeEvents {

    @SubscribeEvent
    public static void onItemTooltip(ItemTooltipEvent event) {
        Item item = event.getItemStack().getItem();
        if (item instanceof EfficiencyAddonItem) {
            float tier = 0;
            if (item == ModuleCore.EFFICIENCY_ADDON_1.get()) {
                tier = 1;
            } else if (item == ModuleCore.EFFICIENCY_ADDON_2.get()) {
                tier = 2;
            } else if (item instanceof ModEfficiencyAddonItem addonItem) {
                tier = addonItem.tier;
            }
            float reduction = tier * -10;
            event.getToolTip().add(Component.translatable(Component.translatable("item.mifa.cooldown_amount").getString() + ": "  + reduction + "%").withStyle(ChatFormatting.GRAY));
        } else if (item instanceof ProcessingAddonItem) {
            float tier = 0;
            if (item == ModuleCore.PROCESSING_ADDON_1.get()) {
                tier = 1;
            } else if (item == ModuleCore.PROCESSING_ADDON_2.get()) {
                tier = 2;
            } else if (item instanceof ModProcessingAddonItem addonItem) {
                tier = addonItem.tier;
            }
            float upgrade = 1 + tier;
            event.getToolTip().add(Component.translatable(Component.translatable("item.industrialforegoing.processing").getString().replace(" ", "") + ": x" + upgrade).withStyle(ChatFormatting.GRAY));
        } else if (item instanceof SpeedAddonItem) {
            float tier = 0;
            if (item == ModuleCore.SPEED_ADDON_1.get()) {
                tier = 1;
            } else if (item == ModuleCore.SPEED_ADDON_2.get()) {
                tier = 2;
            } else if (item instanceof ModSpeedAddonItem addonItem) {
                tier = addonItem.tier;
            }
            float reduction = (1.0F - 1.0F / (1.0F + tier)) * -100.0F;
            event.getToolTip().add(Component.translatable(Component.translatable("item.mifa.cooldown_time").getString() + ": "  + String.valueOf(reduction).substring(0, 3) + "%").withStyle(ChatFormatting.GRAY));
        }
    }

}
