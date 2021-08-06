package com.huawei.pattern.factory.simplefactory;

public class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = SimplePizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.cut();
        pizza.bake();
        pizza.box();
        return pizza;
    }
}
