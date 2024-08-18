package com.christofmeg.mifa.common.provider;

import com.christofmeg.mifa.common.registry.ItemRegistry;
import com.christofmeg.mifa.CommonConstants;
import com.christofmeg.mifa.common.registry.TagRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {

    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, TagsProvider<Block> lookup, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, lookup.contentsGetter(), CommonConstants.MOD_ID, existingFileHelper);
    }

    @Override
    public @NotNull String getName() {
        return CommonConstants.MOD_NAME + " - Item Tags";
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider pProvider) {
        tag(TagRegistry.Items.GEARS_NETHERITE).add(ItemRegistry.NETHERITE_GEAR.get());
    }

}
