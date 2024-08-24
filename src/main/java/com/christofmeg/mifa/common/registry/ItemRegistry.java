package com.christofmeg.mifa.common.registry;

import com.buuz135.industrial.item.RecipelessCustomItem;
import com.buuz135.industrial.module.IModule;
import com.buuz135.industrial.module.ModuleCore;
import com.buuz135.industrial.recipe.DissolutionChamberRecipe;
import com.christofmeg.mifa.CommonConstants;
import com.christofmeg.mifa.common.item.ModEfficiencyAddonItem;
import com.christofmeg.mifa.common.item.ModProcessingAddonItem;
import com.christofmeg.mifa.common.item.ModSpeedAddonItem;
import com.hrznstudio.titanium.module.Feature;
import com.hrznstudio.titanium.tab.TitaniumTab;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ItemRegistry implements IModule {

    public static TitaniumTab TAB_ADDONS = new TitaniumTab(CommonConstants.MOD_ID + "_" + "addons", () -> new ItemStack(ItemRegistry.SPEED_ADDON_3));

    public static ModEfficiencyAddonItem EFFICIENCY_ADDON_3 = new ModEfficiencyAddonItem(3, TAB_ADDONS) {
        @Override
        public void registerRecipe(Consumer<IFinishedRecipe> consumer) {
            new DissolutionChamberRecipe(ForgeRegistries.ITEMS.getKey(this), new Ingredient.IItemList[] {
                    new Ingredient.TagList(Tags.Items.DUSTS_REDSTONE),
                    new Ingredient.TagList(Tags.Items.DUSTS_REDSTONE),
                    new Ingredient.TagList(Tags.Items.GLASS_PANES_COLORLESS),
                    new Ingredient.TagList(Tags.Items.GLASS_PANES_COLORLESS),
                    new Ingredient.TagList(TagRegistry.Items.GEARS_NETHERITE),
                    new Ingredient.SingleItemList(ModuleCore.EFFICIENCY_ADDON_2.getDefaultInstance()),
                    new Ingredient.TagList(Tags.Items.RODS_BLAZE),
                    new Ingredient.TagList(Tags.Items.RODS_BLAZE)
            },
                    new FluidStack(ModuleCore.LATEX.getSourceFluid(), 1000), 200,
                    new ItemStack(this), FluidStack.EMPTY);
        }
    };
    public static ModEfficiencyAddonItem EFFICIENCY_ADDON_4 = new ModEfficiencyAddonItem(4, TAB_ADDONS) {
        @Override
        public void registerRecipe(Consumer<IFinishedRecipe> consumer) {
            new DissolutionChamberRecipe(ForgeRegistries.ITEMS.getKey(this), new Ingredient.IItemList[] {
                    new Ingredient.TagList(Tags.Items.DUSTS_REDSTONE),
                    new Ingredient.TagList(Tags.Items.DUSTS_REDSTONE),
                    new Ingredient.TagList(Tags.Items.GLASS_PANES_COLORLESS),
                    new Ingredient.TagList(Tags.Items.GLASS_PANES_COLORLESS),
                    new Ingredient.TagList(TagRegistry.Items.GEARS_NETHERITE),
                    new Ingredient.SingleItemList(new ItemStack(EFFICIENCY_ADDON_3)),
                    new Ingredient.TagList(Tags.Items.RODS_BLAZE),
                    new Ingredient.TagList(Tags.Items.RODS_BLAZE)
            },
                    new FluidStack(ModuleCore.ETHER.getSourceFluid(), 1000), 200,
                    new ItemStack(this), FluidStack.EMPTY);
        }
    };

    public static ModProcessingAddonItem PROCESSING_ADDON_3 = new ModProcessingAddonItem(3, TAB_ADDONS) {
        @Override
        public void registerRecipe(Consumer<IFinishedRecipe> consumer) {
            new DissolutionChamberRecipe(ForgeRegistries.ITEMS.getKey(this), new Ingredient.IItemList[] {
                    new Ingredient.TagList(Tags.Items.DUSTS_REDSTONE),
                    new Ingredient.TagList(Tags.Items.DUSTS_REDSTONE),
                    new Ingredient.TagList(Tags.Items.GLASS_PANES_COLORLESS),
                    new Ingredient.TagList(Tags.Items.GLASS_PANES_COLORLESS),
                    new Ingredient.TagList(TagRegistry.Items.GEARS_NETHERITE),
                    new Ingredient.SingleItemList(ModuleCore.PROCESSING_ADDON_2.getDefaultInstance()),
                    new Ingredient.SingleItemList(Items.FURNACE.getDefaultInstance()),
                    new Ingredient.SingleItemList(Items.CRAFTING_TABLE.getDefaultInstance())
            },
                    new FluidStack(ModuleCore.PINK_SLIME.getSourceFluid(), 1000), 200,
                    new ItemStack(this), FluidStack.EMPTY);
        }
    };
    public static ModProcessingAddonItem PROCESSING_ADDON_4 = new ModProcessingAddonItem(4, TAB_ADDONS) {
        @Override
        public void registerRecipe(Consumer<IFinishedRecipe> consumer) {
            new DissolutionChamberRecipe(ForgeRegistries.ITEMS.getKey(this), new Ingredient.IItemList[] {
                    new Ingredient.TagList(Tags.Items.DUSTS_REDSTONE),
                    new Ingredient.TagList(Tags.Items.DUSTS_REDSTONE),
                    new Ingredient.TagList(Tags.Items.GLASS_PANES_COLORLESS),
                    new Ingredient.TagList(Tags.Items.GLASS_PANES_COLORLESS),
                    new Ingredient.TagList(TagRegistry.Items.GEARS_NETHERITE),
                    new Ingredient.SingleItemList(new ItemStack(PROCESSING_ADDON_3)),
                    new Ingredient.SingleItemList(Items.FURNACE.getDefaultInstance()),
                    new Ingredient.SingleItemList(Items.CRAFTING_TABLE.getDefaultInstance())
            },
                    new FluidStack(ModuleCore.ETHER.getSourceFluid(), 1000), 200,
                    new ItemStack(this), FluidStack.EMPTY);
        }
    };

    public static ModSpeedAddonItem SPEED_ADDON_3 = new ModSpeedAddonItem(3, TAB_ADDONS) {
        @Override
        public void registerRecipe(Consumer<IFinishedRecipe> consumer) {
            new DissolutionChamberRecipe(ForgeRegistries.ITEMS.getKey(this), new Ingredient.IItemList[] {
                    new Ingredient.TagList(Tags.Items.DUSTS_REDSTONE),
                    new Ingredient.TagList(Tags.Items.DUSTS_REDSTONE),
                    new Ingredient.TagList(Tags.Items.GLASS_PANES_COLORLESS),
                    new Ingredient.TagList(Tags.Items.GLASS_PANES_COLORLESS),
                    new Ingredient.TagList(TagRegistry.Items.GEARS_NETHERITE),
                    new Ingredient.SingleItemList(ModuleCore.SPEED_ADDON_2.getDefaultInstance()),
                    new Ingredient.SingleItemList(new ItemStack(Items.SUGAR)),
                    new Ingredient.SingleItemList(new ItemStack(Items.SUGAR))
            },
                    new FluidStack(ModuleCore.PINK_SLIME.getSourceFluid(), 1000), 200,
                    new ItemStack(this), FluidStack.EMPTY);
        }
    };
    public static ModSpeedAddonItem SPEED_ADDON_4 = new ModSpeedAddonItem(4, TAB_ADDONS) {
        @Override
        public void registerRecipe(Consumer<IFinishedRecipe> consumer) {
            new DissolutionChamberRecipe(ForgeRegistries.ITEMS.getKey(this), new Ingredient.IItemList[] {
                    new Ingredient.TagList(Tags.Items.DUSTS_REDSTONE),
                    new Ingredient.TagList(Tags.Items.DUSTS_REDSTONE),
                    new Ingredient.TagList(Tags.Items.GLASS_PANES_COLORLESS),
                    new Ingredient.TagList(Tags.Items.GLASS_PANES_COLORLESS),
                    new Ingredient.TagList(TagRegistry.Items.GEARS_NETHERITE),
                    new Ingredient.SingleItemList(new ItemStack(SPEED_ADDON_3)),
                    new Ingredient.SingleItemList(new ItemStack(Items.SUGAR)),
                    new Ingredient.SingleItemList(new ItemStack(Items.SUGAR))
            },
                    new FluidStack(ModuleCore.ETHER.getSourceFluid(), 1000), 200,
                    new ItemStack(this), FluidStack.EMPTY);
        }
    };

    public static RecipelessCustomItem NETHERITE_GEAR = new RecipelessCustomItem("netherite_gear", TAB_ADDONS);

    @Override
    public List<Feature.Builder> generateFeatures() {
        List<Feature.Builder> features = new ArrayList<>();

        features.add(Feature.builder("efficiency_addon_3").content(Item.class, EFFICIENCY_ADDON_3));
        features.add(Feature.builder("efficiency_addon_4").content(Item.class, EFFICIENCY_ADDON_4));

        features.add(Feature.builder("processing_addon_3").content(Item.class, PROCESSING_ADDON_3));
        features.add(Feature.builder("processing_addon_4").content(Item.class, PROCESSING_ADDON_4));

        features.add(Feature.builder("speed_addon_3").content(Item.class, SPEED_ADDON_3));
        features.add(Feature.builder("speed_addon_4").content(Item.class, SPEED_ADDON_4));

        features.add(Feature.builder("netherite_gear").content(Item.class, NETHERITE_GEAR));

        return features;
    }

}