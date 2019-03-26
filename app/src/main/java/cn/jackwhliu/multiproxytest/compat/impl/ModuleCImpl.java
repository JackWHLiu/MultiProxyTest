package cn.jackwhliu.multiproxytest.compat.impl;

import android.util.Log;

import com.lwh.jackknife.multiproxy.annotation.Wrapper;

import cn.jackwhliu.multiproxytest.BuildConfig;
import cn.jackwhliu.multiproxytest.compat.annotation.Grape;
import cn.jackwhliu.multiproxytest.compat.annotation.Lemon;
import cn.jackwhliu.multiproxytest.compat.annotation.Mango;
import cn.jackwhliu.multiproxytest.compat.interfaces.IDifferenceC;
import cn.jackwhliu.multiproxytest.compat.wrapper.ModuleCWrapper;

/**
 * 这种方式属于自动生成装饰器，跟自己手写的是等效的。
 */
@Grape
@Lemon
@Mango
@Wrapper(proxyName = BuildConfig.PROXY_CODE)
public class ModuleCImpl extends ModuleCWrapper implements IDifferenceC {

    public ModuleCImpl(IDifferenceC base) {
        super(base);
    }

    @Override
    public void testGenerateWrapper() {
        Log.e("ModuleC", "方法已覆盖成功");
    }
}
