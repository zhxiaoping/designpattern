package com.huawei.pattern.command;

public class FanOffCommand implements Command{
    Fan fan;

    public  FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.off();
    }

    @Override
    public void undo() {
        fan.on();
    }
}
