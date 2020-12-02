package com.van.designpattern.装饰着模式.people;

import com.van.designpattern.装饰着模式.People;

public class BlackPeople extends People {
    public BlackPeople(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println("i'm black people");
    }
}
