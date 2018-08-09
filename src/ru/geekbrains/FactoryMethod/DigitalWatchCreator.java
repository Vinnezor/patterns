package ru.geekbrains.FactoryMethod;

public class DigitalWatchCreator implements WatchCreator {

    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
