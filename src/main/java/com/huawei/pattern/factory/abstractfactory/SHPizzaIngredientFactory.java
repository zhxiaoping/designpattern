package com.huawei.pattern.factory.abstractfactory;

public class SHPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCustDough();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }
}
