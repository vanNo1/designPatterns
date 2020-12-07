package com.van.designpattern.代理模式;

public class Pursuit implements Action {
    private SchoolGirl schoolGirl;

    public Pursuit(SchoolGirl schoolGirl) {
        this.schoolGirl = schoolGirl;
    }

    @Override
    public void giveDolls() {
        System.out.println(schoolGirl.getName() + "送你娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println(schoolGirl.getName() + "送你花花");

    }

    @Override
    public void giveChocolate() {
        System.out.println(schoolGirl.getName() + "送你巧克力");
    }
}
