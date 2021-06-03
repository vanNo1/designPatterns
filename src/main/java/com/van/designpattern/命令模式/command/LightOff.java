package com.van.designpattern.命令模式.command;

import com.van.designpattern.命令模式.Command;
import com.van.designpattern.命令模式.Light;

public class LightOff implements Command {
    private Light light;

    public LightOff(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
