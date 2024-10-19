package com.christofmeg.mifa;

import com.christofmeg.mifa.common.provider.ModRecipeProvider;
import com.christofmeg.mifa.client.ModItemModelProvider;
import com.christofmeg.mifa.client.ModLanguageProvider;
import com.christofmeg.mifa.common.provider.ModBlockTagsProvider;
import com.christofmeg.mifa.common.provider.ModItemTagsProvider;
import com.christofmeg.mifa.common.registry.ItemRegistry;
import com.hrznstudio.titanium.module.ModuleController;
import net.minecraft.world.item.ItemStack;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@Mod(CommonConstants.MOD_ID)
public class MoreIndustrialForegoingAddons extends ModuleController {

    private static final String[] LOCALE_CODES = new String[] { "en_us", };

    public MoreIndustrialForegoingAddons(ModContainer container) {
        super(container);
    }

    @Override
    protected void initModules() {
        new ItemRegistry().generateFeatures(getRegistries());
        this.addCreativeTab("addons", () ->  new ItemStack(ItemRegistry.SPEED_ADDON_3.get()), CommonConstants.MOD_ID + "_addons", ItemRegistry.TAB_ADDONS);
    }

    @Override
    public void addDataProvider(GatherDataEvent event) {
        event.getGenerator().addProvider(event.includeClient(), new ModItemModelProvider(event.getGenerator().getPackOutput(), event.getExistingFileHelper()));
        event.getGenerator().addProvider(event.includeClient(), new ModLanguageProvider(event.getGenerator().getPackOutput()));

        ModBlockTagsProvider blockTags = event.getGenerator().addProvider(true, new ModBlockTagsProvider(event.getGenerator().getPackOutput(), event.getLookupProvider(), event.getExistingFileHelper()));
        event.getGenerator().addProvider(event.includeServer(), new ModItemTagsProvider(event.getGenerator().getPackOutput(), event.getLookupProvider(), blockTags, event.getExistingFileHelper()));
        event.getGenerator().addProvider(event.includeServer(), new ModRecipeProvider(event.getGenerator().getPackOutput(), event.getLookupProvider()));
    }

}