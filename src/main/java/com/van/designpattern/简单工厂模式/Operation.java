package com.van.designpattern.简单工厂模式;

import lombok.Data;

/**
 * 各种运算的抽象类
 */
@Data
public abstract class Operation {
    private double number1;
    private double number2;

    public abstract double getResult();

    public abstract double getResult2(double number1, double number2);


}
