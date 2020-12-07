package com.van.designpattern.代理模式;

/**
 * 代理送礼物
 */
public class Main {
    public static void main(String[] args) {
        SchoolGirl schoolGirl = new SchoolGirl();
        schoolGirl.setName("Lili");
        Proxy proxy = new Proxy(schoolGirl);
        proxy.giveChocolate();
        proxy.giveDolls();
        proxy.giveFlowers();
    }
}
