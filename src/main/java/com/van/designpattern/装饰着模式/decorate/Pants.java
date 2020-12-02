package com.van.designpattern.装饰着模式.decorate;

import com.van.designpattern.装饰着模式.Decorate;

public class Pants extends Decorate {
    public Pants(String name) {
        super(name);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("wear aape");
    }
}
