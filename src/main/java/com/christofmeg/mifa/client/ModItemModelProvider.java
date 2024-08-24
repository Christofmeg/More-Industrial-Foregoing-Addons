package com.christofmeg.mifa.client;

import com.christofmeg.mifa.CommonConstants;
import com.christofmeg.mifa.common.registry.ItemRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nonnull;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, CommonConstants.MOD_ID, existingFileHelper);
    }

    @Nonnull
    @Override
    public String getName() {
        return CommonConstants.MOD_ID + " - ItemModel";
    }

    @Override
    protected void registerModels() {

        simpleItem(ItemRegistry.EFFICIENCY_ADDON_3.getRegistryName());
        simpleItem(ItemRegistry.EFFICIENCY_ADDON_4.getRegistryName());

        simpleItem(ItemRegistry.PROCESSING_ADDON_3.getRegistryName());
        simpleItem(ItemRegistry.PROCESSING_ADDON_4.getRegistryName());

        simpleItem(ItemRegistry.SPEED_ADDON_3.getRegistryName());
        simpleItem(ItemRegistry.SPEED_ADDON_4.getRegistryName());

        simpleItem(ItemRegistry.NETHERITE_GEAR.getRegistryName());

    }

    public void simpleItem(ResourceLocation location) {
        this.getBuilder(location.getPath())
                .parent(new ModelFile.UncheckedModelFile("item/generated"))
                .texture("layer0", new ResourceLocation(location.getNamespace(), ITEM_FOLDER + "/" + location.getPath()));
    }

}