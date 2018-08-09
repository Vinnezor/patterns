package ru.geekbrains.AbstractFactory.ru;

import ru.geekbrains.AbstractFactory.Keyboard;

public class RuKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.println("печатаем по русски");
    }

    @Override
    public void println() {
        System.out.println("печатем с переводом строки по русски");
    }
}
