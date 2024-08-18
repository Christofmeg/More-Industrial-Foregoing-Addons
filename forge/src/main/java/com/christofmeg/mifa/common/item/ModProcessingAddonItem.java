package com.christofmeg.mifa.common.item;

import com.buuz135.industrial.item.addon.ProcessingAddonItem;
import com.hrznstudio.titanium.tab.TitaniumTab;

public class ModProcessingAddonItem extends ProcessingAddonItem {

    public int tier;

    public ModProcessingAddonItem(int tier, TitaniumTab group) {
        super(tier, group);
        this.tier = tier;
    }

}
