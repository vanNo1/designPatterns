package com.van.designpattern.模版模式.pattern;

/**
 * 达到一个很好的复用，把不变的行为放到超类，去除子类中重复的代码
 */
public class Main {
    public static void main(String[] args) {
        AbstractClass concreteClassA = new ConcreteClassA();
        AbstractClass concreteClassB = new ConcreteClassB();
        concreteClassA.templateMethod();
        concreteClassB.templateMethod();
    }
}
