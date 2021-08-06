package com.huawei.pattern.factory.abstractfactory;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
}
