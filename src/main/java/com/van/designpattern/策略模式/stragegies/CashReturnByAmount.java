package com.van.designpattern.策略模式.stragegies;

import com.van.designpattern.策略模式.Stragtegy;

public class CashReturnByAmount extends Stragtegy {
    private Integer buyAmount;
    private Double price;
    // 买returnAmount 送一
    private Integer returnAmount;

    public CashReturnByAmount(Integer buyAmount, Double price, Integer returnAmount) {
        this.buyAmount = buyAmount;
        this.price = price;
        this.returnAmount = returnAmount;
    }

    @Override
    public double getResult(double money) {
        return money - (buyAmount / returnAmount) * price;

    }
}
