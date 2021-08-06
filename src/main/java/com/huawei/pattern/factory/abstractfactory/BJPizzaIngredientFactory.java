package com.huawei.pattern.factory.abstractfactory;

public class BJPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PotatoSauce();
    }
}
