package com.christofmeg.mifa;

import com.christofmeg.mifa.client.ModItemModelProvider;
import com.christofmeg.mifa.client.ModLanguageProvider;
import com.christofmeg.mifa.common.provider.ModItemTagsProvider;
import com.christofmeg.mifa.common.provider.ModRecipeProvider;
import com.christofmeg.mifa.common.provider.ModSerializableProvider;
import com.christofmeg.mifa.common.registry.ItemRegistry;
import com.hrznstudio.titanium.module.Module;
import com.hrznstudio.titanium.module.ModuleController;
import net.minecraft.data.BlockTagsProvider;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod(CommonConstants.MOD_ID)
public class MoreIndustrialForegoingAddons extends ModuleController {

    private static final String[] LOCALE_CODES = new String[] { "en_us", };

    @Override
    protected void initModules() {
        Module.Builder core = Module.builder("addons").description("Module for More Industrial Foreging Addons");
        new ItemRegistry().generateFeatures().forEach(core::feature);
        addModule(core);
    }

    @Override
    public void addDataProvider(GatherDataEvent event) {
        event.getGenerator().addProvider(new ModItemModelProvider(event.getGenerator(), event.getExistingFileHelper()));
        for (String locale : LOCALE_CODES) {
            event.getGenerator().addProvider(new ModLanguageProvider(event.getGenerator(), locale));
        }

        BlockTagsProvider blockTags = new BlockTagsProvider(event.getGenerator(), CommonConstants.MOD_ID, event.getExistingFileHelper());
        event.getGenerator().addProvider(new ModItemTagsProvider(event.getGenerator(), blockTags, event.getExistingFileHelper()));
        event.getGenerator().addProvider(new ModRecipeProvider(event.getGenerator()));
        event.getGenerator().addProvider(new ModSerializableProvider(event.getGenerator(), CommonConstants.MOD_ID));
    }

}