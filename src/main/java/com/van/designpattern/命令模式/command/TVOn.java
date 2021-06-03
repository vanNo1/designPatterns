package com.van.designpattern.命令模式.command;

import com.van.designpattern.命令模式.Command;
import com.van.designpattern.命令模式.TV;

public class TVOn implements Command {
    private TV tv;

    public TVOn(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }
}
