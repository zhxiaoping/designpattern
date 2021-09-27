package com.huawei.pattern.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent{

    List<MenuComponent> list = new ArrayList();
    String name;

    public Menu(String name) {
        this.name = name;
    }

    @Override
    void add(MenuComponent menuComponent) {
        list.add(menuComponent);
    }

    @Override
    void remove(MenuComponent menuComponent) {
        list.remove(menuComponent);
    }

    @Override
    void print() {
        System.out.println(this.name);
        Iterator<MenuComponent> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().print();
        }
    }
}
