package com.van.designpattern.建造者模式.pattern;

public class Director {
    public void construct(Builder builder) {
        builder.builderPartA();
        builder.builderPartB();
    }
}
