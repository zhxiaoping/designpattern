package com.huawei.pattern.command;

public class FanHighCommand implements Command{
    Fan fan;
    String previous;
    public  FanHighCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        previous = fan.getSpeed();
        fan.setHigh();
    }

    @Override
    public void undo() {
        fan.setSpeed(previous);
    }
}
