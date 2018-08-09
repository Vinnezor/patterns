package ru.geekbrains.PublisherSubscriber;

import ru.geekbrains.PublisherSubscriber.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class MeteoStation implements Observed {

    private int temp;
    private int presser;

    private List<Observer> observers = new ArrayList<>();

    public void setMeasurements(int temp, int presser) {
        this.temp = temp;
        this.presser = presser;
        notifyObserver();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).handleEvent(temp, presser);
        }
    }
}
