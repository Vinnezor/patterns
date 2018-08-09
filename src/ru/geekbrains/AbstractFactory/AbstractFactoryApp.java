package ru.geekbrains.AbstractFactory;

import ru.geekbrains.AbstractFactory.factories.EnDeviceFactory;
import ru.geekbrains.AbstractFactory.factories.RuDeviceFactory;

public class AbstractFactoryApp {

    public static void main(String[] args) {
        DeviceFactory factory = getFactory("RU");
        Mouse mouse = factory.getMouse();
        Keyboard keyboard = factory.getKeyboard();
        Touchpad touchpad = factory.getTouchpad();
        mouse.scroll(20);
        keyboard.println();
        touchpad.track(30, 40);
    }

    private static DeviceFactory getFactory (String languages) {
        switch (languages) {
            case "RU":
                return new RuDeviceFactory();
            case "EN":
                return new EnDeviceFactory();
            default:
                throw new RuntimeException("Нет такого языка");
        }
    }
}
