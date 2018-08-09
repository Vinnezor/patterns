package ru.geekbrains.AbstractFactory;


public class RuTouchpad implements Touchpad {
    @Override
    public void track(int deltaX, int deltaY) {
        System.out.println("перемстились на х = " + deltaX + " y = " + deltaY);
    }
}
