package com.van.designpattern.策略模式;

import com.van.designpattern.策略模式.stragegies.CashDiscount;
import com.van.designpattern.策略模式.stragegies.CashNormal;
import com.van.designpattern.策略模式.stragegies.CashReturnByAmount;
import com.van.designpattern.策略模式.stragegies.CashReturnByMoney;

/**
 * context 可以用来放参数，strategy就是一个通用的东西，而它的参数都源自context给它具体化，
 * 那么context肯定可以把成员变量作为参数给strategy
 */
public class CashContext {
    private Integer amount;
    private Double price;
    private Stragtegy stragtegy;

    //这是标准的策略模式
//    public CashContext(Stragtegy stragtegy) {
//        this.stragtegy = stragtegy;
//    }

    //将策略模式和简单工厂结合，把switch放里面，不要放在客户端去做
    //但是用下面switch 还是不好，首先case 只能放常量表达式，枚举都放不了，后期会很难维护
//    public CashContext(Integer type) {
//        switch (type) {
//            case 2:
//                stragtegy = new CashNormal();
//                break;
//            case 3:
//                stragtegy = new CashDiscount(7);
//                break;
//
//            case 4:
//                stragtegy = new CashReturnByMoney(300, 30);
//                break;
//        }
//    }


    public CashContext(Integer amount, Double price) {
        this.amount = amount;
        this.price = price;
    }


    public void createNormal() {
        this.stragtegy = new CashNormal();
    }

    public void createDiscount() {
        this.stragtegy = new CashDiscount(7);
    }

    public void createReturnByMoney() {
        this.stragtegy = new CashReturnByMoney(300, 30);
    }

    public void createReturnByAmount() {
        this.stragtegy = new CashReturnByAmount(amount, price, 2);
    }

    public double getResult(double money) {
        return this.stragtegy.getResult(money);
    }

}
