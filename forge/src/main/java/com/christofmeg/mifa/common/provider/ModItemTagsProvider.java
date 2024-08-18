package com.christofmeg.mifa.common.provider;

import com.christofmeg.mifa.CommonConstants;
import com.christofmeg.mifa.common.registry.ItemRegistry;
import com.christofmeg.mifa.common.registry.TagRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


public class ModItemTagsProvider extends ItemTagsProvider {

    public ModItemTagsProvider(DataGenerator generator, BlockTagsProvider blockTagsProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(generator, blockTagsProvider, CommonConstants.MOD_ID, existingFileHelper);
    }

    @Override
    public @NotNull String getName() {
        return CommonConstants.MOD_NAME + " - Item Tags";
    }

    @Override
    protected void addTags() {
        tag(TagRegistry.Items.GEARS_NETHERITE).add(ItemRegistry.NETHERITE_GEAR.get());
    }

}
