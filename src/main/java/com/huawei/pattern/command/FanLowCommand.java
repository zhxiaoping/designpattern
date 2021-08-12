package com.huawei.pattern.command;

public class FanLowCommand implements Command {
    Fan fan;
    String previous;
    public  FanLowCommand(Fan fan) {
        this.fan = fan;
    }
    @Override
    public void execute() {
        previous = fan.getSpeed();
        fan.setLow();
    }

    @Override
    public void undo() {
        fan.setSpeed(previous);
    }
}
