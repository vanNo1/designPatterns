package com.van.designpattern.装饰着模式.decorate;

import com.van.designpattern.装饰着模式.Decorate;
import com.van.designpattern.装饰着模式.People;

public class Clothes extends Decorate {
    public Clothes(String name) {
        super(name);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("wear adidas");
    }
}
