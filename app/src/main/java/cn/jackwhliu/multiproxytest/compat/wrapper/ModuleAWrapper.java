package cn.jackwhliu.multiproxytest.compat.wrapper;

import android.content.Context;

import cn.jackwhliu.multiproxytest.compat.interfaces.IDifferenceA;

/**
 * wrapper用于定义装饰器实现的抽象层。
 */
public abstract class ModuleAWrapper implements IDifferenceA {

    private IDifferenceA mBase;

    public ModuleAWrapper(IDifferenceA base) {
        this.mBase = base;
    }

    @Override
    public void a1() {
        mBase.a1();
    }

    @Override
    public void a2(String str) {
        mBase.a2(str);
    }

    @Override
    public Context a3() {
        return mBase.a3();
    }

    @Override
    public IDifferenceA getDecorator() {
        return this;
    }
}
