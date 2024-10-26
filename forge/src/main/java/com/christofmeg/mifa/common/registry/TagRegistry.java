package com.christofmeg.mifa.common.registry;

import com.hrznstudio.titanium.util.TagUtil;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class TagRegistry {

    public static class Items {
        public static final TagKey<Item> GEARS_NETHERITE = TagUtil.getItemTag(new ResourceLocation("forge:gears/netherite"));
        public static final TagKey<Item> GEARS = TagUtil.getItemTag(new ResourceLocation("forge:gears"));
    }

}
