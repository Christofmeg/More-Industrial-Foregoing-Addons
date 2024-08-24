package com.christofmeg.mifa.client;

import com.buuz135.industrial.item.addon.EfficiencyAddonItem;
import com.buuz135.industrial.item.addon.ProcessingAddonItem;
import com.buuz135.industrial.item.addon.SpeedAddonItem;
import com.buuz135.industrial.module.ModuleCore;
import com.christofmeg.mifa.CommonConstants;
import com.christofmeg.mifa.common.item.ModEfficiencyAddonItem;
import com.christofmeg.mifa.common.item.ModProcessingAddonItem;
import com.christofmeg.mifa.common.item.ModSpeedAddonItem;
import net.minecraft.item.Item;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
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
            if (item == ModuleCore.EFFICIENCY_ADDON_1) {
                tier = 1;
            } else if (item == ModuleCore.EFFICIENCY_ADDON_2) {
                tier = 2;
            } else if (item instanceof ModEfficiencyAddonItem) {
                tier = ((ModEfficiencyAddonItem) item).tier;
            }
            float reduction = tier * -10;
            event.getToolTip().add(new TranslationTextComponent(new TranslationTextComponent("item.mifa.cooldown_amount").getString() + ": "  + reduction + "%").withStyle(TextFormatting.GRAY));
        } else if (item instanceof ProcessingAddonItem) {
            float tier = 0;
            if (item == ModuleCore.PROCESSING_ADDON_1) {
                tier = 1;
            } else if (item == ModuleCore.PROCESSING_ADDON_2) {
                tier = 2;
            } else if (item instanceof ModProcessingAddonItem) {
                tier = ((ModProcessingAddonItem) item).tier;
            }
            float upgrade = 1 + tier;
            event.getToolTip().add(new TranslationTextComponent(new TranslationTextComponent("item.industrialforegoing.processing").getString().replace(" ", "") + ": x" + upgrade).withStyle(TextFormatting.GRAY));
        } else if (item instanceof SpeedAddonItem) {
            float tier = 0;
            if (item == ModuleCore.SPEED_ADDON_1) {
                tier = 1;
            } else if (item == ModuleCore.SPEED_ADDON_2) {
                tier = 2;
            } else if (item instanceof ModSpeedAddonItem) {
                tier = ((ModSpeedAddonItem) item).tier;
            }
            float reduction = (1.0F - 1.0F / (1.0F + tier)) * -100.0F;
            event.getToolTip().add(new TranslationTextComponent(new TranslationTextComponent("item.mifa.cooldown_time").getString() + ": "  + String.valueOf(reduction).substring(0, 3) + "%").withStyle(TextFormatting.GRAY));
        }
    }

}
