package com.huawei.pattern.observer;

public class MonitorDisplay implements Observer {
    Subject subject;

    public  MonitorDisplay(Subject subject) {
        this.subject = subject;
        subject.register(this);
    }
    @Override
    public void update(int temperature, int humidity, int pressure) {
        System.out.println("temprature is " + temperature + "humidity is "
                + humidity + "pressure is "  + pressure);
    }
}
