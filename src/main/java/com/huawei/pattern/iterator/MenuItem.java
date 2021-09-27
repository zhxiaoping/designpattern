package com.huawei.pattern.iterator;

public class MenuItem {
    String name;
    double prices;

    public MenuItem(String name, double prices) {
        this.name = name;
        this.prices = prices;
    }

    @Override
    public String toString() {
        return "name: " + name + " price: " + prices;
    }
}
