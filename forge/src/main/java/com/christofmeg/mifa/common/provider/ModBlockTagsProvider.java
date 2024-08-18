package com.christofmeg.mifa.common.provider;

import com.christofmeg.mifa.CommonConstants;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagsProvider extends BlockTagsProvider {

    public ModBlockTagsProvider(DataGenerator packOutput, ExistingFileHelper existingFileHelper) {
        super(packOutput, CommonConstants.MOD_ID, existingFileHelper);
    }

}
