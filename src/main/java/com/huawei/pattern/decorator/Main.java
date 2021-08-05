package com.huawei.pattern.decorator;

public class Main {
    public static void main(String[] args) {
        Espresso espresso = new Espresso();
        MilkDecorator milkDecorator = new MilkDecorator(espresso);
        MilkDecorator milkDecorator1 = new MilkDecorator(milkDecorator);
        MochaDecorator mochaDecorator = new MochaDecorator(milkDecorator1);
        System.out.println(mochaDecorator.getDescription());
        System.out.println(mochaDecorator.cost());
    }
}
