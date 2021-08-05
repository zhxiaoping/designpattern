package com.huawei.pattern.decorator;

public class MilkDecorator extends Decorator {

    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 1;
    }


}
