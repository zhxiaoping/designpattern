package com.huawei.pattern.adapter;

public class Main {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        testDuck(duck);
        testDuck(new TurkeyAdapter(turkey));
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
