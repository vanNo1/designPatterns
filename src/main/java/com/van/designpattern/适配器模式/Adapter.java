package com.van.designpattern.适配器模式;

public class Adapter implements Power {
    private GeneralPower generalPower;

    public Adapter(GeneralPower generalPower) {
        this.generalPower = generalPower;
    }

    @Override
    public int voltage() {
        int voltage=generalPower.voltage();
        // process voltage....
        return 5;
    }
}
