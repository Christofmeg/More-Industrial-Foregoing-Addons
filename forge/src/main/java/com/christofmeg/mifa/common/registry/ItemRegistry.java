package com.christofmeg.mifa.common.registry;

import com.buuz135.industrial.item.RecipelessCustomItem;
import com.buuz135.industrial.module.IModule;
import com.buuz135.industrial.module.ModuleCore;
import com.buuz135.industrial.recipe.DissolutionChamberRecipe;
import com.christofmeg.mifa.CommonConstants;
import com.christofmeg.mifa.common.item.ModEfficiencyAddonItem;
import com.christofmeg.mifa.common.item.ModProcessingAddonItem;
import com.christofmeg.mifa.common.item.ModSpeedAddonItem;
import com.hrznstudio.titanium.module.DeferredRegistryHelper;
import com.hrznstudio.titanium.tab.TitaniumTab;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Consumer;

public class ItemRegistry implements IModule {

    public static TitaniumTab TAB_ADDONS = new TitaniumTab(CommonConstants.MOD_ID + "_" + "addons", () -> new ItemStack(ItemRegistry.SPEED_ADDON_3.get()));

    public static RegistryObject<Item> EFFICIENCY_ADDON_3;
    public static RegistryObject<Item> EFFICIENCY_ADDON_4;

    public static RegistryObject<Item> PROCESSING_ADDON_3;
    public static RegistryObject<Item> PROCESSING_ADDON_4;

    public static RegistryObject<Item> SPEED_ADDON_3;
    public static RegistryObject<Item> SPEED_ADDON_4;

    public static RegistryObject<Item> NETHERITE_GEAR;

