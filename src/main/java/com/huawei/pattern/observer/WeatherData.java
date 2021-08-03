package com.huawei.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    int temprature, humidity, presure;
    private List<Observer> observers = new ArrayList<Observer>();


    @Override
    public void register(Observer obj) {
        observers.add(obj);
    }

    @Override
    public void remove(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temprature, humidity, presure);
        }
    }

    public void setMessurements(int temprature, int humidity, int presure) {
        this.temprature = temprature;
        this.humidity = humidity;
        this.presure = presure;
        notifyObservers();
    }
}
