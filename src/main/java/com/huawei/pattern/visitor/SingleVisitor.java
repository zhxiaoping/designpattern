package com.huawei.pattern.visitor;

public class SingleVisitor implements Visitor {
    @Override
    public void visit(Beijing bejing) {
        System.out.println("I came to " + bejing.name);
    }

    @Override
    public void visit(Shanghai shanghai) {
        System.out.println("I came to " + shanghai.name);
    }
}
