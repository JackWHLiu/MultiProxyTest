package cn.jackwhliu.multiproxytest.compat.wrapper;

import cn.jackwhliu.multiproxytest.compat.interfaces.IDifferenceC;

public abstract class ModuleCWrapper implements IDifferenceC {

    private IDifferenceC mBase;

    public ModuleCWrapper(IDifferenceC base) {
        this.mBase = base;
    }

    @Override
    public IDifferenceC getDecorator() {
        return this;
    }

    @Override
    public void testGenerateWrapper() {
        mBase.testGenerateWrapper();
    }
}
