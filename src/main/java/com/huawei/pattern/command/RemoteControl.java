package com.huawei.pattern.command;

public class RemoteControl {
    Command[] onCommand = new Command[7];
    Command[] offCommand = new Command[7];
    Command lastCommand = new NoCommand();

    public RemoteControl() {
        for (Command command : onCommand) {
            command = new NoCommand();
        }
        for (Command command : offCommand) {
            command = new NoCommand();
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommand[slot] = onCommand;
        this.offCommand[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommand[slot].execute();
        lastCommand = onCommand[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommand[slot].execute();
        lastCommand = offCommand[slot];
    }

    public void undo() {
        lastCommand.undo();
    }
}
