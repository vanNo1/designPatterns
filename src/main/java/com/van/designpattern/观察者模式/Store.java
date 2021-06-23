package com.van.designpattern.观察者模式;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Store {
    private List<ProductObserver> observerList = new ArrayList<>();
    private Map<String, Product> productMap = new HashMap<>();

    public void addObserver(ProductObserver productObserver) {
        observerList.add(productObserver);
    }

    public void removeObserver(ProductObserver productObserver) {
        observerList.remove(productObserver);
    }

    public void addProduct(Product product) {
        productMap.put(product.getName(), product);
        observerList.forEach(ProductObserver::onProductChange);
    }

    public void changePrice(Product product, double price) {
        productMap.get(product.getName()).setPrice(price);
        observerList.forEach(ProductObserver::onPriceChange);
    }
}
