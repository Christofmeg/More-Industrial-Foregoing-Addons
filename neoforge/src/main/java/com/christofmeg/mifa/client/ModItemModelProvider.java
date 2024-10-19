package com.christofmeg.mifa.client;

import com.christofmeg.mifa.common.registry.ItemRegistry;
import com.christofmeg.mifa.CommonConstants;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput generator, ExistingFileHelper existingFileHelper) {
        super(generator, CommonConstants.MOD_ID, existingFileHelper);
    }

    @Override
    public @NotNull String getName() {
        return CommonConstants.MOD_ID + " - ItemModel";
    }

    @Override
    protected void registerModels() {
        basicItem(ItemRegistry.EFFICIENCY_ADDON_3.get());
        basicItem(ItemRegistry.EFFICIENCY_ADDON_4.get());

        basicItem(ItemRegistry.PROCESSING_ADDON_3.get());
        basicItem(ItemRegistry.PROCESSING_ADDON_4.get());

        basicItem(ItemRegistry.SPEED_ADDON_3.get());
        basicItem(ItemRegistry.SPEED_ADDON_4.get());

        basicItem(ItemRegistry.NETHERITE_GEAR.get());
    }

}