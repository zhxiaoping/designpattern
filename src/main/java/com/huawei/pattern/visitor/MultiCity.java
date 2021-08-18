package com.huawei.pattern.visitor;

public class MultiCity implements City {
    City[] cities = {new Shanghai(), new Beijing()};

    @Override
    public void accept(Visitor visitor) {
        for (City city : cities) {
            city.accept(visitor);
        }
    }
}
