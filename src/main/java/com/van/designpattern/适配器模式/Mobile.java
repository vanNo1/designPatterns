package com.van.designpattern.适配器模式;

public class Mobile {
    public void charge(Power power){
        System.out.println("charging---voltage is "+power.voltage());
    }
}
