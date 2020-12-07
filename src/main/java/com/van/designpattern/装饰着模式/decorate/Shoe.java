package com.van.designpattern.装饰着模式.decorate;

import com.van.designpattern.装饰着模式.Decorate;

public class Shoe extends Decorate {


    @Override
    public void show() {
        super.show();
        System.out.println("wear shoe");
    }
}
