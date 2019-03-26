package cn.jackwhliu.multiproxytest.compat.interfaces;

import android.content.Context;

import com.lwh.jackknife.multiproxy.annotation.DifferenceInterface;
import com.lwh.jackknife.multiproxy.interfaces.IDifference;

/**
 * DifferenceInterface注解用于指定装饰器的包名和模块名。
 */
@DifferenceInterface(
        packageName = "cn.jackwhliu.multiproxytest.compat.impl",
        moduleName = "ModuleA"
)
public interface IDifferenceA extends IDifference<IDifferenceA> {

    void a1();
    void a2(String str);
    Context a3();
}
