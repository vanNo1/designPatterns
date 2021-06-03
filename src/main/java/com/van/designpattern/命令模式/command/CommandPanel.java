package com.van.designpattern.命令模式.command;

import com.van.designpattern.命令模式.Command;

public class CommandPanel {
    private Command[] commands;

    public CommandPanel(Command[] commands) {
        this.commands = commands;
    }

    public void setCommand(int index, Command command) {
        commands[index] = command;
    }

    public void executeCommand(int index) {
        commands[index].execute();
    }
}
