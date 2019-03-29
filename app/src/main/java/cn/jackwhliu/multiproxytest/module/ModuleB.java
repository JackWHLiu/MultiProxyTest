package cn.jackwhliu.multiproxytest.module;

import com.lwh.jackknife.multiproxy.MultiProxy;
import com.lwh.jackknife.multiproxy.annotation.Autowired;
import com.lwh.jackknife.multiproxy.annotation.Difference;

import cn.jackwhliu.multiproxytest.BuildConfig;
import cn.jackwhliu.multiproxytest.compat.annotation.Grape;
import cn.jackwhliu.multiproxytest.compat.annotation.Lemon;
import cn.jackwhliu.multiproxytest.compat.annotation.Mango;
import cn.jackwhliu.multiproxytest.compat.interfaces.IDifferenceB;

@Grape
@Lemon
@Mango
@Difference(proxyName = BuildConfig.PROXY_CODE)
public class ModuleB implements IDifferenceB {

    @Override
    public String getFruitColor() {
        return "";
    }

    @Override
    public IDifferenceB getDecorator() {
        return MultiProxy.getDecorator(this, IDifferenceB.class);
    }
}
