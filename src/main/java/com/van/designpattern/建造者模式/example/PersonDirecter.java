package com.van.designpattern.建造者模式.example;

import com.van.designpattern.建造者模式.example.PersonBuilder;

public class PersonDirecter {
    private PersonBuilder personBuilder;

    public PersonDirecter(PersonBuilder personBuilder) {
        this.personBuilder = personBuilder;
    }

    public void createPerson() {
        personBuilder.head();
        personBuilder.body();
        personBuilder.leftArm();
        personBuilder.rightArm();
        personBuilder.leftLeg();
        personBuilder.rightLeg();
    }
}
