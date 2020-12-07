package com.van.designpattern.模版模式.pattern;

public abstract class AbstractClass {
    /**
     * 模版方法，逻辑的骨架，而逻辑的组成是抽象方法
     */
    public void templateMethod() {
        System.out.println("具体的步骤");
        abstractMethod2();
        abstractMethod1();
    }

    /**
     * 抽象行为，放到子类去实现
     */
    public abstract void abstractMethod1();

    public abstract void abstractMethod2();

}
