package com.huawei.pattern.factory.abstractfactory;

public class Main {

    public static void main(String[] args) {
        new BJPizzaStore().orderPizza("cheese");
        new SHPizzaStore().orderPizza("cheese");
        new BJPizzaStore().orderPizza("veggie");
        new SHPizzaStore().orderPizza("veggie");
    }
}
