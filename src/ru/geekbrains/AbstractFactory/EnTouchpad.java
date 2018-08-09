package ru.geekbrains.AbstractFactory;

import ru.geekbrains.AbstractFactory.Touchpad;

public class EnTouchpad implements Touchpad {

    @Override
    public void track(int deltaX, int deltaY) {
        System.out.println("change on х = " + deltaX + " y = " + deltaY);
    }
}
