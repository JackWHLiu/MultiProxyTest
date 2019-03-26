package cn.jackwhliu.multiproxytest.module;

import android.util.Log;

import com.lwh.jackknife.multiproxy.MultiProxy;
import com.lwh.jackknife.multiproxy.annotation.Autowired;
import com.lwh.jackknife.multiproxy.annotation.Difference;

import cn.jackwhliu.multiproxytest.BuildConfig;
import cn.jackwhliu.multiproxytest.compat.annotation.Grape;
import cn.jackwhliu.multiproxytest.compat.annotation.Lemon;
import cn.jackwhliu.multiproxytest.compat.annotation.Mango;
import cn.jackwhliu.multiproxytest.compat.interfaces.IDifferenceC;

@Grape
@Lemon
@Mango
@Difference(proxyName = BuildConfig.PROXY_CODE)
public class ModuleC implements IDifferenceC {

    @Autowired
    private IDifferenceC mModule;

    @Override
    public IDifferenceC getDecorator() {
        return MultiProxy.getDecorator(this, IDifferenceC.class);
    }

    @Override
    public void testGenerateWrapper() {
        Log.e("ModuleC", "不会显示这条信息，除非程序出错");
    }
}
