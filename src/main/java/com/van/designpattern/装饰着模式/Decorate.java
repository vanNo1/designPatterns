package com.van.designpattern.装饰着模式;

public abstract class Decorate extends People {
    public People people;

    public Decorate(String name) {
        super(name);
    }

    public void decorate(People people) {
        this.people = people;
    }

    @Override
    public void show() {
        people.show();
    }
}
