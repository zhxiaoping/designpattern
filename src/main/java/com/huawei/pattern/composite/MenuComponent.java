package com.huawei.pattern.composite;

public abstract class MenuComponent {

    void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    void print() {
        throw new UnsupportedOperationException();
    }
}
