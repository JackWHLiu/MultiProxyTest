package cn.jackwhliu.multiproxytest.module;

import android.content.Context;
import android.util.Log;

import com.lwh.jackknife.multiproxy.MultiProxy;
import com.lwh.jackknife.multiproxy.annotation.Autowired;
import com.lwh.jackknife.multiproxy.annotation.Difference;

import cn.jackwhliu.multiproxytest.BuildConfig;
import cn.jackwhliu.multiproxytest.compat.annotation.Grape;
import cn.jackwhliu.multiproxytest.compat.interfaces.IDifferenceA;

/**
 * 这里的Grape注解主要用来开启ModuleA处的差异可以使用ModuleAGrape来实现，这两个注解一起使用代表此模块的
 * Grape开关被打开。默认的实现在Module中实现，差异的实现走的是框架的装饰器。
 */
@Grape
@Difference(proxyName = BuildConfig.PROXY_CODE)
public class ModuleA implements IDifferenceA {

    /**
     * 使用Autowired注解依赖注入IDifferenceA，此属性是必须的。
     */
    @Autowired
    private IDifferenceA mModule;

    @Override
    public void a1() {
        Log.e("ModuleA", "a1");
    }

    @Override
    public void a2(String str) {
        Log.e("ModuleA", str);
    }

    @Override
    public Context a3() {
        Log.e("ModuleA", "a3");
        return null;
    }

    @Override
    public IDifferenceA getDecorator() {
        return MultiProxy.getDecorator(this, IDifferenceA.class);
    }
}
