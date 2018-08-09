package ru.geekbrains.AbstractFactory.ru;

import ru.geekbrains.AbstractFactory.Touchpad;

public class RuTouchpad implements Touchpad {
    @Override
    public void track(int deltaX, int deltaY) {
        System.out.println("перемстились на х = " + deltaX + " y = " + deltaY);
    }
}
