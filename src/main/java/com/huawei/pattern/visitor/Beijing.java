package com.huawei.pattern.visitor;

public class Beijing implements City{
    String name = "beijing";

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
