package com.van.designpattern.简单工厂模式;

public class Main {
    public static void main(String[] args) {
        Operation sum = OperationFactory.createOperation('+');
        sum.setNumber1(1);
        sum.setNumber2(2);
        System.out.println(sum.getResult());
        System.out.println(sum.getResult2(1, 2));

        Operation subtract = OperationFactory.createOperation('-');
        subtract.setNumber1(2);
        subtract.setNumber2(1);
        System.out.println(subtract.getResult());
        System.out.println(subtract.getResult2(2, 1));
    }
}
