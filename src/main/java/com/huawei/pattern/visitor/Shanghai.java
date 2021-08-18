package com.huawei.pattern.visitor;

public class Shanghai implements City {
    String name = "shanghai";
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
