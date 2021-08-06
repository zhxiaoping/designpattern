package com.huawei.pattern.factory.abstractfactory;

public class CheesePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        this.sauce = ingredientFactory.createSauce();
        this.dough = ingredientFactory.createDough();
        this.name = "cheese";
    }
}
