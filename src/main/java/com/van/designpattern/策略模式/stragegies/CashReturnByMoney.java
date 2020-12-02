package com.van.designpattern.策略模式.stragegies;

import com.van.designpattern.策略模式.Stragtegy;

public class CashReturnByMoney extends Stragtegy {
    private Integer upto;
    private Integer ret;

    public CashReturnByMoney(Integer upto, Integer ret) {
        this.upto = upto;
        this.ret = ret;
    }

    @Override
    public double getResult(double money) {
        return money - (int) (money / upto) * ret;
    }
}
