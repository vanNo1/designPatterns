package com.van.designpattern.建造者模式.pattern.concreteBuilder;

import com.van.designpattern.建造者模式.pattern.Builder;
import com.van.designpattern.建造者模式.pattern.Product;

public class ConcreteBuilder2 extends Builder {
    private Product product = new Product();

    @Override
    public void builderPartA() {
        product.add("partX");
    }

    @Override
    public void builderPartB() {
        product.add("partY");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
