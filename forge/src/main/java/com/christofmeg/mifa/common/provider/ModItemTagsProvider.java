package com.christofmeg.mifa.common.provider;

import com.buuz135.industrial.module.ModuleCore;
import com.buuz135.industrial.utils.IndustrialTags;
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
        tag(IndustrialTags.Items.GEAR_DIAMOND).add(ModuleCore.DIAMOND_GEAR.get());
        tag(IndustrialTags.Items.GEAR_GOLD).add(ModuleCore.GOLD_GEAR.get());
        tag(IndustrialTags.Items.GEAR_IRON).add(ModuleCore.IRON_GEAR.get());
        tag(TagRegistry.Items.GEARS)
                .addTag(IndustrialTags.Items.GEAR_IRON)
                .addTag(IndustrialTags.Items.GEAR_GOLD)
                .addTag(IndustrialTags.Items.GEAR_DIAMOND)
                .addTag(TagRegistry.Items.GEARS_NETHERITE);
    }

}
