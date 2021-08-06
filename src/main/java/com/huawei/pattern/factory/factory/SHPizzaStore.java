package com.huawei.pattern.factory.factory;

public class SHPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese"))
            return new CheesePizza();
        else return null;
    }
}
