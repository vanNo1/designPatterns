package com.van.designpattern.观察者模式;

public class Customer implements ProductObserver {
    @Override
    public void onPriceChange() {
        System.out.println("Customer listened price change");
    }

    @Override
    public void onProductChange() {
        System.out.println("Customer listened product change");
    }
}
