package ru.geekbrains.PublisherSubscriber;

public class ConsoleObserver implements Observer {
    @Override
    public void handleEvent(int temp, int presser) {
        System.out.println("изменение температуры  temp = " + temp + " и давления presser = " + presser);
    }
}
