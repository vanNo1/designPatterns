package com.van.designpattern.装饰着模式.decorate;

import com.van.designpattern.装饰着模式.Decorate;

public class Clothes extends Decorate {

    @Override
    public void show() {
        super.show();
        System.out.println("wear clothes");
    }
}
