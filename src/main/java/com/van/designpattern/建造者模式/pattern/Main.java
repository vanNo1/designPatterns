package com.van.designpattern.建造者模式.pattern;

import com.van.designpattern.建造者模式.pattern.concreteBuilder.ConcreteBuilder1;
import com.van.designpattern.建造者模式.pattern.concreteBuilder.ConcreteBuilder2;

public class Main {
    public static void main(String[] args) {
        ConcreteBuilder1 concreteBuilder1 = new ConcreteBuilder1();
        ConcreteBuilder2 concreteBuilder2 = new ConcreteBuilder2();
        Director director = new Director();
        director.construct(concreteBuilder1);
        director.construct(concreteBuilder2);
        Product product1 = concreteBuilder1.getResult();
        Product product2 = concreteBuilder2.getResult();
        product1.show();
        System.out.println();
        product2.show();
    }
}
