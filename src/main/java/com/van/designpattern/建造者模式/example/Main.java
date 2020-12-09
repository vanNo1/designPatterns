package com.van.designpattern.建造者模式.example;

import com.van.designpattern.建造者模式.example.concretebuilder.FatPersonBuilder;
import com.van.designpattern.建造者模式.example.concretebuilder.ThinPersonBuilder;

public class Main {
    public static void main(String[] args) {
        PersonBuilder thinPersonBuilder = new ThinPersonBuilder();
        PersonBuilder fatPersonBuilder = new FatPersonBuilder();
        PersonDirecter thinPersonDirecter = new PersonDirecter(thinPersonBuilder);
        PersonDirecter fatPersonDirecter = new PersonDirecter(fatPersonBuilder);
        thinPersonDirecter.createPerson();
        System.out.println("\n");
        fatPersonDirecter.createPerson();

    }
}
