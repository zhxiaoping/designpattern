package com.huawei.pattern.command;

public class Fan {

    String speed = "low";

    public void on() {
        System.out.println("The fan is on");
    }

    public void off() {
        System.out.println("The fan is off");
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
        System.out.println(speed);
    }

    public void setHigh() {
        speed = "high";
        System.out.println(speed);
    }

    public void setMiddle() {
        speed = "middle";
        System.out.println(speed);
    }

    public void setLow() {
        speed = "low";
        System.out.println(speed);
    }
}
