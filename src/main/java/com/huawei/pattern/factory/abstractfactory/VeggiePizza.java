package com.huawei.pattern.factory.abstractfactory;

public class VeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        this.sauce = ingredientFactory.createSauce();
        this.dough = ingredientFactory.createDough();
        this.name = "veggie";
    }
}
