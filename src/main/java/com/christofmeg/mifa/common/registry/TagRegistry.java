package com.christofmeg.mifa.common.registry;

import net.minecraft.item.Item;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

public class TagRegistry {

    public static class Items {
        public static final Tags.IOptionalNamedTag<Item> GEARS_NETHERITE = ItemTags.createOptional(new ResourceLocation("forge:gears/netherite"));
        public static final Tags.IOptionalNamedTag<Item> GEARS = ItemTags.createOptional(new ResourceLocation("forge:gears"));
    }

}
