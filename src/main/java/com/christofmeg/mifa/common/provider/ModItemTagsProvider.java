package com.christofmeg.mifa.common.provider;

import com.buuz135.industrial.utils.IndustrialTags;
import com.christofmeg.mifa.CommonConstants;
import com.christofmeg.mifa.common.registry.ItemRegistry;
import com.christofmeg.mifa.common.registry.TagRegistry;
import com.hrznstudio.titanium.annotation.MaterialReference;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.item.Item;
import net.minecraft.tags.ITag;
import net.minecraftforge.common.data.ExistingFileHelper;

@MethodsReturnNonnullByDefault
public class ModItemTagsProvider extends ItemTagsProvider {

    @MaterialReference(type = "gear", material = "iron")
    public static Item IRON_GEAR;
    @MaterialReference(type = "gear", material = "gold")
    public static Item GOLD_GEAR;
    @MaterialReference(type = "gear", material = "diamond")
    public static Item DIAMOND_GEAR;

    public ModItemTagsProvider(DataGenerator generator, BlockTagsProvider blockTagsProvider, ExistingFileHelper existingFileHelper) {
        super(generator, blockTagsProvider, CommonConstants.MOD_ID, existingFileHelper);
    }

    @Override
    public String getName() {
        return CommonConstants.MOD_NAME + " - Item Tags";
    }

    @Override
    protected void addTags() {
        tag(TagRegistry.Items.GEARS_NETHERITE).add(ItemRegistry.NETHERITE_GEAR);
        tag((ITag.INamedTag<Item>) IndustrialTags.Items.GEAR_DIAMOND).add(DIAMOND_GEAR);
        tag((ITag.INamedTag<Item>) IndustrialTags.Items.GEAR_GOLD).add(GOLD_GEAR);
        tag((ITag.INamedTag<Item>) IndustrialTags.Items.GEAR_IRON).add(IRON_GEAR);

        tag(TagRegistry.Items.GEARS)
                .addTag((ITag.INamedTag<Item>) IndustrialTags.Items.GEAR_IRON)
                .addTag((ITag.INamedTag<Item>) IndustrialTags.Items.GEAR_GOLD)
                .addTag((ITag.INamedTag<Item>) IndustrialTags.Items.GEAR_DIAMOND)
                .addTag(TagRegistry.Items.GEARS_NETHERITE);
    }

}
