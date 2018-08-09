package ru.geekbrains.PublisherSubscriber;

import ru.geekbrains.PublisherSubscriber.observers.ConsoleObserver;
import ru.geekbrains.PublisherSubscriber.observers.FileObserver;

public class ObserverApp {

    public static void main(String[] args) {
        MeteoStation meteostatio = new MeteoStation();
        meteostatio.addObserver(new ConsoleObserver());
        meteostatio.addObserver(new FileObserver());
        meteostatio.setMeasurements(10, 2110);
        meteostatio.setMeasurements(23, 230);
        meteostatio.setMeasurements(2, 220);
        meteostatio.setMeasurements(1, 20);
        meteostatio.setMeasurements(100, 240);
    }
}
