package com.van.designpattern.装饰着模式;

public abstract class Decorate extends People {
    protected People people;


    public void decorate(People people) {
        this.people = people;
    }

    @Override
    public void show() {
        if (people != null) {
            people.show();
        }
    }
}
