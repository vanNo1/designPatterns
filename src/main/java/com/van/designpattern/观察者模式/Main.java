package com.van.designpattern.观察者模式;

/**
 * 将观察者和解耦，商店不关心具体是谁是观察者，新来的观察者直接实现观察接口并注册到store里面即可
 * 改造：可以让store实现Observable 接口，写注册Observer和remove Observer方法。
 * 并且onChange方法可以写成Event类
 */
public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();
        Customer customer = new Customer();
        Store store = new Store();
        store.addObserver(admin);
        store.addObserver(customer);
        Product chips = new Product("chips", 3.5);
        store.addProduct(chips);
        store.changePrice(chips, 3);
    }
}
