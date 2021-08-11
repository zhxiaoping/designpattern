package com.huawei.pattern.state;

public class NoQuarterState implements State {

    GumballMachine gumballMachine;
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("inserted quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("turned crank");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("no quarter");
    }
}
