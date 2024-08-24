package com.christofmeg.mifa.common.provider;

import com.buuz135.industrial.recipe.DissolutionChamberRecipe;
import com.hrznstudio.titanium.recipe.generator.IJSONGenerator;
import com.hrznstudio.titanium.recipe.generator.IJsonFile;
import com.hrznstudio.titanium.recipe.generator.TitaniumSerializableProvider;
import net.minecraft.data.DataGenerator;

import java.util.Map;

public class ModSerializableProvider extends TitaniumSerializableProvider {

    public ModSerializableProvider(DataGenerator generatorIn, String modid) {
        super(generatorIn, modid);
    }

    @Override
    public void add(Map<IJsonFile, IJSONGenerator> serializables) {
        DissolutionChamberRecipe.RECIPES.forEach(dissolutionChamberRecipe -> serializables.put(dissolutionChamberRecipe, dissolutionChamberRecipe));
    }
}