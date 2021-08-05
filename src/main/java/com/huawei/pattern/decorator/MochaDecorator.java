package com.huawei.pattern.decorator;

public class MochaDecorator extends Decorator {

    public MochaDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 2;
    }


}
