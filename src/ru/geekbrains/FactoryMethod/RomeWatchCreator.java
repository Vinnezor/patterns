package ru.geekbrains.FactoryMethod;

public class RomeWatchCreator implements WatchCreator {
    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}
