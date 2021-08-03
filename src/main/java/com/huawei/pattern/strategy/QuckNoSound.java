package com.huawei.pattern.strategy;

public class QuckNoSound implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can't make sound");
    }
}
