package com.huawei.pattern.command;

public class Tv {

    public void on() {
        System.out.println("The tv is on");
    }

    public void off() {
        System.out.println("The tv is off");
    }

    public void setChannel(int i) {
        System.out.println("channel " + i + " is on");
    }

    public void setVolume(int i) {
        System.out.println("volume " + i);
    }
}
