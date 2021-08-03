package com.huawei.pattern.strategy;

public class ChineseDuck extends Duck{
    public ChineseDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a chinese duck");
    }
}
