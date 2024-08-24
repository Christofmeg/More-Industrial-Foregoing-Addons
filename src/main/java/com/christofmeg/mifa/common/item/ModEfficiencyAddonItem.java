package com.christofmeg.mifa.common.item;

import com.buuz135.industrial.item.addon.EfficiencyAddonItem;
import com.hrznstudio.titanium.tab.TitaniumTab;

public class ModEfficiencyAddonItem extends EfficiencyAddonItem {

    public int tier;

    public ModEfficiencyAddonItem(int tier, TitaniumTab group) {
        super(tier, group);
        this.tier = tier;
    }

}
