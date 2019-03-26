package cn.jackwhliu.multiproxytest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import cn.jackwhliu.multiproxytest.module.ModuleA;
import cn.jackwhliu.multiproxytest.module.ModuleB;
import cn.jackwhliu.multiproxytest.module.ModuleC;

/**
 * Note:业务代码的差异可用装饰器的方式和分支代码的方式，一般以装饰器方式为主。资源布局的兼容采用分支布局覆盖的方式
 * 和抽取颜色的方式。
 */
public class MainActivity extends Activity {

    ModuleA mModuleA;
    ModuleB mModuleB;
    ModuleC mModuleC;
    TestBranchJavaCode mTestBranchJavaCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mModuleA = new ModuleA();
        mModuleB = new ModuleB();
        mModuleC = new ModuleC();
        mModuleA.getDecorator().a2("--------");
        mModuleA.getDecorator().a1();
        mModuleA.getDecorator().a3();
        Log.e("ModuleB", "水果的颜色：" +mModuleB.getDecorator().getFruitColor());
        mModuleC.getDecorator().testGenerateWrapper();
        mTestBranchJavaCode = new TestBranchJavaCode();
        Log.e("TestBranchJavaCode", mTestBranchJavaCode.getStr());
    }
}
