package com.huawei.pattern.state;

public class GumballMachine {
    State noQuarterState;
    State hasQuarterState;
    State soldOutState;
    State state;
    int count = 0;
    public GumballMachine(int count) {
        this.count = count;
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldOutState = new SoldOutState(this);
        if (count > 0) {
            state = this.noQuarterState;
        }
    }

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void releaseBall() {
        if (this.count > 0) {
            System.out.println("the gumball is rolling out from the slot");
            count--;
        }
    }

    public int getCount() {
        return count;
    }
}
