package com.huawei.pattern.factory.factory;

public class BJPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("veggie"))
            return new VeggiePizza();
        else return null;
    }
}
