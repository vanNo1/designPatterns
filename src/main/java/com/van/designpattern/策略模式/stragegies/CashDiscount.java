package com.van.designpattern.策略模式.stragegies;

import com.van.designpattern.策略模式.Stragtegy;

public class CashDiscount extends Stragtegy {
    private Integer discount;

    public CashDiscount(Integer discount) {
        this.discount = discount;
    }

    @Override
    public double getResult(double money) {
        return discount * money * 0.1;
    }
}
