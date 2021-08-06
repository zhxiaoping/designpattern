package com.huawei.pattern.factory.factory;

public class Main {

    public static void main(String[] args) {
        new BJPizzaStore().orderPizza("veggie");
        new SHPizzaStore().orderPizza("cheese");
    }
}
