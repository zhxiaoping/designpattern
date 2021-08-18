package com.huawei.pattern.visitor;

public class Main {
    public static void main(String[] args) {
        MultiCity cities = new MultiCity();
        SingleVisitor singleVisitor = new SingleVisitor();
        cities.accept(singleVisitor);
    }
}
