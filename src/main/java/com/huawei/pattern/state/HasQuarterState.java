package com.huawei.pattern.state;

public class HasQuarterState implements State {
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you cant insert another quarter");
    }

    @Override
    public void turnCrank() {
        if (gumballMachine.getCount() > 0) {
            gumballMachine.releaseBall();
        }
        
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else
            gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
}
