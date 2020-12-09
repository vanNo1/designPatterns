package com.van.designpattern.建造者模式.pattern;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private List<String> parts = new ArrayList<>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.print("product consist of:");
        parts.forEach(obj -> {
            System.out.print(" " + obj);
        });
    }
}
