package com.huawei.pattern.command;

public class MacrosCommannd implements Command {
    Command[] commands;


    public void setCommands(Command ... commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (Command command : commands) {
            command.undo();
        }
    }
}
