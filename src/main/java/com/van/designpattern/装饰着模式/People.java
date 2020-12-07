package com.van.designpattern.装饰着模式;

import java.text.MessageFormat;

public abstract class People {
    private String name;

    //由于构造函数不能被继承，只会显隐式去调用，父类不写无参构造函数，子类的无参构造函数就会调用父类不存在的无参构造函数，这个时候就会出错，所以子类就必须去写一个有参构造函数，去承接父lei
    public People() {
    }

    public People(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(MessageFormat.format("i'm {0}", name));
    }
}