    @Override
    public void generateFeatures(DeferredRegistryHelper helper) {

        EFFICIENCY_ADDON_3 = helper.registerGeneric(Item.class, "efficiency_addon_3", () -> new ModEfficiencyAddonItem(3, TAB_ADDONS) {
            @Override
            public void registerRecipe(Consumer<FinishedRecipe> consumer) {
                new DissolutionChamberRecipe(ForgeRegistries.ITEMS.getKey(this), new Ingredient.Value[] {
                        new Ingredient.TagValue(Tags.Items.DUSTS_REDSTONE),
                        new Ingredient.TagValue(Tags.Items.DUSTS_REDSTONE),
                        new Ingredient.TagValue(Tags.Items.GLASS_PANES_COLORLESS),
                        new Ingredient.TagValue(Tags.Items.GLASS_PANES_COLORLESS),
                        new Ingredient.TagValue(TagRegistry.Items.GEARS_NETHERITE),
                        new Ingredient.ItemValue(ModuleCore.EFFICIENCY_ADDON_2.get().getDefaultInstance()),
                        new Ingredient.TagValue(Tags.Items.RODS_BLAZE),
                        new Ingredient.TagValue(Tags.Items.RODS_BLAZE)
                },
                        new FluidStack(ModuleCore.LATEX.getSourceFluid().get(), 1000), 200,
                        new ItemStack(this), FluidStack.EMPTY);
            }
        });
        EFFICIENCY_ADDON_4 = helper.registerGeneric(Item.class, "efficiency_addon_4", () -> new ModEfficiencyAddonItem(4, TAB_ADDONS) {
            @Override
            public void registerRecipe(Consumer<FinishedRecipe> consumer) {
                new DissolutionChamberRecipe(ForgeRegistries.ITEMS.getKey(this), new Ingredient.Value[] {
                        new Ingredient.TagValue(Tags.Items.DUSTS_REDSTONE),
                        new Ingredient.TagValue(Tags.Items.DUSTS_REDSTONE),
                        new Ingredient.TagValue(Tags.Items.GLASS_PANES_COLORLESS),
                        new Ingredient.TagValue(Tags.Items.GLASS_PANES_COLORLESS),
                        new Ingredient.TagValue(TagRegistry.Items.GEARS_NETHERITE),
                        new Ingredient.ItemValue(new ItemStack(EFFICIENCY_ADDON_3.get())),
                        new Ingredient.TagValue(Tags.Items.RODS_BLAZE),
                        new Ingredient.TagValue(Tags.Items.RODS_BLAZE)
                },
                        new FluidStack(ModuleCore.ETHER.getSourceFluid().get(), 1000), 200,
                        new ItemStack(this), FluidStack.EMPTY);
            }
        });

        PROCESSING_ADDON_3 = helper.registerGeneric(Item.class, "processing_addon_3", () -> new ModProcessingAddonItem(3, TAB_ADDONS) {
            @Override
            public void registerRecipe(Consumer<FinishedRecipe> consumer) {
                new DissolutionChamberRecipe(ForgeRegistries.ITEMS.getKey(this), new Ingredient.Value[] {
                        new Ingredient.TagValue(Tags.Items.DUSTS_REDSTONE),
                        new Ingredient.TagValue(Tags.Items.DUSTS_REDSTONE),
                        new Ingredient.TagValue(Tags.Items.GLASS_PANES_COLORLESS),
                        new Ingredient.TagValue(Tags.Items.GLASS_PANES_COLORLESS),
                        new Ingredient.TagValue(TagRegistry.Items.GEARS_NETHERITE),
                        new Ingredient.ItemValue(ModuleCore.PROCESSING_ADDON_2.get().getDefaultInstance()),
                        new Ingredient.ItemValue(Items.FURNACE.getDefaultInstance()),
                        new Ingredient.ItemValue(Items.CRAFTING_TABLE.getDefaultInstance())
                },
                        new FluidStack(ModuleCore.PINK_SLIME.getSourceFluid().get(), 1000), 200,
                        new ItemStack(this), FluidStack.EMPTY);
            }
        });
        PROCESSING_ADDON_4 = helper.registerGeneric(Item.class, "processing_addon_4", () -> new ModProcessingAddonItem(4, TAB_ADDONS) {
            @Override
            public void registerRecipe(Consumer<FinishedRecipe> consumer) {
                new DissolutionChamberRecipe(ForgeRegistries.ITEMS.getKey(this), new Ingredient.Value[] {
                        new Ingredient.TagValue(Tags.Items.DUSTS_REDSTONE),
                        new Ingredient.TagValue(Tags.Items.DUSTS_REDSTONE),
                        new Ingredient.TagValue(Tags.Items.GLASS_PANES_COLORLESS),
                        new Ingredient.TagValue(Tags.Items.GLASS_PANES_COLORLESS),
                        new Ingredient.TagValue(TagRegistry.Items.GEARS_NETHERITE),
                        new Ingredient.ItemValue(new ItemStack(PROCESSING_ADDON_3.get())),
                        new Ingredient.ItemValue(Items.FURNACE.getDefaultInstance()),
                        new Ingredient.ItemValue(Items.CRAFTING_TABLE.getDefaultInstance())
                },
                        new FluidStack(ModuleCore.ETHER.getSourceFluid().get(), 1000), 200,
                        new ItemStack(this), FluidStack.EMPTY);
            }
        });

        SPEED_ADDON_3 = helper.registerGeneric(Item.class, "speed_addon_3", () -> new ModSpeedAddonItem(3, TAB_ADDONS) {
            @Override
            public void registerRecipe(Consumer<FinishedRecipe> consumer) {
                new DissolutionChamberRecipe(ForgeRegistries.ITEMS.getKey(this), new Ingredient.Value[] {
                        new Ingredient.TagValue(Tags.Items.DUSTS_REDSTONE),
                        new Ingredient.TagValue(Tags.Items.DUSTS_REDSTONE),
                        new Ingredient.TagValue(Tags.Items.GLASS_PANES_COLORLESS),
                        new Ingredient.TagValue(Tags.Items.GLASS_PANES_COLORLESS),
                        new Ingredient.TagValue(TagRegistry.Items.GEARS_NETHERITE),
                        new Ingredient.ItemValue(ModuleCore.SPEED_ADDON_2.get().getDefaultInstance()),
                        new Ingredient.ItemValue(new ItemStack(Items.SUGAR)),
                        new Ingredient.ItemValue(new ItemStack(Items.SUGAR))
                },
                        new FluidStack(ModuleCore.PINK_SLIME.getSourceFluid().get(), 1000), 200,
                        new ItemStack(this), FluidStack.EMPTY);
            }
        });
        SPEED_ADDON_4 = helper.registerGeneric(Item.class, "speed_addon_4", () -> new ModSpeedAddonItem(4, TAB_ADDONS) {
            @Override
            public void registerRecipe(Consumer<FinishedRecipe> consumer) {
                new DissolutionChamberRecipe(ForgeRegistries.ITEMS.getKey(this), new Ingredient.Value[] {
                        new Ingredient.TagValue(Tags.Items.DUSTS_REDSTONE),
                        new Ingredient.TagValue(Tags.Items.DUSTS_REDSTONE),
                        new Ingredient.TagValue(Tags.Items.GLASS_PANES_COLORLESS),
                        new Ingredient.TagValue(Tags.Items.GLASS_PANES_COLORLESS),
                        new Ingredient.TagValue(TagRegistry.Items.GEARS_NETHERITE),
                        new Ingredient.ItemValue(new ItemStack(SPEED_ADDON_3.get())),
                        new Ingredient.ItemValue(new ItemStack(Items.SUGAR)),
                        new Ingredient.ItemValue(new ItemStack(Items.SUGAR))
                },
                        new FluidStack(ModuleCore.ETHER.getSourceFluid().get(), 1000), 200,
                        new ItemStack(this), FluidStack.EMPTY);
            }
        });

        NETHERITE_GEAR = helper.registerGeneric(Item.class, "netherite_gear", () -> new RecipelessCustomItem("netherite_gear", TAB_ADDONS) {
        });
    }
}