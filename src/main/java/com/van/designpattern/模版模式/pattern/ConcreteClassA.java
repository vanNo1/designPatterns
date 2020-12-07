package com.van.designpattern.模版模式.pattern;

public class ConcreteClassA extends AbstractClass {
    @Override
    public void abstractMethod1() {
        System.out.println("classA-步骤1");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("classA-步骤2");
    }
}
