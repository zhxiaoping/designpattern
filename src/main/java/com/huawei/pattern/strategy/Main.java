package com.huawei.pattern.strategy;

public class Main {
    public static void main(String[] args) {
        ChineseDuck chineseDuck = new ChineseDuck();
        chineseDuck.display();
        chineseDuck.performFly();
        chineseDuck.performQuack();
        chineseDuck.setFlyBehavior(new FlyNoWings());
        chineseDuck.setQuackBehavior(new QuckNoSound());
        chineseDuck.performFly();
        chineseDuck.performQuack();
    }
}
