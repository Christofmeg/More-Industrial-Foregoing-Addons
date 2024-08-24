package com.christofmeg.mifa.common.provider;

import com.buuz135.industrial.module.ModuleCore;
import com.buuz135.industrial.recipe.DissolutionChamberRecipe;
import com.buuz135.industrial.utils.IndustrialTags;
import com.christofmeg.mifa.common.registry.ItemRegistry;
import com.hrznstudio.titanium.api.IRecipeProvider;
import com.hrznstudio.titanium.recipe.generator.TitaniumRecipeProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.SmithingRecipeBuilder;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Consumer;

public class ModRecipeProvider extends TitaniumRecipeProvider {

    public ModRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    public void register(Consumer<IFinishedRecipe> consumer) {

        new DissolutionChamberRecipe(ForgeRegistries.ITEMS.getKey(ModuleCore.EFFICIENCY_ADDON_2), new Ingredient.IItemList[] {
                new Ingredient.TagList(Tags.Items.DUSTS_REDSTONE),
                new Ingredient.TagList(Tags.Items.DUSTS_REDSTONE),
                new Ingredient.TagList(Tags.Items.GLASS_PANES_COLORLESS),
                new Ingredient.TagList(Tags.Items.GLASS_PANES_COLORLESS),
                new Ingredient.TagList(IndustrialTags.Items.GEAR_DIAMOND),
                new Ingredient.SingleItemList(new ItemStack(ModuleCore.EFFICIENCY_ADDON_1)),
                new Ingredient.TagList(Tags.Items.RODS_BLAZE),
                new Ingredient.TagList(Tags.Items.RODS_BLAZE)
        },
                new FluidStack(ModuleCore.LATEX.getSourceFluid(), 1000), 200,
                new ItemStack(ModuleCore.EFFICIENCY_ADDON_2), FluidStack.EMPTY);
        ((IRecipeProvider) ItemRegistry.EFFICIENCY_ADDON_3).registerRecipe(consumer);
        ((IRecipeProvider) ItemRegistry.EFFICIENCY_ADDON_4).registerRecipe(consumer);

        new DissolutionChamberRecipe(ForgeRegistries.ITEMS.getKey(ModuleCore.PROCESSING_ADDON_2), new Ingredient.IItemList[] {
                new Ingredient.TagList(Tags.Items.DUSTS_REDSTONE),
                new Ingredient.TagList(Tags.Items.DUSTS_REDSTONE),
                new Ingredient.TagList(Tags.Items.GLASS_PANES_COLORLESS),
                new Ingredient.TagList(Tags.Items.GLASS_PANES_COLORLESS),
                new Ingredient.TagList(IndustrialTags.Items.GEAR_DIAMOND),
                new Ingredient.SingleItemList(new ItemStack(ModuleCore.PROCESSING_ADDON_1)),
                new Ingredient.SingleItemList(Items.FURNACE.getDefaultInstance()),
                new Ingredient.SingleItemList(Items.CRAFTING_TABLE.getDefaultInstance())
        },
                new FluidStack(ModuleCore.LATEX.getSourceFluid(), 1000), 200,
                new ItemStack(ModuleCore.PROCESSING_ADDON_2), FluidStack.EMPTY);
        ((IRecipeProvider) ItemRegistry.PROCESSING_ADDON_3).registerRecipe(consumer);
        ((IRecipeProvider) ItemRegistry.PROCESSING_ADDON_4).registerRecipe(consumer);

        new DissolutionChamberRecipe(ForgeRegistries.ITEMS.getKey(ModuleCore.SPEED_ADDON_2), new Ingredient.IItemList[] {
                new Ingredient.TagList(Tags.Items.DUSTS_REDSTONE),
                new Ingredient.TagList(Tags.Items.DUSTS_REDSTONE),
                new Ingredient.TagList(Tags.Items.GLASS_PANES_COLORLESS),
                new Ingredient.TagList(Tags.Items.GLASS_PANES_COLORLESS),
                new Ingredient.TagList(IndustrialTags.Items.GEAR_DIAMOND),
                new Ingredient.SingleItemList(new ItemStack(ModuleCore.SPEED_ADDON_1)),
                new Ingredient.SingleItemList(new ItemStack(Items.SUGAR)),
                new Ingredient.SingleItemList(new ItemStack(Items.SUGAR))
        },
                new FluidStack(ModuleCore.LATEX.getSourceFluid(), 1000), 200,
                new ItemStack(ModuleCore.SPEED_ADDON_2), FluidStack.EMPTY);
        ((IRecipeProvider) ItemRegistry.SPEED_ADDON_3).registerRecipe(consumer);
        ((IRecipeProvider) ItemRegistry.SPEED_ADDON_4).registerRecipe(consumer);

        SmithingRecipeBuilder.smithing(
                        Ingredient.of(IndustrialTags.Items.GEAR_DIAMOND),
                        Ingredient.of(Tags.Items.INGOTS_NETHERITE),
                        ItemRegistry.NETHERITE_GEAR)
                .unlocks("has_netherite_ingot",has(Tags.Items.INGOTS_NETHERITE))
                .save(consumer, "netherite_gear" + "_smithing");

    }

}
