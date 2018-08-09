package ru.geekbrains.AbstractFactory.factories;

import ru.geekbrains.AbstractFactory.DeviceFactory;
import ru.geekbrains.AbstractFactory.Keyboard;
import ru.geekbrains.AbstractFactory.Mouse;
import ru.geekbrains.AbstractFactory.Touchpad;
import ru.geekbrains.AbstractFactory.en.EnKeyboard;
import ru.geekbrains.AbstractFactory.en.EnMouse;
import ru.geekbrains.AbstractFactory.en.EnTouchpad;

public class EnDeviceFactory implements DeviceFactory {


    @Override
    public Mouse getMouse() {
        return new EnMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new EnKeyboard();
    }

    @Override
    public Touchpad getTouchpad() {
        return new EnTouchpad();
    }
}
