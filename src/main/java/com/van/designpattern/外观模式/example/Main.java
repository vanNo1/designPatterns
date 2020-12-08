package com.van.designpattern.外观模式.example;

/**
 * 基金就是等于去买多只股票。
 */
public class Main {
    public static void main(String[] args) {
        Found found = new Found();
        found.buyFound();
        found.sellFound();
    }
}
