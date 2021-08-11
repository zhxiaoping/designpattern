package com.huawei.pattern.state;

public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("sold out, u cant insert quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("sold out, u cant turn crank");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("sold out, u cant eject quarter");
    }
}
