package com.christofmeg.mifa.client;

import com.buuz135.industrial.utils.Reference;
import com.christofmeg.mifa.CommonConstants;
import com.christofmeg.mifa.common.registry.ItemRegistry;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {

    public ModLanguageProvider(PackOutput output) {
        super(output, CommonConstants.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + CommonConstants.MOD_ID + "_" + "addons", "More Industrial Foregoing Addons");
        add("itemGroup." + Reference.MOD_ID + "_" + "addons", "More Industrial Foregoing Addons");

        add("item.mifa.cooldown_amount", "Cooldown Amount");
        add("item.mifa.cooldown_time", "Cooldown Time");

        addItem(ItemRegistry.NETHERITE_GEAR, "Netherite Gear");
    }

}