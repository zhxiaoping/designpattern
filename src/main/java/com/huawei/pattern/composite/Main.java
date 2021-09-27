package com.huawei.pattern.composite;

public class Main {

    public static void main(String[] args) {
        Menu dinner = new Menu("dinner");
        Menu lunch = new Menu("lunch");
        Menu breakfast = new Menu("breakfast");
        dinner.add(new MenuItem("d0", 2.4));
        lunch.add(new MenuItem("l0", 2.4));
        breakfast.add(new MenuItem("b0", 2.4));
        Menu all = new Menu("All Menue");
        all.add(dinner);
        all.add(lunch);
        all.add(breakfast);
        all.add(new MenuItem("a0", 2.4));
        all.print();
    }
}
