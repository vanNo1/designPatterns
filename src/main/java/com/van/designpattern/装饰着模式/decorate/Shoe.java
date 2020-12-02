package com.van.designpattern.装饰着模式.decorate;

import com.van.designpattern.装饰着模式.Decorate;

public class Shoe extends Decorate {
    public Shoe(String name) {
        super(name);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("wear nike");
    }
}
