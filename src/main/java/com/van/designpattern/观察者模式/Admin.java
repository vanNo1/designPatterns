package com.van.designpattern.观察者模式;

public class Admin implements ProductObserver {
    @Override
    public void onPriceChange() {
        System.out.println("admin listened price change");
    }

    @Override
    public void onProductChange() {
        System.out.println("admin listened product change");
    }
}
