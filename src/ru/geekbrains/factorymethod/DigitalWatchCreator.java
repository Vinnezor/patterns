package ru.geekbrains.factorymethod;

public class DigitalWatchCreator implements WatchCreator {

    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
