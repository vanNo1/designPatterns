package com.van.designpattern.迭代器模式;

/**
 * 感觉就是像编写了一个迭代器
 */
public class Main {
    public static void main(String[] args) {
        Container nameContainer = new NameContainer();
        Iterator iterator = nameContainer.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
