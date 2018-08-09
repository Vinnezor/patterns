package ru.geekbrains.PublisherSubscriber;

import ru.geekbrains.PublisherSubscriber.observers.Observer;

public interface Observed {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
