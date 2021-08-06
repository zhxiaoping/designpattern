package com.huawei.pattern.factory.simplefactory;

public abstract class Pizza {
    public String name;
    public String sauce;

    public void prepare(){
        System.out.println("准备 ..." + name);
        System.out.println("添加配料 ..." + sauce);
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
