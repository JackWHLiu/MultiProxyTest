package cn.jackwhliu.multiproxytest.compat.impl;

import cn.jackwhliu.multiproxytest.compat.interfaces.IDifferenceB;
import cn.jackwhliu.multiproxytest.compat.wrapper.ModuleBWrapper;

public class ModuleBGrape extends ModuleBWrapper {

    public ModuleBGrape(IDifferenceB base) {
        super(base);
    }

    @Override
    public String getFruitColor() {
        return "紫色";
    }
}
