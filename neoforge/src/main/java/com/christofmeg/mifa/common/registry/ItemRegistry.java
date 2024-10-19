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
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.List;
import java.util.Optional;

public class ItemRegistry implements IModule {

    public static TitaniumTab TAB_ADDONS = new TitaniumTab(ResourceLocation.fromNamespaceAndPath(CommonConstants.MOD_ID, "addons"));

    public static DeferredHolder<Item, Item> EFFICIENCY_ADDON_3;
    public static DeferredHolder<Item, Item> EFFICIENCY_ADDON_4;

    public static DeferredHolder<Item, Item> PROCESSING_ADDON_3;
    public static DeferredHolder<Item, Item> PROCESSING_ADDON_4;

    public static DeferredHolder<Item, Item> SPEED_ADDON_3;
    public static DeferredHolder<Item, Item> SPEED_ADDON_4;

    public static DeferredHolder<Item, Item> NETHERITE_GEAR;

    @Override
    public void generateFeatures(DeferredRegistryHelper helper) {

        EFFICIENCY_ADDON_3 = helper.registerGeneric(Registries.ITEM, "efficiency_addon_3", () -> new ModEfficiencyAddonItem(3, TAB_ADDONS) {
            @Override
            public void registerRecipe(RecipeOutput consumer) {
                DissolutionChamberRecipe.createRecipe(consumer, "efficiency_addon_" + this.tier,
                        new DissolutionChamberRecipe(List.of(
                                Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                                Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(TagRegistry.Items.GEARS_NETHERITE),
                                Ingredient.of(ModuleCore.EFFICIENCY_ADDON_2.get().getDefaultInstance()),
                                Ingredient.of(Tags.Items.RODS_BLAZE),
                                Ingredient.of(Tags.Items.RODS_BLAZE)
                        ),
                                new FluidStack(ModuleCore.PINK_SLIME.getSourceFluid().get(), 1000), 200,
                                Optional.of(new ItemStack(this)), Optional.empty()));
            }
        });
        EFFICIENCY_ADDON_4 = helper.registerGeneric(Registries.ITEM, "efficiency_addon_4", () -> new ModEfficiencyAddonItem(4, TAB_ADDONS) {
            @Override
            public void registerRecipe(RecipeOutput consumer) {
                DissolutionChamberRecipe.createRecipe(consumer, "efficiency_addon_" + this.tier,
                        new DissolutionChamberRecipe(List.of(
                                Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                                Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(new ItemStack(Items.ECHO_SHARD)),
                                Ingredient.of(new ItemStack(EFFICIENCY_ADDON_3.get())),
                                Ingredient.of(Tags.Items.RODS_BLAZE),
                                Ingredient.of(Tags.Items.RODS_BLAZE)
                        ),
                                new FluidStack(ModuleCore.ETHER.getSourceFluid().get(), 1000), 200,
                                Optional.of(new ItemStack(this)), Optional.empty()));
            }
        });

        PROCESSING_ADDON_3 = helper.registerGeneric(Registries.ITEM, "processing_addon_3", () -> new ModProcessingAddonItem(3, TAB_ADDONS) {
            @Override
            public void registerRecipe(RecipeOutput consumer) {
                DissolutionChamberRecipe.createRecipe(consumer, "processing_addon_" + this.tier,
                        new DissolutionChamberRecipe(List.of(
                                Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                                Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(TagRegistry.Items.GEARS_NETHERITE),
                                Ingredient.of(ModuleCore.PROCESSING_ADDON_2.get().getDefaultInstance()),
                                Ingredient.of(Items.FURNACE.getDefaultInstance()),
                                Ingredient.of(Items.CRAFTING_TABLE.getDefaultInstance())
                        ),
                                new FluidStack(ModuleCore.PINK_SLIME.getSourceFluid().get(), 1000), 200,
                                Optional.of(new ItemStack(this)), Optional.empty()));
            }
        });
        PROCESSING_ADDON_4 = helper.registerGeneric(Registries.ITEM, "processing_addon_4", () -> new ModProcessingAddonItem(4, TAB_ADDONS) {
            @Override
            public void registerRecipe(RecipeOutput consumer) {
                DissolutionChamberRecipe.createRecipe(consumer, "processing_addon_" + this.tier,
                        new DissolutionChamberRecipe(List.of(
                                Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                                Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(new ItemStack(Items.ECHO_SHARD)),
                                Ingredient.of(new ItemStack(PROCESSING_ADDON_3.get())),
                                Ingredient.of(Items.FURNACE.getDefaultInstance()),
                                Ingredient.of(Items.CRAFTING_TABLE.getDefaultInstance())
                        ),
                                new FluidStack(ModuleCore.ETHER.getSourceFluid().get(), 1000), 200,
                                Optional.of(new ItemStack(this)), Optional.empty()));
            }
        });

        SPEED_ADDON_3 = helper.registerGeneric(Registries.ITEM, "speed_addon_3", () -> new ModSpeedAddonItem(3, TAB_ADDONS) {
            @Override
            public void registerRecipe(RecipeOutput consumer) {
                DissolutionChamberRecipe.createRecipe(consumer, "speed_addon_tier_" + this.tier,
                    new DissolutionChamberRecipe(List.of(
                            Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                            Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                            Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                            Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                            Ingredient.of(TagRegistry.Items.GEARS_NETHERITE),
                            Ingredient.of(ModuleCore.SPEED_ADDON_2.get().getDefaultInstance()),
                            Ingredient.of(new ItemStack(Items.SUGAR)),
                            Ingredient.of(new ItemStack(Items.SUGAR))
                    ),
                            new FluidStack(ModuleCore.PINK_SLIME.getSourceFluid().get(), 1000), 200,
                            Optional.of(new ItemStack(this)), Optional.empty()));
            }
        });
        SPEED_ADDON_4 = helper.registerGeneric(Registries.ITEM, "speed_addon_4", () -> new ModSpeedAddonItem(4, TAB_ADDONS) {
            @Override
            public void registerRecipe(RecipeOutput consumer) {
                DissolutionChamberRecipe.createRecipe(consumer, "speed_addon_tier_" + this.tier, 
                    new DissolutionChamberRecipe(List.of(
                            Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                            Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                            Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                            Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                            Ingredient.of(new ItemStack(Items.ECHO_SHARD)),
                            Ingredient.of(new ItemStack(SPEED_ADDON_3.get())),
                            Ingredient.of(new ItemStack(Items.SUGAR)),
                            Ingredient.of(new ItemStack(Items.SUGAR))
                    ),
                            new FluidStack(ModuleCore.ETHER.getSourceFluid().get(), 1000), 200,
                            Optional.of(new ItemStack(this)), Optional.empty()));
            }
        });
        
        NETHERITE_GEAR = helper.registerGeneric(Registries.ITEM, "netherite_gear", () -> {
            return new RecipelessCustomItem("netherite_gear", TAB_ADDONS);
        });
    }
}