package com.huawei.pattern.composite;

public class MenuItem extends MenuComponent {
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

    @Override
    void print() {
        System.out.println(this.toString());
    }
}
