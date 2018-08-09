package ru.geekbrains.AbstractFactory.factories;

import ru.geekbrains.AbstractFactory.DeviceFactory;
import ru.geekbrains.AbstractFactory.Keyboard;
import ru.geekbrains.AbstractFactory.Mouse;
import ru.geekbrains.AbstractFactory.Touchpad;
import ru.geekbrains.AbstractFactory.ru.RuKeyboard;
import ru.geekbrains.AbstractFactory.ru.RuMouse;
import ru.geekbrains.AbstractFactory.ru.RuTouchpad;

public class RuDeviceFactory implements DeviceFactory {
    @Override
    public Mouse getMouse() {
        return new RuMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new RuKeyboard();
    }

    @Override
    public Touchpad getTouchpad() {
        return new RuTouchpad();
    }
}
