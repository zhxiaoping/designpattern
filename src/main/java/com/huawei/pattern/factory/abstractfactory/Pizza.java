package com.huawei.pattern.factory.abstractfactory;

public abstract class Pizza {
    public String name;
    Dough dough;
    Sauce sauce;

    public void prepare(){
        System.out.println("准备 ..." + name);
        System.out.println("dough " + dough.name);
        System.out.println("sauce " + sauce.name);
    }

    public void bake(){
        System.out.println("烘烤 25 分钟。");
    }

    public void cut(){
        System.out.println("把比萨饼切成对角片。");
    }

    public void box(){
        System.out.println("将比萨放到比萨商店的盒子中。");
    }
}
