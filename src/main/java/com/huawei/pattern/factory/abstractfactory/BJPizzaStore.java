package com.huawei.pattern.factory.abstractfactory;

public class BJPizzaStore extends PizzaStore {

    PizzaIngredientFactory pizzaIngredientFactory = new BJPizzaIngredientFactory();

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CheesePizza(pizzaIngredientFactory);
        } else if (type.equals("veggie")) {
            return new VeggiePizza(pizzaIngredientFactory);
        } else {
            return null;
        }
    }
}
