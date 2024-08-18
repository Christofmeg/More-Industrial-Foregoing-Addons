package com.christofmeg.mifa.client;

import com.buuz135.industrial.utils.Reference;
import com.christofmeg.mifa.CommonConstants;
import com.christofmeg.mifa.common.registry.ItemRegistry;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {

    public ModLanguageProvider(PackOutput output, String locale) {
        super(output, CommonConstants.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        String locale = this.getName().replace("Languages: ", "");
        if (locale.equals("en_us")) {

            add("itemGroup." + CommonConstants.MOD_ID + "_" + "addons", "More Industrial Foregoing Addons");
            add("itemGroup." + Reference.MOD_ID + "_" + "addons", "More Industrial Foregoing Addons");

            add("item.mifa.cooldown_amount", "Cooldown Amount");
            add("item.mifa.cooldown_time", "Cooldown Time");

            addItem(ItemRegistry.NETHERITE_GEAR, "Netherite Gear");
        }
    }

}