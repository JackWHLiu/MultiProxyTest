package cn.jackwhliu.multiproxytest.compat.interfaces;

import com.lwh.jackknife.multiproxy.annotation.DifferenceInterface;
import com.lwh.jackknife.multiproxy.interfaces.IDifference;

@DifferenceInterface(
        packageName = "cn.jackwhliu.multiproxytest.compat.impl",
        moduleName = "ModuleB"
)
public interface IDifferenceB extends IDifference<IDifferenceB> {

    String getFruitColor();
}
