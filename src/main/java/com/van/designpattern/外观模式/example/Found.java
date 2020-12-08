package com.van.designpattern.外观模式.example;

import com.van.designpattern.外观模式.example.stock.StockOne;
import com.van.designpattern.外观模式.example.stock.StockThree;
import com.van.designpattern.外观模式.example.stock.StockTwo;

public class Found {
    private StockOne stockOne;
    private StockTwo stockTwo;
    private StockThree stockThree;

    public Found() {
        stockOne = new StockOne();
        stockTwo = new StockTwo();
        stockThree = new StockThree();
    }

    public void buyFound() {
        stockThree.buyStockThree();
        stockTwo.buyStockTwo();
        stockOne.buyStockOne();
    }

    public void sellFound() {
        stockOne.sellStockOne();
        stockTwo.sellStockTwo();
        stockThree.sellStockThree();
    }
}
