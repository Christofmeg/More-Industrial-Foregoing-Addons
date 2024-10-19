package com.christofmeg.mifa.common.provider;

import com.buuz135.industrial.module.ModuleCore;
import com.buuz135.industrial.recipe.DissolutionChamberRecipe;
import com.buuz135.industrial.utils.IndustrialTags;
import com.christofmeg.mifa.common.registry.ItemRegistry;
import com.hrznstudio.titanium.api.IRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.SmithingTransformRecipeBuilder;
import net.minecraft.data.recipes.packs.VanillaRecipeProvider;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.fluids.FluidStack;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends VanillaRecipeProvider {

    public ModRecipeProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(packOutput, completableFuture);
    }

    @Override
    public void buildRecipes(@NotNull RecipeOutput recipeOutput) {

        DissolutionChamberRecipe.createRecipe(recipeOutput, BuiltInRegistries.ITEM.getKey(ModuleCore.EFFICIENCY_ADDON_2.get()).toShortLanguageKey(),
                new DissolutionChamberRecipe(List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                        Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                        Ingredient.of(IndustrialTags.Items.GEAR_DIAMOND),
                        Ingredient.of(new ItemStack(ModuleCore.EFFICIENCY_ADDON_1.get())),
                        Ingredient.of(Tags.Items.RODS_BLAZE),
                        Ingredient.of(Tags.Items.RODS_BLAZE)
                ),
                        new FluidStack(ModuleCore.LATEX.getSourceFluid().get(), 1000), 200,
                        Optional.of(new ItemStack(ModuleCore.EFFICIENCY_ADDON_2.get())), Optional.empty()));
        ((IRecipeProvider) ItemRegistry.EFFICIENCY_ADDON_3.get()).registerRecipe(recipeOutput);
        ((IRecipeProvider) ItemRegistry.EFFICIENCY_ADDON_4.get()).registerRecipe(recipeOutput);

        DissolutionChamberRecipe.createRecipe(recipeOutput, BuiltInRegistries.ITEM.getKey(ModuleCore.PROCESSING_ADDON_2.get()).toShortLanguageKey(),
                new DissolutionChamberRecipe(List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                        Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                        Ingredient.of(IndustrialTags.Items.GEAR_DIAMOND),
                        Ingredient.of(new ItemStack(ModuleCore.PROCESSING_ADDON_1.get())),
                        Ingredient.of(Items.FURNACE.getDefaultInstance()),
                        Ingredient.of(Items.CRAFTING_TABLE.getDefaultInstance())
                ),
                        new FluidStack(ModuleCore.LATEX.getSourceFluid().get(), 1000), 200,
                        Optional.of(new ItemStack(ModuleCore.PROCESSING_ADDON_2.get())), Optional.empty()));
        ((IRecipeProvider) ItemRegistry.PROCESSING_ADDON_3.get()).registerRecipe(recipeOutput);
        ((IRecipeProvider) ItemRegistry.PROCESSING_ADDON_4.get()).registerRecipe(recipeOutput);

        DissolutionChamberRecipe.createRecipe(recipeOutput, BuiltInRegistries.ITEM.getKey(ModuleCore.SPEED_ADDON_2.get()).toShortLanguageKey(),
                new DissolutionChamberRecipe(List.of(
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.DUSTS_REDSTONE),
                        Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                        Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                        Ingredient.of(IndustrialTags.Items.GEAR_DIAMOND),
                        Ingredient.of(new ItemStack(ModuleCore.SPEED_ADDON_1.get())),
                        Ingredient.of(new ItemStack(Items.SUGAR)),
                        Ingredient.of(new ItemStack(Items.SUGAR))
                ),
                        new FluidStack(ModuleCore.LATEX.getSourceFluid().get(), 1000), 200,
                        Optional.of(new ItemStack(ModuleCore.SPEED_ADDON_2.get())), Optional.empty()));
        ((IRecipeProvider) ItemRegistry.SPEED_ADDON_3.get()).registerRecipe(recipeOutput);
        ((IRecipeProvider) ItemRegistry.SPEED_ADDON_4.get()).registerRecipe(recipeOutput);

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.of(IndustrialTags.Items.GEAR_DIAMOND),
                        Ingredient.of(Tags.Items.INGOTS_NETHERITE),
                        RecipeCategory.MISC,
                        ItemRegistry.NETHERITE_GEAR.get())
                .unlocks("has_netherite_ingot",has(Tags.Items.INGOTS_NETHERITE))
                .save(recipeOutput, getItemName(ItemRegistry.NETHERITE_GEAR.get()) + "_smithing");

    }

}
