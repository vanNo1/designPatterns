package com.van.designpattern.建造者模式.example.concretebuilder;

import com.van.designpattern.建造者模式.example.PersonBuilder;

public class FatPersonBuilder extends PersonBuilder {
    @Override
    public void body() {
        System.out.println("胖胖的脑袋");

    }

    @Override
    public void head() {
        System.out.println("胖胖的脑袋");

    }

    @Override
    public void leftArm() {
        System.out.println("胖胖的左臂");


    }

    @Override
    public void rightArm() {
        System.out.println("胖胖的右臂");

    }

    @Override
    public void leftLeg() {
        System.out.println("胖胖的左腿");

    }

    @Override
    public void rightLeg() {
        System.out.println("胖胖的右腿");

    }
}
