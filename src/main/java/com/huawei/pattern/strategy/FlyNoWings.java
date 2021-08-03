package com.huawei.pattern.strategy;

public class FlyNoWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("sorry, I can't fly");
    }
}
