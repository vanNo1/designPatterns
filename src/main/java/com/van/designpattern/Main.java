package com.van.designpattern;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void getClass(Object object) {
        Class<?> aClass = object.getClass();
        System.out.println(aClass);
    }

    public static void main(String[] args) {
        getClass(new ArrayList<Integer>());
        getClass(new LinkedList<Integer>());
    }
}
