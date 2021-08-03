package com.huawei.pattern.observer;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        MonitorDisplay monitorDisplay = new MonitorDisplay(weatherData);
        weatherData.setMessurements(1, 2, 3);
        weatherData.setMessurements(2, 2, 3);
        weatherData.remove(monitorDisplay);
        weatherData.setMessurements(2, 2, 3);

    }
}
