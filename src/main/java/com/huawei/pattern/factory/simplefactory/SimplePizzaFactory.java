package com.huawei.pattern.factory.simplefactory;

public class SimplePizzaFactory {

    public static Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CheesePizza();
        } else if (type.equals("veggie")) {
            return new VeggiePizza();
        } else
            return null;
    }
}
