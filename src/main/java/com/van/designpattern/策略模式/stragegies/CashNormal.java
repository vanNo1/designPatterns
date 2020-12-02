package com.van.designpattern.策略模式.stragegies;

import com.van.designpattern.策略模式.Stragtegy;

public class CashNormal  extends Stragtegy {

    @Override
    public double getResult(double money) {
        return money;
    }
}
