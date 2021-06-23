package com.van.designpattern.mokitodemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller {
    @Autowired
    private Service service;
    public void callService1(){
        System.out.println("do some things");
        service.print();
    }
    public void callService2(){
        System.out.println("do some things");
        service.returnInt();
    }
}
