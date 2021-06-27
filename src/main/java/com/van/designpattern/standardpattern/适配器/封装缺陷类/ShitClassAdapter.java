package com.van.designpattern.standardpattern.适配器.封装缺陷类;

/**
 * 适配可继承可组合
 */
public class ShitClassAdapter extends ShitClass implements Itarget {
    @Override
    public void m1() {
        super.shitM1();
    }

    @Override
    public void m2() {
        ShitClass.staticM2();
    }

    @Override
    public void m3() {
        super.lowPerformanceM3();
    }
}
