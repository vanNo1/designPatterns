package com.van.designpattern.外观模式.pattern;

import com.van.designpattern.外观模式.pattern.subsystem.SubSystemOne;
import com.van.designpattern.外观模式.pattern.subsystem.SubSystemThree;
import com.van.designpattern.外观模式.pattern.subsystem.SubSystemTwo;

/**
 * 将客户的请求代理给适当的子系统对象
 */
public class Facade {
    private SubSystemOne subSystemOne;
    private SubSystemTwo subSystemTwo;
    private SubSystemThree subSystemThree;

    public Facade() {
        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
        subSystemThree = new SubSystemThree();
    }

    public void methodA() {
        subSystemOne.methodOne();
        subSystemThree.methodThree();
    }

    public void methodB() {
        subSystemTwo.methodTwo();
        subSystemThree.methodThree();
    }
}
