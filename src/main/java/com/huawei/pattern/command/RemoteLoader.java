package com.huawei.pattern.command;

public class RemoteLoader {

    public static void main(String[] args) {
        Fan fan = new Fan();
        Light light = new Light();
        FanHighCommand fanHighCommand = new FanHighCommand(fan);
        FanLowCommand fanLowCommand = new FanLowCommand(fan);
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, fanHighCommand, fanLowCommand);
        remoteControl.setCommand(1, lightOnCommand, lightOffCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.undo();

        MacrosCommannd macrosCommand = new MacrosCommannd();
        macrosCommand.setCommands(fanLowCommand, lightOnCommand);

        MacrosCommannd macrosCommand1 = new MacrosCommannd();
        macrosCommand1.setCommands(fanHighCommand, lightOffCommand);
        remoteControl.setCommand(2,macrosCommand, macrosCommand1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.undo();
    }
}
