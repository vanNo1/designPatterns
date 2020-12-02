package com.van.designpattern.装饰着模式;

public abstract class People {
    public String name;

    public People(String name) {
        this.name = name;
    }

    public abstract void show();
}
