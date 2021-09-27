package com.huawei.pattern.iterator;

public class Waitress {

    Menu dinnerMenu = new DinnerMenu();
    Menu pancakeMenu = new PancakeHouseMenu();

    public void printAllMenue() {
        Iterator iterator = dinnerMenu.createIterator();
        printMenue(iterator);
        iterator = pancakeMenu.createIterator();
        printMenue(iterator);
    }

    public void printMenue(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
