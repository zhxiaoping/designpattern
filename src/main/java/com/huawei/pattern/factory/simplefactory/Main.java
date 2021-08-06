package com.huawei.pattern.factory.simplefactory;

public class Main {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("veggie");
    }
}
