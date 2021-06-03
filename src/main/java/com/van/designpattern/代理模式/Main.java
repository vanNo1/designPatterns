package com.van.designpattern.代理模式;

/**
 * 代理送礼物
 *
 * 代理和被代理完成的事情都是一样的，所以完全可以抽象出来，做成一个统一的Action接口去规定他们要干的事情。
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
