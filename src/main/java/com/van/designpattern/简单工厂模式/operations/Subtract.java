package com.van.designpattern.简单工厂模式.operations;

import com.van.designpattern.简单工厂模式.Operation;

public class Subtract extends Operation {
    @Override
    public double getResult() {
        return getNumber1() - getNumber2();
    }

    @Override
    public double getResult2(double number1, double number2) {
        return number1 - number2;
    }
}
