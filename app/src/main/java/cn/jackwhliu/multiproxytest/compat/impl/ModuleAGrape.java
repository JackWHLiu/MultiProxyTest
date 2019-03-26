package cn.jackwhliu.multiproxytest.compat.impl;

import android.util.Log;

import cn.jackwhliu.multiproxytest.compat.interfaces.IDifferenceA;
import cn.jackwhliu.multiproxytest.compat.wrapper.ModuleAWrapper;

/**
 * 手动命名为：模块名 + 代理名。
 */
public class ModuleAGrape extends ModuleAWrapper {

    public ModuleAGrape(IDifferenceA base) {
        super(base);
    }

    @Override
    public void a1() {
//        super.a1();
        Log.e("ModuleA", "Grape");
    }

    @Override
    public void a2(String str) {
        super.a2("grape " + str);
    }
}
