package com.van.designpattern.命令模式.command;

import com.van.designpattern.命令模式.Command;
import com.van.designpattern.命令模式.Light;
import com.van.designpattern.命令模式.TV;

public class Main {
    private static final int SIZE = 4;

    public static void main(String[] args) {
        Light light = new Light();
        TV tv = new TV();
        CommandPanel commandPanel = new CommandPanel(new Command[SIZE]);
        commandPanel.setCommand(0, new LightOn(light));
        commandPanel.setCommand(1, new LightOff(light));
        commandPanel.setCommand(2, new TVOn(tv));
        commandPanel.setCommand(3, new TVOff(tv));
        commandPanel.executeCommand(0);
        commandPanel.executeCommand(2);

    }
}
