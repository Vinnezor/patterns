package ru.geekbrains.factorymethod;

public class FactoryMethodApp {

    public static void main(String[] args) {
        WatchCreator creator = getWatchCreatorByName("Rome1");
        Watch watch = creator.createWatch();
        watch.showTime();
    }

    public static WatchCreator getWatchCreatorByName(String creator) {
        switch (creator) {
            case "Digital":
                return new DigitalWatchCreator();
            case "Rome":
                return new RomeWatchCreator();
            default:
                throw new RuntimeException("нет такого проихводителя " + creator);
        }

    }
}
