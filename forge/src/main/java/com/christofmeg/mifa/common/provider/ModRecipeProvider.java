package com.christofmeg.mifa.common.provider;

import com.buuz135.industrial.module.ModuleCore;
import com.buuz135.industrial.recipe.DissolutionChamberRecipe;
import com.buuz135.industrial.utils.IndustrialTags;
import com.christofmeg.mifa.common.registry.ItemRegistry;
import com.hrznstudio.titanium.api.IRecipeProvider;
import com.hrznstudio.titanium.recipe.generator.TitaniumRecipeProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.SmithingTransformRecipeBuilder;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Consumer;

public class ModRecipeProvider extends TitaniumRecipeProvider {

    public ModRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    public void register(Consumer<FinishedRecipe> consumer) {

        new DissolutionChamberRecipe(ForgeRegistries.ITEMS.getKey(ModuleCore.EFFICIENCY_ADDON_2.get()), new Ingredient.Value[] {
                new Ingredient.TagValue(Tags.Items.DUSTS_REDSTONE),
                new Ingredient.TagValue(Tags.Items.DUSTS_REDSTONE),
                new Ingredient.TagValue(Tags.Items.GLASS_PANES_COLORLESS),
                new Ingredient.TagValue(Tags.Items.GLASS_PANES_COLORLESS),
                new Ingredient.TagValue(IndustrialTags.Items.GEAR_DIAMOND),
                new Ingredient.ItemValue(new ItemStack(ModuleCore.EFFICIENCY_ADDON_1.get())),
                new Ingredient.TagValue(Tags.Items.RODS_BLAZE),
                new Ingredient.TagValue(Tags.Items.RODS_BLAZE)
        },
                new FluidStack(ModuleCore.LATEX.getSourceFluid().get(), 1000), 200,
                new ItemStack(ModuleCore.EFFICIENCY_ADDON_2.get()), FluidStack.EMPTY);
        ((IRecipeProvider) ItemRegistry.EFFICIENCY_ADDON_3.get()).registerRecipe(consumer);
        ((IRecipeProvider) ItemRegistry.EFFICIENCY_ADDON_4.get()).registerRecipe(consumer);

        new DissolutionChamberRecipe(ForgeRegistries.ITEMS.getKey(ModuleCore.PROCESSING_ADDON_2.get()), new Ingredient.Value[] {
                new Ingredient.TagValue(Tags.Items.DUSTS_REDSTONE),
                new Ingredient.TagValue(Tags.Items.DUSTS_REDSTONE),
                new Ingredient.TagValue(Tags.Items.GLASS_PANES_COLORLESS),
                new Ingredient.TagValue(Tags.Items.GLASS_PANES_COLORLESS),
                new Ingredient.TagValue(IndustrialTags.Items.GEAR_DIAMOND),
                new Ingredient.ItemValue(new ItemStack(ModuleCore.PROCESSING_ADDON_1.get())),
                new Ingredient.ItemValue(Items.FURNACE.getDefaultInstance()),
                new Ingredient.ItemValue(Items.CRAFTING_TABLE.getDefaultInstance())
        },
                new FluidStack(ModuleCore.LATEX.getSourceFluid().get(), 1000), 200,
                new ItemStack(ModuleCore.PROCESSING_ADDON_2.get()), FluidStack.EMPTY);
        ((IRecipeProvider) ItemRegistry.PROCESSING_ADDON_3.get()).registerRecipe(consumer);
        ((IRecipeProvider) ItemRegistry.PROCESSING_ADDON_4.get()).registerRecipe(consumer);

        new DissolutionChamberRecipe(ForgeRegistries.ITEMS.getKey(ModuleCore.SPEED_ADDON_2.get()), new Ingredient.Value[] {
                new Ingredient.TagValue(Tags.Items.DUSTS_REDSTONE),
                new Ingredient.TagValue(Tags.Items.DUSTS_REDSTONE),
                new Ingredient.TagValue(Tags.Items.GLASS_PANES_COLORLESS),
                new Ingredient.TagValue(Tags.Items.GLASS_PANES_COLORLESS),
                new Ingredient.TagValue(IndustrialTags.Items.GEAR_DIAMOND),
                new Ingredient.ItemValue(new ItemStack(ModuleCore.SPEED_ADDON_1.get())),
                new Ingredient.ItemValue(new ItemStack(Items.SUGAR)),
                new Ingredient.ItemValue(new ItemStack(Items.SUGAR))
        },
                new FluidStack(ModuleCore.LATEX.getSourceFluid().get(), 1000), 200,
                new ItemStack(ModuleCore.SPEED_ADDON_2.get()), FluidStack.EMPTY);
        ((IRecipeProvider) ItemRegistry.SPEED_ADDON_3.get()).registerRecipe(consumer);
        ((IRecipeProvider) ItemRegistry.SPEED_ADDON_4.get()).registerRecipe(consumer);

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.of(IndustrialTags.Items.GEAR_DIAMOND),
                        Ingredient.of(Tags.Items.INGOTS_NETHERITE),
                        RecipeCategory.MISC,
                        ItemRegistry.NETHERITE_GEAR.get())
                .unlocks("has_netherite_ingot",has(Tags.Items.INGOTS_NETHERITE))
                .save(consumer, getItemName(ItemRegistry.NETHERITE_GEAR.get()) + "_smithing");

    }

}
