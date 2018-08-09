package ru.geekbrains.AbstractFactory;

import ru.geekbrains.AbstractFactory.Keyboard;

public class EnKeyboard implements Keyboard {

    @Override
    public void print() {
        System.out.println("print");
    }

    @Override
    public void println() {
        System.out.println("println");
    }
}
