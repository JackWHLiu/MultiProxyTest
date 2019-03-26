package cn.jackwhliu.multiproxytest.compat.wrapper;

import cn.jackwhliu.multiproxytest.compat.interfaces.IDifferenceB;

public abstract class ModuleBWrapper implements IDifferenceB {

    private IDifferenceB mBase;

    public ModuleBWrapper(IDifferenceB base) {
        this.mBase = base;
    }

    @Override
    public String getFruitColor() {
        return mBase.getFruitColor();
    }

    @Override
    public IDifferenceB getDecorator() {
        return this;
    }
}
