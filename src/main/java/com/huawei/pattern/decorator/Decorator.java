package com.huawei.pattern.decorator;

public abstract class Decorator implements Beverage {
    Beverage beverage;

    public Decorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
