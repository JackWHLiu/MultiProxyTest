package cn.jackwhliu.multiproxytest.compat.impl;

import cn.jackwhliu.multiproxytest.compat.interfaces.IDifferenceB;
import cn.jackwhliu.multiproxytest.compat.wrapper.ModuleBWrapper;

public class ModuleBLemon extends ModuleBWrapper {

    public ModuleBLemon(IDifferenceB base) {
        super(base);
    }

    @Override
    public String getFruitColor() {
        return "黄色";
    }
}
