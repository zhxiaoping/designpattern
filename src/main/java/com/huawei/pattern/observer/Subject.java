package com.huawei.pattern.observer;

public interface Subject {
    public void register(Observer obj);
    public void remove(Observer obj);
    public void notifyObservers();
}
