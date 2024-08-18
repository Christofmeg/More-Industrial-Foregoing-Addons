package com.christofmeg.mifa.common.item;

import com.buuz135.industrial.item.addon.SpeedAddonItem;
import com.hrznstudio.titanium.tab.TitaniumTab;

public class ModSpeedAddonItem extends SpeedAddonItem {

    public int tier;

    public ModSpeedAddonItem(int tier, TitaniumTab group) {
        super(tier, group);
        this.tier = tier;
    }

}
